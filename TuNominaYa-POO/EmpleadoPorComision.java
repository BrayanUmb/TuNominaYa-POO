package TuNominaYa;

public class EmpleadoPorComision extends Empleado {
   private double ventasBrutas;
   private double tarifaComision;

   public EmpleadoPorComision( String nombre, String apellido, String nss, double ventas, double tarifa ) {
      super( nombre, apellido, nss );
      setVentasBrutas( ventas );
      setTarifaComision( tarifa );
   }

   public void setTarifaComision( double tarifa ) {
      tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
   }

   public double getTarifaComision() { return tarifaComision; }

   public void setVentasBrutas( double ventas ) {
      ventasBrutas = ventas < 0.0 ? 0.0 : ventas;
   }

   public double getVentasBrutas() { return ventasBrutas; }

   @Override
   public double ingresos() { return getTarifaComision() * getVentasBrutas(); }

   @Override
   public String toString() {
      return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", 
         "empleado por comision", super.toString(), 
         "ventas brutas", getVentasBrutas(), 
         "tarifa de comision", getTarifaComision() );
   }
}
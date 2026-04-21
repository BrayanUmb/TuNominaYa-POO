package TuNominaYa;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
   private double salarioBase;

   public EmpleadoBaseMasComision( String nombre, String apellido, 
      String nss, double ventas, double tarifa, double salario ) {
      super( nombre, apellido, nss, ventas, tarifa );
      setSalarioBase( salario );
   }

   public void setSalarioBase( double salario ) {
      salarioBase = salario < 0.0 ? 0.0 : salario;
   }

   public double getSalarioBase() { return salarioBase; }

   @Override
   public double ingresos() { return getSalarioBase() + super.ingresos(); }

   @Override
   public String toString() {
      return String.format( "%s %s; %s: $%,.2f", 
         "con salario base", super.toString(), 
         "salario base", getSalarioBase() );
   }
}
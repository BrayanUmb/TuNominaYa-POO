package TuNominaYa;

public class EmpleadoPorHoras extends Empleado {
   private double sueldo;
   private double horas;

   public EmpleadoPorHoras( String nombre, String apellido, String nss, double sueldoPorHoras, double horasTrabajadas ) {
      super( nombre, apellido, nss );
      setSueldo( sueldoPorHoras );
      setHoras( horasTrabajadas );
   }

   public void setSueldo( double sueldoPorHoras ) {
      sueldo = sueldoPorHoras < 0.0 ? 0.0 : sueldoPorHoras;
   }

   public double getSueldo() { return sueldo; }

   public void setHoras( double horasTrabajadas ) {
      horas = ( ( horasTrabajadas >= 0.0 ) && ( horasTrabajadas <= 168.0 ) ) ? horasTrabajadas : 0.0;
   }

   public double getHoras() { return horas; }

   @Override
   public double ingresos() {
      if ( getHoras() <= 40 ) return getSueldo() * getHoras();
      else return 40 * getSueldo() + ( getHoras() - 40 ) * getSueldo() * 1.5;
   }

   @Override
   public String toString() {
      return String.format( "empleado por horas: %s\n%s: $%,.2f; %s: %,.2f", 
         super.toString(), "sueldo por horas", getSueldo(), "horas trabajadas", getHoras() );
   }
}
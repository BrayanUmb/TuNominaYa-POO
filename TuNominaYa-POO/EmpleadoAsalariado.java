package TuNominaYa;

public class EmpleadoAsalariado extends Empleado {
   private double salarioSemanal;

   public EmpleadoAsalariado( String nombre, String apellido, String nss, double salario ) {
      super( nombre, apellido, nss );
      setSalarioSemanal( salario );
   }

   public void setSalarioSemanal( double salario ) {
      salarioSemanal = salario < 0.0 ? 0.0 : salario;
   }

   public double getSalarioSemanal() { return salarioSemanal; }

   @Override
   public double ingresos() { return getSalarioSemanal(); }

   @Override
   public String toString() {
      return String.format( "empleado asalariado: %s\n%s: $%,.2f", 
         super.toString(), "salario semanal", getSalarioSemanal() );
   }
}
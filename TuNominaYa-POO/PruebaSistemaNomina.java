package TuNominaYa;

public class PruebaSistemaNomina {
   public static void main( String[] args ) {
      EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado( "Juan", "Perez", "111-11-1111", 800.00 );
      EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision( "Arlae", "Razon", "222-22-2222", 10000, .06 );
      EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision( "Alfonso", "Romero", "333-33-3333", 5000, .04, 300 );
      EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras( "Isabel", "Romero", "444-44-4444", 16.75, 40 );

      Empleado[] empleados = new Empleado[ 4 ];
      empleados[ 0 ] = empleadoAsalariado;
      empleados[ 1 ] = empleadoPorComision;
      empleados[ 2 ] = empleadoBaseMasComision;
      empleados[ 3 ] = empleadoPorHoras;

      System.out.println( "--- REPORTE DE NÓMINA (DEMOSTRACIÓN DE POLIMORFISMO) ---" );

      for ( Empleado empleadoActual : empleados ) {
         System.out.println( empleadoActual ); 

         if ( empleadoActual instanceof EmpleadoBaseMasComision ) {
            EmpleadoBaseMasComision empleado = ( EmpleadoBaseMasComision ) empleadoActual;
            empleado.setSalarioBase( 1.10 * empleado.getSalarioBase() );
            System.out.printf( "El nuevo salario base con 10%% de aumento es: $%,.2f\n", empleado.getSalarioBase() );
         }

         System.out.printf( "ingresos devengados: $%,.2f\n\n", empleadoActual.ingresos() );
      }

      for ( int j = 0; j < empleados.length; j++ ) {
         System.out.printf( "El empleado %d es un %s\n", j, empleados[ j ].getClass().getName() );
      }
   }
}
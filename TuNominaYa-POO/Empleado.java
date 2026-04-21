package TuNominaYa;

public abstract class Empleado {
   private String primerNombre;
   private String apellidoPaterno;
   private String numeroSeguroSocial;

   public Empleado( String nombre, String apellido, String nss ) {
      primerNombre = nombre;
      apellidoPaterno = apellido;
      numeroSeguroSocial = nss;
   }

   public void setPrimerNombre( String nombre ) { primerNombre = nombre; }
   public String getPrimerNombre() { return primerNombre; }

   public void setApellidoPaterno( String apellido ) { apellidoPaterno = apellido; }
   public String getApellidoPaterno() { return apellidoPaterno; }

   public void setNumeroSeguroSocial( String nss ) { numeroSeguroSocial = nss; }
   public String getNumeroSeguroSocial() { return numeroSeguroSocial; }

   @Override
   public String toString() {
      return String.format( "%s %s\nnumero de seguro social: %s", 
         getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial() );
   }

   public abstract double ingresos(); 
}
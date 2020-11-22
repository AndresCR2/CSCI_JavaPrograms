public class Hospital
{
   public static void main(String[] args)
   {
      Administrator vito = new Administrator("Vito", 123, "", 0);
      Administrator jason = new Administrator("Jason", 404, "department", 0);
     
      System.out.println(vito);
      System.out.println(jason);
      
      vito.administrate2();
      jason.administrate();
   }
}

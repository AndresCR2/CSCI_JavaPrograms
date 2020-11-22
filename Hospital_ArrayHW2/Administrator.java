public class Administrator
{
   protected String name, departmentdisc;
   protected int department, number;

   public Administrator(String empName, int empNumber, String admDepartment, int empDepartment)
   {
      name = empName;
      number = empNumber;
      departmentdisc = admDepartment;
      department = empDepartment;
   }

   public void setName(String empName)
   {
      name = empName;
   }
  
   public void setNumber(int empNumber)
   {
      number = empNumber;
   }
   
   public void setDepertment2(String admDepartment)
   {
     departmentdisc = admDepartment;
   }
   
    public void setDepartment(int empDepartment)
   {
      number = empDepartment;
   }

   public String getName()
   {
      return name;
   }

   public int getNumber()
   {
      return number;
   }
   
   public String toString()
   {
      return name + "\t" + number + "\t" + departmentdisc;
   }
       public void administrate2()
   {
      System.out.println(name + " works for the hospital.");
   }

   public void administrate()
   {
      System.out.println(name + " is a department Administrator.");
   }
}
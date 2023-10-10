public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private String alternateEmail;
   private int mailBoxCapacity;

   //Constructor

   public Email(String firstName, String lastName){
     this.firstName = firstName;
     this.lastName = lastName;
     System.out.println("Email created: "+this.firstName+" "+this.lastName);

     this.department = setDepartment();
   }

   //Ask for the department

   private String setDepartment(){
     System.out.println("Enter the department\n1 for sales\n2 for development\n3 for accounting\n4 for human resources\n0 for none");
     Scanner in = new Scanner(System.in);
     int departmentChoice = in.nextInt();
     switch (departmentChoice){
       case 1:
         return "sales";
         break;
       case 2:
         return "dev";
         break;
       case 3:
         return "acct";
         break;
       case 4:
         return "HR";
         break;
       default:
          return "";
     }
   }

}


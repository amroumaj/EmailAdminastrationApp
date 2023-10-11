import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private String alternateEmail;
   private String email;
   private String companySuffix = "company.com";
   private int mailBoxCapacity = 500;
   private int passwordLength = 10;

   //Constructor

   public Email(String firstName, String lastName){
     this.firstName = firstName;
     this.lastName = lastName;
     System.out.println("Email created: "+this.firstName+" "+this.lastName);

     //Call a method that asks for the department
     this.department = setDepartment();
     System.out.println("Department: "+ this.department);

     //Call a method that returns a random password
     this.password = randomPassword(passwordLength);
     System.out.println("Your password is: " + this.password);

     //Generate the email
     email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
     System.out.println("Your email is: "+ email);
   }
  
   //Generate a random password
   private String randomPassword(int length){
     String passwordSet = "ABCEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
     char[] password = new char[length];
     for (int i=0; i<length; i++){
       int rand = (int) (Math.random()*passwordSet.length());
       password[i] = passwordSet.charAt(rand);
     }
     return new String(password);
   }

   //Ask for the department

   private String setDepartment(){
     System.out.println("Enter the department\n1 for sales\n2 for development\n3 for accounting\n4 for human resources\n0 for none");
     Scanner in = new Scanner(System.in);
     int departmentChoice = in.nextInt();
     switch (departmentChoice){
       case 1:
         return "sales";
       case 2:
         return "dev";
       case 3:
         return "acct";
       case 4:
         return "HR";
       default:
          return "";
     }
   }

}


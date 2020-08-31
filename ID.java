import java.util*;

public class ID{
     private String name;
     private String birthday;
     private String year;//Class rank has been named 'year', as opposed to 'class' to avoid confusion with the code
     private double overdue_cost;

     public boolean taken;
     


     public ID(String a, String b, String c){
         name = a;
	 birthday = b;
	 year = c;
	 taken = false;
	 overdue_cost = 0;
     
     }

     public void displayID(){

         String name_header = String.format("Name: %s", name);
	 String birth_header = String.format("DOB: %s", birthday);
	 String class_header = String.format("Class Year: %s",year); 

	 System.out.println("---------Student ID---------------");    
         System.out.println(name_header);
	 System.out.println(birthday_header);
	 System.out.println(class_header);
	 System.out.println("----------------------------------");
     }

     private double calculateFee(int minutes){
      /*Flat rate fee of $1.50 will be applied for each minute gone over */

	double fee = 1.5 * minutes;
	overdue_cost = fee;
	return fee;
     }

     public void userAction(){
	 //This will let a user know if said person is on a machine    
         taken = true;
	 
     }


}

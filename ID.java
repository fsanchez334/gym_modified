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
	 System.out.println("---------Student ID---------------");    
         System.out.println("%s%s","Name: ", name);
	 System.out.println("%s%s", "DOB: ", birthday);
	 System.out.println("%s%s", "Class Year:" , year);
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

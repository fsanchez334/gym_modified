import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Main{

	public static void main(String[] args){
	    System.out.println("Hello and welcome to the gym");
	    ArrayList<Treadmill> available_treads = new ArrayList<>();

            for(int i = 0; i < 5; i++){
	        Treadmill holder = new Treadmill();
		available_treads.add(holder);

		System.out.println("Treadmill added");
	    }


	    Scanner input = new Scanner(System.in);
	    System.out.print("Please input your name: ");

	    String name = input.nextLine();
	    //System.out.println(name);
             
	    System.out.print("Please input your birthday in the format Month Day, Year: ");
	    
	    String birthdate = input.nextLine();
	    System.out.print("Please input your class year: ");

	    String class_year = input.nextLine();

	    ID holder = new ID(name, birthdate, class_year);
	    holder.displayID();


	}
	
}

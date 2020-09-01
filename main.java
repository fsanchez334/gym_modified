import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Main{

	public static void main(String[] args){
	    System.out.println("Hello and welcome to the gym");
	    ArrayList<Treadmill> available_treads = new ArrayList<>(5);

            addTreadmills(available_treads);


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

	public static void addTreadmills(ArrayList arr){
	
            for(int i = 0; i < arr.size(); i++){
	        Treadmill place = new Treadmill();
		arr.add(place);
		System.out.println("Treadmill added");
	    }
	}
	
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Main{

	public static void main(String[] args){
	    System.out.println("Hello and welcome to the gym");
	    ArrayList<Treadmill> available_treads = new ArrayList<>();
	    ArrayList<ID> visitors = new ArrayList<>();

            for(int i = 0; i < 5; i++){
	        Treadmill holder = new Treadmill();
		available_treads.add(holder);

		System.out.println("Treadmill added");
	    }


	    Scanner input = new Scanner(System.in);
	    System.out.println("How many people will be attending the gym today?");
	    int response = input.nextInt();

	    makeID(visitors,input,response); 
	     


	}

	private static void makeID(ArrayList<ID> list, Scanner holder, int x){
	    int counter = 0;

	    while(counter < x) {
		
                System.out.println("Please input your name, but dont' add a space - instead, place | : ");

                String name = holder.next();

		String improved = name.replace("|", " ");

                System.out.println("Please input your birthday in the format MM/DD/YYYY");

                String birthdate = holder.next();
                System.out.print("Please input your class year: ");
	        String class_year = holder.next();

		ID space = new ID(improved, birthdate, class_year);
		list.add(space);
		space.displayID();

		System.out.println("ID Created");

		counter++;
	

		
	}

       }
	
}

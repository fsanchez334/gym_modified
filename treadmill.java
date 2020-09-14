import java.util.*;
import java.util.ArrayList;

public class Treadmill{

    public boolean taken;
    private String mode;
    private String availability;

    public String name;

    public Treadmill(){
	taken = false;
	mode = "Default";
	availability = "Available";
	name = " ";
    }

    public void displayInfo(){
         System.out.println("-------TreadMill Information---------");
	 System.out.println(mode);
	 System.out.println(availability);
    }

    public void reserveTreadMill(ArrayList<Treadmill> machines, ID person, int x){
        machines.get(x-1).taken = true;
	availability = "Unavailable";

	String name = person.name;


    
    }


}


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

    public void displayInfo(int y){
         String information  = String.format("TreadMill #%d Information: ", y);
	 
	 System.out.print(information);
	 System.out.println(availability);
    }

    public void reserveTreadMill(String person, int x){
        this.taken = true;
	this.availability = "Unavailable";

	this.name = person;


    
    }


}


import java.util.*;

public class Treadmill{

    public boolean taken;
    private String mode;
    private String availability;

    public Treadmill(){
	taken = false;
	mode = "Default";
	availability = "Available";
	
    }

    public void displayInfo(){
         System.out.println("-------TreadMill Information---------");
	 System.out.println(mode);
	 System.out.println(availability);
    }

    public String changeAndTake(String name){
         taken = true;
	 String status = name + " has taken the treadmill";
	 return status;

    }


}


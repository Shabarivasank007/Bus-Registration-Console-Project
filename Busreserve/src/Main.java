import busres.*;

import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        List<Bus> buslist = new ArrayList<>();
        buslist.add(new Bus(1,true,2));
        buslist.add(new Bus(2,true,2));
        buslist.add(new Bus(3,false,3));

        List<Booking> booklist = new ArrayList<>();

        System.out.println("Welcome To the vasan Bus Service");
        //System.out.println("Enter 0 to register OR Enter 1 to exit");
        Scanner in = new Scanner(System.in);
        int n = 0;

        for(Bus b : buslist)
        {
            b.displayBus();
        }

        while(n == 0)
        {
            System.out.println("Enter 0 to register OR Enter 1 to exit");
//            System.out.println("Start Bookings :");
            n = in.nextInt();
            if(n == 0)
            {
                System.out.println("Booking........");
                Booking booking = new Booking();
                if(booking.isAvailable(booklist,buslist))
                {
                    booklist.add(booking);
                    System.out.println("Your Booking is Confirmed !!");
                }
                else{
                    System.out.println("Sorry!, Bus is full");
                }
            }
        }
        System.out.println("Booking Ended");
    }
}



package busres;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String Passname;
    int busno;
    Date date;

    Scanner scan = new Scanner(System.in);

    public Booking() throws ParseException {
        System.out.println("Enter The Passenger Name :");
        Passname = scan.next();
        System.out.println("Enter the Bus No :");
        busno = scan.nextInt();
        System.out.println("Enter the date :");

        String dateInput = scan.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        date = dateFormat.parse(dateInput);
    }

    public boolean isAvailable(List<Booking> booklist, List<Bus> Buslist) {
        int capacity = 0;
        for (Bus bus : Buslist) {
            if (bus.getBusno() == busno) {
                capacity = bus.getCapacity();
            }
        }
        int booked = 0;
        for (Booking b : booklist) {
            if (b.busno == busno && b.date.equals(date)) {
                booked++;
            }
        }
        return booked < capacity;
    }
}

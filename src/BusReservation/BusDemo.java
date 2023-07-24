package BusReservation;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
    public static void main(String[] args){
        ArrayList<Bus> buses =new ArrayList<Bus>();
        ArrayList<Booking> bookings=new ArrayList<Booking>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,48));
        int userOption=1;
        Scanner sr=new Scanner(System.in);
        for(Bus b:buses){
            b.displayBusInfo();
        }
        while(userOption==1){
            System.out.println("enter 1 to book and 2 to exit");
            userOption=sr.nextInt();{
                if(userOption == 1){
                    Booking booking=new Booking();
                    if(booking.isAvailable(bookings,buses)){
                        bookings.add(booking);
                        System.out.println("your booking is conformed");
                    }
                    else System.out.println("Sorry,Bus is full.Try another bus or date");
                }
            }
        }
    }
}

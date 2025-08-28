class Room {
    String roomNumber, roomType; double pricePerNight; boolean isAvailable=true; int maxOccupancy;
    public Room(String num,String type,double price,int occ){ this.roomNumber=num; this.roomType=type; this.pricePerNight=price; this.maxOccupancy=occ; }
}

class Guest {
    String guestId, guestName, phoneNumber, email;
    public Guest(String id,String name){ this.guestId=id; this.guestName=name; }
}

class Booking {
    static int totalBookings=0; static double hotelRevenue=0; static String hotelName;
    String bookingId; Guest guest; Room room; String checkInDate,checkOutDate; double totalAmount;
    public Booking(String id,Guest g,Room r,String in,String out){
        this.bookingId=id; this.guest=g; this.room=r; this.checkInDate=in; this.checkOutDate=out; 
        this.totalAmount=r.pricePerNight*2; totalBookings++; hotelRevenue+=totalAmount; r.isAvailable=false;
    }
    public void display(){ System.out.println("Booking:"+bookingId+" Guest:"+guest.guestName+" Room:"+room.roomNumber+" Amount:"+totalAmount); }
}

public class Assignment3_HotelReservation {
    public static void main(String[] args){
        Room r1=new Room("101","Deluxe",2000,2);
        Guest g1=new Guest("G1","Alice");
        Booking b1=new Booking("B1",g1,r1,"2025-01-01","2025-01-03");
        b1.display();
        System.out.println("Total Bookings:"+Booking.totalBookings+" Revenue:"+Booking.hotelRevenue);
    }
}
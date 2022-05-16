import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CCVTicket {
    private String name;
    private String address;
    private int time;
    private String category;
    private double price;

    public CCVTicket(String name, String address, int time, String category, double price) {
        this.name = name;
        this.address = address;
        this.time = time;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CCVTicket{" +
                "name: '" + name + '\'' +
                ", address: '" + address + '\'' +
                ", price: " + price +
                ", time: " + time +
                '}';
    }
}
public class ArrayListTicket {
    public static void main(String[] args) {
        List<CCVTicket> Tickets = new ArrayList<>();
        Tickets.add(new CCVTicket("Doctor Strange", "CCV HANOI",15, "Viễn Tưởng", 90));
        Tickets.add(new CCVTicket("Urban Myths", "CCV HANOI",20 , "Viễn Tưởng", 100));
        Tickets.add(new CCVTicket("FireStarter", "CCV HANOI",21 , "Viễn Tưởng", 80));
        Tickets.add(new CCVTicket("Extremely Easy Job", "CCV HCM",21 , "Tâm lí", 80));
        Tickets.add(new CCVTicket("Doraemon", "CCV HCM",21 , "Hài hước", 80));

        Tickets.forEach(ccvTicket -> {
            System.out.println("Name: " + ccvTicket.getName() + ", Address: " + ccvTicket.getAddress()+ ", Time: " + ccvTicket.getTime() + ", Category: " + ccvTicket.getCategory() + ", Price: " + ccvTicket.getPrice());
        });

        System.out.println("---------------------");
        Tickets.sort((ticket1, ticket2) -> {
            return ticket1.getTime() - ticket2.getTime();
        });

        Tickets.sort(Comparator.comparingInt(CCVTicket::getTime));
        System.out.println("Sorted ticket list by time: " + Tickets );

        Tickets.sort(Comparator.comparing(CCVTicket::getName));

        System.out.println("Sorted ticket list by name: " + Tickets );

        System.out.println("------------------");

        // Find the size of an ArrayList
        System.out.println("There are " + Tickets.size() + " tickets");

    }
}


import java.util.ArrayList;
import java.util.List;

class CCVTicket {
    private String name;
    private String address;
    private int time;
    private int date;
    private String category;
    private double price;

    public CCVTicket(String name, String address, int time, int date, String category, double price) {
        this.name = name;
        this.address = address;
        this.time = time;
        this.date = date;
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
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
        return "Ticket{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", time=" + time +
                ", date=" + date +
                ", category='" + category + '\'' +
                '}';
    }
}

public class Ticket {
    public void main(String[] args) {
        List<CCVTicket> Tickets = new ArrayList<>();
        Tickets.add(new CCVTicket("Doctor Strange", "CCV HANOI",19 ,15/05/2022, "VCC", 90));
        Tickets.add(new CCVTicket("Urban Myths", "CCV HANOI",19 ,15/05/2022, "TT", 100));
        Tickets.add(new CCVTicket("FireStarter", "CCV HANOI",19 ,15/05/2022, "KD", 80));

        System.out.println("Does \"Doctor Strange\" have in Array?" + Tickets.contains("Doctor Strange"));

    }
}



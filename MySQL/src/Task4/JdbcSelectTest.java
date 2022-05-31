package Task4;

import java.sql.*;
import java.util.Scanner;

public class JdbcSelectTest {
    public static void main(String[] args)  {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop",
                        "root","");
                Statement stmt = conn.createStatement();

        ) {
            String strSelect = "select title, price, qty from books";
            System.out.println("The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()) {
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + ", " + price + "," + qty);
                ++rowCount;

            }
            System.out.println("Total number of records = " + rowCount);
            System.out.println("----------");

            // 1. Hien thi danh sach khach hang
            strSelect = "select id,title, price, qty from books";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            System.out.println("1.Hien thi danh sach khach hang: ");
            rowCount = 0;
            while (rset1.next()) {
                int id = rset1.getInt("id");
                String title = rset1.getString("title");
                double price = rset1.getDouble("price");
                int qty = rset1.getInt("qty");
                System.out.println(id + ", " + title + ", " + price + "," + qty);
                ++rowCount;

            }
            // 2.Tim khach hang theo ten
            System.out.println("\n2.Tim khach hang theo ten");
            Scanner in = new Scanner(System.in);
            String searchName = in.nextLine();
            String strSearch = "select * from books where author like '%" + searchName + "%'";
            ResultSet rset2 = stmt.executeQuery(strSearch);
            rowCount = 0;
            while (rset2.next()) {
                int id = rset2.getInt("id");
                String author = rset2.getString("author");
                System.out.println(id + ", " + author);

                ++rowCount;
            }


            // 3. Hien thi danh sach san pham
            System.out.println("\n3.Hien thi danh sach san pham");
            strSelect = "select ProductName from products";
            ResultSet rset3 = stmt.executeQuery(strSelect);
            rowCount = 0;
            while (rset3.next()) {
                String ProductName = rset3.getString("ProductName");
                System.out.println(ProductName);
                ++rowCount;
            }

            // 4. Tim san pham theo gia ban trong khoang do nguoi dung nhap vao
            System.out.println("\n4.Tim san pham theo gia ban trong khoang do nguoi dung nhap vao");
            Scanner input = new Scanner(System.in);
            String searchBook = input.nextLine();
            String strSearchBook = "";
            ResultSet rset4 = stmt.executeQuery(strSearch);
            rowCount = 0;
            while (rset2.next()) {
                int id = rset4.getInt("id");
                String author = rset4.getString("author");
                System.out.println(id + ", " + author);
                ++rowCount;
            }

            // 5. Hiện thị thông tin chi tiết của một đơn hàng
            System.out.println("\n5.Hiện thị thông tin chi tiết của một đơn hàng");
            strSelect = "select OrderID, CustomerID, EmployeeID from orders";
            ResultSet rset5 = stmt.executeQuery(strSelect);
            rowCount = 0;

            while (rset5.next()) {
                int OrderID = rset5.getInt("OrderID");
                String CustomerID = rset5.getString("CustomerID");
                int EmployeeID = rset5.getInt("EmployeeID");
                System.out.println(OrderID + ", " + CustomerID + ", " + EmployeeID);
                ++rowCount;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}


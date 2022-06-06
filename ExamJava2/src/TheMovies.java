import java.sql.*;
import java.util.Scanner;

public class TheMovies {
    public static void main(String[] args) throws SQLException {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cinema", "root", "");
                PreparedStatement pstmtDelete = conn.prepareStatement("delete from movies where id = ?");
                PreparedStatement pstmtInsert = conn.prepareStatement("insert into movies values (?, ?, ?, ?, ?)");
                PreparedStatement pstmtSelect = conn.prepareStatement("select * from movies");
                PreparedStatement pstmtUpdate = conn.prepareStatement("update movies set name = ? where id = ?");
                PreparedStatement pstmtSearch = conn.prepareStatement("select * from movies where id = ?");
                Statement stmt = conn.createStatement();

        ) {
           // 1.DELETE
             System.out.println("\n1.DELETE FILMS");
             System.out.println("Enter ID Film: ");
             Scanner scDelete = new Scanner(System.in);
             String nameFilm = scDelete.nextLine();
             pstmtDelete.setString(1, nameFilm);
             pstmtDelete.executeUpdate();
             System.out.println("Delete Successfully!!");

             System.out.println("\nAfter delete");
             ResultSet rset = pstmtSelect.executeQuery();
                    while (rset.next()) {
                        System.out.println(rset.getString("id") + ", "
                                + rset.getString("name") + ", "
                                + rset.getDate("date") + ", "
                                + rset.getString("author") + ","
                                + rset.getInt("time"));
                    }

            // 2.INSERT
            System.out.println("\n2.INSERT FILMS");
            System.out.println("Enter film's id: ");
            Scanner scID = new Scanner(System.in);
            String id = scID.nextLine();

            System.out.println("Enter film's name: ");
            Scanner scName = new Scanner(System.in);
            String name = scName.nextLine();

            System.out.println("Enter date: ");
            Scanner scDate = new Scanner(System.in);
            String date = scDate.nextLine();

            System.out.println("Enter author: ");
            Scanner scAuthor = new Scanner(System.in);
            String author = scAuthor.nextLine();

            System.out.println("Enter time: ");
            Scanner scTime = new Scanner(System.in);
            String time = scTime.nextLine();

            pstmtInsert.setString(1, id);
            pstmtInsert.setString(2, name);
            pstmtInsert.setString(3, date);
            pstmtInsert.setString(4, author);
            pstmtInsert.setString(5, time);
            pstmtInsert.executeUpdate();
            System.out.println("Insert Ok!");

            System.out.println("After insert");
            ResultSet rset2 = pstmtSelect.executeQuery();
            while (rset2.next()) {
                System.out.println(rset2.getString("id") + ", "
                        + rset2.getString("name") + ", "
                        + rset2.getDate("date") + ", "
                        + rset2.getString("author") + ","
                        + rset2.getInt("time"));
            }

            //3. UPDATE
            System.out.println("\n3.UPDATE FILMS");

            System.out.println("Enter film's name: ");
            Scanner scName1 = new Scanner(System.in);
            String name1 = scName1.nextLine();

            System.out.println("Enter film's id: ");
            Scanner scID1 = new Scanner(System.in);
            String id1 = scID1.nextLine();

            pstmtUpdate.setString(1, name1);
            pstmtUpdate.setString(2, id1);
            pstmtUpdate.executeUpdate();

            System.out.println("After update");
            ResultSet rset3 = pstmtSelect.executeQuery();
            while (rset3.next()) {
                System.out.println(rset3.getString("id") + ", "
                        + rset3.getString("name") + ", "
                        + rset3.getDate("date") + ", "
                        + rset3.getString("author") + ","
                        + rset3.getInt("time"));
            }

            //4.SEARCH
            System.out.println("\n4.SEARCH FILMS");

            System.out.println("Enter film's id: ");
            Scanner scID2 = new Scanner(System.in);
            String id2 = scID2.nextLine();
            pstmtSearch.setString(1, id2);

            System.out.println("\nAfter search");
            ResultSet rset4 = pstmtSearch.executeQuery();
            while (rset4.next()) {
                System.out.println(rset4.getString("id") + ", "
                        + rset4.getString("name") + ", "
                        + rset4.getDate("date") + ", "
                        + rset4.getString("author") + ","
                        + rset4.getInt("time"));
            }

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}




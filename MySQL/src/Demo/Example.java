package Demo;
import java.sql.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/classroom",
                        "root", "");
                Statement stmt = conn.createStatement();

        ) {
            //1.DELETE
//            System.out.println("1.DELETE RECORD");
//            System.out.println("Enter delete a record: ");
//            Scanner scDel = new Scanner(System.in);
//            String del = scDel.nextLine();
//            String sqlDelete = "delete from student where studentID = " + del;
//            System.out.println(sqlDelete + "\n");
//            int countDelete = stmt.executeUpdate(sqlDelete);
//
//            // Print
//            String strSelect = "select * from student";
//            System.out.println(strSelect);
//            ResultSet rset1 = stmt.executeQuery(strSelect);
//            while (rset1.next()) {
//                System.out.println(rset1.getInt("studentID") + ","
//                        + rset1.getString("name") + ","
//                        + rset1.getDate("date") + ","
//                        + rset1.getString("gender") + ","
//                        + rset1.getString("address"));
//            }

            // 2.INSERT
//            System.out.println("\n2.INSERT RECORD");
//            System.out.println("Enter your studentID: ");
//            Scanner sc1 = new Scanner(System.in);
//            String id = sc1.nextLine();
//
//            System.out.println("Enter your name: ");
//            Scanner sc2 = new Scanner(System.in);
//            String  name = sc2.nextLine();
//
//            System.out.println("Enter your date: ");
//            Scanner sc3 = new Scanner(System.in);
//            String  date = sc3.nextLine();
//
//            System.out.println("Enter your gender:(Male - Female) ");
//            Scanner sc4 = new Scanner(System.in);
//            String  gender = sc4.nextLine();
//
//            System.out.println("Enter your address: ");
//            Scanner sc5 = new Scanner(System.in);
//            String  address = sc5.nextLine();
//
//            String sqlInsert = "insert into student values(" + id +", " + "'" + name +"', '" + date +"', '" + gender +"', " + "'" + address +  "')";
//            System.out.println("Student: " + sqlInsert + "\n");
//            stmt.executeUpdate(sqlInsert);



            // 3. UPDATE
//            System.out.println("\n3.UPDATE RECORD");
//            System.out.println("Change your record: ");
//
//            System.out.println("Enter update student set: ");
//            Scanner sn1 = new Scanner(System.in);
//            String su1 = sn1.nextLine();
//
//            System.out.println("Enter update student where: ");
//            Scanner sn2 = new Scanner(System.in);
//            String su2 = sn2.nextLine();
//
//            String sqlUpdate = "update student set name = " + "'" + su1 + "' where studentID = " +  su2;
//            System.out.println("Student: " + sqlUpdate + "\n");
//            stmt.executeUpdate(sqlUpdate);
//
//            // Print
//            String strSelect3 = "select * from student";
//            System.out.println(strSelect3);
//            ResultSet rset3 = stmt.executeQuery(strSelect3);
//            while (rset3.next()) {
//                System.out.println(rset3.getInt("studentID") + ","
//                        + rset3.getString("name") + ","
//                        + rset3.getDate("date") + ","
//                        + rset3.getString("gender") + ","
//                        + rset3.getString("address"));
//            }

            // 4.SEARCH
//            System.out.println("\n4.SEARCH RECORD");
//            System.out.println("Tim khach hang theo ten");
//            Scanner in = new Scanner(System.in);
//            String searchName = in.nextLine();
//            String strSearch = "select * from student where name like '%" + searchName + "%'";
//            ResultSet rset4 = stmt.executeQuery(strSearch);
//            int rowCount = 0;
//            while (rset4.next()) {
//                int studentID = rset4.getInt("studentID");
//                String sname = rset4.getString("name");
//                System.out.println(studentID + ", " + sname);
//                ++rowCount;
//            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


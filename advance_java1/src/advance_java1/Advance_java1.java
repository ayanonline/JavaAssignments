/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package advance_java1;

/**
 *
 * @author user
 */
import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class Advance_java1 {

    /**
     * @param args the command line arguments
     */
    static final String url = "jdbc:mysql://localhost:3306/mca_b";

    void display(Statement stmt, Scanner sc) throws Exception {
        System.out.print("Enter the Id which You want to see: ");
        int userId = sc.nextInt();
        ResultSet rs = stmt.executeQuery("select * from registration where id=" + userId);
        while (rs.next()) {
            System.out.println(rs.getInt("id") + "  " + rs.getString("f_name") + "  " + rs.getString("l_name") + "  "
                    + rs.getInt("age"));
        }
    }

    void insert(Statement stmt, Scanner sc) throws Exception {
        System.out.print("Enter Your first name: ");
        String firstName = sc.next();
        System.out.print("\nEnter Your last name: ");
        String lastName = sc.next();
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();

        int result = stmt.executeUpdate("insert into registration(f_name,l_name,age) values(" + "'" + firstName + "',"
                + "'" + lastName + "'," + age + ")");
        if (result > 0)
            System.out.println("successfully inserted");
        else
            System.out.println("unsucessful insertion ");
    }

    void update(Statement stmt, Scanner sc) throws Exception {
        System.out.print("Enter the id which you want to update : ");
        int userId = sc.nextInt();
        System.out.print("\nEnter new fist name : ");
        String firstName = sc.next();
        System.out.print("\nEnter new last name : ");
        String lastName = sc.next();
        System.out.print("\nEnter new age : ");
        int newAge = sc.nextInt();

        int result = stmt.executeUpdate("update registration set f_name=" + "'" + firstName + "',l_name=" + "'"
                + lastName + "',age=" + newAge + " where id=" + userId);
        if (result > 0)
            System.out.println("successfully updated user > " + userId);
        else
            System.out.println("unsucessful updation");
    }

    void delete(Statement stmt, Scanner sc) throws Exception {
        System.out.print("Enter the id which you want to delete : ");
        int userId = sc.nextInt();
        int result = stmt.executeUpdate("delete from registration where id=" + userId);
        if (result > 0)
            System.out.println("successfully deleted user> " + userId);
        else
            System.out.println("unsucessful deletion");
    }

    public static void main(String args[]) {
        Advance_java1 obj = new Advance_java1();
        Scanner sc = new Scanner(System.in);
        int choice;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mca_b", "root", "");
            // here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();

            do {
                System.out.println("1.Insert\n2.display\n3.update\n4.delete");
                System.out.print("Enter Your choice : ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        obj.insert(stmt, sc);
                        break;
                    case 2:
                        obj.display(stmt, sc);
                        break;
                    case 3:
                        obj.update(stmt, sc);
                        break;
                    case 4:
                        obj.delete(stmt, sc);
                        break;
                }
            } while (choice != 5);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

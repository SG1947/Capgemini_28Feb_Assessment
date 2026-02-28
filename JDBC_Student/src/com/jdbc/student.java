package com.jdbc;
import java.sql.*;
import java.util.Scanner;
public class student {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/JDBC";
		String username="root";
		String password="root";
		try {
            Scanner sc = new Scanner(System.in);
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish Connection
            Connection conn = DriverManager.getConnection(url, username, password);

            int choice = 0;

            while (choice != 5) {
                System.out.println("\n===== Student Management System =====");
                System.out.println("1. Add Student");
                System.out.println("2. Update Student Marks");
                System.out.println("3. Delete Student");
                System.out.println("4. View All Students");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    // 1️. Insert Student
                    case 1:
                        System.out.println("Enter Student Id:");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Student Name:");
                        String name = sc.nextLine();

                        System.out.println("Enter Student Marks:");
                        double marks = sc.nextDouble();

                        PreparedStatement st = conn.prepareStatement(
                                "INSERT INTO Student VALUES(?,?,?)");

                        st.setInt(1, id);
                        st.setString(2, name);
                        st.setDouble(3, marks);

                        int res = st.executeUpdate();

                        if (res > 0) {
                            System.out.println("Record inserted successfully");
                        }

                        break;

                    // 2️. Update Student Marks
                    case 2:
                        System.out.println("Enter Student ID to update:");
                        int searchid = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter New Marks:");
                        double newMarks = sc.nextDouble();
                        //Create Prepared Statement
                        PreparedStatement st1 = conn.prepareStatement(
                                "UPDATE Student SET marks=? WHERE id=?");

                        st1.setDouble(1, newMarks);
                        st1.setInt(2, searchid);
						
                        //Execute Query/Update
                        int res1 = st1.executeUpdate();
						
                        //Process Result
                        if (res1 > 0) {
                            System.out.println("Record updated successfully for ID: " + searchid);
                        } 
                        else {
                            System.out.println("Student not found.");
                        }

                        break;

                    // 3️. Delete Student
                    case 3:
                        System.out.println("Enter Student ID to delete:");
                        int deleteid = sc.nextInt();

                        PreparedStatement st2 = conn.prepareStatement(
                                "DELETE FROM Student WHERE id=?");

                        st2.setInt(1, deleteid);

                        int res2 = st2.executeUpdate();

                        if (res2 > 0) {
                            System.out.println("Record deleted successfully for ID: " + deleteid);
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;

                    // 4️. View All Students
                    case 4:
                        String query = "SELECT * FROM Student";

                        PreparedStatement st3 = conn.prepareStatement(query);
                        ResultSet rs = st3.executeQuery();

                        System.out.println("ID\tName\tMarks");
                        System.out.println("-------------------------");

                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + "\t" +
                                    rs.getString(2) + "\t" +
                                    rs.getDouble(3)
                            );
                        }
                        break;

                    case 5:
                        System.out.println("Exiting program");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } 

        } 
		//Exception Handling
		catch (Exception e) {
            System.out.println(e.getMessage());
        }

	}

}


package com.example.jsp.dao;

import com.example.jsp.bean.Employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    public static Connection getConnection() throws Exception{
        Connection con;
        Class.forName("org.postgresql.Driver");
        con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Employee", "postgres", "Rujan123");
        return con;
    }

//    public static int insertEmployee(Employee employee, InputStream inputStream) throws Exception{
//        int status;
//        Connection con=getConnection();
//        System.out.println(employee.getHobbies());
//        PreparedStatement stmt=con.prepareStatement("INSERT INTO employeeInfo(emp_name,gender,country,hobbies,photo_filename,photo) VALUES (?,?,?,?,?,?)");
//        stmt.setString(1,employee.getEmp_name());
//        stmt.setString(2,employee.getGender());
//        stmt.setString(3,employee.getCountry());
//        stmt.setString(4,employee.getHobbies());
//        stmt.setString(5,employee.getPhoto_filename()); // Set the filename in the query
//        stmt.setBinaryStream(6, inputStream); // Set the photo data in the query
//        status = stmt.executeUpdate();
//
//        return status;
//    }

//    public static List<Employee> selectAllEmployees() throws Exception{
//        List<Employee> list=new ArrayList<>();
//        Connection con=getConnection();
//        PreparedStatement stmt=con.prepareStatement("SELECT * FROM employeeInfo");
//        ResultSet rs=stmt.executeQuery();
//        while(rs.next()){
//            Employee employee=new Employee();
//            employee.setEmp_id(rs.getInt("emp_id"));
//            employee.setEmp_name(rs.getString("emp_name"));
//            employee.setGender(rs.getString("gender"));
//            employee.setCountry(rs.getString("country"));
//            employee.setHobbies(rs.getString("hobbies"));
//            employee.setPhoto(new File(rs.getString("photo")));
//            employee.setResume(rs.getClob("resume"));
//            list.add(employee);
//        }
//        return list;
//    }
}

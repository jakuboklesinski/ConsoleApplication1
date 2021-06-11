package com.company;
import java.sql.*;

public class DB {
    String url, dbName, driver, userName, dbpassword;
    public DB(){
        url = "jdbc:mysql://localhost:3306";
        dbName = "/aeh";
        driver = "com.mysql.jdbc.Driver";
        userName = "root";
        dbpassword = "";
    }

    public String getTab(String tab){
        String costam="";
        try {
// loading driver
            Class.forName(driver);
// Connection set up with database named as user
            Connection c = DriverManager.getConnection(url+dbName,userName,dbpassword);
// Creating statement for the connection to use sql queries
            Statement st = c.createStatement();
// Executing sql query using the created statement over the table user_details located in the database pointing by the dsn
            ResultSet rs = st.executeQuery("SELECT * from "+tab);
// Accessing the result of query execution
            while(rs.next())
            {
                String imie = rs.getString(2);
                String nazwisko = rs.getString(3);
                costam+=imie+" "+nazwisko;
            }
// Closing the statement and connection
            st.close();
            c.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return costam;

    }
}



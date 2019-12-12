package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Zekrom78");
            System.out.println("yooo");

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from pantientgegevens");

            while(rs.next())
                System.out.println(
                        "ID: "+rs.getString(1)+"\n"+
                        "Naam: "+rs.getString(3)+"\n"+
                        "Achternaam: "+rs.getString(4)+"\n"+
                        "Straat: "+rs.getString(5)+"\n"+
                        "email: "+rs.getString(6)+"\n"+
                        "Bloedsuiser: "+rs.getString(7)+"\n");
            con.close();
        }
        catch(Exception e){ System.out.println(e);}
    }

}


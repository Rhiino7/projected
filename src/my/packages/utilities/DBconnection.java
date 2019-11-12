/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.packages.utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rhino
 */


public class DBconnection {
    
    public boolean connect(){
        Connection c = null;
      
        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:DB.db");
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
           return false;
        }
        System.out.println("Opened database successfully");
        return true;
    }
    
    public boolean isDBOnline(){
        Connection c = null;
      
        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:DB.db");
            return c.isValid(0);
        } catch ( ClassNotFoundException | SQLException e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
           return false;
        }
    }
    
    public boolean createDB(){
        Connection c = null;
        Statement stmt = null;
        String sql = null;

        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:data/DB.db");
           System.out.println("Opened database successfully");

           stmt = c.createStatement();
           sql = "CREATE TABLE LUGAR " +
                          "(ID	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE," +
                          " NAME           TEXT    NOT NULL, " + 
                          " CAPACIDAD            INT     NOT NULL);"; 
           stmt.executeUpdate(sql);
           sql = "CREATE TABLE  USUARIO" +
                          "(ID	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE," +
                          " FIRST_NAME         TEXT         NOT NULL, " + 
                          " LAST_NAME          TEXT         NOT NULL, " + 
                          " AGE            INT              NOT NULL, " +
                          " USER               TEXT         NOT NULL, " + 
                          " PASS               TEXT         NOT NULL, " + 
                          " IDN                TEXT         NOT NULL, " + 
                          " NUMID          INT              NOT NULL UNIQUE, " + 
                          " GENDER             TEXT         NOT NULL, " + 
                          " EMAIL              TEXT         NOT NULL, " + 
                          " CITY               TEXT         NOT NULL, " + 
                          " NUMBER         INT              NOT NULL,"  +
                          " MANAGER        INT              NOT NULL,"  +
                          " ADMIN          INT              NOT NULL);" ;
           stmt.executeUpdate(sql);
           sql = "CREATE TABLE  MANAGER" +
                          "(ID	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE," +
                          " FIRST_NAME         TEXT         NOT NULL, " + 
                          " LAST_NAME          TEXT         NOT NULL, " + 
                          " AGE            INT              NOT NULL, " +
                          " USER               TEXT         NOT NULL, " + 
                          " PASS               TEXT         NOT NULL, " + 
                          " IDN                TEXT         NOT NULL, " + 
                          " NUMID          INT              NOT NULL UNIQUE, " + 
                          " GENDER             TEXT         NOT NULL, " + 
                          " EMAIL              TEXT         NOT NULL, " + 
                          " CITY               TEXT         NOT NULL, " + 
                          " NUMBER         INT              NOT NULL, " +
                          " RATE           INT              NOT NULL,"   +
                          " ADMIN          INT              NOT NULL);" ;
           stmt.executeUpdate(sql);
           sql = "CREATE TABLE EVENTO(\n" +
                        "ID	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
                        "NAME           TEXT    NOT NULL, \n" +
                        "ARTIST         TEXT    NOT NULL,\n" +
                        "LUGAR          TEXT    NOT NULL,\n" +
                        "MANAGER        TEXT    NOT NULL,\n" +
                        "DATE           TEXT    NOT NULL,\n" +
                        "PRECIO         INT     NOT NULL,\n" +
                        "FOREIGN KEY (LUGAR) REFERENCES LUGAR(NAME),\n" +
                        "FOREIGN KEY(MANAGER) REFERENCES MANAGER(FIRST_NAME))"; 
           stmt.executeUpdate(sql);
           /*
           sql = "CREATE TABLE  TICKET" +
                          "(ID	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE," +
                          " NUMBER         INT              NOT NULL UNIQUE, " + 
                          " NAME               TEXT         NOT NULL, " + 
                          " PRECIO         INT              NOT NULL,"  +
                          " FOREIGN KEY(NAME) REFERENCES USUARIO(FIRST_NAME));";
           stmt.executeUpdate(sql);
           */
           
           stmt.close();
           c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           //System.exit(0);
           return false;
        }
        System.out.println("DB created successfully");
        return true;
    }
        
    public boolean table(){
        Connection c = null;
        Statement stmt = null;

        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:DB.db");
           System.out.println("Opened database successfully");

           stmt = c.createStatement();
           String sql = "CREATE TABLE COMPANY " +
                          "(ID INT PRIMARY KEY     NOT NULL," +
                          " NAME           TEXT    NOT NULL, " + 
                          " AGE            INT     NOT NULL, " + 
                          " ADDRESS        CHAR(50), " + 
                          " SALARY         REAL)"; 
           stmt.executeUpdate(sql);
           stmt.close();
           c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
           return false;
        }
        System.out.println("Table created successfully");
        return true;
    }
    
    public boolean insert(String name, String[] data){
        Connection c = null;
        Statement stmt = null;

        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:data/DB.db");
           c.setAutoCommit(false);
           System.out.println("Opened database successfully");
           
           stmt = c.createStatement();
           String sql = null;
           switch(name){
               case "Lugar":{
                   sql = "INSERT INTO LUGAR (NAME, CAPACIDAD) VALUES ('"+data[0]+"', "+data[1]+");";
                   stmt.executeUpdate(sql);
                   break;
               }
               case "Usuario":{
                   sql = "INSERT INTO USUARIO (FIRST_NAME,LAST_NAME,AGE,USER,PASS,IDN,NUMID,GENDER,EMAIL,CITY,NUMBER,MANAGER,ADMIN) VALUES ('"
                                                                          +data[0]+"', '"+data[1]+"', "+data[2]+", '"+data[3]+"', '"+data[4]+
                                                                      "', '"+data[5]+"', "+data[6]+", '"+data[7]+"', '"+data[8]+"', '"+data[9]+
                                                                      "', "+data[10]+", "+data[11]+", "+data[12]+");";
                   stmt.executeUpdate(sql);
                   break;
               }
               case "Manager":{
                   sql = "INSERT INTO MANAGER (FIRST_NAME, LAST_NAME, AGE, USER, PASS, IDN, NUMID, GENDER, EMAIL, CITY, NUMBER, RATE, ADMIN) VALUES ('"
                                                                          +data[0]+"', '"+data[1]+"', "+data[2]+", '"+data[3]+"', '"+data[4]+
                                                                      "', '"+data[5]+"', "+data[6]+", '"+data[7]+"', '"+data[8]+"', '"+data[9]+
                                                                      "', "+data[10]+", "+data[11]+", "+data[12]+");";
                   stmt.executeUpdate(sql);
                   break;
               }
               case "Evento":{
                   sql = "INSERT INTO EVENTO (NAME, ARTIST, LUGAR, MANAGER, DATE, PRECIO) VALUES ('"+data[0]+"', '"+data[1]+"', '"+data[2]+
                                                                                                 "', '"+data[3]+"', '"+data[4]+"', "+data[5]+");";
                   stmt.executeUpdate(sql);
                   break;
               }
               default:break;
           }
           
           stmt.close();
           c.commit();
           c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
           return false;
        }
        System.out.println("Records created successfully");
        return true;
    }
    
    public ArrayList<String> selectInfo(String user){
        Connection c = null;
        Statement stmt = null;
        ArrayList<String> usuario = new ArrayList<>();
        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:data/DB.db");
           c.setAutoCommit(false);
           System.out.println("Opened database successfully");

           stmt = c.createStatement();
           ResultSet rs = stmt.executeQuery( "SELECT * FROM USUARIO WHERE USER='"+user+"';" );
           
           while ( rs.next() ) {
              String name = rs.getString(2);
              usuario.add(name);
              String apellido = rs.getString(3);
              usuario.add(apellido);
              String age = rs.getString(4);
              usuario.add(age);
              String userd = rs.getString(5);
              usuario.add(userd);
              String pass = rs.getString(6);
              usuario.add(pass);
              String IDN = rs.getString(7);
              usuario.add(IDN);
              String NUMID = rs.getString(8);
              usuario.add(NUMID);
              String GENDER = rs.getString(9);
              usuario.add(GENDER);
              String email = rs.getString(10);
              usuario.add(email);
              String city = rs.getString(11);
              usuario.add(city);
              String number = rs.getString(12);
              usuario.add(number);
           }
           rs.close();
           stmt.close();
           c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
           return null;
        }
        System.out.println("Operation done successfully");
        return usuario;
    }
    
    public ArrayList<String> selectEventos(){
        Connection c = null;
        Statement stmt = null;
        ArrayList<String> eventos = new ArrayList<>();
        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:data/DB.db");
           c.setAutoCommit(false);
           System.out.println("Opened database successfully");

           stmt = c.createStatement();
           ResultSet rs = stmt.executeQuery( "SELECT NAME FROM EVENTO;" );
           
           while ( rs.next() ) {
              String name = rs.getString("NAME");
              eventos.add(name);
           }
           rs.close();
           stmt.close();
           c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
           return null;
        }
        System.out.println("Operation done successfully");
        return eventos;
    }
    
    public boolean select(){
        Connection c = null;
        Statement stmt = null;
        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:data/DB.db");
           c.setAutoCommit(false);
           System.out.println("Opened database successfully");

           stmt = c.createStatement();
           ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );

           while ( rs.next() ) {
              int id = rs.getInt("id");
              String  name = rs.getString("name");
              int age  = rs.getInt("age");
              String  address = rs.getString("address");
              float salary = rs.getFloat("salary");

              System.out.println( "ID = " + id );
              System.out.println( "NAME = " + name );
              System.out.println( "AGE = " + age );
              System.out.println( "ADDRESS = " + address );
              System.out.println( "SALARY = " + salary );
              System.out.println();
           }
           rs.close();
           stmt.close();
           c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
           return false;
        }
        System.out.println("Operation done successfully");
        return true;
    }
        
    public boolean login(String name, String pass){
        Connection c = null;
        Statement stmt = null;
        String password = null;

        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:data/DB.db");
           c.setAutoCommit(false);
           System.out.println("Opened database successfully");
           
           stmt = c.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT PASS FROM USUARIO WHERE USER='"+name+"'");
           password = rs.getString("pass");
           
           if(!password.equals(pass))
               return false;
           
           stmt.close();
           c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           return false;
        }
        System.out.println("Operation done successfully");
        return true;
    }
    
    public boolean updateUsuario(String[] info){
        Connection c = null;
        Statement stmt = null;

        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:data/DB.db");
           c.setAutoCommit(false);
           System.out.println("Opened database successfully");
           int iden = 0;
           
           String stmt1 = "SELECT ID FROM USUARIO WHERE USER='"+info[3]+"';";
           ResultSet rs = stmt.executeQuery(stmt1);
           while(rs.next()){
               iden = rs.getInt("ID");
           }
           
           String name = info[0];
           String apellido = info[1];
           String age = info[2];
           String useri = info[3];
           String passi = info[4];
           String idn = info[5];
           String numid = info[6];
           String gender = info[7];
           String email = info[8];
           String city = info[9];
           String number = info[10];
           
           stmt = c.createStatement();
           String sql = "UPDATE USUARIO SET FIRST_NAME= '"+name+"', LAST_NAME= '"+apellido+"', AGE= "+Integer.parseInt(age)+", USER= '"+useri+"', PASS= '"+passi+"', IDN= '"+
                                                          idn+"', NUMID= "+numid+", GENDER= '"+gender+"', EMAIL= '"+email+"', CITY= '"+city+"', NUMBER= "+number+" where ID="+iden+";";
           stmt.executeUpdate(sql);
           c.commit();
           
           rs.close();
           stmt.close();
           c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
           return false;
        }
        System.out.println("Operation done successfully");
        return true;
    }
    
    public boolean update(){
        Connection c = null;
        Statement stmt = null;

        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:data/DB.db");
           c.setAutoCommit(false);
           System.out.println("Opened database successfully");

           stmt = c.createStatement();
           String sql = "UPDATE COMPANY set SALARY = 25000.00 where ID=1;";
           stmt.executeUpdate(sql);
           c.commit();

           ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );

           while ( rs.next() ) {
              int id = rs.getInt("id");
              String  name = rs.getString("name");
              int age  = rs.getInt("age");
              String  address = rs.getString("address");
              float salary = rs.getFloat("salary");

              System.out.println( "ID = " + id );
              System.out.println( "NAME = " + name );
              System.out.println( "AGE = " + age );
              System.out.println( "ADDRESS = " + address );
              System.out.println( "SALARY = " + salary );
              System.out.println();
           }
           rs.close();
           stmt.close();
           c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
           return false;
        }
        System.out.println("Operation done successfully");
        return true;
    }
    
    public boolean delete(){
        Connection c = null;
        Statement stmt = null;

        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:test.db");
           c.setAutoCommit(false);
           System.out.println("Opened database successfully");

           stmt = c.createStatement();
           String sql = "DELETE from COMPANY where ID=2;";
           stmt.executeUpdate(sql);
           c.commit();

           ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );

           while ( rs.next() ) {
           int id = rs.getInt("id");
           String  name = rs.getString("name");
           int age  = rs.getInt("age");
           String  address = rs.getString("address");
           float salary = rs.getFloat("salary");

           System.out.println( "ID = " + id );
           System.out.println( "NAME = " + name );
           System.out.println( "AGE = " + age );
           System.out.println( "ADDRESS = " + address );
           System.out.println( "SALARY = " + salary );
           System.out.println();
        }
        rs.close();
        stmt.close();
        c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
           return false;
        }
        System.out.println("Operation done successfully");
        return true;
    }
}

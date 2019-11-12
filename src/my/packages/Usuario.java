/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.packages;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author rhino
 */
public class Usuario {
    protected String first_name; //nombre
    protected String last_name; // apellido
    protected int age; // edad
    protected String password; // contraseña
    protected String user; // nombre de usuario
    protected String ID; //tipo identificacion
    protected int numID; //numero identificacion
    protected String gender; //genero
    protected String email; //correo
    protected String city; //ciudad
    protected int number; //celular
    protected int manager; // 1 = manager, 0 = no manager
    protected int admin; // 1 = admin, 0 = no admin
    private Queue<Ticket> tickets;
    static private String[] data = new String[13];

    public Usuario(String first_name, String last_name, int age, String user,
                   String password, String ID, int numID, String gender, String email, String city, int number, int manager, int admin) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.user = user;
        this.password = password;
        this.ID = ID;
        this.numID = numID;
        this.gender = gender;
        this.email = email;
        this.city = city;
        this.number = number;
        this.manager = manager;
        this.admin = admin;
        this.tickets = new LinkedList<Ticket>();
        fill();
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Queue<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Queue<Ticket> tickets) {
        this.tickets = tickets;
    }

    public static String[] getData() {
        return data;
    }

    public static void setData(String[] data) {
        Usuario.data = data;
    }
    
    public void fill(){
        data[0] = first_name;
        data[1] = last_name;
        data[2] = Integer.toString(age);
        data[3] = user;
        data[4] = password;
        data[5] = ID;
        data[6] = Integer.toString(numID);
        data[7] = gender;
        data[8] = email;
        data[9] = city;
        data[10] = Integer.toString(number);
        data[11] = Integer.toString(manager);
        data[12] = Integer.toString(admin);
    }
}

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
public class Manager extends Usuario{
    private Queue<Evento> eventos;
    private int rate;
    static private String[] data = new String[13];

    public Manager(String first_name, String last_name, int age, String user,
                   String password, String ID, int numID, String gender, String email, String city, int number,int rate, int admin) {
        
        super(first_name, last_name, age, user, password, ID, numID, gender, email, city, number, 1, admin);
        this.eventos = new LinkedList<Evento>();
        this.rate = rate;
        fill();
    }

    public Queue getEventos() {
        return eventos;
    }

    public void setEventos(Queue eventos) {
        this.eventos = eventos;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public static String[] getData() {
        return data;
    }

    public static void setData(String[] data) {
        Manager.data = data;
    }
    
    
    @Override
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
        data[11] = Integer.toString(rate);
        data[12] = Integer.toString(admin);
    }
}

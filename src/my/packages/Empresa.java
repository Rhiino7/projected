/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.packages;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import my.packages.utilities.DBconnection;

/**
 *
 * @author rhino
 */
public class Empresa {
    
    private DBconnection connection = new DBconnection();
    
    private Queue<Evento> eventos;
    private Manager[] managers;
    private ArrayList<Usuario> users;
    private Lugar[] lugares;
    
    static public int columnsE = 8;
    static public int columnsM = 12;
    static public int columnsU = 11;
    static public int columnsL = 2;

    public Empresa() {
        this.eventos = new LinkedList<>(); //N eventos
        this.managers = new Manager[10]; //10 managers
        this.users = new ArrayList<>(); //N usuarios
        this.lugares = new Lugar[5]; // 5 lugares
        File db = new File("data/DB.db");
        if(!db.exists()){
            connection.createDB();
            this.fill();
        }else{
            
        }
    }
    
    public boolean fill(){
        try{
            int n = 20;
            addUsuario("cesar", "solano", 22, "rhino", "1234", "Cedula", -1, "masculino", "csolanoc@unal.edu.co", "bogota",-1, 0, 1);
            for(int i=0;i<n;i++){
                if(i<10)
                    addManager("manager"+i, "co"+1, i, "managerUser"+i, "managerPass"+i, "cedula", i, "masculino", "managerEmail"+1, "bogota", i, 1, 0);
                else
                    addUsuario("usuario"+i, "apellido"+i, i, "user"+i, "pass"+i, "cedula", i, "femenino", "email"+i, "bogota", i, 0, 0);
                if(i<5){
                    int r = (int) (1000 + Math.random() * (10000 - 1001));
                    addLugar("lugar"+i, r);
                }
            }
            
            for(int i=0;i<10;i++){
                int m = (int)(Math.random()*10+1);
                int r = (int)(Math.random()*5+1);
                int month = (int)(1 + Math.random()*(12-2));
                int day = (int)(1 + Math.random()*(31-2));
                addEvento("evento"+i, "artista"+i, managers[i%10], lugares[i%5], 2020, month, day, 10000);
            }
        } catch(Exception e){
            System.out.println("Problemas al crear datos.");
        }
        return true;
    }
    
    public boolean addLugar(String name, int capacidad){
        try{
            Lugar l = new Lugar(name, capacidad);
            for(int i=0;i<lugares.length;i++){
                if(lugares[i] == null){
                    lugares[i] = l;
                    break;
                }
            }
            connection.insert("Lugar", l.getData());
        }catch(Exception e){
            System.out.println("No se pudo agregar el lugar.");
        }
        return true;
    }
    
    public boolean addUsuario(String nombre, String apellido, int edad, String usuario,
                              String password, String ID, int numID, String genero, 
                              String email, String ciudad, int numero, int manager, int admin){
        try{
            Usuario u = new Usuario(nombre, apellido, edad, usuario, password, ID, numID, genero, email, ciudad, numero, manager, admin);
            users.add(u);
            connection.insert("Usuario", u.getData());
        }catch(Exception e){
            System.out.println("No se pudo agregar el usuario.");
            return false;
        }
        return true;
    }
    
    public boolean addManager(String nombre, String apellido, int edad, String usuario,
                              String password, String ID, int numID, String genero, 
                              String email, String ciudad, int numero, int rate, int admin){
        try{
            Manager m = new Manager(nombre, apellido, edad, usuario, password, ID, numID, genero, email, ciudad, numero, rate, admin);
            for(int i=0;i<managers.length;i++){
                if(managers[i] == null){
                    managers[i] = m;
                    break;
                }
            }
            connection.insert("Manager", m.getData());
        }catch(Exception e){
            System.out.println("No se pudo agregar el manager.");
            return false;
        }
        
        return true;
    }
    
    public boolean addEvento(String nombre, String artista, Manager manager,  Lugar lugar, int year, int month, int day, int precio){
        
        try{
            Evento e = new Evento(nombre, artista, manager, lugar, year, month, day, precio);
            eventos.add(e);
            connection.insert("Evento", e.getData());
        }catch(Exception e){
            System.out.println("No se pudo agregar el evento.");
            return false;
        }
        return true;
    }
    
        
    public Queue<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(Queue<Evento> eventos) {
        this.eventos = eventos;
    }
    
    public Manager[] getManagers() {
        return managers;
    }

    public void setManagers(Manager[] managers) {
        this.managers = managers;
    }
    
    public ArrayList<Usuario> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Usuario> users) {
        this.users = users;
    }
    
    public Lugar[] getLugares() {
        return lugares;
    }

    public void setLugares(Lugar[] lugares) {
        this.lugares = lugares;
    }

    public DBconnection getConnection() {
        return connection;
    }

    public void setConnection(DBconnection connection) {
        this.connection = connection;
    }
    
    
}

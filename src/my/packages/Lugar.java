/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.packages;

import java.util.ArrayList;

/**
 *
 * @author rhino
 */
public class Lugar {
    private String nombre;
    private int[] sillas;
    private ArrayList<Integer> sillasEscogidas;
    private ArrayList<Integer> sillasLibres;
    private int capacidad;
    private int precio;
    static private String[] data = new String[2];

    public Lugar(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.sillasEscogidas = new ArrayList<Integer>();
        this.sillasLibres = new ArrayList<Integer>();
        this.precio = 0;
        this.sillas = fullCap(); // fullCap solo llena la pila y el array de numero 1 hasta n
        fill();
    }
        

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getSillasEscogidas() {
        return sillasEscogidas;
    }

    public void setSillasEscogidas(ArrayList<Integer> sillasEscogidas) {
        this.sillasEscogidas = sillasEscogidas;
    }

    public ArrayList<Integer> getSillasLibres() {
        return sillasLibres;
    }

    public void setSillasLibres(ArrayList<Integer> sillasLibres) {
        this.sillasLibres = sillasLibres;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int[] getSillas() {
        return sillas;
    }

    public void setSillas(int[] sillas) {
        this.sillas = sillas;
    }

    public static String[] getData() {
        return data;
    }

    public static void setData(String[] data) {
        Lugar.data = data;
    }
    
    
    
    public int[] fullCap(){
        this.sillas = new int[this.capacidad];
        for(int i=0;i<this.capacidad;i++){
            sillas[i] = i+1;
            this.sillasLibres.add(i+1);
        }
        return sillas;
    }
    
    public void fill(){
        data[0] = getNombre();
        data[1] = Integer.toString(getCapacidad());
    }
}

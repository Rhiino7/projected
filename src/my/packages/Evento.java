/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.packages;

import java.time.LocalDate;

/**
 *
 * @author rhino
 */
public class Evento {
    private String nombre;
    private String artista;
    private Manager manager;
    private LocalDate date;
    private Lugar lugar;
    static private String[] data = new String[6];

    public Evento(String nombre, String artista, Manager manager, Lugar lugar, int year, int month, int day, int precio) {
        this.nombre = nombre;
        this.artista = artista;
        this.manager = manager;
        this.date = LocalDate.of(year, month, day);
        this.lugar = lugar;
        this.lugar.setPrecio(precio);
        fill();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public static String[] getData() {
        return data;
    }

    public static void setData(String[] data) {
        Evento.data = data;
    }
    
    
    
    public void fill(){
        data[0] = getNombre();
        data[1] = getArtista();
        data[2] = getLugar().getNombre();
        data[3] = getManager().getFirst_name();
        data[4] = getDate().toString();
        data[5] = Integer.toString(getLugar().getPrecio());
    }
        
    public void update(Lugar lugar){
        this.lugar = lugar;
        data[2] = getLugar().getNombre();
    }
    
    public void update(Manager manager){
        this.manager = manager;
        data[3] = getManager().getFirst_name();
    }
}

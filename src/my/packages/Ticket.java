/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.packages;

/**
 *
 * @author rhino
 */
public class Ticket implements Comparable<Ticket>{
    private int numero;
    private Usuario comprador;
    private int precio;
    private int tipo; // 1 = platino, 2 = oro, 3 = plata
    private String[] data = new String[3];

    public Ticket(int numero, Usuario comprador, int precio) {
        this.numero = numero;
        this.comprador = comprador;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void fill(){
        data[0] = Integer.toString(this.numero);
        data[1] = this.comprador.getFirst_name();
        data[2] = Integer.toString(this.precio);
        
    }
    
    public int getTipo(){
        return this.tipo;
    }
    
    public String[] getData(){
        return this.data;
    }

    @Override
    public int compareTo(Ticket o) {
        if(this.tipo < o.getTipo())
            return 1;
        else if(this.tipo > o.getTipo())
            return -1;
        else
            return 0;
    }
}

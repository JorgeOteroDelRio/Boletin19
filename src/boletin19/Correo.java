/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author Jota
 */
public class Correo {
    private String contido;
    private boolean leido=false;
    
    public Correo(String contido){
        this.contido=contido;
    }

    @Override
    public String toString() {
        return "Correo{" + contido + '}';
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
    
    
    
    
}

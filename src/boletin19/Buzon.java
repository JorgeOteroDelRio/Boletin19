/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;
import java.util.ArrayList;
/**
 *
 * @author Jota
 */
public class Buzon {
    private ArrayList<Correo> buzon=new ArrayList();
    
    public int numeroDeCorreos(){
        int count=0;
        for(int i=0;i<buzon.size();i++){
            if(buzon.get(i)!=null){
                count++;
            }
        }
        return count;     
    }
    
    public void engade(Correo c){
        buzon.add(c);
    }
    
    public boolean porLer(){
        for(int i=0;i<buzon.size();i++){
            if(!buzon.get(i).isLeido()){
                return true;
            }
        }
        return false;
    }
    
    public String amosaPrimerNoLeido(){
        for(int i=0;i<buzon.size();i++){
            if(!buzon.get(i).isLeido()){
                return buzon.get(i).toString();
            }
        }
        return "Todos los correos han sido leidos";
    }
    
    public String amosa(int k){
        buzon.get(k).setLeido(true);
        return buzon.get(k).toString();
    }
    
    public void elimina(int k){
        buzon.remove(k);
        
    }
}



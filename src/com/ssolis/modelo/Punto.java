package com.ssolis.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Punto {
    
    private int x;
    private int y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "P ("+getX()+","+getY()+")";
                }

    public static double calcularDistancia(Punto p1, Punto p2){
        double v1=Math.pow((double)p2.getX()-(double)p1.getX(),2);
        double v2=Math.pow((double)p2.getY()-(double)p1.getY(),2);
        return Math.sqrt(v2+v1);
    }
//        static ArrayList<Punto>puntos = new ArrayList<Punto>();
//    public static void almacenarPuntos(){
//        puntos.add(new Punto());
//    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
            
            
            
            
            
            
            
            
            
            


}

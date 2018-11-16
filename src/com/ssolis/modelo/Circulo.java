package com.ssolis.modelo;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Circulo {
    Punto p;
    int radio;

    public Circulo() {
    }

    public Circulo(Punto p, int radio) {
        this.p = p;
        this.radio = radio;
    }

    public void setP(Punto p) {
        this.p = p;
    }

    public Punto getP() {
        return p;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "el centro de"
                + "l círculo es: "+getP()+
                "\nTiene un radio de: "+getRadio();
        
    }
    
    
    
    
    
    
    
    
    
    
    
    

}










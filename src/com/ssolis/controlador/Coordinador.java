package com.ssolis.controlador;

import com.ssolis.modelo.Circulo;
import com.ssolis.modelo.Punto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Coordinador {
    ArrayList<Punto> puntos= new ArrayList<Punto>();
    ArrayList<Circulo> circulos= new ArrayList<Circulo>();
    
    public void almacenarPuntos(Punto p){
        p.setX(Integer.parseInt(JOptionPane.showInputDialog("Ingresa X:")));
         p.setY(Integer.parseInt(JOptionPane.showInputDialog("Ingresa Y:")));
         puntos.add(p);
    }
    public void calcularDistanciaEntreDosPuntos(){
        int p1,p2,cont=0;
        //do{
        p1 = Integer.parseInt(JOptionPane.showInputDialog(imprimirPuntos()+"\nIngresa un punto"))-1;
        p2 = Integer.parseInt(JOptionPane.showInputDialog(imprimirPuntos()+"\nIngresa un punto"))-1;
        double v1=Math.pow((puntos.get(p2).getX())-(puntos.get(p1).getX()),2);
        double v2=Math.pow((puntos.get(p2).getY())-(puntos.get(p1).getY()),2);
        JOptionPane.showMessageDialog(null,""+Math.sqrt(v1+v2));
//        cont++;
        //}while(cont!=2);
//imprimirPuntos();
    }
    
    public void crearCirculo(){
      //  circulos.add(new Circulo(puntos.get(0),Integer.parseInt(JOptionPane.showInputDialog("Ingresa radio"))));
    //JOptionPane.showMessageDialog(null,circulos.get(0));
    
    double pi = 3.14;
        double radio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio del circulo: "));
        double puntos = 2*radio*pi;
        double area = pi*Math.pow(radio,2);
        JOptionPane.showMessageDialog(null,"Puntos: "+puntos+"\n"+"Área: "+area);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
     public String imprimirPuntos(){
        String datos="";
        for (Punto punto : puntos) {
            datos +="\n"+(puntos.indexOf(punto)+1)+".- "+punto.toString();
        }
        //JOptionPane.showMessageDialog(null, datos);
        return datos;
    }
     
     public void menu(){
        int op=0;
        
        do{
        try{
            op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion:\n"
                 + "1.- Ingresar Punto\n"
                 + "2.- Calcular Distancia entre dos puntos\n"
                 + "3.- Calcular distancia a la torre de control\n"
                 + "4.- Imprimir Puntos\n"
                 + "5.- Crear circulo\n"  
                 + "6.- Salir"));
            switch (op) {
                case 1:
                    almacenarPuntos(new Punto());
                    break;
                case 2:
                    calcularDistanciaEntreDosPuntos();
                    System.out.println("CAso 2");
                    break;
                case 3:
                    
                    break; 
                case 4:
                    JOptionPane.showMessageDialog(null,imprimirPuntos());
                    break;
                case 5:
                    crearCirculo();
                    System.out.println("CAso 5");
                    break;
            } 
        }catch(Exception e){
            System.out.println("error");
            
        }
           
            
        }while(op!=6);
                 
     }
    
}














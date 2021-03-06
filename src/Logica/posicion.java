
package Logica;

import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import juego.Principal;

/**
 * Clase posicion que contiene los atributos y metodos que hacen posible visualizar el movimiento de las balas disparadas por el cañon
 * @author Juan David Reyes. 
 * @author Juan Ricardo Rodriguez Campos.
 */
public class posicion extends Thread{
    
    
    int i=0;
    JLabel bala,cubo,dis;
    int x,y;
    Principal principal;
/**
 * Constructor de la clase posicion que recibe como parametros para poder visualizar el movimiento realizado por la bala de cañon
 * @param bala
 * @param x
 * @param y
 * @param cubo
 * @param dis 
 */    
    public posicion(JLabel bala,int x,int y,JLabel cubo,JLabel dis){
        this.cubo=cubo;
        this.bala=bala;
        this.dis=dis;
        this.x=x;
        this.y=y;
        
    }
    /**
     * metodo datos para conocer las coordenadas del cubo
     */
    public void datos(){
        
        
        System.out.println("X :"+cubo.getX());
        System.out.println("Y :"+cubo.getY());
        
       
        
    }
    
    /**
     * metodo run que contiene la logica ejecutada por el hilo y realiza el movimiento de la bala disparada por el cañon
     */
    @Override
    public void run(){
        
        int n;
        int p=0;
       
            try {
                for(i=0;i<500;i++){
                    
                
                bala.setLocation(x,i);
                sleep(5);
                
                        System.out.println("Coordenada dispa en x :"+dis.getX());
                        System.out.println("Coordenada dispa en y :"+dis.getY());
                        System.out.println("Coordenada bala en x :"+bala.getX());
                        System.out.println("Coordenada bala en y :"+bala.getY());
                if((bala.getY() == dis.getY())&&(bala.getX()==dis.getX())){
                    i=0;
                }
                    if((bala.getY())==490){
                        System.out.println("Coordenada dispa en x :"+dis.getX());
                        System.out.println("Coordenada dispa en y :"+dis.getY());
                        System.out.println("Coordenada bala en x :"+bala.getX());
                        System.out.println("Coordenada bala en y :"+bala.getY());
                        
                        
                    }
                    
                
                
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(posicion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
    /**
     * 
     */
    public void reset(){
        this.i=0;
    }
    
}

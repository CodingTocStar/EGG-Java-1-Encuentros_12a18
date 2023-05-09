/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_2_distanciapuntos.newpackage;

import java.util.Scanner;


public class Puntos {
    //ATRIBUTOS
    private int x1;
    private int x2;
    
    private int y1;
    private int y2;
 
//=====================================================================
    //CONSTRUCTORES
    //vacio
    public Puntos (){
    }
    
    //con parametros
    public Puntos(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        
        this.y1 = y1;
        this.y2 = y2;
    }
 
//=====================================================================
    //METODOS
    // getter & setter
    public int getX1(){
        return x1;
    }
    
    public void setX1(int x1){
        this.x1 = x1;
    }
    //------------------------------------------------------
    public int getX2(){
        return x2;
    }
    
    public void setX2(int x2){
        this.x2 = x2;
    }
    //------------------------------------------------------
    public int getY1(){
        return y1;
    }
    
    public void setY1(int y1){
        this.y1 = y1;
    }
    //------------------------------------------------------
    public int getY2(){
        return y2;
    }
    
    public void setY2(int y2){
        this.y2 = y2;
    }
    
    //Crear puntos
    public void crearPuntos(){
        Scanner lector = new Scanner(System.in);
        //------------------------------------------------------
        System.out.println("Ingrese la coordenada x del primer punto:");
        int x1 = lector.nextInt();
        this.x1 = x1;
        //------------------------------------------------------
        System.out.println("Ingrese la coordenada y del primer punto:");
        
        
        
        
    }
    
}

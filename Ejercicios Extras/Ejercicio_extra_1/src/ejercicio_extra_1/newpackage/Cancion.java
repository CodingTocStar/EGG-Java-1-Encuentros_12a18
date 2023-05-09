/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_1.newpackage;

import java.util.Scanner;


public class Cancion {
    //ATRIBUTOS
    private String titulo;
    private String autor;
    
//=====================================================================    
    //CONSTRUCTORES
    
    
    //con propiedades
    public Cancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
        //vacio
    public Cancion (){
    }
    
//=====================================================================    
    //METODOS
    
    //Getter y Setter
    public String getTitulo (){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    //---------------------------------------------
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    //agregar cancion
    public void agregarCancion (){
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Agregue el titulo de la cancion:");
        String titulo = lector.nextLine();
        this.titulo = titulo;
        
        System.out.println("Agregue el autor de la cancion:");
        String autor = lector.nextLine();
        this.autor = autor;
    }
    
    
}

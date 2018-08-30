/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibros {
    //Asociacion
    private Libro[] coleccion;

    public ConjuntoLibros() {
        this.coleccion = new Libro[4];
    }

    public boolean anadirLibro( Libro libro){
        for(int c = 0; c < this.coleccion.length; c++){
          if(this.coleccion[c] == null){
            this.coleccion[c] = libro;
            return true;
          }
        }
        return false;
    }
    
    public boolean eliminarxTitulo (String titulo){
        for(int i = 0; i < this.coleccion.length; i++){
          if(this.coleccion.equals(titulo))
          {
            
          }
        }
        return false;
    }
    
    public boolean eliminarxAutor (String autor){
        return false;
    }
    
    public Libro obtenerMejorCalificacion (){
        return null;
    }
    
    public Libro obtenerPeorCalificacion (){
        return null;
    }
    
    public Libro[] obtenerTodos (){
        return this.coleccion;
    }
}


package clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Botas extends zapato {
    
       
  private double precio;
  private String materiaPrima;
  private String color;
  private int contador ;//solo es para que salga mocacin 1, mocacin 2 etcc
  
    public Botas(double precio, String materiaPrima, String color, String tipo, String Marca, double talla) {
        super(tipo, Marca, talla);
        this.precio = precio;
        this.materiaPrima = materiaPrima;
        this.color = color;
    }

  

  @Override
    public void File(String nombreArchivo) {
       
           try {
               FileWriter acrhivoEscritura = new FileWriter(new File(nombreArchivo),true);//para que se agregue mas texto
                             
               acrhivoEscritura.write(toString());//este es el metodo que el ingeniero nos dijom que era para mostrar los datos
               acrhivoEscritura.write(calzar());//se mostrara el metodo calzar
               
               
               acrhivoEscritura.close();//no se porque se debe cerrar el archivo
               
           } catch (IOException ex) {
               System.err.println(ex.getMessage());
           } 
   
        
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
    
    @Override
    public String calzar() {
        return "\n"+super.calzar()+" y solo valen "+precio+" lempiras\n\n"; 
    }

    
  
  @Override
      public String toString(){//el metodo que nos enseño el ingeniero
     return "Caracteristicas de la "+getTipo()+" "+contador//el contador se enviara desde el arraylist
            
             + "\n\nMarca: "+getMarca()+"\nPrecio: "+precio+"\nMateria Prima: "+materiaPrima+"\n"
             + "Talla: "+getTalla()+"\nColor: "+color;
        
        
        
    }
    
    
    
   
    
}

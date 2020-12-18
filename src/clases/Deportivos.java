
package clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Deportivos extends zapato{
    
    
  private double precio;
  private String color;
  private int contador;
  
    public Deportivos(double precio, String color, String tipo, String Marca, double talla) {
        super(tipo, Marca, talla);
        this.precio = precio;
     
        this.color = color;
    }

    public void setContador(int contador) {
        this.contador = contador;
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

  @Override
      public String toString(){
     return "Caracteristicas del zapato "+getTipo()+" "+contador
            
             + "\n\nMarca: "+getMarca()+"\nPrecio: "+precio+"\n"
             + "Talla: "+getTalla()+"\nColor: "+color;
        
        
    }

     @Override
    public String calzar() {
        return "\n"+super.calzar()+" y solo valen "+precio+" lempiras\n\n"; 
    }

    

//Metodos getters y setters

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
 

    
    
         
    
    
    
    
}

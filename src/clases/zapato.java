
package clases;


import java.io.File;
import java.util.Scanner;


public abstract class  zapato{
    
   private String tipo;//o seaa que zapato es y este lo pondra el usuario en el constructor
   private String Marca;
   private double talla;
   
    public zapato(String tipo, String Marca, double talla) {
        this.tipo = tipo;
        this.Marca = Marca;
        this.talla = talla;
    }

   

    public String calzar() {
        return "Que bien tengo mucha suerte me quedaran estos "+tipo+" de la marca "+Marca+" que son talla "+talla;
    }
    
public abstract void File(String nombreArchivo);

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }
    

}

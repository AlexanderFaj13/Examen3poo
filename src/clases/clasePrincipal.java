package clases;

import java.util.ArrayList;
import java.util.Scanner;

/*
Utilizando clases y empleando herencia realizar.

Un programa para el inventario de una tienda de zapatos. Está tendrá una clase padre, llamada zapato, este tendrá una propiedad talla (si desea le puede agregar más propiedades)

De ella heredarán 3 clases, ustede definirá los nombres y propiedades de las clases hijas.

La clase padre tendrá un metodo abstracto que implementará polimorfismo, dicho metodo será

void 2File(fileName), este metodo guardará las propiedades de este objeto en un archivo de texto.

La clase padre implementará un metodo String calzar(), devolverá la frase "Que bien me quedan estos NOMBRECLASE que son talla TALLA"

 

En el main..

Se le preguntará al usuario que tipo de zapato quiere agregar y segun el tipo le pedirá las cualidades, por cada tipo de zapato, se creará una instancia del objeto, la cual se guardará en un arraylist. 

Esto se repetirá hasta el que el usuario desee terminar de crear los zapatos. cuando el usuario decida terminar la ejecucion, se llamará el metodo 2file, para que guarde cada instancia del objeto en un archivo con el nombre que se le dio al zapato.

 

Se puede utilizar la clase de manejo de archivos que le pasé.

 

Se subirá el examen a su repositorio con el nombre examen3poo, aqui me pondrán el link de su repositorio.
 */
public class clasePrincipal {

    //Los atributos de la clase seran todos los arraylists que se llenjaran con los zapatos  y son estaticos para que le pertenezcan a la clase
  
    public static void main(String[] args) {
     ArrayList<Mocasines> mocasines = new ArrayList<>();//inicialmente estan vacios
     ArrayList<Deportivos> deportivos = new ArrayList<>();//inicialmente estan vacios
      ArrayList<Botas> botas = new ArrayList<>();//inicialmente estan vacios

        Scanner leerDatos = new Scanner(System.in);
        
        

        System.out.println("\t-----Fajado's Shoes-------");

        char decision = ' ';
        int accion;

        do {
            System.out.println("\nOpciones Disponibles");
            System.out.println("1.Agregar Mocasines a la bodega");
            System.out.println("2.Agregar Botas a la bodega");
            System.out.println("3.Agregar Zapatos Deportivos a la bodega");
            System.out.print("Ingrese el numero de la accion a realizar : ");

            accion = leerDatos.nextInt();

            switch (accion) {

                case 1:
        
       //Atributos de los Mocasines             
        double prize;
        double talla;
        String color;
        String marca;
        String materiaPrima;

       //pidiendo los datos al usuario
         leerDatos.nextLine();
         
        System.out.print("\nDigite la marca de los Mocasines: ");
        marca = leerDatos.nextLine();

        
        System.out.print("Digite el precio de los Mocasines: ");
        prize = leerDatos.nextDouble();
          
         leerDatos.nextLine();
           
        System.out.print("Digite la materia prima de que estan hechos los Mocasines: ");
        materiaPrima = leerDatos.nextLine();  
          
        
            
        
        System.out.print("Digite el color de los Mocasines: ");
        color = leerDatos.nextLine();
      
        System.out.print("Digite la talla de los Mocasines: ");
        talla = leerDatos.nextDouble();
    
        Mocasines mocasin = new Mocasines(prize, materiaPrima, color, "mocasin", marca, talla);
     
        mocasines.add(mocasin);//agregando los mocasines al arrayList

                    System.out.println("\n\nMocasines agregados correctamente\n");
                    
                    
                                    
                    break;

                case 2:

       //Atributos de las Botas             
        double prizeBotas;
        double tallaBotas;
        String colorBotas;
        String marcaBotas;
        String materiaPrimaBotas;

       //pidiendo los datos al usuario
         leerDatos.nextLine();
        System.out.print("\nDigite la marca de las botas: ");
        marcaBotas = leerDatos.nextLine();

        
        System.out.print("Digite el precio de las botas: ");
        prizeBotas = leerDatos.nextDouble();
          
         leerDatos.nextLine();
           
        System.out.print("Digite la materia prima de que estan hechas las botas: ");
        materiaPrimaBotas = leerDatos.nextLine();  
          
        
            
     
        
        
        System.out.print("Digite el color de las botas: ");
        colorBotas = leerDatos.nextLine();
      
        System.out.print("Digite la talla de las botas: ");
        tallaBotas = leerDatos.nextDouble();
    
        Botas boots = new Botas(prizeBotas, materiaPrimaBotas, colorBotas, "bota", marcaBotas, tallaBotas);
     
        botas.add(boots);//agregando las botas al arrayList

                    System.out.println("\n\nBotas agregadas correctamente\n");

                    break;

                case 3:

                    //Atributos de los Mocasines             
        double prizeDeportivos;
        double tallaDeportivos;
        String colorDeportivos;
        String marcaDeportivos;
        String materiaPrimaDeportivos;

       //pidiendo los datos al usuario
         //limpiar el buffer
        leerDatos.nextLine();
        
        System.out.print("\nDigite la marca de los zapatos deportivos: ");
        marcaDeportivos = leerDatos.nextLine();

        
        System.out.print("Digite el precio de los zapatos deportivos: ");
        prizeDeportivos = leerDatos.nextDouble();
          
        //limpiar el buffer
        leerDatos.nextLine();
           
        System.out.print("Digite la materia prima de que estan hechos los zapatos deportivos: ");
        materiaPrimaDeportivos = leerDatos.nextLine();  
          
        
       
        System.out.print("Digite el color de  los zapatos deportivos: ");
        colorDeportivos = leerDatos.nextLine();
      
        System.out.print("Digite la talla de los zapatos deportivos: ");
        tallaDeportivos = leerDatos.nextDouble();
    
        Deportivos sportShoes = new Deportivos(prizeDeportivos, colorDeportivos, "deportivo", marcaDeportivos, tallaDeportivos);
     
        deportivos.add(sportShoes);//agregando los mocasines al arrayList

                    System.out.println("\n\nZapatos Deportivos agregados correctamente\n");
                    

                    break;

                default:
                   
                    break;
            }
            
            if(accion < 1 || accion >3){
                 System.out.println("\n\nOpcion incorrecta intente de nuevo  :) \n");
                 decision = 'S';
           
            }else{
            
            System.out.println("¿Desea ingresar otro zapato?(S para si, N para no)");
            decision = leerDatos.next().charAt(0);//guardando la opcion del usuario
           
            decision = Character.toUpperCase(decision);//transformando a mayuscula
          
            
            }
            
        } while (decision == 'S');//para que el usuario elija cuando parar

        //con estas funciones se recorreran los archivos
        recorrerMocasines(mocasines);//los inclui a tpodos en una funcion
        recorrerBotas(botas);
        recorrerDeportivos(deportivos);
        
        System.out.println("\nFeliz navidad Ingeniero fue un placer recibir clases con usted :,)\n");
    }

    //voy a recorrer todos los mocasines ingresados
    public static void recorrerMocasines(ArrayList<Mocasines> mocasin){//los parametros de la funcion
       //recorriendo el arraylist por indices
        
       for(int i=0;i< mocasin.size();i++){
           Mocasines moca = mocasin.get(i);//guardando un objeto de tipo mocasin en cada iteracion
           moca.setContador(i+1);
           moca.File("Mocacines.txt");//creando el archivo
          
        }
    }
  
    public static void recorrerDeportivos(ArrayList<Deportivos> Zapatosdeportivos){//los parametros de la funcion
        
         for(int i=0;i< Zapatosdeportivos.size();i++){
           Deportivos depor = Zapatosdeportivos.get(i);//guardando un objeto de tipo deportivo en cada iteracion
           depor.setContador(i+1);
           depor.File("Zapatos Deportivos.txt");//creando el archivo
          
        }
    }
        
    
  
        public static void recorrerBotas(ArrayList<Botas> listadebotas){//los parametros de la funcion
        for(int i=0;i< listadebotas.size();i++){
          Botas boot = listadebotas.get(i);//guardando un objeto de tipo deportiva en cada iteracion
          boot.setContador(i+1);//por estetiva
          boot.File("Botas.txt");//creando el archivo
          
        }
    }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccioncolombia;

import java.util.Scanner;
import jugadorSeleccion.JugadorSeleccion;

/**
 *
 * @author SARA
 */
public class SeleccionColombia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int opcion;
        int contador=0;
        int buscar;
        int editar;
        
        
               
        JugadorSeleccion [] jugadores = new JugadorSeleccion[23];
                
        do{
            System.out.println("*******************************");
            System.out.println("B I E N V E N I D O");
            System.out.println("Convocatoria selección Colombia");
            System.out.println("*******************************");
            System.out.println(" ");
            
            System.out.println("O P C I O N E S  M E N Ú");
            System.out.println("................................");
            System.out.println(" ");
            
            System.out.println("*1. Agregar un jugador");
            System.out.println("*2. Buscar un jugador");
            System.out.println("*3. Editar un jugador");
            System.out.println("*4. Mostrar toda la convocatoria");
            System.out.println("*5. Salir");
            
            System.out.println(" ");
            System.out.println("................................");
            
            System.out.println("**DIGITE UNA OPCIÓN DEL MENÚ**");
            System.out.println(" ");
            opcion=entrada.nextInt();
            
            
        switch(opcion){   
        
            case 1:
                System.out.println("**R E G I S T R O  D E L  J U G A D O R**");
                System.out.println(".........................................");
                
                jugadores [contador] = new JugadorSeleccion();
                jugadores [contador].setNumeroCamiseta(contador);
                
                System.out.println("Ingrese camiseta del jugador");
                jugadores[contador].setNumeroCamiseta(entrada.nextInt());
                
                System.out.println("Ingrese nombre del jugador");
                jugadores[contador].setNombre(entrada.next());
                
                System.out.println("Ingrese apellido del jugador");
                jugadores[contador].setApellido(entrada.next());
                
                System.out.println("Ingrese la posicion del jugador");
                jugadores[contador].setPosición(entrada.next());
                
                System.out.println("Ingrese la edad jugador");
                jugadores[contador].setEdad(entrada.nextInt());
                
                System.out.println("Ingrese el equipo del jugador");
                jugadores[contador].setEquipo(entrada.next());
                
                contador ++;
                
            break;
            
            
            case 2:
                System.out.println("**B U S C A R  J U G A D O R**");
                System.out.println("..............................");
                System.out.println(" ");
                System.out.println("Digite camiseta del jugador ");
                buscar=entrada.nextInt();
                                                       
                    for(int i=0;i<contador;i++){
                        if(buscar==jugadores[i].getNumeroCamiseta()){
                            System.out.println("El número de camiseta del jugador es: "+jugadores[i].getNumeroCamiseta()); 
                            System.out.println("El nombre del jugador es: "+jugadores[i].getNombre());
                            System.out.println("El apellido del jugador es: "+jugadores[i].getApellido());
                            System.out.println("El jugador juega en la posición: "+jugadores[i].getPosición());
                            System.out.println("El edad del jugador es: "+jugadores[i].getEdad());
                            System.out.println("El equipo del jugador es: "+jugadores[i].getEquipo());
                            System.out.println(" ");
                            System.out.println("*******************************");
                                                                                             
            break;                
                        }else{
                            System.out.println("El jugador no está CONVOCADO"); 
                            System.out.println(" ");
                            System.out.println("****************************");
                        }
                    }
                    
            break;       
                 
            case 3:
                System.out.println("**E D I T A R  J U G A D O R**");
                System.out.println("...............................");
                System.out.println(" ");
                System.out.println("Digite camiseta del jugador ");
                editar=entrada.nextInt();
                
                                                       
                    for(int i=0;i<contador;i++){
                        if(editar==jugadores[i].getNumeroCamiseta()){
                            
                            System.out.println("El número de camiseta del jugador actual es: "+jugadores[i].getNumeroCamiseta());
                            System.out.println("Ingrese NUEVO NUMERO de camiseta del jugador");
                            jugadores[i].setNumeroCamiseta(entrada.nextInt());
                            
                            System.out.println("El nombre del jugador actual es: "+jugadores[i].getNombre());                        
                            System.out.println("Ingrese NUEVO NOMBRE del jugador");
                            jugadores[i].setNombre(entrada.next());
                            
                            System.out.println("El apellido del jugador actual es: "+jugadores[i].getApellido());
                            System.out.println("Ingrese NUEVO APELLIDO del jugador");
                            jugadores[i].setApellido(entrada.next());
                            
                            System.out.println("La posición actual del jugador es: "+jugadores[i].getPosición());
                            System.out.println("Ingrese la NUEVA POSICIÓN del jugador");
                            jugadores[i].setPosición(entrada.next());
                            
                            System.out.println("El edad del jugador actual es: "+jugadores[i].getEdad());
                            System.out.println("Ingrese la NUEVA EDAD del jugador");
                            jugadores[i].setEdad(entrada.nextInt());
                            
                            System.out.println("El equipo del jugador actual es: "+jugadores[i].getEquipo());
                            System.out.println("Ingrese el NUEVO EQUIPO del jugador");
                            jugadores[i].setEquipo(entrada.next());
                    
                            System.out.println(" ");
                            System.out.println("*******************************");
                                             
            break;                
                        }else{
                            System.out.println("El jugador no está CONVOCADO"); 
                            System.out.println(" ");
                            System.out.println("****************************");
                        }
                    }
            break;           
                    
                  
            case 4:
                System.out.println("**J U G A D O R E S  C O N V O C A D O S**");
                System.out.println("..........................................");
                System.out.println(" ");
                
                for(int i=0;i<contador;i++){
                        
                            System.out.println("El número de camiseta del jugador es: "+jugadores[i].getNumeroCamiseta()); 
                            System.out.println("El nombre del jugador es: "+jugadores[i].getNombre());
                            System.out.println("El apellido del jugador es: "+jugadores[i].getApellido());
                            System.out.println("El jugador juega en la posición: "+jugadores[i].getPosición());
                            System.out.println("El edad del jugador es: "+jugadores[i].getEdad());
                            System.out.println("El equipo del jugador es: "+jugadores[i].getEquipo());
                            System.out.println(" ");
                            System.out.println("*******************************");                                                                                                                      
                }
                
                          
            break;
            
            case 5:
                System.exit(0);
            break;
            
            default:
            break;
                       
        }  
            
        }while(opcion!=5);
    
    }
     
}

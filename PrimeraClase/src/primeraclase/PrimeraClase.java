
package primeraclase;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class PrimeraClase {
    private static String i;

   
    public static void main(String[] args) {
      /*
      EJERCICIO DE SUMA
       * 
      int a=30;
      double b=30.5;
      double suma=a+b;
        System.out.println(suma);*/
    
    //ejercicio del iva
        
       /* final double IVA=0.12;
        int producto= 300;
        double resultado=producto*IVA;
        
        System.out.println("El iva del producto es "+resultado );*/
        
        //operadores unarios
        
        /*int operador=10;
        int x=0;
        operador++;
        operador++;
        operador--;
        System.out.println(x=operador++);
        System.out.println(x=operador++);
        
        System.out.println("el valor de x es "+x);*/
        
        //entrada y salida de datos por consola
        
        /*Scanner entra =new Scanner(System.in);
        System.out.println("Ingrese un dato por consola");
        int datoC=entra.nextInt();
        
        System.out.println("su dato es: "+datoC );*/
        
        //entrada y salida de datos por ventana
        
        /*String nombre = JOptionPane.showInputDialog("Ingrese un nombre por ventana");
        JOptionPane.showMessageDialog(null, "Bien, tu nombre es: "+nombre);*/
        
        //calculo de iva avanzado para convertir datos
        
        /*final double IVA=0.12;
        String texto_num=JOptionPane.showInputDialog("introduce el precio: ");
        
        int precio=Integer.parseInt(texto_num);
        JOptionPane.showMessageDialog(null, "El producto tiene un precio de: "+precio+" y su precio final es de: "+(precio+(precio*IVA)));*/
        
        // ingreso de datos por consola y multiplicar
        
        /*Scanner entra =new Scanner(System.in);
        System.out.println("Ingrese un dato por consola");
        int datoC=entra.nextInt();
        
        System.out.println("Numero ingresado: "+datoC);
        System.out.println("El doble del numero es: "+2*datoC);
        System.out.println("El triple del numero es: "+3*datoC);*/
         
        //condicional switch
        
        /*Scanner entra =new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana");
        int datoC=entra.nextInt();
        
        switch (datoC){
            
            case 1:
                System.out.println("El dia ingresado es: lunes");
                break;
            case 2:
                System.out.println("El dia ingresado es: martes");
                break;
            case 3:
                System.out.println("El dia ingresado es: miercoles");
                break;
            case 4:
                System.out.println("El dia ingresado es: jueves");
                break;
            case 5:
                System.out.println("El dia ingresado es: viernes");
                break;
            case 6:
                System.out.println("El dia ingresado es: sabado");
                break;
            case 7:
                System.out.println("El dia ingresado es: domingo");
                break;
            default:
                System.out.println("El dia ingresado no es valido");
                break;
        }*/
        
        
        /*haga un programa que eprmita el ingreso 
         *de 10 valores y muestre la suma de los valores y su priomedio*/ 
        
        /*Scanner dato1= new Scanner(System.in);
        System.out.println("Ingrese el primer dato");
        int Dato =dato1.nextInt();
        int i=1;
        
        while(i<=10){
            
        int promedio = Dato + i * 10;
        System.out.println("El promedio es: "+promedio);
        }
                 
        */
        
        
        /*Una planta que fabrica perfiles de hierro posee un lote de N piezas
         * hacer un programa que pida ingresar la cantidad de piezas a procesar
         * y luego ingrese la longitud de cada perfil sabiendo que la pieza cuya longitud 
         * este comprendida en el rango de 1.20 y 1.30 son actas.mostrar por pantalla la 
         * cantidad de piezas actas que hay en el lote
         */
        Scanner entra= new Scanner(System.in);
        System.out.println("ingrese la cantidad de piezas existentes");
        int N=entra.nextInt();
        int P=0;
        for(int i=0;i<=N;i++){
        
            Scanner EP= new Scanner(System.in);
        System.out.println("ingrese la Longitud de la pieza");
        float P1=entra.nextFloat();
            
        if(P1>=1.20 && P1<=1.30){
           
            System.out.println("LA pieza es valida");
            
            P++;
        
        }else{
        
            System.out.println("La Pieza no es valida");
        
        }
            System.out.println("La cantidad de piezas es: "+P);
        }
  
        
        }
    }
    


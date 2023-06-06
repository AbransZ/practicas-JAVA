/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author SO1
 */
public class ArreglosAyB {

    public static int cont=1;
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Cuantos valores se van a ingresar"));
             
             int numA[]=new int[cant]; 
             int numB[]=new int[cant];
             
             Llenar(numA, cant);
             Comparar(numA, cant, numB);
             Mostrar(numA, cant, numB);
    }
    
    
            public static void Llenar(int numA[], int cant){
                 
        
                for(int i=1;i<cant;i++){
                    
                  numA[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor "+i));
                }
            }
            
            public static void Mostrar(int numA[],int cant,int numB[]){
                
                for(int i=1;i<cant;i++){
                
                    JOptionPane.showMessageDialog(null, "El valor "+i+" es "+numB[i]);
                }
            
            }
            public static void Comparar(int numA[],int cant,int numB[]){
            int j=0;
            
            for (int i= 0;i<cant;i++){
                
            if(numA[i]%2==0){
                
            numB[j]=numA[i];
            j++;
            cont++;
            }
            }
                
            }
    }
    


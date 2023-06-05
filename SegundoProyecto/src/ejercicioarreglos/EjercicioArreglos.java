package ejercicioarreglos;


import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author SO1
 */
public class EjercicioArreglos {

  
    public static void main(String[] args) {
        int cont=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de numeros "));
        int num[]=new int[5];
        int i;
        
            
        for(i=1;i<=cont;i++){
            
            num[i]= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero "+i));
            
        
        }
        
        for(int j=1;j<=cont;j++){
        
        JOptionPane.showMessageDialog(null, "Los numeros ingresados son: "+num[j]);
        }
        }
    
      
}

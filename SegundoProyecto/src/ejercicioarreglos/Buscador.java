
package ejercicioarreglos;

import javax.swing.JOptionPane;


 
public class Buscador {

 
    public static void main(String[] args) {
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros va a ingresar"));
       int num[] =new int [cant];
       
       boolean band=false;
       for(int i=0;i<cant;i++){
       num[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus numeros por favor: "));
       }
       int buscar=Integer.parseInt(JOptionPane.showInputDialog("Que numero deseas buscar? "));
       
       
      int i=0;
      
      while(i<cant && band==false){
      if(buscar==num[i]){
      band=true;
      }
      i++;
      }
      if(band==true){
      JOptionPane.showMessageDialog(null, "Su numero esta de "+i+" lugar");
      }else{
      JOptionPane.showMessageDialog(null, "El numero no esta en los numeros ingresados");
      
      }
      
       
    }
    
}

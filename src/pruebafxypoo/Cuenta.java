package pruebafxypoo;

// @author AbransZ

import javax.swing.JOptionPane;

public class Cuenta {

    public String titular;
    public double cantidad;

    public Cuenta() {
    }
    
    

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;

        if (cantidad < 0)
        {
            cantidad = 0;
        } else
        {
            this.cantidad = cantidad;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void ingresar(double cantidad){
   
        if (cantidad<0)
        {
            JOptionPane.showMessageDialog(null, "Cantidad invalida");
        } else
        {
            this.cantidad+=cantidad;
        }  
    }
    
    public void retirar(double canti){
    
        if (this.cantidad-canti<0)
        {
            JOptionPane.showMessageDialog(null, "Fondos insuficioentes");
            this.cantidad=0;
        } else
        {
            this.cantidad-=canti;
        }
    }

    @Override
    public String toString() {
        return "El titular "+titular+" tiene su cuenta "+cantidad+" bolivares";
    }
    
    

}


import static java.lang.System.out;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PrimerProyecto {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // como capturar y mostrar datos en ventanas
        /**
         * String Nom=JOptionPane.showInputDialog("Introduce tu Nombre");
         * int Ed= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu Edad"));
         * int Ced= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu
         * Cedula"));
         * 
         * JOptionPane.showMessageDialog(null,"El Nombre es: "+Nom+" La edad es: "+Ed+"
         * La cedula es: "+Ced);
         */

        // operadores aritmeticos por consola
        /**
         * Scanner operacion=new Scanner(System.in);
         * int Num1,Num2,suma,mul,res;
         * System.out.println("Ingrese 2 Numeros");
         * 
         * Num1=operacion.nextInt();
         * Num2=operacion.nextInt();
         * 
         * suma=Num1+Num2;
         * mul=Num1*Num2;
         * res=Num1%Num2;
         * 
         * System.out.println("El resultado de la suma es: "+suma);
         * System.out.println("El resultado de la residuo es: "+res);
         * System.out.println("El resultado de la multiplicacion es: "+mul);
         */

        // operaciones con libreria math

        /**
         * int num1=5;
         * int num2=0;
         * num2=--num1;
         * System.out.println("num1="+num1);
         * System.out.println("num2="+num2);
         * 
         * double numRaiz=8;
         * double resRaiz=0;
         * resRaiz=Math.sqrt(numRaiz);
         * System.out.println("resRaiz="+resRaiz);
         * 
         * double base=5;
         * double exp=2;
         * double resExpo;
         * resExpo=Math.pow(base, exp);
         * System.out.println("resExpo="+resExpo);
         * 
         * float numAbs=-5.5f;
         * double resAbs=Math.abs(numAbs);
         * System.out.println("resAbs="+resAbs);
         * 
         * float numRed=5.5f;
         * int resRed=Math.round(numRed);
         * System.out.println("resRed="+resRed);
         * 
         * double resAle=Math.random();
         * System.out.println("resAle="+Math.round(resAle*100));
         */

        /*
         * una tienda vende 3 productos suma el precio total y dona
         * el residuo restante del pagado
         */
        /**
         * Scanner valores=new Scanner(System.in);
         * 
         * System.out.print("Ingrese primer producto: ");
         * float prod1=valores.nextFloat();
         * 
         * System.out.print("Ingrese primer producto: ");
         * float prod2=valores.nextFloat();
         * 
         * System.out.print("Ingrese primer producto: ");
         * float prod3=valores.nextFloat();
         * 
         * float suma=prod1+prod2+prod3;
         * System.out.println("El valor total a pagar es: "+suma);
         * 
         * double paga=Math.ceil(suma);
         * System.out.println("Se pago: "+paga);
         * 
         * double dona=paga-suma;
         * System.out.println("El cliente hizo una donacion de: "+dona);
         * System.out.println("\"MUCHAS GRACIAS!!!\"");
         * 
         * 
         * //Calcular fechas
         * 
         * Calendar fechaNac=new GregorianCalendar(2000,01,01);
         * Calendar fechaHoy=Calendar.getInstance();
         * int anoNac=fechaNac.get(Calendar.YEAR);
         * int anoHoy=fechaHoy.get(Calendar.YEAR);
         * int edad=anoHoy-anoNac;
         * System.out.println("Edad="+edad);
         */

        // condicionales anidados

        /*
         * Scanner entra= new Scanner(System.in);
         * System.out.println("Ingrese un numero entre 1 y 10.000");
         * int num=entra.nextInt();
         * 
         * if(num>=0 && num<=99){
         * 
         * System.out.println("el numero es aceptado por pertenecer a la unidad");
         * 
         * }else{
         * 
         * if(num>=100 && num<=999){
         * 
         * System.out.println("El numero es centanas");
         * 
         * }else{
         * 
         * if(num>=1000 && num<=9999){
         * 
         * System.out.println("El numero es una unidad de mil");
         * 
         * }else{
         * 
         * System.out.println("El numero no es aceptado");
         * 
         * }
         * 
         * }
         * }
         */
        /*
         * ejercicio 1 Comision sobre ventas de un trabajador
         * 
         * 
         * final int sueldo=100;
         * final float comision=(float) 0.10;
         * 
         * 
         * Scanner ventas= new Scanner(System.in);
         * System.out.println("Ingrese el total de su primera venta: ");
         * float venta1 =ventas.nextFloat();
         * 
         * Scanner ventas1= new Scanner(System.in);
         * System.out.println("Ingrese el total de su primera venta: ");
         * float venta2 =ventas.nextFloat();
         * 
         * Scanner ventas2= new Scanner(System.in);
         * System.out.println("Ingrese el total de su primera venta: ");
         * float venta3 =ventas.nextFloat();
         * 
         * float total_comision=venta1+venta2+venta3*comision;
         * 
         * 
         * float total_sueldo=venta1+venta2+venta3+sueldo+total_comision;
         * System.out.println("Las ganancia del mes son: "+(sueldo+venta1+venta2+venta3)
         * +"\ncon una comision de: "+total_comision+"\nEn total su ganancia es de: "
         * +total_sueldo);
         */

        // Ejercicio 2 descuento de un cliente

        /*
         * final float descuento =(float) 0.15;
         * 
         * Scanner venta =new Scanner(System.in);
         * System.out.println("Ingrese costo total de la venta");
         * float venta1=venta.nextFloat();
         * 
         * float total_descuento=venta1*descuento;
         * 
         * System.out.println("El total de su descuento es: "+total_descuento);
         * 
         * System.out.println("El total a pagar es: "+(venta1-total_descuento));
         */

        /*
         * 
         * ejercicio calculo de hipotenusa
         * 
         * Scanner entra =new Scanner(System.in);
         * System.out.println("Ingrese valor de cateto opuesto");
         * double cat_op=entra.nextDouble();
         * 
         * Scanner entra1=new Scanner(System.in);
         * System.out.println("Ingrese valor de cateto adyasente");
         * double cat_ady=entra1.nextFloat();
         * 
         * 
         * double hipotenusa= Math.pow(cat_op,2)+Math.pow(cat_ady, 2);
         * float resultado;
         * resultado = (float)Math.sqrt(hipotenusa);
         * 
         * System.out.println("La hipotenusa del triangulo rectangulo es: "+resultado);
         * 
         */
        /*
         * ejercicio de division valida resultado 0
         * 
         * Scanner entrada=new Scanner(System.in);
         * System.out.println("ingrese valor del primer numero:");
         * int num1=entrada.nextInt();
         * 
         * Scanner entrada1=new Scanner(System.in);
         * System.out.println("ingrese valor del primer numero:");
         * int num2=entrada1.nextInt();
         * 
         * int resultado =num1/num2;
         * 
         * if(resultado%2==0){
         * System.out.println("El numero "+num1+" y "
         * +num2+" son divicibles entre 2\n dando como resultado "+resultado );
         * }else {
         * System.out.println("El numero no es divicible entre 2");
         * }
         */

        /*
         * comparador de cadena de texto y condicional switch
         * 
         * Scanner entra = new Scanner(System.in);
         * System.out.println("Ingrese su sexo: ");
         * String sexo = entra.next();
         * 
         * switch (sexo) {
         * 
         * case "femenino" -> System.out.println("El sexo es femenino");
         * 
         * case "masculino" -> System.out.println("El secxo es masculino");
         * 
         * default -> System.out.println("texto invalido");
         * 
         * }
         */
        /*
         * condiconal y bucle for
         * 
         * Scanner entra = new Scanner(System.in);
         * System.out.println("ingrese valor del iterador");
         * int iterar = entra.nextInt();
         * 
         * if (iterar > 0) {
         * 
         * for (int i = 0; i <= iterar; i++) {
         * 
         * System.out.println("se ah iterado " + i + " veces");
         * }
         * } else {
         * 
         * System.out.
         * println("valor no admitido, debe ingresar valores positivos y enteros");
         * }
         */

        int num = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
        String nombre = (JOptionPane.showInputDialog("ingresa un nombre"));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
        String nombre2 = (JOptionPane.showInputDialog("ingresa un nombre"));

        if (num > num2) {
            JOptionPane.showMessageDialog(null, nombre + "Es El mayor");

        } else {
            JOptionPane.showMessageDialog(null, nombre2 + "Es El mayor");

        }
    }
}

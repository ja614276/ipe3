package CIP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double a=0;double b=0; double c=0;

        System.out.print("ingrese 1er numero: ");
        a= scan.nextDouble();
        System.out.print("ingrese 2do numero: ");
        b= scan.nextDouble();
        System.out.print("ingrese 3er numero: ");
        c= scan.nextDouble();

        double resultado = funcion1(a,b,c);
        System.out.println(resultado);
    }
    public static double funcion1 (double a, double b, double c){
        double suma =a+b+c;
        return suma;
    }



}

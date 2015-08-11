/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 * Parabola implementa una parábola con la ecuacion y = A*x^2 + B*x + C
 * @author enrique
 */
public class Parabola {
    private double a;
    private double b;
    private double c;


    /**
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Habilita la lectura de datos desde el teclado
        Scanner sc = new Scanner(System.in);
        
        // Solicita los valores necesarios para el calculo
        System.out.print("Ingrese coeficiente A: ");
        double a = sc.nextDouble();
        
        System.out.print("Ingrese coeficiente B: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese coeficiente C: ");
        double c = sc.nextDouble();
        
        System.out.print("Ingrese X: ");
        double x = sc.nextDouble();

        // Crea el objeto p de tipo parabola con sus coeficientes
        Parabola p = new Parabola(a, b, c);
        
        // Calcula el valor Y
        System.out.print("Y = ");
        System.out.println(p.calcularY(x));
        
    }

    /**
     * Constructor
     * @param a coeficiente del primer término
     * @param b coeficiente del segundo término
     * @param c coeficiente del tercer término
     */
    Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /**
     * CalcularY determina el valor Y de acuerdo a la ecuación de la parábola
     * @param x valor en el eje X
     * @return devuelve el valor calculado
     */
        
    public double calcularY(double x) {
        double y;
        
        y = a*x*x + b*x + c;
        
        return y;
    }
}

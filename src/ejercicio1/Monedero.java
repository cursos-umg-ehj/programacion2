/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author enrique
 */
public class Monedero {
    private double saldo;

    /**
     * @param args son los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Monedero monedero = new Monedero(500);
        
        monedero.retirar(250);
        monedero.consultar();
        monedero.depositar(50);
        monedero.consultar();
        monedero.retirar(400);
        
    }
    
    /**
     * Constructor 
     * @param cantidad es el monto inicial del monedero 
     */
    Monedero(double cantidad) {
        saldo = cantidad;
    }
    
    /**
     * depositar: aumenta el saldo del monedero
     * @param cantidad es el monto a aumentar al saldo
     */
    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    }
    
    
    /**
     * retirar: disminuye el saldo del monedero
     * @param cantidad es el monto a disminuir del saldo
     * 
     * No se puede disminuir una cantidad mayor al saldo
     */
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo = saldo - cantidad;
        }
        else {
            System.out.println("Error: Fondos insuficientes para esta operación");
        }
    }
    
    
    /**
     * consultar: Muestra el saldo disponible
     */
    public void consultar() {
        System.out.print("El saldo es:");
        System.out.println(saldo);
    }
}

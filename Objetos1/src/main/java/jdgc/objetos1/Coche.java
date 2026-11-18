/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdgc.objetos1;

import java.util.Scanner;

/**
 *
 * @author usuariom
 */
public class Coche {

    static Scanner sc = new Scanner(System.in);
    //Definimos atributos (Variables)
    String marca;
    String color;
    float kms;
    int velocidad;

    //Metodos
    public void arrancar() { //Defino los metodos (Lo que hace)
        System.out.println("Arrancando, selecciona velocidad");
        velocidad = sc.nextInt(); 
    //Lo puede ver porque esta dentro de una clase y porque los metodos que yo pueda hacer pueden variar los atributos de la clase
    }

    public void acelerar() {
        System.out.println("Acelerando");
        velocidad = velocidad + 199; //Aumenta la velocidad en 10 cada vez que entra  al metodo
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }

    public void pintarCoche(String unColor) {
        System.out.println("Pintando");
        color = unColor;
    }

    public void estrellarse() {
        System.out.println("BUUUUUUUUUUUUUUUUUUUUUUUUUUM");
        System.out.println("Llamando ambulancia");
        velocidad = 0;
        System.out.println(velocidad);
    }

    public void mostrarCoche() {
        System.out.printf("Coche: %s %s con %.2f km. Va a %d km/h%n", marca, color, kms, velocidad); //Mirar el printf como iba, este lo ha hecho la maestra
    } //El %n es el salto de linea del printf

}

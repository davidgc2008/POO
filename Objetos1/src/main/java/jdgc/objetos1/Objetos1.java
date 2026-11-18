/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package jdgc.objetos1;

import java.util.Scanner;

/**
 *
 * @author usuariom
 */
public class Objetos1 {
    
static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Voy a por mi cochaso");
        //Creo el objeto en el Main
        Coche cochasoGitano = new Coche();
        //Cambio sus atributos
        cochasoGitano.marca = "Ferrari";
        cochasoGitano.color = "Negro";
        cochasoGitano.kms = 0;

        //Ejecuto acciones
        cochasoGitano.arrancar();
        cochasoGitano.acelerar();
        cochasoGitano.estrellarse();
        
        //Otro coche
        Coche cocheDavid = new Coche();
        //Atributos del coche
        cocheDavid.marca =  "Mercedes AMG 45";
        cocheDavid.color = "Rojo";
        cocheDavid.kms = 100;
        
        //Vuelvo a ejecutar cosas
        System.out.println(cocheDavid);//Pasa como con los arrays, muestra la direccion de memoria
        cocheDavid.mostrarCoche(); //Printf
        
        cocheDavid.pintarCoche("Amarillo");
        cocheDavid.mostrarCoche();
    }
}

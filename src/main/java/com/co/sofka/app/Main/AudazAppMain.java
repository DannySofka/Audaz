package com.co.sofka.app.Main;

import com.co.sofka.app.Conexion.Conexion;

import java.sql.Connection;
import java.util.Scanner;

public class AudazAppMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion=0;

        do {
            System.out.println("---------------------");
            System.out.println(" Bienvenido a la página Audaz.com ");
            System.out.println("1. Ver eventos por Ciudad");
            System.out.println("2. Ingrese el Código del Evento de su preferencia");
            System.out.println("3. Ingrese su nombre completo");
            System.out.println("4. Ingrese su medio de Pago");
            System.out.println("5. Salir");
            //Leemos la opción ingresada por el usuario
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;

            }

        }while (opcion != 5);


    }

}

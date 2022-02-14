/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto7carreteras;

import java.util.InputMismatchException;

/**
 *
 * @author Jhon Jader caro & Camilo Avendaño Rodriguez
 */
public class Reto7Carreteras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = -1;
        Carretera calle1 = new Carretera();
        while (opcion != 0) {
            try {

                opcion = new Utileria().ingresoInt("\n\n!!!BIENVENIDO!!!!!!\n\n\n"
                        + "INGRESE UNA OPCIÓN DEL MENÚ:\n\n" //menu
                        + "1) CONSTRUIR CARRETERA\n"
                        + "2) MOSTRAR LONGITUD DE LA CARRETERA CONSTRUIDA \n"
                        + "3) MOSTRAR EL AREA TOTAL DE LA CARRETERA CONSTRUIDA\n"
                        + "4) MOSTRAR VOLUMEN TOTAL DE LOS MATERIALES DE LA CARRETERA\n"
                        + "5) VOLUMEN DE ASFALTO USADO EN LA CARRETERA\n"
                        + "6) VOLUMEN DE MATERIALES SIN ASFALTAR\n"
                        + "7) ¿LA CARRETERA ESTA CONECTADA?\n"
                        + "0) SALIR\n");
            } catch (InputMismatchException e) { //excepcion en caso de que se ingrese en opcion una letra en lugar de un numero.
                System.out.println("Usted a ingresado una opción invalida por favor ingrese nuevamente.");
            }

            try {

                switch (opcion) {

                    case 1:

                        calle1.crearCarretera();
                        break;
                    case 2:
                        calle1.longitudCarretera();
                        break;
                    case 3:
                        calle1.areaCarretera();
                        break;
                    case 4:
                        calle1.volumenMaterialCarretera();
                        break;
                    case 5:
                        calle1.volumenAsfaltoCarretera();
                        break;
                    case 6:
                        calle1.volumenMaterialSinAsfaltar();
                        break;
                    case 7:
                        System.out.println(calle1.carreteraConectada());
                        break;
                    case 0:
                        System.out.println("Muchas gracias por usar este programita :)");
                    default:
                        System.out.println("Por favor ingrese una opcion numerica que aparezca en el menú.");

                }
            } catch (InputMismatchException e) {
                System.out.println("el caracter ingresado no es valido, ingres un numero natural entero positivo");
            }

        }

    }

}

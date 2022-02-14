/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7carreteras;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Utileria {

    Scanner lector = new Scanner(System.in);

    public int ingresoInt(String text) {
        System.out.println(text);
        return (lector.nextInt());
    }

    public String ingresoString(String text) {
        System.out.println(text);
        return (lector.next());
    }

    public double ingresoDouble(String text) {
        System.out.println(text);
        return (lector.nextDouble());
    }

    public boolean ingresoBoolean(String text) {
        System.out.println(text);
        return (lector.nextBoolean());
    }

}

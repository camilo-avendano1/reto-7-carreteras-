/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7carreteras;

/**
 *
 * @author User
 */
public class TramoSinAsfaltar extends Tramo {

    final double ancho = 6;
    String material;
    double espesor;

    public TramoSinAsfaltar(double coordenadaX1, double coordenadaY1, double coordenadaX2, double coordenadaY2, String material, double espesor) {
        this.coordenadaX1 = coordenadaX1;
        this.coordenadaY1 = coordenadaY1;
        this.coordenadaX2 = coordenadaX2;
        this.coordenadaY2 = coordenadaY2;
        this.espesor = espesor;
        this.material = material(material);

    }

    public String material(String material) {
        
        String materialAdar = "nada";
        String piedra = "piedra";
        String arena = "arena";
        String balastro = "balastro";
        if (material.equalsIgnoreCase(arena)) {
            materialAdar = arena;
        } else {
            if (material.equalsIgnoreCase(piedra)) {
                materialAdar = piedra;
            } else {
                if (material.equalsIgnoreCase(balastro)) {
                    materialAdar = balastro;
                } else {
                    System.out.println("material invalido");
                }
            }
        }

        return materialAdar;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setEspesor(double espesor) {
        this.espesor = espesor;
    }

    public double getAncho() {
        return ancho;
    }

    public String getMaterial() {
        return material;
    }

    public double getEspesor() {
        return espesor;
    }

    @Override
    public double longitud() {
        return Math.sqrt((coordenadaX2 - coordenadaX1) * (coordenadaX2 - coordenadaX1) + (coordenadaY2 - coordenadaY1) * (coordenadaY2 - coordenadaY1));
    }

    @Override
    public double area() {
        return longitud() * ancho;
    }

    @Override
    public double volumen() {
        return area() * espesor;
    }

    @Override
    public String toString() {
        return "TramoSinAsfaltar{" + "ancho=" + ancho + ", material=" + material + ", espesor=" + espesor + " coordenadaX1=" + coordenadaX1 + ", coordenadaY1=" + coordenadaY1 + ", coordenadaX2=" + coordenadaX2 + ", coordenadaY2=" + coordenadaY2 + '}';
    }

}

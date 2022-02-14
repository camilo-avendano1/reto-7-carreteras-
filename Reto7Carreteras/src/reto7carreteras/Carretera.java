/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7carreteras;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Carretera {

    ArrayList<Tramo> carreteraCompleta = new ArrayList();

    public Carretera() {
    }

    public void crearCarretera() {
        int numeroTramos;
        Utileria tool = new Utileria();
        numeroTramos = tool.ingresoInt("cuantos tramos tendra la carretera?");

        for (int i = 1; i <= numeroTramos; i++) {
            int eleccion;
            eleccion = tool.ingresoInt("que tipo de tramo va ser el tramo " + i + "\n"
                    + "1) asfaltada\n"
                    + "2) sin asfaltar");
            int coordenadaX1 = tool.ingresoInt("ingrese la coordenada x1");
            int coordenadaY1 = tool.ingresoInt("ingrese la coordenada y1");
            int coordenadaX2 = tool.ingresoInt("ingrese la coordenada x2");
            int coordenadaY2 = tool.ingresoInt("ingrese la coordenada y2");
            switch (eleccion) {

                case 1:
                    int permitidoAdelantar = tool.ingresoInt("esta permitido adelantar en este tramo? \n"
                            + "1) verdadero \n"
                            + "0) falso");
                    String proveedor = tool.ingresoString("cual es el provedor del material de este tramo");
                    Tramo uno = new TramoAsfaltado(coordenadaX1, coordenadaY1, coordenadaX2, coordenadaY2, proveedor, permitidoAdelantar);
                    carreteraCompleta.add(uno);
                    break;

                case 2:

                    String material = tool.ingresoString("cual es el material de este tramo");
                    double espesor = tool.ingresoDouble("cual es el espsor del tramo");
                    Tramo dos = new TramoSinAsfaltar(coordenadaX1, coordenadaY1, coordenadaX2, coordenadaY2, material, espesor);
                    carreteraCompleta.add(dos);
                    break;
            }
        }
        System.out.println(carreteraCompleta);
    }

    public void longitudCarretera() {
        double longitudSumada = 0;
        for (int i = 0; i < carreteraCompleta.size(); i++) {
            longitudSumada += carreteraCompleta.get(i).longitud();
        }
        System.out.println(longitudSumada);
    }

    public void areaCarretera() {
        double areaSumada = 0;
        for (int i = 0; i < carreteraCompleta.size(); i++) {
            areaSumada += carreteraCompleta.get(i).area();
        }
        System.out.println(areaSumada);
    }

    public void volumenMaterialCarretera() {
        double volumenSumado = 0;
        for (int i = 0; i < carreteraCompleta.size(); i++) {
            volumenSumado += carreteraCompleta.get(i).volumen();
        }
        System.out.println(volumenSumado);
    }

    public void volumenAsfaltoCarretera() {
        double volumenAsfaltoSumado = 0;
        for (int i = 0; i < carreteraCompleta.size(); i++) {
            if (carreteraCompleta.get(i) instanceof TramoAsfaltado) {  //comprobamos que el objeto i sea una instancia
                volumenAsfaltoSumado += carreteraCompleta.get(i).volumen(); // de tramo asfaltado para poder sumar su volumen
            }
        }
        System.out.println(volumenAsfaltoSumado);
    }

    public void volumenMaterialSinAsfaltar() {
        double volumenSinAsfaltoSumado = 0;
        for (int i = 0; i < carreteraCompleta.size(); i++) {
            if (carreteraCompleta.get(i) instanceof TramoSinAsfaltar) {//comprobamos que el objeto i sea una instancia
                volumenSinAsfaltoSumado += carreteraCompleta.get(i).volumen();// de tramo sin asfaltado para poder sumar su volumen
            }
        }
        System.out.println(volumenSinAsfaltoSumado);
    }

    public boolean carreteraConectada() {
        boolean conectado = true;
        for (int i = 0; i < carreteraCompleta.size() - 1; i++) {
            if (!(carreteraCompleta.get(i).coordenadaX2 == carreteraCompleta.get(i + 1).coordenadaX1 && carreteraCompleta.get(i).coordenadaY2 == carreteraCompleta.get(i + 1).coordenadaY1)) {
                return false;
            }
        }
        return conectado;
    }

    public void mostrarCarretera() {
        System.out.println(carreteraCompleta);
    }
}

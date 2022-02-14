/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7carreteras;

import java.util.Objects;

/**
 *
 * @author User
 */
public class TramoAsfaltado extends Tramo {

    String proveedor;
    final double ancho = 8;
    final double espesor = 0.25;
    int verificacionBoolean;
    boolean permitidoAdelantar = permitidoAdelantar(verificacionBoolean);

    public TramoAsfaltado(double coordenadaX1, double coordenadaY1, double coordenadaX2, double coordenadaY2, String proveedor, int permitidoAdelantar) {
        this.coordenadaX1 = coordenadaX1;
        this.coordenadaY1 = coordenadaY1;
        this.coordenadaX2 = coordenadaX2;
        this.coordenadaY2 = coordenadaY2;
        this.proveedor = proveedor;
        this.permitidoAdelantar = permitidoAdelantar(permitidoAdelantar);
    }

    @Override
    public double longitud() {
        return Math.sqrt((coordenadaX2 - coordenadaX1) * (coordenadaX2 - coordenadaX1) + (coordenadaY2 - coordenadaY1) * (coordenadaY2 - coordenadaY1));
    }

    @Override
    public double area() {
        return (longitud() * ancho);
    }

    public boolean permitidoAdelantar(int verificar) {

        boolean valor = false;
        if (verificar == 0 || verificar == 1) {
            switch (verificar) {

                case 1:
                    valor = true;

                    break;
                case 0:
                    valor = false;
                    break;
            }
        }

        return valor;
    }

    public double volumen() {
        return (area() * espesor);
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isPermitidoAdelantar() {
        return permitidoAdelantar;
    }

    public void setPermitidoAdelantar(boolean permitidoAdelantar) {

        this.permitidoAdelantar = permitidoAdelantar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.proveedor);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.ancho) ^ (Double.doubleToLongBits(this.ancho) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.espesor) ^ (Double.doubleToLongBits(this.espesor) >>> 32));
        hash = 83 * hash + (this.permitidoAdelantar ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TramoAsfaltado other = (TramoAsfaltado) obj;
        if (Double.doubleToLongBits(this.ancho) != Double.doubleToLongBits(other.ancho)) {
            return false;
        }
        if (Double.doubleToLongBits(this.espesor) != Double.doubleToLongBits(other.espesor)) {
            return false;
        }
        if (this.permitidoAdelantar != other.permitidoAdelantar) {
            return false;
        }
        if (!Objects.equals(this.proveedor, other.proveedor)) {
            return false;
        }
        return true;
    }

    public double getAncho() {
        return ancho;
    }

    public double getEspesor() {
        return espesor;
    }

    public int getVerificacionBoolean() {
        return verificacionBoolean;
    }

}

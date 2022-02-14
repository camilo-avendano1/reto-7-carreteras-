
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7carreteras;

/**
 *
 * @author User
 */
public abstract class Tramo {

    double coordenadaX1;
    double coordenadaY1;
    double coordenadaX2;
    double coordenadaY2;

    public abstract double longitud();

    public abstract double area();

    public abstract double volumen();

    public double getCoordenadaX1() {
        return coordenadaX1;
    }

    public void setCoordenadaX1(double coordenadaX1) {
        this.coordenadaX1 = coordenadaX1;
    }

    public double getCoordenadaY1() {
        return coordenadaY1;
    }

    public void setCoordenadaY1(double coordenadaY1) {
        this.coordenadaY1 = coordenadaY1;
    }

    public double getCoordenadaX2() {
        return coordenadaX2;
    }

    public void setCoordenadaX2(double coordenadaX2) {
        this.coordenadaX2 = coordenadaX2;
    }

    public double getCoordenadaY2() {
        return coordenadaY2;
    }

    public void setCoordenadaY2(double coordenadaY2) {
        this.coordenadaY2 = coordenadaY2;
    }

    @Override
    public String toString() {
        return "Tramo{" + "coordenadaX1=" + coordenadaX1 + ", coordenadaY1=" + coordenadaY1 + ", coordenadaX2=" + coordenadaX2 + ", coordenadaY2=" + coordenadaY2 + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.coordenadaX1) ^ (Double.doubleToLongBits(this.coordenadaX1) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.coordenadaY1) ^ (Double.doubleToLongBits(this.coordenadaY1) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.coordenadaX2) ^ (Double.doubleToLongBits(this.coordenadaX2) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.coordenadaY2) ^ (Double.doubleToLongBits(this.coordenadaY2) >>> 32));
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
        final Tramo other = (Tramo) obj;
        if (Double.doubleToLongBits(this.coordenadaX1) != Double.doubleToLongBits(other.coordenadaX1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.coordenadaY1) != Double.doubleToLongBits(other.coordenadaY1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.coordenadaX2) != Double.doubleToLongBits(other.coordenadaX2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.coordenadaY2) != Double.doubleToLongBits(other.coordenadaY2)) {
            return false;
        }
        return true;
    }
    
    

}

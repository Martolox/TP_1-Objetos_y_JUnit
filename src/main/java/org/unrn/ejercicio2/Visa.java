package org.unrn.ejercicio2;

public class Visa implements Tarjeta {
    public double aplicarDescuento(double mPl, double mBeb) {
        double t = mPl + mBeb - 0.03 * mBeb;
        return t;
    }
}

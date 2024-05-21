package app.fun;

import java.lang.Math;

public class Fun {
    

    Double getQ(double S, double D, double H) {

        double Q = (2 * S * D) / H;
        return RaizCuadrada(Q);
    }

    Double getT(double Q, double D) {
        return Q/D;
    }

    Double RaizCuadrada(double a) {
        return Math.sqrt(a);
    }

}

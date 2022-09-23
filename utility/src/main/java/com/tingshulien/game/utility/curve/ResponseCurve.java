package com.tingshulien.game.utility.curve;

public interface ResponseCurve {

    double getM();

    void setM(double m);

    double getK();

    void setK(double k);

    double getB();

    void setB(double b);

    double getC();

    void setC(double c);

    double map(double x);

}

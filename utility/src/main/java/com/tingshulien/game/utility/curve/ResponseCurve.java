package com.tingshulien.game.utility.curve;

public interface ResponseCurve {

    float getM();

    void setM(float m);

    float getK();

    void setK(float k);

    float getB();

    void setB(float b);

    float getC();

    void setC(float c);

    float map(float x);

}

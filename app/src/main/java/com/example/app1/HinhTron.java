package com.example.app1;

public class HinhTron {
    private int r;

    public Double chuVi(){
        return 2*r*Math.PI;
    }
    public Double dienTich(){
        return r*r*Math.PI;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}

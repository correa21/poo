package com.ac.shape3d;


public abstract class Shape3D {
    protected double x = 0, y = 0, z = 0;

    public Shape3D (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getZ(){
        return this.z;
    }

    public void move(double dx, double dy, double dz){
        x += dx;
        y += dy;
        z += dz;
    }

    public abstract double getArea();
    public abstract double getVolume();

    public String toString(){
        return("Coordenadas: <" + x + y + z + ">\n" +
                "Area = " + getArea() + "\n"
                "Volumen = " + getVolume() + "\n")
    }
}

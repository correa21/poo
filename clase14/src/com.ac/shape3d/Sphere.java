package com.ac.shape3d;


public class Sphere extends Shape3D{
    private double radius = 1.0;

    public Sphere(double x, double y, double z, double radius){
        super(x, y, z);
        setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }
    private void setRadius(double radius){
        if (radius > 0.0) {
            this.radius = radius;
        }
    }
    public void resize(double dr){
        if ((radius + dr) > 0.0) {
            radius += dr;
        }
    }
    public double getArea(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    public double getVolume(){
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }
    public String toString(){
        return("ESFERA\nRadio: " + getRadius + "\n" + super.toString())
    }
}

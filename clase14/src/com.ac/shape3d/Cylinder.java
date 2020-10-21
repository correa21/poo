package com.ac.shape3d;

public class Cylinder extends Shape3D {
    private int radius = 0;
    private int height = 0;

    public Cylinder(double x, double y, double z, double radius, double height){
        super(x, y, z);
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    private void setRadius(double radius){
        if (radius > 0.0) {
            this.radius = radius;
        }
    }
    private void setHeight(double height){
        if (height > 0.0) {
            this.height = height;
        }
    }
    public void resize(double dr, double dh){
        if ((radius + dr) > 0.0 && (height + dh) > 0.0) {
            radius = radius + dr;
            height = height + dh;
        }

    }

    public double getArea(){
        return ((2 * Math.PI * Math.pow(radius, 2)) +
                (2 * Math.PI * height * radius));
    }
    public double getVolume(){
        return height * Math.PI * Math.pow(radius, 2);
    }
}

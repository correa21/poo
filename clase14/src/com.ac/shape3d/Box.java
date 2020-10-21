package com.ac.shape3d;

public class Box extends Shape3D{
    protected int deept = 0;
    protected int height = 0;
    protected int width = 0;

    public Sphere(double x, double y, double z, double deept, double height, double width){
        super(x, y, z);
        setDeept(radius);
        setHeight(height);
        setWidth(getWidth)
    }

    public double getDeept(){
        return deept;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    private void setDeept(double deept){
        if (deept > 0.0) {
            this.deept = deept;
        }
    }
    private void setHeight(double height){
        if (height > 0.0) {
            this.height = height;
        }
    }
    private void setWidth(double width){
        if (width > 0.0) {
            this.width = width;
        }
    }
    public void resize(double dw, double dh, double dd){
        if ((width + dw) > 0.0 && (height + dh) > 0.0 && (deept + dd) > 0.0) {
            deept = deept + dd;
            height = height + dh;
            width = width + dw;
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

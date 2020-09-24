package tests;

import shapes2d.Rectangle;

public class TestRectangle
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(12,15);
        Rectangle r3 = new Rectangle(10,20);

        r1.print();

        r1.setRectangleBase(40);
        r1.setRectangleHeight(10);

        r2 = r1.clone();
        System.gc();
        //r1.destructor();
        r2.print();
        r2 = null;
        System.gc();
    }
}

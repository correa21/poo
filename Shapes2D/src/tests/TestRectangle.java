package tests;

import shapes2d.Rectangle;

public class TestRectangle
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.print();

        r1.setRectangleBase(40);
        r1.setRectangleHeight(10);

        r1.print();
    }
}

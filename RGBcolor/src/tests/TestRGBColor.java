package tests;

import RGBcolor.*;

public class TestRGBColor
{
    public static void main(String[] args)
    {
        RGBColor c1 = new RGBColor();
        RGBColor c2 = new RGBColor(80,200,120,"Esmeralda");
        RGBColor c3 = new RGBColor(220,20,60,"Carmesi");
        RGBColor c4 = new RGBColor(18,10,143,"Azul Marino");
        RGBColor c5 = new RGBColor(c2.getCyan(),c2.getMagenta(),
                                   c2.getYellow(),"Esmeralda Impreso");

        System.out.printf("%x\n",c3.getRed());
        System.out.printf("%x\n",c3.getGreen());
        System.out.printf("%x\n",c3.getBlue());
        System.out.printf("%x\n",c3.getRGB());
     }
}

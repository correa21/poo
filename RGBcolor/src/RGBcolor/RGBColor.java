package RGBcolor;

public class RGBColor
{
    /*MASKS for RGB filtering*/
    private static int RED = 0xFF0000;
    private static int GREEN = 0xFF00;
    private static int BLUE = 0xFF;



    private int rgb = 127 << 16 | 127 << 8 | 127;
    private int red = 127;
    private int green = 127;
    private int blue = 127;
    private String name = "Gris";

    public RGBColor ()
    {

    }

    public RGBColor (int red, int green, int blue, String name)
    {
        setRed(red);
        setBlue(blue);
        setGreen(green);
        setName(name);
    }

    public void setRed(int red)
    {
        if (red <= 255 && red >= 0)
        {
            this.red = red;
        }
    }

    public void setBlue(int blue)
    {
        if (blue <= 255 && blue >= 0)
        {
            this.blue = blue;
        }
    }

    public void setGreen(int green)
    {
        if (green <= 255 && green >= 0)
        {
            this.green = green;
        }
    }
    public void setName(String name)
    {
        if("" != name)
        {
            this.name = name;
        }
    }

    public int getRed()
    {
        return red;
    }

    public int getGreen()
    {
        return green;
    }

    public int getBlue()
    {
        return blue;
    }

    private double getKRatio()
    {
        double r = red / 255.0;
        double g = green / 255.0;
        double b = blue / 255.0;
        double kRatio = (1.0 - maximus(r,g,b));
        return kRatio;
    }
    public int getCyan()
    {
        double r = red / 255.0;
        double k = getKRatio();
        double cRatio = (1-r-k) / (1-k+0.0000001);
        int c = (int) (cRatio*255);
        return c;
    }
    public int getMagenta()
    {
        double g = green / 255.0;
        double k = getKRatio();
        double mRatio = (1-g-k) / (1-k+0.0000001);
        int m = (int)(mRatio * 255);
        return m;
    }
    public int getYellow()
    {
        double b = blue / 255.0;
        double k = getKRatio();
        double yRatio = (1-b-k) / (1-k+0.0000001);
        int y = (int) (yRatio * 255);
        return y;
    }
    public int getRGB()
    {
        int rgb =  red << 16 | green << 8 | blue;
        return rgb;
    }

    private double maximus (double a, double b, double c)
    {
        if(a<b)
        {
            if (b<c)
            {
                return c;
            }
            else
            {
                return b;
            }
        }
        else if (a<c)
        {
            return c;
        }
        else
        {
            return a;
        }
    }
}

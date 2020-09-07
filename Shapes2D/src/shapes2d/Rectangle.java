package shapes2d;

public class Rectangle
{
    private double base = 1.0;
    private double height = 1.0;

    public Rectangle (double base, double height)
    {
        setRectangleBase(base);
        setRectangleHeight(base);
    }

    public Rectangle ()
    {
        
    }

    public void setRectangleHeight(double height)
    {
        if (height <= 100 && height >= 1)
        {
            this.height = height;
        }

    }

    public void setRectangleBase(double base)
    {
        if (base <= 100 && base >= 1)
        {
            this.base = base;
        }
    }

    public double getArea()
    {
        return base * height;
    }

    public double getPerimeter()
    {
        return 2 * (base + height);
    }
    public void print()
    {
        System.out.println(base + ", " + height + ", " +
                            getArea() + ", " + getPerimeter());
    }
}

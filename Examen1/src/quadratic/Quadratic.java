package quadratic;

public class Quadratic
{

    private int a  = 0;
    private int b = 0;
    private int c = 0;
    private boolean hasSolution = false;
    private double positiveX = 0;
    private double negativeX = 0;

    public Quadratic(int a, int b, int c){
        set(a, b, c);
    }

    private void setA (int a){
        this.a = a;
    }
    private void setB (int b){
        this.b = b;
    }
    private void setC (int c){
        this.c = c;
    }
    private int getA (int a){
        return a;
    }
    private int getB (int b){
        return b;
    }
    private int getC (int c){
        return c;
    }

    public void set(int a, int b, int c){
        setA(a);
        setB(b);
        setC(c);
    }

    public boolean getHasSolution(){
        return hasSolution;
    }
    public double getPositiveX(){
        return positiveX;
    }
    public double getNegativeX(){
        return negativeX;
    }
    public void solve(){
        int discriminant = (b*b) - (4 * a * c);
        if (discriminant < 0){
            hasSolution = false;
            return;
        }
        positiveX = (-b + Math.sqrt(discriminant)) / (2 * a);
        negativeX = (-b - Math.sqrt(discriminant)) / (2 * a);
        hasSolution = true;
    }

    public String toString()
    {
        if (hasSolution){
            return(a + "X^2 + " + b + "X + " + c + " = 0. X = (" + positiveX +
                    ", " + negativeX + ") ");
        }
        else{
            return(a + "X^2 + " + b + "X + " + c + " = 0. No real solution");
        }
    }

    public boolean equals(Object o)
    {
        if (!(o instanceof Quadratic))
            return false;
        Quadratic cuad = (Quadratic) o;
        if((this.a == cuad.a) && (this.b == cuad.b) && (this.c == cuad.c)){
            return true;
        }
        else{
            return false;
        }
    }
}

package vector;


public class Vector{

    public static int MIN_LENGTH;
    protected boolean isRowVector = true;
    static{
        MIN_LENGTH = 1;
    }
    public Vector(){
        MIN_LENGTH = 1;
        super(1,3);
    }
    public Vector(int cols){
        super(1,cols);
    }
     public Vector(boolean isRowVector, int size){
         this.isRowVector = isRowVector;
        (this.isRowVector == true) ? super(1,size) : super(size,1);
    }
    public double magnitude(){
        long sum = 0;
        if (isRowVector){
            for(int i = 0; i<this.cols; i++){
                sum += Math.pow(get(1,i),2);
            }
        }
        else{
            for(int i = 0; i<this.row; i++){
                sum += Math.pow(get(i,1),2);
            }
        }
        return Math.sqrt(sum);
    }
    public void setElement(int index, double value){
        //se usa la funcion set de la calse padre
        if (isRowVector) {
            set(1,index,value);
        }
        else{
            set(index,1, value)
        }
    }
    public double getElement(int index){
        //se usa la funcion get de la calse padre
        if (isRowVector) {
            get(1, index);
        }
        else{
            get(index, 1)
        }
    }
    public String toString(){
        String strFormat = "[";
        if (isRowVector) {
            strFormat += (super.toString() + "]")
            return super.toString();
        }
        else{
            for (int i = 0 ; i < super.cols ; i++){
                strFormat += get(i,1);
            }
            strFormat += "]T"
            return (strFormat);
        }
    }
}

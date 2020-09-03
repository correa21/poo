import javax.swing.*;


public class Main{
    public static void main(String[] args) {
        String strPrecio;
        float precio = 0.0f;

        do{
            strPrecio = JOptionPane.showInputDialog("Proporcione el precio");
            if (strPrecio == null)
            {
                break;
            }
            if (strPrecio.equals(""))
            {
                continue;
            }
            try
            {
                precio = Float.parseFloat(strPrecio);
            }
            catch(NumberFormatException ex)
            {
                System.out.println("El precio proporcinado no es numerico");
            }
            catch (Exception ex)
            {
                System.out.println("Ocurrió una excepción imprevista");
            }
        }while(precio <= 8.0f);
    }

}

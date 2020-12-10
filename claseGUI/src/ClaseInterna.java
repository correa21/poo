// Demostración de los métodos establecer y obtener de la clase Tiempo
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClaseInterna extends JFrame {
   private Tiempo tiempo;
   private JLabel rojoEtiquta, verdeEtiqueta, azulEtiqueta;
   private JTextField rojoCampo, verdeCampo, azulCampo, pantallaCampo;
   private JPanel contenedor;
   private Color backgroundColor;

   // constructor
   public ClaseInterna() {
      // llamar al constructor de JFrame para establecer cadena de barra de título
      super( "Demostración de clase interna anónima" );

      tiempo = new Tiempo();            // crear objeto Tiempo
      crearGUI();                       // configurar GUI
      super.add(this.contenedor);
      super.setResizable(false);
      registrarManejadoresDeEventos();  // configurar el manejo de eventos
   }

   // crear componentes de GUI y adjuntarlos al panel de contenido
   private void crearGUI(){
      contenedor = new JPanel();
      contenedor.setLayout(new BorderLayout());

      JPanel contCampos = new JPanel();
      contCampos.setLayout(new GridLayout(3, 2));

      rojoEtiquta = new JLabel( "Red" );
      rojoCampo = new JTextField( 10 );
      verdeEtiqueta = new JLabel( "Green" );
      verdeCampo = new JTextField( 10 );
      azulEtiqueta = new JLabel( "Blue" );
      azulCampo = new JTextField( 10 );
      pantallaCampo = new JTextField( 30 );
      pantallaCampo.setEditable( false );

      contCampos.add( rojoEtiquta);
      contCampos.add( rojoCampo);
      contCampos.add( verdeEtiqueta);
      contCampos.add( verdeCampo);
      contCampos.add( azulEtiqueta);
      contCampos.add( azulCampo);

      contenedor.add(contCampos, BorderLayout.WEST);
      contenedor.add(pantallaCampo, BorderLayout.CENTER);
      contenedor.setSize(300, 250);

   } // fin del método crearGUI

   // registrar manejadores de eventos para rojoCampo, verdeCampo y azulCampo
   private void registrarManejadoresDeEventos(){
      // registrar manejador de eventos para rojoCampo
      rojoCampo.addActionListener(

         new ActionListener() {  // clase interna anónima

            public void actionPerformed( ActionEvent evento ) {
               tiempo.establecerHora( Integer.parseInt(evento.getActionCommand() ) );
               rojoCampo.setText( "" );
               mostrarTiempo();
            }
         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener para rojoCampo

      // registrar manejador de eventos para verdeCampo
      verdeCampo.addActionListener(

         new ActionListener() {  // CLASE INTERNA ANONIMA

            public void actionPerformed( ActionEvent evento ){

               tiempo.establecerMinuto( Integer.parseInt(evento.getActionCommand() ) );
               verdeCampo.setText( "" );
               mostrarTiempo();
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener para verdeCampo

      azulCampo.addActionListener(

         new ActionListener() {  // clase interna anónima

            public void actionPerformed( ActionEvent evento )
            {
               tiempo.establecerSegundo( Integer.parseInt(evento.getActionCommand() ) );
               azulCampo.setText( "" );
               mostrarTiempo();
            }
         } // fin de la clase interna anónima
      ); // fin de la llamada a addActionListener para azulCampo
   } // fin del método registrarManejadoresDeEventos

   // mostrar tiempo en pantallaCampo
   public void mostrarTiempo(){
      pantallaCampo.setText( "La hora es: " + tiempo );
   }

   // crear objeto VentanaPruebaTiempo2, registrarse para sus eventos de ventana
   // y mostrarlo para empezar la ejecución de la aplicación
   public static void main( String args[] ){
      ClaseInterna ventana = new ClaseInterna();

      // registrar componente de escucha para evento windowClosing
      ventana.addWindowListener(

         // clase interna anónima para evento windowClosing
         new WindowAdapter() {

            // terminar la aplicación cuando el usuario cierra la ventana
            public void windowClosing( WindowEvent evento ){
               System.exit( 0 );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addWindowListener para ventana

      ventana.setSize( 400, 120 );
      ventana.setVisible( true );

   } // fin de main
} // fin de la clase ClaseInterna

import javax.swing.*; //Libreria de interfaz
import java.awt.event.*; //Eventos
import javax.swing.event.*; //Eventos del JCheckBox
import java.awt.*; // Color

public class terminos extends JFrame implements ActionListener, ChangeListener{

	//Suprime el mensaje de alerta
	@SuppressWarnings("Unchecked") 

	//Elementos de la interfaz
	private JLabel instruccion, logo;
	private JTextArea terminos;
	private JScrollPane scroll;
	private JButton continuar, declinar;
	private JCheckBox aceptar;

	//Variables
	String nombre_usuario = "";

	//Constructor
	terminos(){

		//Detalles de la interfaz
		setLayout(null);

		//Cierre de operación
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Título
		setTitle("Términos y Condiciones");

		//Mensajero
		bienvenida mensajero = new bienvenida();
		nombre_usuario = mensajero.nombre_usuario;

		//ICONO
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		
		//this.getContentPane().setBackground(new Color(250,0,0));

		//IMAGES
		ImageIcon logo_blanco_pequeño = new ImageIcon("images/logo-coca-rojo-pequeño.png");

		//Diseño de los elementos de la interfaz

			//Etiquetas
		instruccion = new JLabel("Por favor, lea atentamente los siguientes Términos y Condiciones");
		instruccion.setBounds(30,10, 700,50);
		instruccion.setFont(new Font("Times New Roman", 3, 16));
		instruccion.setForeground(new Color (0,0,0));
		add(instruccion);

		logo = new JLabel(logo_blanco_pequeño);
		logo.setBounds(460,245,250,250);
		add(logo);

			//JTextArea
		terminos = new JTextArea("                                        Terminos y condiciones" +
								"\n \n1) Este sistema se rige bajo la licencia de software libre."+ 
								"\n\nEs decir, en unión a la filosofía de movimiento de cultura libre, " + 
								"todo el software "+
								"\ndesarrollado por Amaro's Company puede ser:" +

								"\n \nA)  Usado libremente"+
								"\n \nB)  Usado para estudiar su funcionamiento y para la adaptación de su código fuente"+
								"\n para otra funcionalidad" +
								"\n\nC) Usado para la distribución de copias del mismo"+
								"\n\nD) Usado para modificarse y/o mejorar su código fuente, "+
								"y hacer públicas esas"+"\n mejoras."+

								"\n\nRespetamos la libertad de los usuarios y de la comunidad. "+
								"Por lo que el usuario"+"\n puede ejecutar, copiar, distribuir, estudiar, "+
								"modificar y mejorar el software."+

								"\n \n2) Todo el software diseñado bajo Amaro's Company es totalmente gratuito, "+
								"\naunque las donaciones y/o contribuciones son muy apreciadas." +

								"\n \n3) Este software ha sido diseñado con fines de educativos." +
								"\n\n Contacto con el desarrollador: \n \n @todo.es.relativo13");

		terminos.setFont(new Font("Andale Mono", 1, 12));
		terminos.setEditable(false);

		scroll = new JScrollPane(terminos);
		scroll.setBounds(30,55,620,270);
		add(scroll);

			//JCheckBox
		aceptar = new JCheckBox("Yo, " + nombre_usuario + ", he leído y acepto los términos y condiciones");
		aceptar.setBounds(10,330,460,50);
		//aceptar.setBackground(new Color(255,0,0));
		aceptar.addChangeListener(this);
		add(aceptar);

			//JButton
		continuar = new JButton("Continuar");
		continuar.setBounds(70,380,120,30);
		continuar.addActionListener(this);
		continuar.setEnabled(false);
		add(continuar);

		declinar = new JButton("Declinar");
		declinar.setBounds(230,380,120,30);
		declinar.addActionListener(this);
		add(declinar);
	}

	//Acción de los botones cuando estén activados

	public void actionPerformed(ActionEvent e){

		if(e.getSource() == continuar){

			//Abre la interfaz principal, ciera esta
		principal interfaz1 = new principal();
		interfaz1.setBounds(0,0,1200,800);
		interfaz1.setLocationRelativeTo(null);
		interfaz1.setVisible(true);
		interfaz1.setResizable(false);
		this.setVisible(false);

		} else if (e.getSource() == declinar){

			//Cierra esta interfaz, abre la de bienvendia
		bienvenida interfaz1 = new bienvenida();
		interfaz1.setBounds(0,0,500,700);
		interfaz1.setLocationRelativeTo(null);
		interfaz1.setVisible(true);
		interfaz1.setResizable(false);

		this.setVisible(false);		

		}
	}

	//Parte donde se activan o desactivan los botones

	public void stateChanged(ChangeEvent e){

		if(aceptar.isSelected() == true){
			continuar.setEnabled(true);
			declinar.setEnabled(false);
		
		} else if(aceptar.isSelected() == false){

			continuar.setEnabled(false);
			declinar.setEnabled(true);
		} 

	}

	public static void main(String[] args) {
		//Diseño del JFRAME
		terminos interfaz1 = new terminos();
		interfaz1.setBounds(0,0,700,450);
		interfaz1.setLocationRelativeTo(null);
		interfaz1.setVisible(true);
		interfaz1.setResizable(false);
	}

}
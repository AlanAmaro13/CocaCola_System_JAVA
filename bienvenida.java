import javax.swing.*; //Uso de la interfaz
import java.awt.*; //Uso del color
import java.awt.event.*;  //Uso de los eventos

public class bienvenida extends JFrame implements ActionListener{

	@SuppressWarnings("Unchecked") //Suprime el mensaje de alerta

	//Declaramos los elementos de la interfaz
	private JLabel logoPrincipal, bienvenida, instruccion, derechos; 
	private JTextField nombre;
	private JButton ingreso, bc;
	public static String nombre_usuario = "";

	//Colocamos el constructor
	public bienvenida(){
		setLayout(null); //Coordenadas del usuario
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierre en botón x
		setTitle("¡Bienvenido!"); //Título
		this.getContentPane().setBackground(new Color(255,0,0)); //Color de la interfaz 
		
		//ICONO
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		// IMAGES
		ImageIcon logo_blanco_pequeño = new ImageIcon("images/logo-coca.png");
		
		//ImageIcon icono = new ImageIcon("images/icon.png");
		ImageIcon logo_rojo = new ImageIcon("coca-cola.png");
		ImageIcon logo_blanco_grande = new ImageIcon("images/coca-cola-blanco.png");

		// Diseño de la interfaz

			//Etiquetas
		logoPrincipal = new JLabel(logo_blanco_pequeño);
		logoPrincipal.setBounds(95,60,300,100);
		add(logoPrincipal);

		bienvenida = new JLabel("¡Bienvenido a Sistema Vacacional!");
		bienvenida.setBounds(50,120,400,150);
		bienvenida.setFont(new Font("Andale Mono", 2, 23));
		bienvenida.setForeground(new Color(255,255,255));
		add(bienvenida);

		instruccion = new JLabel("Por favor, ingresa un solo nombre:");
		instruccion.setBounds(80,250,400,50);
		instruccion.setForeground(new Color(255,255,255));
		instruccion.setFont(new Font("Andale Mono", 2, 18));
		add(instruccion);

		derechos = new JLabel("® 2021 The Coca-Cola Company");
		derechos.setBounds(65,560,500,100);
		derechos.setFont(new Font("Andale Mono", 3, 20));
		derechos.setForeground(new Color(255,255,255));
		add(derechos);

			//JTextField
		nombre = new JTextField();
		nombre.setBounds(120,310,250,30);
		nombre.setBackground(new Color(255,255,255));
		nombre.setForeground(new Color(255,0,0));
		nombre.setFont(new Font("Andale Mono", 2, 18));
		add(nombre);

			//JButton
		ingreso = new JButton("Continuar");
		ingreso.setBounds(170,380,160,60);
		ingreso.addActionListener(this);
		add(ingreso);
	}


	//Acción de los botones
	public void actionPerformed(ActionEvent e){

		if(e.getSource() == bc){

			System.exit(0); //BOTON NO CONFIGURADO

		} else if (e.getSource() == ingreso){

			nombre_usuario = nombre.getText().trim(); //Obtiene el contenido del JTextField

			if(nombre_usuario.equals("")){ //Verifica que no esté vacio

				JOptionPane.showMessageDialog(null, "Debes colocar tu nombre");

			} else {

				// Abre la siguiente interfaz
				
				terminos interfaz1 = new terminos();
				interfaz1.setBounds(0,0,700,450);
				interfaz1.setLocationRelativeTo(null);
				interfaz1.setVisible(true);
				interfaz1.setResizable(false);	

				this.setVisible(false);
			}

		} 
	}

	//MAIN, diseño del JFRAME
	public static void main(String[] args) {

		bienvenida interfaz1 = new bienvenida();
		interfaz1.setBounds(0,0,500,700);
		interfaz1.setLocationRelativeTo(null);
		interfaz1.setVisible(true);
		interfaz1.setResizable(false);

	}

}


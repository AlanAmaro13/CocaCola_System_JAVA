import javax.swing.*; //Diseño de la interfaz
import java.awt.*; //Color
import java.awt.event.*; //Eventos

public class principal extends JFrame implements ActionListener{

	//Suprime las advertencias
	@SuppressWarnings("Unchecked")

	//Componentes de la interfaz
		//Barra Superior
	private JMenuBar barra;
		
		//Menus
	private JMenu opciones, color;
		
		//Items
	private JMenuItem nuevo, calcular, acerca_de, salir, rojo, negro, morado, rosa, azul;

		//Etiquetas
	private JLabel logo, bienvenida_nombre, nombre_trabajador, area_de_trabajo, años_de_trabajo, leyenda;

		//JTextField
	private JTextField nombre, apellido_paterno, apellido_materno;

		//JComboBox
	private JComboBox area, años;

		//JtextArea
	private JTextArea vacaciones;

	//Variables

	String nombre_usuario = "", nombre_text = "", apellido_paterno_text = "", apellido_materno_text= "";
	String años_text="", area_text="";


	// Constructor

	public principal(){

		setLayout(null); //Coordenadas

		//Mensajero

		bienvenida mensajero = new bienvenida();
		nombre_usuario = mensajero.nombre_usuario;

		//Titulo
		setTitle("¡Bienvenido " + nombre_usuario + "!");

		//Icono
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		//Cierre de proceso
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Color de la interfaz
		this.getContentPane().setBackground(new Color(255,0,0));

		//Imagenes
		ImageIcon logo_coca = new ImageIcon("images/logo-coca-blanco-mediano.png");

		//Barra del menu
		 barra = new JMenuBar();
		 setJMenuBar(barra);

		 // Menus
		 opciones = new JMenu("  Opciones  ");
		 opciones.setFont(new Font("Andale Mono", 2, 18));
		 barra.add(opciones );

		 color = new JMenu("Color   ");
		 color.setFont(new Font("Andale Mono",2,18));
		 opciones.add(color);

		 nuevo = new JMenuItem("                Nuevo");
		 nuevo.setFont(new Font("Andale Mono",2 , 18));
		 nuevo.addActionListener(this);
		 barra.add(nuevo);

		 calcular = new JMenuItem("             Calcular");
		 calcular.setFont(new Font("Andale Mono", 2, 18));
		 calcular.addActionListener(this);
		 barra.add(calcular);

		 acerca_de = new JMenuItem("             Acerca de");
		 acerca_de.setFont(new Font("Andale Mono", 2, 18));
		 acerca_de.addActionListener(this);
		 barra.add(acerca_de);

		 salir = new JMenuItem("                  Salir");
		 salir.setFont(new Font("Andale Mono", 2, 18));
		 salir.addActionListener(this);
		 barra.add(salir);

		 rojo = new JMenuItem("Rojo");
		 rojo.setFont(new Font("Andale Mono",2,18));
		 rojo.addActionListener(this);
		 color.add(rojo);

		 negro = new JMenuItem("Negro");
		 negro.setFont(new Font("Andale Mono",2,18));
		 negro.addActionListener(this);
		 color.add(negro);

		 morado = new JMenuItem("Morado");
		 morado.setFont(new Font("Andale Mono",2,18));
		 morado.addActionListener(this);
		 color.add(morado);

		 rosa = new JMenuItem("Rosa");
		 rosa.setFont(new Font("Andale Mono",2,18));
		 rosa.addActionListener(this);
		 color.add(rosa);

		 azul = new JMenuItem("Azul");
		 azul.setFont(new Font("Andale Mono",2,18));
		 azul.addActionListener(this);
		 color.add(azul);

		// Etiquetas

		logo = new JLabel(logo_coca);
		logo.setBounds(200,-165,820,622);
		add(logo);

		bienvenida_nombre = new JLabel("¡Bienvenido " + nombre_usuario + "!");
		bienvenida_nombre.setBounds(200,225,900,200);
		bienvenida_nombre.setFont(new Font("Andale Mono", 3, 42));
		bienvenida_nombre.setForeground(new Color(255,255,255));
		add(bienvenida_nombre);

		nombre_trabajador = new JLabel(
			"Nombres                           " + 
			"Apellido Paterno                    " + 
			"Apellido Materno");
		nombre_trabajador.setBounds(80,300,1200,200);
		nombre_trabajador.setFont(new Font("Andale Mono", 0, 28));
		nombre_trabajador.setForeground(new Color(255,255,255));
		add(nombre_trabajador);

		area_de_trabajo = new JLabel("Área de trabajo");
		area_de_trabajo.setBounds(50, 460,400,200);
		area_de_trabajo.setFont(new Font("Andale Mono", 0, 28));
		area_de_trabajo.setForeground(new Color(255,255,255));
		add(area_de_trabajo);

		años_de_trabajo = new JLabel("Años de trabajo");
		años_de_trabajo.setBounds(450,460,400,200);
		años_de_trabajo.setFont(new Font("Andale Mono", 0 , 28));
		años_de_trabajo.setForeground(new Color(255,255,255));
		add(años_de_trabajo);

		leyenda = new JLabel("®2021 The Coca-Cola Company - Todos los derechos reservados");
		leyenda.setBounds(50,620,1000,200);
		leyenda.setFont(new Font("Andale Mono", 3, 20));
		leyenda.setForeground(new Color(255,255,255));
		add(leyenda);

		// JTextArea

		vacaciones = new JTextArea("Los días de vacaciones aparecen aquí");
		vacaciones.setBounds(830,540, 310,160);
		vacaciones.setFont(new Font("Andale Mono", 3, 14));
		vacaciones.setEditable(false);
		add(vacaciones);

		//JTextField
		nombre = new JTextField("");
		nombre.setBounds(40,450,250,40);
		nombre.setFont(new Font("Andale Mono", 1, 18));
		nombre.setEditable(true);
		add(nombre);

		apellido_paterno = new JTextField("            ");
		apellido_paterno.setBounds(430,450,260,40);
		apellido_paterno.setFont(new Font("Andale Mono", 1, 18));
		apellido_paterno.setEditable(true);
		add(apellido_paterno);

		apellido_materno = new JTextField("            ");
		apellido_materno.setBounds(845,450,250,40);
		apellido_materno.setFont(new Font("Andale Mono", 1, 18));
		apellido_materno.setEditable(true);
		add(apellido_materno);

		// JComboBox
		area = new JComboBox();
		area.setBounds(30,600,320,40);
		area.addItem("Departamento de Atención al cliente");
		area.addItem("Departamento de Logística");
		area.addItem("Departamento de Gerencia");
		area.setFont(new Font("Andale Mono", 1, 14));
		add(area);

		años = new JComboBox();
		años.setBounds(440,600,300,40);
		años.addItem("1 año de servicio");
		años.addItem("De 2 a 6 años de servicio");
		años.addItem("Apartir de 7 años de servicio");
		años.setFont(new Font("Andale Mono", 1, 14));
		add(años);

	}

	public void actionPerformed(ActionEvent e){

		//Regresa a la bievenida
		if(e.getSource() == salir){

		bienvenida interfaz1 = new bienvenida();
		interfaz1.setBounds(0,0,500,700);
		interfaz1.setLocationRelativeTo(null);
		interfaz1.setVisible(true);
		interfaz1.setResizable(false);
		this.setVisible(false);


		//Da información sobre el desarrollador
		} else if(e.getSource() == acerca_de){
			JOptionPane.showMessageDialog(null, "Desarrollado por:" + 
												"\n       Alan Amaro" +
												"\n\n         Instagram: \n @todo.es.relativo13");
		
		//Realiza el cálculo de vacaciones
		//Dependiendo del área y la antiguedad
		} else if(e.getSource() == calcular){

			//Obtención de los datos
			nombre_text = nombre.getText();
			apellido_paterno_text = apellido_paterno.getText().trim();
			apellido_materno_text = apellido_materno.getText().trim();

			años_text = años.getSelectedItem().toString();
			area_text = area.getSelectedItem().toString();

			//Verifica que no hay campos vacios
		if( nombre_text.equals("") || apellido_paterno_text.equals("") || 
			apellido_materno.equals("")|| años_text.equals("") ||
			area_text.equals("")){

			JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");

		} else {

			if(area_text.equals("Departamento de Atención al cliente")){


				if(años_text.equals("1 año de servicio")){

					vacaciones.setText("El trabajador: \n"+
										nombre_text + " " + apellido_paterno_text+ " " + apellido_materno_text +
										"\n\nEl cual labora en:\n "+
										area_text +
										"\n\nDesde hace 1 año de servicio. "+
										"\n \nRecibe 6 días de vacaciones");

					vacaciones.setFont(new Font("Andale Mono", 3, 14));

				} else if(años_text.equals("De 2 a 6 años de servicio")){

					vacaciones.setText("El trabajador: \n"+
										nombre_text + " " + apellido_paterno_text+ " " + apellido_materno_text +
										"\n\nEl cual labora en:\n "+
										area_text +
										"\n\nDesde 2 a 6 años de servicio. "+
										"\n \nRecibe 14 días de vacaciones");

					vacaciones.setFont(new Font("Andale Mono", 3, 14));

				} else if(años_text.equals("Apartir de 7 años de servicio")){

					vacaciones.setText("El trabajador: \n"+
										nombre_text + " " + apellido_paterno_text+ " " + apellido_materno_text +
										"\n\nEl cual labora en:\n "+
										area_text +
										"\n\nDesde hace 7 años de servicio. "+
										"\n \nRecibe 20 días de vacaciones");

					vacaciones.setFont(new Font("Andale Mono", 3, 14));

				}


			} else if(area_text.equals("Departamento de Logística")){

				if(años_text.equals("1 año de servicio")){

					vacaciones.setText("El trabajador: \n"+
										nombre_text + " " + apellido_paterno_text+ " " + apellido_materno_text +
										"\n\nEl cual labora en:\n "+
										area_text +
										"\n\nDesde hace 1 año de servicio. "+
										"\n \nRecibe 7 días de vacaciones");

					vacaciones.setFont(new Font("Andale Mono", 3, 14));

				} else if(años_text.equals("De 2 a 6 años de servicio")){

					vacaciones.setText("El trabajador: \n"+
										nombre_text + " " + apellido_paterno_text+ " " + apellido_materno_text +
										"\n\nEl cual labora en:\n "+
										area_text +
										"\n\nDesde 2 a 6 años de servicio. "+
										"\n \nRecibe 15 días de vacaciones");

					vacaciones.setFont(new Font("Andale Mono", 3, 14));

				} else if(años_text.equals("Apartir de 7 años de servicio")){

					vacaciones.setText("El trabajador: \n"+
										nombre_text + " " + apellido_paterno_text+ " " + apellido_materno_text +
										"\n\nEl cual labora en:\n "+
										area_text +
										"\n\nDesde hace 7 años de servicio. "+
										"\n \nRecibe 22 días de vacaciones");

					vacaciones.setFont(new Font("Andale Mono", 3, 14));

				}

			} else if(area_text.equals("Departamento de Gerencia")){

				if(años_text.equals("1 año de servicio")){

					vacaciones.setText("El trabajador: \n"+
										nombre_text + " " + apellido_paterno_text+ " " + apellido_materno_text +
										"\n\nEl cual labora en:\n "+
										area_text +
										"\n\nDesde hace 1 año de servicio. "+
										"\n \nRecibe 10 días de vacaciones");

					vacaciones.setFont(new Font("Andale Mono", 3, 14));

				} else if(años_text.equals("De 2 a 6 años de servicio")){

					vacaciones.setText("El trabajador: \n"+
										nombre_text + " " + apellido_paterno_text+ " " + apellido_materno_text +
										"\n\nEl cual labora en:\n "+
										area_text +
										"\n\nDesde 2 a 6 años de servicio. "+
										"\n \nRecibe 20 días de vacaciones");

					vacaciones.setFont(new Font("Andale Mono", 3, 14));

				} else if(años_text.equals("Apartir de 7 años de servicio")){

					vacaciones.setText("El trabajador: \n"+
										nombre_text + " " + apellido_paterno_text+ " " + apellido_materno_text +
										"\n\nEl cual labora en:\n "+
										area_text +
										"\n\nDesde hace 7 años de servicio. "+
										"\n \nRecibe 30 días de vacaciones");

					vacaciones.setFont(new Font("Andale Mono", 3, 14));

				}

			}
		}

		//Borra los campos, deja todo como al inicio
		} else if(e.getSource() == nuevo){

			nombre.setText("");
			apellido_paterno.setText("            ");
			apellido_materno.setText("            ");
			area.setSelectedIndex(0);
			años.setSelectedIndex(0);
			vacaciones.setText("Los días de vacaciones aparecen aquí");

		//Cambia el color de la interfaz 
		} else if (e.getSource() == rojo){

			this.getContentPane().setBackground(new Color(255,0,0));

		} else if (e.getSource() == negro){

			this.getContentPane().setBackground(new Color(0,0,0));

		} else if (e.getSource() == morado){

			this.getContentPane().setBackground(new Color(165,75,255));

		} else if (e.getSource() == rosa){

			this.getContentPane().setBackground(new Color(247,76,255));

		} else if (e.getSource() == azul){

			this.getContentPane().setBackground(new Color(75,162,255));

		}


	}

	public static void main(String[] args) {

		//Diseño del JFRAME
		principal interfaz1 = new principal();
		interfaz1.setBounds(0,0,1200,800);
		interfaz1.setLocationRelativeTo(null);
		interfaz1.setVisible(true);
		interfaz1.setResizable(false);

	}
}
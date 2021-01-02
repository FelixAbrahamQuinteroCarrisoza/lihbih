package Proyecto_Final;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Menu extends Memorama {
	
		
	//BOTONES
	JLabel fondoMenu;
	JPanel panelMenu;
	JLabel BotonSuma;
	JLabel BotonResta;
	JLabel BotonDivision;
	JLabel BotonMulti;
	
	JLabel PresBotonSuma;
	JLabel PresBotonResta;
	JLabel PresBotonDivision;
	JLabel PresBotonMulti;
	
	
	JLabel RegresarBoton;
	JLabel PresRegresarBoton;
	JLabel InformacionBoton;
	JLabel PresInformacionBoton;
	JLabel Anima;
	
	JLabel imgVidas;
	JLabel imgVidas2;
	JLabel imgVidas3;
	
	Timer tiempo;
	Timer tiempoEspera;
	Timer tiempoEspera1;
	JLabel cronometro;
	
	//Variables para la matriz de los pares
	JLabel matriz[][];
	int mat[][];
	int matAux[][];
	Random aleatorio;
	
	int min;
	int seg;
	int contador;
	int contSegEsp;
	int ban;
	int ban1;
	
	//detenga el numero de la carta
	int num;
	//pos anterior de la carta en x
	int antx;
	//pos anterior de la carta en y
	int anty;
	
	//detenga el numero de la carta actual
	int actualnum;
	//pos actual de la carta en x
	int actualx;
	//pos actual de la carta en y
	int actualy;

  //Variables para las operaciones
  int numero1;
  int numero2;
  int res;
  int vidas;
  String n;
  String n2;
  int salir;
  int contvid;
  int errores;
  
  int numeroDiv;
  int numeroDiv2;
  
  //Variables para los sonidos
  Clip MusicaFondoMenu = null;
  Clip SonidoBotonMenu = null;
  Clip SonidoBotonPuntaje = null;
  Clip SonidoBotonRegresar = null;
  Clip sonidoEquivo = null;
  Clip sonidoEquivo2 = null;
  Clip sonidoCorrec = null;
  Clip sonidoGanar = null;
  
  Timer tiempoEsperaBotones;
  int contespe;
  int contAnim;
  
  //Variables para la animacion de la piraña
  int contAnimPira;
  int contAnimPira1;
  JLabel AnimaPira1;
  JLabel AnimaPira2;
  JLabel AnimaPira3;
  JLabel AnimaPira4;
  JLabel AnimaPira5;
  
  String NumRegre;
  
public void Menu() {
	
	
	//panel del menu
	panelMenu = new JPanel();
	panelMenu.setSize(ventana.getWidth(), ventana.getHeight());
	panelMenu.setLocation(0, 0);
	panelMenu.setLayout(null); 
	panelMenu.setVisible(true);
			
	//fondo del menu
	fondoMenu = new JLabel();
	fondoMenu.setSize(ventana.getWidth(), ventana.getHeight());
	fondoMenu.setLocation(0, 0);
	fondoMenu.setIcon(new ImageIcon("Imagenes/niveles.png"));
	fondoMenu.setVisible(true);
	panelMenu.add(fondoMenu,0);
	
	//nombre de jugador
	nombreJugador = new JLabel();
	nombreJugador.setSize(100, 20);
	nombreJugador.setLocation(20, 80);
	nombreJugador.setForeground(Color.WHITE);
	nombreJugador.setVisible(true);
	panelMenu.add(nombreJugador,0);
	
	//boton para entrar a jugar pares suma
	BotonSuma = new JLabel();
	BotonSuma.setSize(265, 108);
	BotonSuma.setLocation(400, 400);
	BotonSuma.setIcon(new ImageIcon("Imagenes/botonSuma.png"));
	BotonSuma.setVisible(true);
	panelMenu.add(BotonSuma,0);
	
	//boton para animacion del boton suma
	PresBotonSuma = new JLabel();
	PresBotonSuma.setSize(265, 108);
	PresBotonSuma.setLocation(400, 400);
	PresBotonSuma.setIcon(new ImageIcon("Imagenes/presSuma.png"));
	PresBotonSuma.setVisible(false);
	panelMenu.add(PresBotonSuma,0);
	
	//boton para entrar a jugar pares resta
	BotonResta = new JLabel();
	BotonResta.setSize(265, 108);
	BotonResta.setLocation(500, 300);
	BotonResta.setIcon(new ImageIcon("Imagenes/imgResta.png"));
	BotonResta.setVisible(true);
	panelMenu.add(BotonResta,0);
	
	//boton para animacion del boton resta
	PresBotonResta = new JLabel();
	PresBotonResta.setSize(265, 108);
	PresBotonResta.setLocation(500, 300);
	PresBotonResta.setIcon(new ImageIcon("Imagenes/presResta.png"));
	PresBotonResta.setVisible(false);
	panelMenu.add(PresBotonResta,0);
	
	//boton para entrar a jugar pares de divisiones
	BotonDivision = new JLabel();
	BotonDivision.setSize(265, 108);
	BotonDivision.setLocation(700, 110);
	BotonDivision.setIcon(new ImageIcon("Imagenes/divisionboton.png"));
	BotonDivision.setVisible(true);
	panelMenu.add(BotonDivision,0);
	
	//boton para animacion del boton division
	PresBotonDivision = new JLabel();
	PresBotonDivision.setSize(265, 108);
	PresBotonDivision.setLocation(700, 110);
	PresBotonDivision.setIcon(new ImageIcon("Imagenes/presDivi.png"));
	PresBotonDivision.setVisible(false);
	panelMenu.add(PresBotonDivision,0);
	
	//boton para entrar a jugar pares de multiplicaciones
	BotonMulti = new JLabel();
	BotonMulti.setSize(265, 108);
	BotonMulti.setLocation(600, 200);
	BotonMulti.setIcon(new ImageIcon("Imagenes/multi.png"));
	BotonMulti.setVisible(true);
	panelMenu.add(BotonMulti,0);
	
	//boton para animacion del boton multiplicacion
	PresBotonMulti = new JLabel();
	PresBotonMulti.setSize(265, 108);
	PresBotonMulti.setLocation(600, 200);
	PresBotonMulti.setIcon(new ImageIcon("Imagenes/presMulti.png"));
	PresBotonMulti.setVisible(false);
	panelMenu.add(PresBotonMulti,0);
	
	//imagen de animacion para el cubo
	Anima = new JLabel();
	Anima.setSize(60, 67);
	Anima.setLocation(203, 233);
	Anima.setIcon(new ImageIcon("Imagenes/anima.png"));
	Anima.setVisible(false);
	panelMenu.add(Anima,0);
	
	
	//imagen de animacion para la piraña
	AnimaPira1 = new JLabel();
	AnimaPira1.setSize(68, 67);
	AnimaPira1.setLocation(183, 60);
	AnimaPira1.setIcon(new ImageIcon("Imagenes/piraña png 1.png"));
	AnimaPira1.setVisible(false);
	panelMenu.add(AnimaPira1,0);
	
	//imagen de animacion para la piraña
	AnimaPira2 = new JLabel();
	AnimaPira2.setSize(68, 67);
	AnimaPira2.setLocation(183, 60);
	AnimaPira2.setIcon(new ImageIcon("Imagenes/piraña png 2.png"));
	AnimaPira2.setVisible(false);
	panelMenu.add(AnimaPira2,0);
	
	//imagen de animacion para la piraña
	AnimaPira3 = new JLabel();
	AnimaPira3.setSize(68, 67);
	AnimaPira3.setLocation(183, 60);
	AnimaPira3.setIcon(new ImageIcon("Imagenes/piraña png 3.png"));
	AnimaPira3.setVisible(false);
	panelMenu.add(AnimaPira3,0);
	
	//imagen de animacion para la piraña
	AnimaPira4 = new JLabel();
	AnimaPira4.setSize(68, 67);
	AnimaPira4.setLocation(183, 60);
	AnimaPira4.setIcon(new ImageIcon("Imagenes/piraña png 4.png"));
	AnimaPira4.setVisible(false);
	panelMenu.add(AnimaPira4,0);
	
	//imagen de animacion para la piraña
	AnimaPira5 = new JLabel();
	AnimaPira5.setSize(68, 67);
	AnimaPira5.setLocation(183, 60);
	AnimaPira5.setIcon(new ImageIcon("Imagenes/piraña png 5.png"));
	AnimaPira5.setVisible(false);
	panelMenu.add(AnimaPira5,0);
	
	
	//GIF
	JLabel AnimaGIF = new JLabel();
	AnimaGIF.setSize(222, 143);
	//AnimaGIF.setLocation(350, 10);
	AnimaGIF.setLocation(700, 350);
	AnimaGIF.setIcon(new ImageIcon("Imagenes/GIFsuma.gif"));
	AnimaGIF.setVisible(true);
	panelMenu.add(AnimaGIF,0);
	
	//Imagen para el titulo
	JLabel TituloMenu = new JLabel();
	TituloMenu.setSize(359, 175);
	TituloMenu.setLocation(320, 10);
	TituloMenu.setIcon(new ImageIcon("Imagenes/tituloniveles.png"));
	TituloMenu.setVisible(true);
	panelMenu.add(TituloMenu,0);
	
	//Tiempo de espera para animacion del cubo 
	 Timer tiempoEsperaAnim=new Timer(1000,new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				contAnim++;
				
				if(contAnim %2 ==0) {
				Anima.setVisible(true);
				}
				else {
				Anima.setVisible(false);
				}
			}
			
		});
	 tiempoEsperaAnim.start();
	 
	//Tiempo de espera para animacion de la piraña 
	Timer tiempoEsperaAnimPira=new Timer(100,new ActionListener () {
				@Override
				public void actionPerformed(ActionEvent e)
				{
					
					contAnimPira++;
					
					if(contAnimPira==5 || contAnimPira==6 ) {
						AnimaPira1.setVisible(true);
						AnimaPira2.setVisible(false);
						AnimaPira3.setVisible(false);
						AnimaPira4.setVisible(false);
						AnimaPira5.setVisible(false);
						
					}						
					else if(contAnimPira==4 || contAnimPira==7) {
						AnimaPira1.setVisible(false);
						AnimaPira2.setVisible(true);
						AnimaPira3.setVisible(false);
						AnimaPira4.setVisible(false);
						AnimaPira5.setVisible(false);
					}
					else if(contAnimPira==3 || contAnimPira==8) {
						AnimaPira1.setVisible(false);
						AnimaPira2.setVisible(false);
						AnimaPira3.setVisible(true);
						AnimaPira4.setVisible(false);
						AnimaPira5.setVisible(false);
					}
					else if(contAnimPira==2 || contAnimPira==9) {
						AnimaPira1.setVisible(false);
						AnimaPira2.setVisible(false);
						AnimaPira3.setVisible(false);
						AnimaPira4.setVisible(true);
						AnimaPira5.setVisible(false);
						
					}
					else if(contAnimPira==1 || contAnimPira==10) {
						AnimaPira1.setVisible(false);
						AnimaPira2.setVisible(false);
						AnimaPira3.setVisible(false);
						AnimaPira4.setVisible(false);
						AnimaPira5.setVisible(true);
						
						if(contAnimPira==10)
							contAnimPira=0;
					}
				}
				
			});
		 tiempoEsperaAnimPira.start();
	 
	
	//MUSICA PARA EL FONDO DEL MENU
	try {
		MusicaFondoMenu = AudioSystem.getClip();
	} catch (LineUnavailableException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
    File a5 = new File("Imagenes\\y2mate.com - Space Fantasy - Super Mario Galaxy Lo-fi Remix.wav");
    try {
    	MusicaFondoMenu.open(AudioSystem.getAudioInputStream(a5));
	} catch (LineUnavailableException | IOException
			| UnsupportedAudioFileException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
    //Activar sonido
    MusicaFondoMenu.start();
    MusicaFondoMenu.loop(Clip.LOOP_CONTINUOUSLY);
    
    //SONIDO DE LOS BOTONES DEL MENU
    try {
    	SonidoBotonMenu = AudioSystem.getClip();
	} catch (LineUnavailableException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
    File a7 = new File("Imagenes\\donkey-kong-coin.wav");
    try {
    	SonidoBotonMenu.open(AudioSystem.getAudioInputStream(a7));
	} catch (LineUnavailableException | IOException
			| UnsupportedAudioFileException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	
	//EVENTO CUANDO SE PRESIONA EL BOTON SUMA
	BotonSuma.addMouseListener(new MouseAdapter () {
		@Override 
		public void mousePressed(MouseEvent e) {
			
			tiempoEsperaAnim.stop();
			SonidoBotonMenu.start();
			PresBotonSuma.setVisible(true);
			
			//Evento para esperar 1 segundo cuando se presiona el boton
			tiempoEsperaBotones=new Timer(1000,new ActionListener () {

				@Override
				public void actionPerformed(ActionEvent e) {
					contespe++;
						 
			System.out.print(contespe);
			
			if(contespe==1) {
				
			tiempoEsperaBotones.stop();	
			//cuando le damos clik al boton jugar, desaparece el fondo original
			panelMenu.setVisible(false);
			//objeto mandar a llamar la clase suma
			Suma Obj2 = new Suma ();
			Obj2.Suma();
			nombreJugador.setText("Jugador: "+Jugador);
			
			//cerrar musica 
			MusicaFondoMenu.close();
			}
				}
				
			});
			tiempoEsperaBotones.start();
		}});	
	
	//EVENTO CUANDO SE PRESIONA EL BOTON RESTA
	BotonResta.addMouseListener(new MouseAdapter () {
		@Override 
		public void mousePressed(MouseEvent e) {
			
			tiempoEsperaAnim.stop();
			SonidoBotonMenu.start();
			PresBotonResta.setVisible(true);
			
			//Evento para esperar 1 segundo cuando se presniona el boton
			tiempoEsperaBotones=new Timer(1000,new ActionListener () {

				@Override
				public void actionPerformed(ActionEvent e) {
					contespe++;
						 
			System.out.print(contespe);
			
			if(contespe==1) {
			tiempoEsperaBotones.stop();
			//cuando le damos clik al boton jugar, desaparece el fondo original
			panelMenu.setVisible(false);
			//objeto mandar a llamar la clase resta
			Resta Obj3 = new Resta ();
			Obj3.Resta();
			nombreJugador.setText("Jugador: "+Jugador);
			
			//cerrar musica 
			MusicaFondoMenu.close();
			}
				}
				
			});
			tiempoEsperaBotones.start();
		}});	
	
	//EVENTO CUANDO SE PRESIONA EL BOTON DIVISION
	BotonDivision.addMouseListener(new MouseAdapter () {
		@Override 
		public void mousePressed(MouseEvent e) {
			
			tiempoEsperaAnim.stop();
			SonidoBotonMenu.start();
			PresBotonDivision.setVisible(true);
			
			//Evento para esperar 1 segundo cuando se presniona el boton
			tiempoEsperaBotones=new Timer(1000,new ActionListener () {

				@Override
				public void actionPerformed(ActionEvent e) {
					contespe++;
						 
			System.out.print(contespe);
			
			if(contespe==1) {
			tiempoEsperaBotones.stop();	
			//cuando le damos clik al boton jugar, desaparece el fondo original
			panelMenu.setVisible(false);
			//objeto mandar a llamar la clase divison
			Division Obj3 = new Division ();
			Obj3.Division();
			nombreJugador.setText("Jugador: "+Jugador);
			
			//cerrar musica 
			MusicaFondoMenu.close();
			}
				}
				
			});
			tiempoEsperaBotones.start();
		}});	
	
	//EVENTO CUANDO SE PRESIONA EL BOTON MULTIPLICACION
	BotonMulti.addMouseListener(new MouseAdapter () {
		@Override 
		public void mousePressed(MouseEvent e) {
			
			tiempoEsperaAnim.stop();
			SonidoBotonMenu.start();
			PresBotonMulti.setVisible(true);
			
			//Evento para esperar 1 segundo cuando se presniona el boton
			tiempoEsperaBotones=new Timer(1000,new ActionListener () {

				@Override
				public void actionPerformed(ActionEvent e) {
					contespe++;
						 
			System.out.print(contespe);
			
			if(contespe==1) {
			tiempoEsperaBotones.stop();	
			//cuando le damos clik al boton jugar, desaparece el fondo original
			panelMenu.setVisible(false);
			//objeto mandar a llamar la clase multiplicacion
			Multiplicacion Obj3 = new Multiplicacion ();
			Obj3.Multiplicacion();
			nombreJugador.setText("Jugador: "+Jugador);
			
			//cerrar musica 
			MusicaFondoMenu.close();
			}
				}
				
			});
			tiempoEsperaBotones.start();
		}});	
	
	
	
	
	nombreJugador.setText("Jugador: "+Jugador);
	
	ventana.add(panelMenu);
	panelMenu.setVisible(true);
		
		
	}
}




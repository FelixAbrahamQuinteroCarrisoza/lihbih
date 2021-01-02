package Proyecto_Final;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
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

public class Memorama {
	
    static JFrame ventana;
    
	static JPanel panelPresentacion;
	static JLabel fondoPresentacion;
	static JLabel BotonMenu;
	static String Jugador;
	static public JLabel nombreJugador;
	static Timer tiempo;
	
	static JLabel BotonMenuAnima;
	static Timer tiempoEspera1;
	
	static int contSegEspe;
	static int contEstrella;
	static int contEspeMon;
	static int contEspeBal;
	
	
	static JLabel AnimaEstre1;
	static JLabel AnimaEstre2;
	static JLabel AnimaEstre3;
	
	public static void main(String []args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		
		
		    //Musica de fondo para la presentacion
			Clip Musica = AudioSystem.getClip();
	        File a = new File("Imagenes\\Into the Galaxy - Super Mario Galaxy.wav");
	        Musica.open(AudioSystem.getAudioInputStream(a));
	        Musica.start();
	        Musica.loop(Clip.LOOP_CONTINUOUSLY);
	        
	        //Sonido para el boton "play"
	        Clip sonidoPlay = AudioSystem.getClip();
	        File a2 = new File("Imagenes\\donkey-kong-coin.wav");
	        sonidoPlay.open(AudioSystem.getAudioInputStream(a2));
		
		        //ventana
				ventana = new JFrame("Memorama de Mario");
				ventana.setSize(1000, 563);
				ventana.setLayout(null);
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ventana.setLocationRelativeTo(null);
				ventana.setResizable(false); 
				
				
				//Porpiedades al panel
				panelPresentacion = new JPanel();
				panelPresentacion.setSize(ventana.getWidth(), ventana.getHeight());
				panelPresentacion.setLocation(0, 0);
				panelPresentacion.setLayout(null); 
				panelPresentacion.setVisible(true);
				
				
				//imagen de fondo de presentacion 
				fondoPresentacion = new JLabel();
				fondoPresentacion.setSize(ventana.getWidth(), ventana.getHeight());
				fondoPresentacion.setLocation(0, 0);
				fondoPresentacion.setIcon(new ImageIcon("Imagenes/portada.png"));
				fondoPresentacion.setVisible(true);
				panelPresentacion.add(fondoPresentacion,0);
				
				
				//boton para entrar al menu
				BotonMenu = new JLabel();
				BotonMenu.setSize(265, 108);
				BotonMenu.setLocation(300, 350);
				BotonMenu.setIcon(new ImageIcon("Imagenes/boton.png"));
				BotonMenu.setVisible(true);
				panelPresentacion.add(BotonMenu,0);
				
				
				//boton para entrar al menu animacion
				BotonMenuAnima = new JLabel();
				BotonMenuAnima.setSize(265, 108);
				BotonMenuAnima.setLocation(300, 350);
				BotonMenuAnima.setIcon(new ImageIcon("Imagenes/botonpush.png"));
				BotonMenuAnima.setVisible(false);
				panelPresentacion.add(BotonMenuAnima,0);
				
				//imagen de animacion estrella 
				AnimaEstre1 = new JLabel();
				AnimaEstre1.setSize(68, 67);
				AnimaEstre1.setLocation(620,150);
				AnimaEstre1.setIcon(new ImageIcon("Imagenes/Estrella 3.png"));
				AnimaEstre1.setVisible(false);
				panelPresentacion.add(AnimaEstre1,0);
				
				//imagen de animacion estrella 
				AnimaEstre2 = new JLabel();
				AnimaEstre2.setSize(68, 67);
				AnimaEstre2.setLocation(620, 150);
				AnimaEstre2.setIcon(new ImageIcon("Imagenes/Estrella 2.png"));
				AnimaEstre2.setVisible(false);
				panelPresentacion.add(AnimaEstre2,0);
				
				//imagen de animacion estrella 
				AnimaEstre3 = new JLabel();
				AnimaEstre3.setSize(68, 67);
				AnimaEstre3.setLocation(620, 150);
				AnimaEstre3.setIcon(new ImageIcon("Imagenes/Estrella 1.png"));
				AnimaEstre3.setVisible(false);
				panelPresentacion.add(AnimaEstre3,0);
				
				//imagen de animacion de las monedas
				JLabel Mon = new JLabel();
				//Mon.setSize(165, 126);
				Mon.setSize(161, 123);
				Mon.setLocation(0, 5);
				Mon.setIcon(new ImageIcon("Imagenes/Monedas 2.png"));
				Mon.setVisible(true);
				panelPresentacion.add(Mon,0);
				
				//imagen de animacion para la bala
				JLabel AnimaBala1 = new JLabel();
				AnimaBala1.setSize(166, 148);
				AnimaBala1.setLocation(900, 110);
				AnimaBala1.setIcon(new ImageIcon("Imagenes/Bala.png"));
				AnimaBala1.setVisible(false);
				panelPresentacion.add(AnimaBala1,0);
				
				//imagen de animacion para la bala
				JLabel AnimaBala2 = new JLabel();
				AnimaBala2.setSize(166, 148);
				AnimaBala2.setLocation(850,70 );
				AnimaBala2.setIcon(new ImageIcon("Imagenes/Bala.png"));
				AnimaBala2.setVisible(false);
				panelPresentacion.add(AnimaBala2,0);
				
				//imagen de animacion para la bala
				JLabel AnimaBala3 = new JLabel();
				AnimaBala3.setSize(166, 148);
				AnimaBala3.setLocation(800, 30);
				AnimaBala3.setIcon(new ImageIcon("Imagenes/Bala.png"));
				AnimaBala3.setVisible(false);
				panelPresentacion.add(AnimaBala3,0);
				
				//imagen de animacion para la bala
				JLabel AnimaBala4 = new JLabel();
				AnimaBala4.setSize(166, 148);
				AnimaBala4.setLocation(750, -10);
				AnimaBala4.setIcon(new ImageIcon("Imagenes/Bala.png"));
				AnimaBala4.setVisible(false);
				panelPresentacion.add(AnimaBala4,0);
				
				//imagen de animacion para la bala
				JLabel AnimaBala5 = new JLabel();
				AnimaBala5.setSize(166, 148);
				AnimaBala5.setLocation(700, -50);
				AnimaBala5.setIcon(new ImageIcon("Imagenes/Bala.png"));
				AnimaBala5.setVisible(false);
				panelPresentacion.add(AnimaBala5,0);
				
				//imagen de animacion para la bala
				JLabel AnimaBala6 = new JLabel();
				AnimaBala6.setSize(166, 148);
				AnimaBala6.setLocation(650, -90);
				AnimaBala6.setIcon(new ImageIcon("Imagenes/Bala.png"));
				AnimaBala6.setVisible(false);
				panelPresentacion.add(AnimaBala6,0);
				
				//imagen de animacion para la bala
				JLabel AnimaBala7 = new JLabel();
				AnimaBala7.setSize(166, 148);
				AnimaBala7.setLocation(600, -130);
				AnimaBala7.setIcon(new ImageIcon("Imagenes/Bala.png"));
				AnimaBala7.setVisible(false);
				panelPresentacion.add(AnimaBala7,0);
				
				//EVENTO DE Tiempo de espera para animacion de la bala
				 Timer tiempoEsperaBala=new Timer(100,new ActionListener () {
						@Override
						public void actionPerformed(ActionEvent e)
						{
							
							contEspeBal++;
							
							if(contEspeBal==1 ) {
								AnimaBala1.setVisible(true);
								AnimaBala2.setVisible(false);
								AnimaBala3.setVisible(false);	
								AnimaBala4.setVisible(false);
								AnimaBala5.setVisible(false);
								AnimaBala6.setVisible(false);
								AnimaBala7.setVisible(false);
								
							}						
							else if(contEspeBal==2 ) {
								AnimaBala1.setVisible(false);
								AnimaBala2.setVisible(true);
								AnimaBala3.setVisible(false);
								AnimaBala4.setVisible(false);
								AnimaBala5.setVisible(false);
								AnimaBala6.setVisible(false);
								AnimaBala7.setVisible(false);
							}
							else if(contEspeBal==3 ) {
								AnimaBala1.setVisible(false);
								AnimaBala2.setVisible(false);
								AnimaBala3.setVisible(true);
								AnimaBala4.setVisible(false);
								AnimaBala5.setVisible(false);
								AnimaBala6.setVisible(false);
								AnimaBala7.setVisible(false);
							}
							else if(contEspeBal==4 ) {
								AnimaBala1.setVisible(false);
								AnimaBala2.setVisible(false);
								AnimaBala3.setVisible(false);
								AnimaBala4.setVisible(true);
								AnimaBala5.setVisible(false);
								AnimaBala6.setVisible(false);
								AnimaBala7.setVisible(false);
							}
							else if(contEspeBal==5 ) {
								AnimaBala1.setVisible(false);
								AnimaBala2.setVisible(false);
								AnimaBala3.setVisible(false);
								AnimaBala4.setVisible(false);
								AnimaBala5.setVisible(true);
								AnimaBala6.setVisible(false);
								AnimaBala7.setVisible(false);
							}
							else if(contEspeBal==6 ) {
								AnimaBala1.setVisible(false);
								AnimaBala2.setVisible(false);
								AnimaBala3.setVisible(false);
								AnimaBala4.setVisible(false);
								AnimaBala5.setVisible(false);
								AnimaBala6.setVisible(true);
								AnimaBala7.setVisible(false);
								
							}
							else if(contEspeBal==7 ) {
								AnimaBala1.setVisible(false);
								AnimaBala2.setVisible(false);
								AnimaBala3.setVisible(false);
								AnimaBala4.setVisible(false);
								AnimaBala5.setVisible(false);
								AnimaBala6.setVisible(false);
								AnimaBala7.setVisible(true);
								if(contEspeBal == 7)
									contEspeBal=0;
							}
							
						}
						
					});
				 tiempoEsperaBala.start();
				 
				
				//Tiempo de espera para animacion del las monedas
				 Timer tiempoEsperaAnim=new Timer(1000,new ActionListener () {
						@Override
						public void actionPerformed(ActionEvent e)
						{
							contEspeMon++;
							
							if(contEspeMon %2 ==0) {
								Mon.setVisible(true);
							}
							else {
								Mon.setVisible(false);
							}
						}
						
					});
				 tiempoEsperaAnim.start();
				
				//Tiempo de espera para animacion de la estrella 
				 Timer tiempoEsperaEstrella=new Timer(100,new ActionListener () {
						@Override
						public void actionPerformed(ActionEvent e)
						{
							
							contEstrella++;
							
							if(contEstrella==1 || contEstrella==6 ) {
								AnimaEstre1.setVisible(true);
								AnimaEstre2.setVisible(false);
								AnimaEstre3.setVisible(false);	
								
								if(contEstrella == 6)
									contEstrella=0;
							}						
							else if(contEstrella==2 || contEstrella==5) {
								AnimaEstre1.setVisible(false);
								AnimaEstre2.setVisible(true);
								AnimaEstre3.setVisible(false);
							}
							else if(contEstrella==3 || contEstrella==4) {
								AnimaEstre1.setVisible(false);
								AnimaEstre2.setVisible(false);
								AnimaEstre3.setVisible(true);
							}
							
						}
						
					});
				 tiempoEsperaEstrella.start();
				
		        //Boton de "Play" para entrar al menu principal
				BotonMenu.addMouseListener(new MouseAdapter () {
					@Override 
					public void mousePressed(MouseEvent e) {
						
						sonidoPlay.start();
						BotonMenuAnima.setVisible(true);
						
						//Nombre de usuario ventana
						Jugador = JOptionPane.showInputDialog(ventana,"Nombre del jugador","Escribe aqui");
						while(Jugador == null || Jugador.compareTo("Escribe aqui") ==0 || Jugador.compareTo("")==0) {
							Jugador = JOptionPane.showInputDialog(ventana,"Debes ingresar usuario","Escribe aqui");
						}
						
						//cuando le damos clik al boton jugar, desaparece el fondo original
						panelPresentacion.setVisible(false);
						
						//objeto para mandar a llamar al menu principal
						Menu Obj1 = new Menu ();
						Obj1.Menu();
						
						Musica.close();
					}});	
				
				
				ventana.add(panelPresentacion); 
				ventana.setVisible(true);
				
	}

}

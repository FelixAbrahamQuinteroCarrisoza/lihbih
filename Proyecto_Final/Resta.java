package Proyecto_Final;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Resta extends Menu {
	
	JPanel panelResta;
	JLabel fondoResta;
	JLabel nombreJugadorResta;
	Clip sonidores = null;
	
	public void Resta() {
		
		//panel del menu
		panelResta = new JPanel();
		panelResta.setSize(ventana.getWidth(), ventana.getHeight());
		panelResta.setLocation(0, 0);
		panelResta.setLayout(null); 
		panelResta.setVisible(true);
						
						
		//fondo del menu
		fondoResta = new JLabel();
		fondoResta.setSize(ventana.getWidth(), ventana.getHeight());
		fondoResta.setLocation(0, 0);
		fondoResta.setIcon(new ImageIcon("Imagenes/segundoFondo.png"));
		fondoResta.setVisible(true);
		panelResta.add(fondoResta,0);
				
		//nombre de jugador
		nombreJugadorResta = new JLabel();
		nombreJugadorResta.setSize(100, 20);
		nombreJugadorResta.setLocation(20, 80);
		nombreJugadorResta.setForeground(Color.WHITE);
		nombreJugadorResta.setVisible(true);
		panelResta.add(nombreJugadorResta,0);
		
		//imagenVida
		imgVidas = new JLabel();
		imgVidas.setSize(75, 56);
		imgVidas.setLocation(0, 120);
		imgVidas.setIcon(new ImageIcon("Imagenes/vida.png"));
		imgVidas.setVisible(true);
		panelResta.add(imgVidas,0);
		
		//cronometro de jugador
		cronometro = new JLabel();
		cronometro.setSize(80, 20);
		cronometro.setLocation(ventana.getWidth()-105, 65);
		cronometro.setForeground(Color.WHITE);
		cronometro.setVisible(true);
		panelResta.add(cronometro,0);

				
		//imagenVida2
	    imgVidas2 = new JLabel();
		imgVidas2.setSize(75, 56);
		imgVidas2.setLocation(40, 120);
		imgVidas2.setIcon(new ImageIcon("Imagenes/vida.png"));
		imgVidas2.setVisible(true);
		panelResta.add(imgVidas2,0);		
				
		//imagenVida3
	    imgVidas3 = new JLabel();
		imgVidas3.setSize(75, 56);
		imgVidas3.setLocation(80, 120);
		imgVidas3.setIcon(new ImageIcon("Imagenes/vida.png"));
		imgVidas3.setVisible(true);
		panelResta.add(imgVidas3,0);	
		
		RegresarBoton = new JLabel();
		RegresarBoton.setSize(80, 80);
		RegresarBoton.setLocation(30, 420);
		RegresarBoton.setIcon(new ImageIcon("Imagenes/BotonRojo.png"));
		RegresarBoton.setVisible(true);
		panelResta.add(RegresarBoton,0);
		
		//Boton para regresar animacion
		PresRegresarBoton = new JLabel();
		PresRegresarBoton.setSize(481, 519);
		PresRegresarBoton.setLocation(30, 200);
		PresRegresarBoton.setIcon(new ImageIcon("Imagenes/PresBotonRojo.png"));
		PresRegresarBoton.setVisible(false);
		panelResta.add(PresRegresarBoton,0);
		
		//Boton para ver el puntaje
		InformacionBoton = new JLabel();
		InformacionBoton.setSize(80, 80);
		InformacionBoton.setLocation(120, 420);
		InformacionBoton.setIcon(new ImageIcon("Imagenes/PuntosRojo.png"));
		InformacionBoton.setVisible(true);
		panelResta.add(InformacionBoton,0);
						
		//Boton para ver el puntaje animado
		PresInformacionBoton = new JLabel();
		PresInformacionBoton.setSize(80, 80);
		PresInformacionBoton.setLocation(120, 420);
		PresInformacionBoton.setIcon(new ImageIcon("Imagenes/presPuntosRojo.png"));
		PresInformacionBoton.setVisible(false);
		panelResta.add(PresInformacionBoton,0);
		
		//imagen de animacion pirana
		AnimaPira1 = new JLabel();
		AnimaPira1.setSize(68, 67);
		AnimaPira1.setLocation(154, 62);
		AnimaPira1.setIcon(new ImageIcon("Imagenes/piraña png 1.png"));
		AnimaPira1.setVisible(false);
		panelResta.add(AnimaPira1,0);
				
		//imagen de animacion pirana
		AnimaPira2 = new JLabel();
		AnimaPira2.setSize(68, 67);
		AnimaPira2.setLocation(154, 62);
		AnimaPira2.setIcon(new ImageIcon("Imagenes/piraña png 2.png"));
		AnimaPira2.setVisible(false);
		panelResta.add(AnimaPira2,0);
				
		//imagen de animacion pirana
		AnimaPira3 = new JLabel();
		AnimaPira3.setSize(68, 67);
		AnimaPira3.setLocation(154, 62);
		AnimaPira3.setIcon(new ImageIcon("Imagenes/piraña png 3.png"));
		AnimaPira3.setVisible(false);
		panelResta.add(AnimaPira3,0);
				
		//imagen de animacion pirana
		AnimaPira4 = new JLabel();
		AnimaPira4.setSize(68, 67);
		AnimaPira4.setLocation(154, 62);
		AnimaPira4.setIcon(new ImageIcon("Imagenes/piraña png 4.png"));
		AnimaPira4.setVisible(false);
		panelResta.add(AnimaPira4,0);
				
		//imagen de animacion pirana
		AnimaPira5 = new JLabel();
		AnimaPira5.setSize(68, 67);
		AnimaPira5.setLocation(154, 62);
		AnimaPira5.setIcon(new ImageIcon("Imagenes/piraña png 5.png"));
		AnimaPira5.setVisible(false);
		panelResta.add(AnimaPira5,0);
				
				//Tiempo de espera para animacion del cubo 
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
		
		//Boton para ver el puntaje
				InformacionBoton.addMouseListener(new MouseAdapter () {
					@Override 
					public void mousePressed(MouseEvent e) {
						
						PresInformacionBoton.setVisible(true);
						
						//Sonido de los botones
					    try {
					    	SonidoBotonPuntaje = AudioSystem.getClip();
						} catch (LineUnavailableException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					    File a7 = new File("Imagenes\\candy-crush-bomba-color.wav");
					    try {
					    	SonidoBotonPuntaje.open(AudioSystem.getAudioInputStream(a7));
						} catch (LineUnavailableException | IOException
								| UnsupportedAudioFileException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					    SonidoBotonPuntaje.start();//sonido de boton
						
						JOptionPane.showMessageDialog(ventana, "PUNTAJE ACTUAL\n \tCON EL TIEMPO: "+min+":"+seg
						        +"\nVidas totales: "+contvid+"\nErrores totales: "+errores);
						PresInformacionBoton.setVisible(false);      
						
					}});		
		
		RegresarBoton.addMouseListener(new MouseAdapter () {
			@Override 
			public void mousePressed(MouseEvent e) {
				
				PresRegresarBoton.setVisible(true);//boton animacion
				
				//Sonido de los botones
			    try {
			    	SonidoBotonRegresar = AudioSystem.getClip();
				} catch (LineUnavailableException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			    File a7 = new File("Imagenes\\008973539_prev.wav");
			    try {
			    	SonidoBotonRegresar.open(AudioSystem.getAudioInputStream(a7));
				} catch (LineUnavailableException | IOException
						| UnsupportedAudioFileException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			    SonidoBotonRegresar.start();//sonido de boton
				
				//Mensaje para regresar o no
				NumRegre = JOptionPane.showInputDialog(ventana,"SEGURO QUE QUIERES REGRESAR AL MENU PRINCIPAL\n si(1) / no(2)","Escribe aqui");
			while( NumRegre == null || NumRegre.compareTo("Escribe aqui") ==0 || NumRegre.compareTo("")==0) {
				NumRegre = JOptionPane.showInputDialog(ventana,"SEGURO QUE QUIERES REGRESAR AL MENU PRINCIPAL\n si(1) / no(2)","Escribe aqui");
			 }
			salir = Integer.parseInt(NumRegre);
				 
				 if(salir==2) {
					 PresRegresarBoton.setVisible(false);
					 getClass();
				 }
				  if(salir==1) {
				
				
				//Evento para esperar 1 segundo cuando se presniona el boton
				tiempoEsperaBotones=new Timer(1000,new ActionListener () {

					@Override
					public void actionPerformed(ActionEvent e) {
						contespe++;
							 
				System.out.print(contespe);
				
				if(contespe==1) {
					tiempoEsperaBotones.stop();	
				//cuando le damos clik al boton regresar, desaparece el fondo original y vuelve al menu principal
					//cuando le damos clik al boton regresar, desaparece el fondo original y vuelve al menu principal
					panelResta.setVisible(false);
					 Menu Obj1 = new Menu ();
					 Obj1.Menu();
				 sonidores.close();	
				}
				
	           }});
				tiempoEsperaBotones.start();
			   }
					
			}});
		
		//MUSICA PARA EL FONDO DEL JUEGO RESTA
				try {
					sonidores = AudioSystem.getClip();
				} catch (LineUnavailableException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			    File asum = new File("Imagenes\\y2mate.com - Música de Super Mario Galaxy 2 - Galaxia Nieve y Lava.wav");
			    try {
			    	sonidores.open(AudioSystem.getAudioInputStream(asum));
				} catch (LineUnavailableException | IOException
						| UnsupportedAudioFileException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			    //Activar sonido
			    sonidores.start();
			    sonidores.loop(Clip.LOOP_CONTINUOUSLY);
		
		
		
			  //DARLE VALOR A LAS VARIABLES
				//matriz logica --- dar memoria a las matrices
				mat = new int [4][5];
				matAux = new int [4][5];
				aleatorio = new Random();
				//llamar metodo aleatorio
				this.numerosAleatorios();
				
				//matriz de imagenes
						matriz= new JLabel[4][5];
						for(int i=0; i<4; i++) {
							for(int j=0; j<5; j++) {
								matriz[i][j] = new JLabel(); //dar memoria
								matriz[i][j].setBounds(300+(j*100), 20+(i*120), 100, 110);
								matriz[i][j].setIcon(new ImageIcon("Imagenes/"+matAux[i][j]+".png"));
								matriz[i][j].setVisible(true);
								panelResta.add(matriz[i][j],0); 
									}
								}
						
						//tiempo
						min = 0;
						seg = 0;
						
						//EVENTO PARA EL TIEMPO DEL CRONOMETRO
						tiempo=new Timer(1000,new ActionListener () {
						@Override
						public void actionPerformed(ActionEvent e)
						{
						  seg++;
						  if(seg==60) {
						    min++;
							seg=0;
						   }
						cronometro.setText("tiempo: "+min+":"+seg);
						}});
						 
						 //EVENTO PARA EL TEIMPO DE ESPERA PARA VOLTEAR LAS CARTAS 
						 contSegEsp=0;
						 tiempoEspera=new Timer(1000,new ActionListener () {
						 @Override
						 public void actionPerformed(ActionEvent e)
						 {
						 contSegEsp++;
						 }});
						 tiempoEspera.start(); 
						 tiempoEspera.stop();
						 contSegEsp=0;
						 ban=0;
							 
						 contador=0;

                  //evento de clic de las cartas
                  for(int i = 0; i < 4; i++) {
                   for(int j = 0; j < 5;j++) {
                    matriz[i][j].addMouseListener(new MouseAdapter () {
                    @Override
                    public void mousePressed(MouseEvent e) {
                     for(int k = 0; k < 4;k++) {
                      for(int l = 0; l < 5;l++) {
                       if(e.getSource() == matriz[k][l]) {
	
	if( matAux[k][l] == 0 && contador != 2) {
		matAux[k][l] = mat[k][l];
		matriz[k][l].setIcon(new ImageIcon("Imagenes/"+matAux[k][l]+".png"));
		contador++;
		actualnum =  mat[k][l];
		actualx = k;
		actualy = l;
		if(contador == 1) {
		num = mat[k][l];
		antx = k;
		anty = l;
		}
		
		
		tiempoEspera1=new Timer(500,new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
			
			
		
		   
			if(contador==2 && ban1 == 0) {
				tiempoEspera.restart();
				ban1=1;
			}
		if( contador == 2 && contSegEsp == 1 ) {
			tiempoEspera.stop();
			contSegEsp=0;
			
			
			if(matAux[actualx][actualy] != matAux[antx][anty]) {
				
				//SONIDO PARA LOS IMPARES
				Clip sonido4 = null;
				try {
					sonido4 = AudioSystem.getClip();
				} catch (LineUnavailableException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			    File a4 = new File("Imagenes\\SD_NAVIGATE_6.wav");
			    try {
					sonido4.open(AudioSystem.getAudioInputStream(a4));
				} catch (LineUnavailableException | IOException
						| UnsupportedAudioFileException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			    //Activar sonido
				sonido4.start();
				
				do {
				do {
				int numeroResta= (int)(Math.random()*10); 
				int numeroResta2= (int)(Math.random()*10); 
				++vidas;
				++contvid;
			 if(vidas==1) {
					imgVidas.setVisible(false);
					}
					else if(vidas==2)
					imgVidas2.setVisible(false);
					else if(vidas==3) {
					imgVidas3.setVisible(false);
					res=numeroResta-numeroResta2;
					if(res<0)
					res=res*(-1);
					
					n = JOptionPane.showInputDialog(ventana,"Coloca la respuesta de la resta\n"+numeroResta+"-"+numeroResta2+"=","Escribe aqui");
					while( n == null || n.compareTo("Escribe aqui") ==0 || n.compareTo("")==0) {
						n = JOptionPane.showInputDialog(ventana,"Coloca la respuesta de la resta\n"+numeroResta+"-"+numeroResta2+"=","Escribe aqui");
					 }	
					numero1 = Integer.parseInt(n);
					
					if(numero1==res) {
						
						//Sonido cuando es correcta la operacion
					    try {
					    	sonidoCorrec = AudioSystem.getClip();
						} catch (LineUnavailableException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					    File correc = new File("Imagenes\\woo-hoo.wav");
					    try {
					    	sonidoCorrec.open(AudioSystem.getAudioInputStream(correc));
						} catch (LineUnavailableException | IOException
								| UnsupportedAudioFileException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						sonidoCorrec.start();
						
						imgVidas.setVisible(true);
						imgVidas2.setVisible(true);
						imgVidas3.setVisible(true);
						vidas=0;
					   }
					else if(numero1!=res) {
						
						sonidores.close();
						
						//Sonido cuando se equivoca en la operacion
					    try {
					    	sonidoEquivo = AudioSystem.getClip();
						} catch (LineUnavailableException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					    File aSonidoEquivo = new File("Imagenes\\mario-bros-mamma-mia.wav");
					    try {
					    	sonidoEquivo.open(AudioSystem.getAudioInputStream(aSonidoEquivo));
						} catch (LineUnavailableException | IOException
								| UnsupportedAudioFileException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						sonidoEquivo.start();
						
						//Sonido cuando se equivoca en la operacion
					    try {
					    	sonidoEquivo2 = AudioSystem.getClip();
						} catch (LineUnavailableException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					    File GameOver = new File("Imagenes\\Game Over.wav");
					    try {
					    	sonidoEquivo2.open(AudioSystem.getAudioInputStream(GameOver));
						} catch (LineUnavailableException | IOException
								| UnsupportedAudioFileException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						sonidoEquivo2.start();
						
					++errores;
					
					n2 = JOptionPane.showInputDialog(ventana,"GAME OVER\n repetir(1) / salir(2)","Escribe aqui");
					while( n2 == null || n2.compareTo("Escribe aqui") ==0 || n2.compareTo("")==0) {
					n2 = JOptionPane.showInputDialog(ventana,"GAME OVER\n repetir(1) / salir(2)","Escribe aqui");
					}
					 salir = Integer.parseInt(n2);
					  if(salir==1) {
						  
						  try {
								sonidores = AudioSystem.getClip();
							} catch (LineUnavailableException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
						    File ares = new File("Imagenes\\y2mate.com - Música de Super Mario Galaxy 2 - Galaxia Nieve y Lava.wav");
						    try {
						    	sonidores.open(AudioSystem.getAudioInputStream(ares));
							} catch (LineUnavailableException | IOException
									| UnsupportedAudioFileException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
						 //Activar sonido
						    sonidores.start();
						    sonidores.loop(Clip.LOOP_CONTINUOUSLY);
						  
						 imgVidas.setVisible(true);
						 imgVidas2.setVisible(true);
						 imgVidas3.setVisible(true);
						 vidas=0;
					 }
					 else if(salir==2) {
						 sonidores.close();
						 panelResta.setVisible(false);
						 Menu Obj1 = new Menu ();
						 Obj1.Menu();
					 }
				   }

				 }
					 
			   }while(numero1!=res && vidas==0 );
				
			}while(salir==1 && vidas==0 );
		}
			//if para borrar cartas
			if( matAux[actualx][actualy] == matAux[antx][anty]) {
				
				//SONIDO PARA LOS PARES
				Clip sonido3 = null;
				try {
					sonido3 = AudioSystem.getClip();
				} catch (LineUnavailableException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			    File a3 = new File("Imagenes\\animal-crossing-mail.wav");
			    try {
					sonido3.open(AudioSystem.getAudioInputStream(a3));
				} catch (LineUnavailableException | IOException
						| UnsupportedAudioFileException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			    //Activar sonido
				sonido3.start();
				
				matAux[actualx][actualy] = -1;
				matAux[antx][anty]=-1;
				matriz[actualx][actualy].setIcon(new ImageIcon("Imagenes/"+matAux[actualx][actualy]+".png"));
				matriz[antx][anty].setIcon(new ImageIcon("imagenes/"+matAux[antx][anty]+".png"));
			    contador=0;
			    //for para ganar
			    int acum=0;
			    for(int m = 0;m<4;m++ ) {
					for(int n = 0;n < 5;n++) {
						if(matAux[m][n] == -1) 
							acum++;
						
						}
					
					}
			    if(acum == 20) {
			    	sonidores.close();
			    	
			    	//SONIDO PARA LOS PARES
					try {
						sonidoGanar = AudioSystem.getClip();
					} catch (LineUnavailableException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				    File Ganar = new File("Imagenes\\mario_kart_wii_fanfare.wav");
				    try {
				    	sonidoGanar.open(AudioSystem.getAudioInputStream(Ganar));
					} catch (LineUnavailableException | IOException
							| UnsupportedAudioFileException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				    //Activar sonido
				    sonidoGanar.start();
			    	
			    	
			    	tiempo.stop();
			    	JOptionPane.showMessageDialog(ventana, "FELICITACIONES GANASTE\n \tCON EL TIEMPO: "+min+":"+seg
					+"\nVidas totales: "+contvid+"\nErrores totales: "+errores);
			        n2=JOptionPane.showInputDialog("FELICIDADES\n salir(2)");
					 salir = Integer.parseInt(n2);
			         if(salir==2) {
						 panelResta.setVisible(false);
						 Menu Obj1 = new Menu ();
						 Obj1.Menu();
					 }
			         
			    	
			    	
			    }
			    
			}
			
			
			
			for(int m = 0;m<4;m++ ) {
				for(int n = 0;n < 5;n++) {//para que se oculte la carta 
					System.out.print(matAux[m][n]+" ");
					if(matAux[m][n] != 0 && matAux[m][n]!=-1 ) {
						matAux[m][n] = 0;
						matriz[m][n].setIcon(new ImageIcon("imagenes/"+matAux[m][n]+".png"));
						contador = 0;
					}
				}
			}

			tiempoEspera1.stop();
			ban1=0;
			System.out.print("\n"+vidas);
		}
			}});
		if(ban==0) {
			tiempoEspera1.start();
			ban=1;
		}
		if(contador==2 )
		tiempoEspera1.restart();
	  
		
	   }
      }
     }
    }
   }
  }); 
 }
}

        tiempo.start();
		nombreJugadorResta.setText("Jugador: "+Jugador);
		
		ventana.add(panelResta);
		panelResta.setVisible(true);
		
	}



//metodo para numeros aleatorios
		public void numerosAleatorios() {
			
			int acumulador = 0;
			for (int i = 0; i < 4; i++) 
				for(int j = 0; j < 5; j++) { 
					mat[i][j] = 0;
					matAux[i][j]=0;
				}
			
			for (int i = 0; i < 4; i++) {
				for(int j = 0; j < 5; j++) {
					mat[i][j] = aleatorio.nextInt(10)+1;
					do {
						acumulador=0;
					   for (int k = 0; k < 4; k++) {
						   for (int l = 0; l < 5; l++) {
							   if( mat[i][j] == mat[k][l]) {
								   acumulador +=1;
							   }
							 
						   }
					   }
					   
					   if( acumulador == 3) {
						   mat[i][j] = aleatorio.nextInt(10)+1;
					   }
					}while (acumulador == 3 );
				}
			}
			//termina de fors
		/*/
			for (int i = 0; i < 4; i++) {
				for(int j = 0; j < 5; j++) {
					 System.out.print(mat[i][j]+"    ");
				}
				System.out.println("");
			}
		/*/
		}//fin de metodo
	
	
	
	
}

package com.gameframe.code;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import AppPackage.AnimationClass;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class BiologyHome {

	private JFrame frmMysteryWithBiology;
	static Background o;
	public static String s[]=new String[1];

	/**
	 * Launch the application.
	 */
	
	int xMouse,yMouse;
	JLabel bg2,bg1;
	 AnimationClass ac = new AnimationClass();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BiologyHome window = new BiologyHome();
					window.frmMysteryWithBiology.setVisible(true);
					window.frmMysteryWithBiology.setOpacity(.95F);
					s[0]=args[0];
					o=new Background();
					if(args[0].equalsIgnoreCase("1")){
						o.play();
					}
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BiologyHome() {
		initialize();
		startSlideShow();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	  void startSlideShow(){
	        
	        new Thread(){
	            public void run(){
	                
	                try{
	                    int count=0;
	                    while(true){
	                        
	                        
	                        switch(count){
	                            
	                            case 0:
	                                ImageIcon i1=new ImageIcon(getClass().getResource("/com/gameframe/slider/bioslider4.png"));
	                                bg1.setIcon(i1);
	                                
	                                Thread.sleep(1500);
	                                ac.jLabelXLeft(0, -900,1 , 5, bg1);
	                                ac.jLabelXLeft(900, 0, 1, 5, bg2);
	                                count = 1;
	                                break;
	                             case 1:
	                                ImageIcon i2=new ImageIcon(getClass().getResource("/com/gameframe/slider/bioslider2.png"));
	                                bg2.setIcon(i2);
	                                
	                                Thread.sleep(1500);
	                                ac.jLabelXRight(-900, 0,1 , 5, bg1);
	                                ac.jLabelXRight(0, 900, 1, 5, bg2);
	                                count = 2;
	                                break;
	                                
	                             case 2:
	                                ImageIcon i3=new ImageIcon(getClass().getResource("/com/gameframe/slider/bioslider1.png"));
	                                bg1.setIcon(i3);
	                                
	                                 
	                                Thread.sleep(1500);
	                                ac.jLabelXLeft(0, -900,1 , 5, bg1);
	                                ac.jLabelXLeft(900, 0, 1, 5, bg2);
	                                count = 3;
	                                break;
	                            case 3:
	                                ImageIcon i4=new ImageIcon(getClass().getResource("/com/gameframe/slider/bioslider3.png"));
	                                bg2.setIcon(i4);
	                                
	                                
	                                Thread.sleep(1500);
	                                ac.jLabelXRight(-900, 0,1 , 5, bg1);
	                                ac.jLabelXRight(0, 900, 1, 5, bg2);
	                                count = 0;
	                                break;
	                         
	                        }
	                        
	                    }
	                
	                }
	                catch(Exception e){
	                
	                }
	            }
	            
	            
	        }.start();
	    }
	
	private void initialize() {
		frmMysteryWithBiology = new JFrame();
		frmMysteryWithBiology.setIconImage(Toolkit.getDefaultToolkit().getImage(BiologyHome.class.getResource("/com/gameframe/code/icon.jpg")));
		frmMysteryWithBiology.setResizable(false);
		frmMysteryWithBiology.setTitle("Mystery With Biology");
		frmMysteryWithBiology.setBounds(100, 100, 900, 600);
		frmMysteryWithBiology.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMysteryWithBiology.setUndecorated(true);
		frmMysteryWithBiology.setUndecorated(true);
		frmMysteryWithBiology.getContentPane().setLayout(null);
		
		JLabel human = new JLabel("");
		human.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmMysteryWithBiology.dispose();
				try{
					if(o.clip.isRunning()){
						s[0]="1";
						o.stop();
					}
					else
						s[0]="0";
				}
				catch(Exception e1){
					s[0]="0";
				}
				HumanFrame.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				human.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base4.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				human.setIcon(null);
			}
		});
		human.setBounds(0, 303, 439, 297);
		human.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmMysteryWithBiology.getContentPane().add(human);
		
		JLabel plant = new JLabel("");
		plant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmMysteryWithBiology.dispose();
				try{
					if(o.clip.isRunning()){
						s[0]="1";
						o.stop();
					}
					else
						s[0]="0";
				}
				catch(Exception e1){
					s[0]="0";
				}
				PlantFrame.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				plant.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base4.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				plant.setIcon(null);
			}
		});
		plant.setBounds(439, 303, 461, 297);
		plant.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmMysteryWithBiology.getContentPane().add(plant);
		
		JLabel mini = new JLabel("");
		mini.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mini.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmMysteryWithBiology.setState(Frame.ICONIFIED);
			}
		});
		mini.setBounds(784, 0, 56, 34);
		frmMysteryWithBiology.getContentPane().add(mini);
		
		JLabel close = new JLabel("");
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				System.exit(0);
			}
		});
		close.setBounds(844, 0, 56, 34);
		frmMysteryWithBiology.getContentPane().add(close);
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 785, 34);
		frmMysteryWithBiology.getContentPane().add(TitleBar);
		 TitleBar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
	        TitleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
	            public void mouseDragged(java.awt.event.MouseEvent evt) {
	                TitleBarMouseDragged(evt);
	            }
	        });
	        TitleBar.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mousePressed(java.awt.event.MouseEvent evt) {
	                TitleBarMousePressed(evt);
	            }
	        });
		
		JLabel bgfx = new JLabel("");
		bgfx.setIcon(new ImageIcon(BiologyHome.class.getResource("/com/gameframe/mainframe/BioFrame.png")));
		bgfx.setBounds(0, 0, 900, 600);
		frmMysteryWithBiology.getContentPane().add(bgfx);
		
		bg1 = new JLabel("");
		bg1.setIcon(new ImageIcon(BiologyHome.class.getResource("/com/gameframe/slider/bioslider1.png")));
		bg1.setBounds(0, 0, 900, 316);
		frmMysteryWithBiology.getContentPane().add(bg1);
		
		bg2 = new JLabel("");
		bg2.setBounds(900, 0, 900, 316);
		frmMysteryWithBiology.getContentPane().add(bg2);
	}

	
	   private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        int x=evt.getXOnScreen();
	        int y=evt.getYOnScreen();
	        frmMysteryWithBiology.setLocation(x-xMouse, y-yMouse);

	    }                                     

	    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        xMouse=evt.getX();
	        yMouse=evt.getY();

	    }   
}

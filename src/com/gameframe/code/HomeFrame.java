package com.gameframe.code;
import AppPackage.AnimationClass;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;



















import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class HomeFrame {

	private JFrame frmHomemysteryWithChemistry;
	private int xMouse,yMouse;
	static int level=1;
	JLabel bg2,bg1;
	AnimationClass ac = new AnimationClass();
	static Background o;
	public static String s[]=new String[1];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrame window = new HomeFrame();
					window.frmHomemysteryWithChemistry.setVisible(true);
					window.frmHomemysteryWithChemistry.setOpacity(.95F);
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
	public HomeFrame() {
		initialize();
		startSlideShow();
	}
	
	 void startSlideShow(){
	        
	        new Thread(){
	            public void run(){
	                
	                try{
	                    int count=0;
	                    while(true){
	                        
	                        
	                        switch(count){
	                            
	                            case 0:
	                                ImageIcon i1=new ImageIcon(getClass().getResource("/com/gameframe/slider/chemslider1.png"));
	                                bg1.setIcon(i1);
	                                
	                                Thread.sleep(1500);
	                                ac.jLabelXLeft(0, -640,1 , 5, bg1);
	                                ac.jLabelXLeft(640, 0, 1, 5, bg2);
	                                count = 1;
	                                break;
	                             case 1:
	                                ImageIcon i2=new ImageIcon(getClass().getResource("/com/gameframe/slider/chemslider2.png"));
	                                bg2.setIcon(i2);
	                                
	                                Thread.sleep(1500);
	                                ac.jLabelXRight(-640, 0,1 , 5, bg1);
	                                ac.jLabelXRight(0, 640, 1, 5, bg2);
	                                count = 2;
	                                break;
	                                
	                             case 2:
	                                ImageIcon i3=new ImageIcon(getClass().getResource("/com/gameframe/slider/chemslider3.png"));
	                                bg1.setIcon(i3);
	                                
	                                 
	                                Thread.sleep(1500);
	                                ac.jLabelXLeft(0, -640,1 , 5, bg1);
	                                ac.jLabelXLeft(640, 0, 1, 5, bg2);
	                                count = 3;
	                                break;
	                            case 3:
	                                ImageIcon i4=new ImageIcon(getClass().getResource("/com/gameframe/slider/chemslider4.png"));
	                                bg2.setIcon(i4);
	                                
	                                
	                                Thread.sleep(1500);
	                                ac.jLabelXRight(-640, 0,1 , 5, bg1);
	                                ac.jLabelXRight(0, 640, 1, 5, bg2);
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
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHomemysteryWithChemistry = new JFrame();
		frmHomemysteryWithChemistry.setIconImage(Toolkit.getDefaultToolkit().getImage(HomeFrame.class.getResource("/com/gameframe/code/icon.jpg")));
		frmHomemysteryWithChemistry.setTitle("HOME-Mystery With Chemistry");
		frmHomemysteryWithChemistry.setResizable(false);
		frmHomemysteryWithChemistry.setBounds(100, 100, 640, 360);
		frmHomemysteryWithChemistry.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHomemysteryWithChemistry.setUndecorated(true);
		frmHomemysteryWithChemistry.getContentPane().setLayout(null);
		
		JLabel lblFixedHome = new JLabel("");
		JLabel lblMinimize = new JLabel("");
		lblMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmHomemysteryWithChemistry.setState(Frame.ICONIFIED);
			}
		});
		lblMinimize.setToolTipText("Minimize");
		lblMinimize.setBounds(572, 0, 32, 24);
		lblMinimize.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmHomemysteryWithChemistry.getContentPane().add(lblMinimize);
		
		JLabel lblExit = new JLabel("");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				System.exit(0);
			}
		});
		lblExit.setBounds(608, 0, 32, 24);
		lblExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmHomemysteryWithChemistry.getContentPane().add(lblExit);
		
		JLabel lblClose = new JLabel("");
		lblClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmHomemysteryWithChemistry.dispose();
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
				SelectionFrame.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblClose.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base3.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblClose.setIcon(null);
			}
		});
		lblClose.setBounds(461, 254, 82, 29);
		frmHomemysteryWithChemistry.getContentPane().add(lblClose);
		
		JLabel lblPlay = new JLabel("");
		lblPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmHomemysteryWithChemistry.dispose();
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
				GamePlayFrame.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPlay.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base3.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblPlay.setIcon(null);
			}
		});
		lblPlay.setBounds(461, 197, 92, 29);
		lblPlay.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmHomemysteryWithChemistry.getContentPane().add(lblPlay);
		
		JLabel lblLevel = new JLabel("");
		lblLevel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmHomemysteryWithChemistry.dispose();
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
				LevelFrame.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLevel.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base3.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblLevel.setIcon(null);
			}
		});
		lblLevel.setBounds(459, 145, 94, 29);
		frmHomemysteryWithChemistry.getContentPane().add(lblLevel);
		lblLevel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 572, 24);
		frmHomemysteryWithChemistry.getContentPane().add(TitleBar);
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
		lblFixedHome.setIcon(new ImageIcon(HomeFrame.class.getResource("/com/gameframe/mainframe/ChemFrame.png")));
		lblFixedHome.setBounds(0, 0, 640, 360);
		frmHomemysteryWithChemistry.getContentPane().add(lblFixedHome);
		
		bg1 = new JLabel("");
		bg1.setIcon(new ImageIcon(HomeFrame.class.getResource("/com/gameframe/slider/chemslider2.png")));
		bg1.setBounds(0, 0, 640, 360);
		frmHomemysteryWithChemistry.getContentPane().add(bg1);
		
		bg2 = new JLabel("");
		bg2.setIcon(new ImageIcon(HomeFrame.class.getResource("/com/gameframe/slider/chemslider1.png")));
		bg2.setBounds(640, 0, 640, 360);
		frmHomemysteryWithChemistry.getContentPane().add(bg2);
	}
    private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        frmHomemysteryWithChemistry.setLocation(x-xMouse, y-yMouse);

    }                                     

    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();

    }    
}

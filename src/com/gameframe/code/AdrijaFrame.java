package com.gameframe.code;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;


public class AdrijaFrame {

	private JFrame frmAdrijaDasmahapatra;

	static Background o;
	public static String s[]=new String[1];
	/**
	 * Launch the application.
	 */
	private int xMouse,yMouse;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdrijaFrame window = new AdrijaFrame();
					window.frmAdrijaDasmahapatra.setVisible(true);
					window.frmAdrijaDasmahapatra.setOpacity(.95F);
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
	public AdrijaFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdrijaDasmahapatra = new JFrame();
		frmAdrijaDasmahapatra.setIconImage(Toolkit.getDefaultToolkit().getImage(AdrijaFrame.class.getResource("/com/gameframe/code/icon.jpg")));
		frmAdrijaDasmahapatra.setTitle("Adrija Dasmahapatra");
		frmAdrijaDasmahapatra.setBounds(100, 100, 900, 600);
		frmAdrijaDasmahapatra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdrijaDasmahapatra.setUndecorated(true);
		frmAdrijaDasmahapatra.getContentPane().setLayout(null);
		
		JLabel back = new JLabel("");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmAdrijaDasmahapatra.dispose();
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
				DeveloperSelectFrame.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Sound.main(null, Sound.SELECT);
			}
		});
		back.setBounds(21, 11, 119, 52);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmAdrijaDasmahapatra.getContentPane().add(back);
		
		JLabel min = new JLabel("");
		min.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmAdrijaDasmahapatra.setState(Frame.ICONIFIED);
			}
		});
		min.setBounds(821, 0, 40, 41);
		min.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmAdrijaDasmahapatra.getContentPane().add(min);
		
		JLabel close = new JLabel("");
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				Sound.main(null,Sound.CLICK);
				frmAdrijaDasmahapatra.dispose();
				System.exit(0);
			}
		});
		close.setBounds(860, 0, 40, 40);
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmAdrijaDasmahapatra.getContentPane().add(close);
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 822, 41);
		frmAdrijaDasmahapatra.getContentPane().add(TitleBar);
		TitleBar.setCursor(new Cursor(Cursor.MOVE_CURSOR));
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
		
		JLabel fb = new JLabel("");
		fb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				Browser.main(null, "https://www.facebook.com/adrija.dasmahapatra");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				fb.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base5.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				fb.setIcon(null);
			}
		});
		fb.setCursor(new Cursor(Cursor.HAND_CURSOR));
		fb.setBounds(419, 475, 66, 80);
		frmAdrijaDasmahapatra.getContentPane().add(fb);
		
		JLabel gp = new JLabel("");
		gp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				Browser.main(null, "https://plus.google.com/u/0/106918366338582992452/posts");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				gp.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base5.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				gp.setIcon(null);
			}
		});
		gp.setBounds(550, 475, 66, 80);
		gp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmAdrijaDasmahapatra.getContentPane().add(gp);
		
		JLabel in = new JLabel("");
		in.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				Browser.main(null, "https://www.linkedin.com/in/adrija-dasmahapatra-912b7a116");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				in.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base5.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				in.setIcon(null);
			}
		});
		in.setBounds(672, 475, 74, 80);
		in.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmAdrijaDasmahapatra.getContentPane().add(in);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(AdrijaFrame.class.getResource("/com/gameframe/developer/AdrijaFrame.png")));
		bg.setBounds(0, 0, 900, 600);
		frmAdrijaDasmahapatra.getContentPane().add(bg);
	}

	   private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        int x=evt.getXOnScreen();
	        int y=evt.getYOnScreen();
	        frmAdrijaDasmahapatra.setLocation(x-xMouse, y-yMouse);

	    }                                     

	    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        xMouse=evt.getX();
	        yMouse=evt.getY();

	    }  
}

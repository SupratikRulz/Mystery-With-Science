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

public class InstructionsFrame {

	private JFrame frmInstructions;

	/**
	 * Launch the application.
	 */
	int xMouse,yMouse;
	static Background o;
	public static String s[]=new String[1];
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InstructionsFrame window = new InstructionsFrame();
					window.frmInstructions.setVisible(true);
					window.frmInstructions.setOpacity(.95F);
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
	public InstructionsFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInstructions = new JFrame();
		frmInstructions.setIconImage(Toolkit.getDefaultToolkit().getImage(InstructionsFrame.class.getResource("/com/gameframe/code/icon.jpg")));
		frmInstructions.setTitle("Instructions");
		frmInstructions.setBounds(100, 100, 900, 600);
		frmInstructions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInstructions.setUndecorated(true);
		frmInstructions.getContentPane().setLayout(null);
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 783, 33);
		frmInstructions.getContentPane().add(TitleBar);
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
		
		
		JLabel min = new JLabel("");
		min.setCursor(new Cursor(Cursor.HAND_CURSOR));
		min.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmInstructions.setState(Frame.ICONIFIED);
			}
		});
		min.setBounds(784, 0, 58, 35);
		frmInstructions.getContentPane().add(min);
		
		JLabel close = new JLabel("");
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmInstructions.dispose();
				System.exit(0);
			}
		});
		close.setBounds(844, 0, 56, 33);
		frmInstructions.getContentPane().add(close);
		
		JLabel back = new JLabel("");
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmInstructions.dispose();
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
				StartingFrame.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Sound.main(null, Sound.SELECT);
			}
		});
		back.setBounds(27, 19, 95, 43);
		frmInstructions.getContentPane().add(back);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(InstructionsFrame.class.getResource("/com/gameframe/mainframe/Instructions.png")));
		bg.setBounds(0, 0, 900, 600);
		frmInstructions.getContentPane().add(bg);
	}
	   private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        int x=evt.getXOnScreen();
	        int y=evt.getYOnScreen();
	        frmInstructions.setLocation(x-xMouse, y-yMouse);

	    }                                     

	    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        xMouse=evt.getX();
	        yMouse=evt.getY();

	    }  
}

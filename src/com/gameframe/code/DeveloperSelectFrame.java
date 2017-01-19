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

public class DeveloperSelectFrame {

	private JFrame frmDevelopers;
	static Background o;
	public static String s[]=new String[1];

	/**
	 * Launch the application.
	 */
	
	int xMouse,yMouse;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeveloperSelectFrame window = new DeveloperSelectFrame();
					window.frmDevelopers.setVisible(true);
					window.frmDevelopers.setOpacity(.95F);
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
	public DeveloperSelectFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDevelopers = new JFrame();
		frmDevelopers.setIconImage(Toolkit.getDefaultToolkit().getImage(DeveloperSelectFrame.class.getResource("/com/gameframe/code/icon.jpg")));
		frmDevelopers.setTitle("Developers");
		frmDevelopers.setResizable(false);
		frmDevelopers.setBounds(100, 100, 900, 600);
		frmDevelopers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDevelopers.setUndecorated(true);
		frmDevelopers.getContentPane().setLayout(null);
		
		JLabel sb = new JLabel("");
		sb.setCursor(new Cursor(Cursor.HAND_CURSOR));
		sb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmDevelopers.dispose();
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
				SupratikFrame.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Sound.main(null, Sound.SELECT);
			}
		});
		sb.setBounds(112, 191, 266, 333);
		frmDevelopers.getContentPane().add(sb);
		
		JLabel adm = new JLabel("");
		adm.setCursor(new Cursor(Cursor.HAND_CURSOR));
		adm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmDevelopers.dispose();
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
				AdrijaFrame.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Sound.main(null, Sound.SELECT);
			}
		});
		adm.setBounds(512, 191, 266, 319);
		frmDevelopers.getContentPane().add(adm);
		
		JLabel back = new JLabel("");
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmDevelopers.dispose();
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
				Sound.main(null, Sound.SELECT);
			}
		});
		back.setBounds(40, 67, 102, 50);
		frmDevelopers.getContentPane().add(back);
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 821, 34);
		frmDevelopers.getContentPane().add(TitleBar);
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
		
		JLabel min = new JLabel("");
		min.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmDevelopers.setState(Frame.ICONIFIED);
			}
		});
		min.setBounds(819, 0, 41, 40);
		min.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmDevelopers.getContentPane().add(min);
		
		JLabel exit = new JLabel("");
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				System.exit(0);
			}
		});
		exit.setBounds(859, 0, 41, 40);
		frmDevelopers.getContentPane().add(exit);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(DeveloperSelectFrame.class.getResource("/com/gameframe/developer/DeveloperSelectFrame.png")));
		bg.setBounds(0, 0, 900, 600);
		frmDevelopers.getContentPane().add(bg);
	}
	

	   private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        int x=evt.getXOnScreen();
	        int y=evt.getYOnScreen();
	        frmDevelopers.setLocation(x-xMouse, y-yMouse);

	    }                                     

	    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        xMouse=evt.getX();
	        yMouse=evt.getY();

	    }    
}

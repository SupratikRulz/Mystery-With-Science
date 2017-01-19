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

public class SelectionFrame {

	private JFrame frmSelectGame;
	int xMouse,yMouse;
	static Background o;
	public static String s[]=new String[1];
	public int status;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectionFrame window = new SelectionFrame();
					window.frmSelectGame.setVisible(true);
					window.frmSelectGame.setOpacity(.95F);
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
	public SelectionFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSelectGame = new JFrame();
		frmSelectGame.setIconImage(Toolkit.getDefaultToolkit().getImage(SelectionFrame.class.getResource("/com/gameframe/code/icon.jpg")));
		//frmSelectGame.setOpacity(0.95F);
		frmSelectGame.setTitle("Select Game");
		frmSelectGame.setResizable(false);
		frmSelectGame.setBounds(100, 100, 900, 600);
		frmSelectGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSelectGame.setUndecorated(true);
		frmSelectGame.getContentPane().setLayout(null);
		
		JLabel chem = new JLabel("");
		chem.setCursor(new Cursor(Cursor.HAND_CURSOR));
		chem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmSelectGame.dispose();
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
				HomeFrame.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				chem.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base2.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chem.setIcon(null);
			}
		});
		chem.setBounds(10, 328, 286, 185);
		frmSelectGame.getContentPane().add(chem);
		
		JLabel bio = new JLabel("");
		bio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmSelectGame.dispose();
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
				BiologyHome.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				bio.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base2.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				bio.setIcon(null);
			}
		});
		bio.setBounds(306, 328, 281, 185);
		frmSelectGame.getContentPane().add(bio);
		bio.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JLabel phy = new JLabel("");
		phy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmSelectGame.dispose();
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
				PhysicsHome.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				phy.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base2.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				phy.setIcon(null);
				
			}
		});
		phy.setBounds(597, 328, 293, 185);
		frmSelectGame.getContentPane().add(phy);
		phy.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JLabel knowdev = new JLabel("");
		knowdev.setCursor(new Cursor(Cursor.HAND_CURSOR));
		knowdev.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmSelectGame.dispose();
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
		knowdev.setBounds(266, 529, 380, 60);
		frmSelectGame.getContentPane().add(knowdev);
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 783, 35);
		frmSelectGame.getContentPane().add(TitleBar);
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
        
        JLabel lblMinimize = new JLabel("");
		lblMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmSelectGame.setState(Frame.ICONIFIED);
			}
		});
		lblMinimize.setToolTipText("Minimize");
		lblMinimize.setBounds(784, 0, 57, 35);
		lblMinimize.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmSelectGame.getContentPane().add(lblMinimize);
		
		JLabel lblExit = new JLabel("");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				System.exit(0);
			}
		});
		lblExit.setBounds(843, 0, 56, 35);
		lblExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmSelectGame.getContentPane().add(lblExit);
		
		JLabel back = new JLabel("");
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmSelectGame.dispose();
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
		back.setBounds(32, 42, 88, 35);
		frmSelectGame.getContentPane().add(back);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(SelectionFrame.class.getResource("/com/gameframe/mainframe/SelectionFrame.png")));
		bg.setBounds(0, 0, 900, 600);
		frmSelectGame.getContentPane().add(bg);
	}
	 private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        int x=evt.getXOnScreen();
	        int y=evt.getYOnScreen();
	        frmSelectGame.setLocation(x-xMouse, y-yMouse);

	    }                                     

	    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        xMouse=evt.getX();
	        yMouse=evt.getY();

	    }  

}

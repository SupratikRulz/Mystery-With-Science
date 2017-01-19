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



public class SupratikFrame {

	private JFrame frmSupratikBasu;
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
					SupratikFrame window = new SupratikFrame();
					window.frmSupratikBasu.setVisible(true);
					window.frmSupratikBasu.setOpacity(.95F);
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
	public SupratikFrame() {
		initialize();		
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSupratikBasu = new JFrame();
		frmSupratikBasu.setIconImage(Toolkit.getDefaultToolkit().getImage(SupratikFrame.class.getResource("/com/gameframe/code/icon.jpg")));
		frmSupratikBasu.setTitle("Supratik Basu");
		frmSupratikBasu.setBounds(100, 100, 900, 600);
		frmSupratikBasu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSupratikBasu.setUndecorated(true);
		frmSupratikBasu.getContentPane().setLayout(null);
		
		JLabel back = new JLabel("");
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmSupratikBasu.dispose();
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
		back.setBounds(31, 26, 121, 46);
		frmSupratikBasu.getContentPane().add(back);
		
		JLabel min = new JLabel("");
		min.setCursor(new Cursor(Cursor.HAND_CURSOR));
		min.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmSupratikBasu.setState(Frame.ICONIFIED);
			}
		});
		min.setBounds(820, 0, 41, 40);
		frmSupratikBasu.getContentPane().add(min);
		
		JLabel close = new JLabel("");
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmSupratikBasu.dispose();
				System.exit(0);
			}
		});
		close.setBounds(859, 0, 41, 40);
		frmSupratikBasu.getContentPane().add(close);
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setCursor(new Cursor(Cursor.MOVE_CURSOR));
		TitleBar.setBounds(0, 0, 822, 40);
		frmSupratikBasu.getContentPane().add(TitleBar);
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
	
		
		
			
	
		fb.setCursor(new Cursor(Cursor.HAND_CURSOR));
		fb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				Sound.main(null,Sound.CLICK);
				 Browser.main(null, "http://www.facebook.com/supratik.rulz");
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
		fb.setBounds(339, 416, 71, 80);
		frmSupratikBasu.getContentPane().add(fb);
		
		JLabel youtube = new JLabel("");
		youtube.setCursor(new Cursor(Cursor.HAND_CURSOR));
		youtube.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				Browser.main(null, "https://www.youtube.com/channel/UCD_VZUJZcBLHpSUGUSyShLA/videos");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				youtube.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base5.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				youtube.setIcon(null);
			}
		});
		youtube.setBounds(458, 416, 78, 80);
		frmSupratikBasu.getContentPane().add(youtube);
		
		JLabel gp = new JLabel("");
		gp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		gp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				 Browser.main(null, "https://plus.google.com/u/0/+SupratikBasuRulz/posts");
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
		gp.setBounds(583, 416, 64, 80);
		frmSupratikBasu.getContentPane().add(gp);
		
		JLabel in = new JLabel("");
		in.setCursor(new Cursor(Cursor.HAND_CURSOR));
		in.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				Browser.main(null, "https://www.linkedin.com/in/supratik-rulz-5ab4538b");
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
		in.setBounds(682, 416, 71, 80);
		frmSupratikBasu.getContentPane().add(in);
		
		JLabel gogmailer = new JLabel("");
		gogmailer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				Browser.main(null, "https://www.facebook.com/gmailers");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				gogmailer.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/base5.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				gogmailer.setIcon(null);
			}
		});
		gogmailer.setBounds(786, 416, 78, 80);
		gogmailer.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmSupratikBasu.getContentPane().add(gogmailer);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(SupratikFrame.class.getResource("/com/gameframe/developer/SupratikFrame.png")));
		bg.setBounds(0, 0, 900, 600);
		frmSupratikBasu.getContentPane().add(bg);
	}

	   private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        int x=evt.getXOnScreen();
	        int y=evt.getYOnScreen();
	        frmSupratikBasu.setLocation(x-xMouse, y-yMouse);

	    }                                     

	    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        xMouse=evt.getX();
	        yMouse=evt.getY();

	    }   
}

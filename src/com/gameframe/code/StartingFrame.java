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

public class StartingFrame {

	private JFrame frmMysteryWithScience;
	private int xMouse,yMouse;
	static Background o;
	public String s[]=new String[1];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartingFrame window = new StartingFrame();
					window.frmMysteryWithScience.setVisible(true);
					window.frmMysteryWithScience.setOpacity(.95F);
					if(args.length==0 || args[0].equalsIgnoreCase("1")){
						o = new Background();
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
	public StartingFrame() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMysteryWithScience = new JFrame();
		frmMysteryWithScience.setIconImage(Toolkit.getDefaultToolkit().getImage(StartingFrame.class.getResource("/com/gameframe/code/icon.jpg")));
		frmMysteryWithScience.setTitle("Mystery With Science");
		frmMysteryWithScience.setBounds(100, 100, 900, 600);
		frmMysteryWithScience.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMysteryWithScience.setUndecorated(true);
		frmMysteryWithScience.getContentPane().setLayout(null);
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 785, 42);
		frmMysteryWithScience.getContentPane().add(TitleBar);
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
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmMysteryWithScience.setState(Frame.ICONIFIED);
			}
		});
		min.setCursor(new Cursor(Cursor.HAND_CURSOR));
		min.setToolTipText("Minimize");
		min.setBounds(787, 0, 55, 41);
		frmMysteryWithScience.getContentPane().add(min);
		
		JLabel exit = new JLabel("");
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				Sound.main(null,Sound.CLICK);
				frmMysteryWithScience.dispose();
				System.exit(0);
			}
		});
		exit.setToolTipText("Exit");
		exit.setBounds(844, 0, 55, 40);
		frmMysteryWithScience.getContentPane().add(exit);
		
		JLabel play = new JLabel("");
		play.setCursor(new Cursor(Cursor.HAND_CURSOR));
		play.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmMysteryWithScience.dispose();
				if(o.clip.isRunning())
					s[0]="1";
				else
					s[0]="0";
				o.stop();
				
				SelectionFrame.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Sound.main(null, Sound.SELECT);
				play.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/Base.png")));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				play.setIcon(null);
			}
		});
		play.setBounds(515, 193, 105, 50);
		play.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmMysteryWithScience.getContentPane().add(play);
		
		JLabel instructions = new JLabel("");
		instructions.setCursor(new Cursor(Cursor.HAND_CURSOR));
		instructions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmMysteryWithScience.dispose();
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
				
				InstructionsFrame.main(s);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				instructions.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/Base.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				instructions.setIcon(null);
			}
		});
		instructions.setBounds(431, 260, 268, 50);
		instructions.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmMysteryWithScience.getContentPane().add(instructions);
		
		JLabel knwdev = new JLabel("");
		knwdev.setCursor(new Cursor(Cursor.HAND_CURSOR));
		knwdev.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmMysteryWithScience.dispose();
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
				knwdev.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/Base.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				knwdev.setIcon(null);
			}
		});
		knwdev.setBounds(296, 374, 425, 69);
		frmMysteryWithScience.getContentPane().add(knwdev);
		knwdev.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel music = new JLabel("");
		music.setCursor(new Cursor(Cursor.HAND_CURSOR));
		music.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(o.clip.isRunning())
					o.stop();
				else
					o.play();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				music.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/Base.png")));
				Sound.main(null, Sound.SELECT);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				music.setIcon(null);
			}
		});
		music.setBounds(752, 366, 67, 75);
		music.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmMysteryWithScience.getContentPane().add(music);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(StartingFrame.class.getResource("/com/gameframe/mainframe/MainMenu.png")));
		bg.setBounds(0, 0, 900, 600);
		frmMysteryWithScience.getContentPane().add(bg);
	}
	  private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        int x=evt.getXOnScreen();
	        int y=evt.getYOnScreen();
	        frmMysteryWithScience.setLocation(x-xMouse, y-yMouse);

	    }                                     

	    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        xMouse=evt.getX();
	        yMouse=evt.getY();

	    }    

}

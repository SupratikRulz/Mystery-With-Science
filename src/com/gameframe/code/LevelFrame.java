package com.gameframe.code;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class LevelFrame {

	private JFrame frmSelectLevel;
	private int xMouse,yMouse;
	static Background o;
	public static String s[]=new String[1];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LevelFrame window = new LevelFrame();
					window.frmSelectLevel.setVisible(true);
					window.frmSelectLevel.setOpacity(.95F);
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
	public LevelFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSelectLevel = new JFrame();
		frmSelectLevel.setIconImage(Toolkit.getDefaultToolkit().getImage(LevelFrame.class.getResource("/com/gameframe/code/icon.jpg")));
		frmSelectLevel.setTitle("Select Level");
		frmSelectLevel.setBounds(100, 100, 600, 300);
		frmSelectLevel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSelectLevel.setUndecorated(true);
		frmSelectLevel.getContentPane().setLayout(null);
		
		JLabel lblBeginner = new JLabel("");
		lblBeginner.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				HomeFrame.level=1;
				frmSelectLevel.dispose();
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
				Sound.main(null, Sound.SELECT);
			}
		});
		lblBeginner.setBounds(222, 150, 157, 31);
		frmSelectLevel.getContentPane().add(lblBeginner);
		lblBeginner.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblInter = new JLabel("");
		lblInter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				HomeFrame.level=2;
				frmSelectLevel.dispose();
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
				Sound.main(null, Sound.SELECT);
			}
		});
		lblInter.setBounds(183, 192, 224, 31);
		frmSelectLevel.getContentPane().add(lblInter);
		lblInter.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblExpert = new JLabel("");
		lblExpert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				HomeFrame.level=3;
				frmSelectLevel.dispose();
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
				Sound.main(null, Sound.SELECT);
			}
		});
		lblExpert.setBounds(233, 234, 129, 31);
		frmSelectLevel.getContentPane().add(lblExpert);
		lblExpert.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblMinimize = new JLabel("");
		lblMinimize.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmSelectLevel.setState(Frame.ICONIFIED);
			}
		});
		lblMinimize.setBounds(528, 0, 33, 27);
		frmSelectLevel.getContentPane().add(lblMinimize);
		
		JLabel lblClose = new JLabel("");
		lblClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				System.exit(0);
			}
		});
		lblClose.setBounds(567, 0, 33, 25);
		frmSelectLevel.getContentPane().add(lblClose);
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 528, 24);
		frmSelectLevel.getContentPane().add(TitleBar);
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
		
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(LevelFrame.class.getResource("/com/gameframe/mainframe/SelectLevel.png")));
		bg.setBounds(0, 0, 600, 300);
		frmSelectLevel.getContentPane().add(bg);
	}
	 private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        int x=evt.getXOnScreen();
	        int y=evt.getYOnScreen();
	        frmSelectLevel.setLocation(x-xMouse, y-yMouse);

	    }                                     

	    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        xMouse=evt.getX();
	        yMouse=evt.getY();

	    }    

}

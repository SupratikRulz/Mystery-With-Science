package com.gameframe.code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import com.gameframe.elementmodel.ElementInfo;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;


public class ScorecardFrame {

	private JFrame frmScoreCard;

	/**
	 * Launch the application.
	 */
	public ElementInfo element[] = new ElementInfo[22]; 
	static Background o;
	public static String s[]=new String[1];
	int xMouse,yMouse;
	
	public static void main(String[] args,int sc) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScorecardFrame window = new ScorecardFrame(sc);
					window.frmScoreCard.setVisible(true);
					window.frmScoreCard.setOpacity(.95F);
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
	public ScorecardFrame(int sc) {
		initialize(sc);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int sc) {
		frmScoreCard = new JFrame();
		frmScoreCard.setIconImage(Toolkit.getDefaultToolkit().getImage(ScorecardFrame.class.getResource("/com/gameframe/code/icon.jpg")));
		frmScoreCard.setTitle("Score Card");
		frmScoreCard.setBounds(100, 100, 900, 600);
		frmScoreCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScoreCard.setUndecorated(true);
		frmScoreCard.getContentPane().setLayout(null);
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 784, 33);
		frmScoreCard.getContentPane().add(TitleBar);
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
		min.setCursor(new Cursor(Cursor.HAND_CURSOR));
		min.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmScoreCard.setState(Frame.ICONIFIED);
			}
		});
		min.setBounds(785, 0, 57, 33);
		frmScoreCard.getContentPane().add(min);
		
		JLabel close = new JLabel("");
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmScoreCard.dispose();
				System.exit(0);
			}
		});
		close.setBounds(843, 0, 57, 33);
		frmScoreCard.getContentPane().add(close);
		
		JLabel score = new JLabel("");
		score.setForeground(new Color(255, 99, 71));
		score.setFont(new Font("Tahoma", Font.BOLD, 40));
		score.setText(String.valueOf(sc));
		score.setBounds(742, 394, 81, 42);
		frmScoreCard.getContentPane().add(score);
		
		JLabel back = new JLabel("");
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmScoreCard.dispose();
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
		back.setBounds(420, 520, 134, 49);
		frmScoreCard.getContentPane().add(back);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(ScorecardFrame.class.getResource("/com/gameframe/mainframe/ScoreCard.png")));
		bg.setBounds(0, 0, 900, 600);
		frmScoreCard.getContentPane().add(bg);
	}
	
	private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        frmScoreCard.setLocation(x-xMouse, y-yMouse);

    }                                     

    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();

    }  
	
}

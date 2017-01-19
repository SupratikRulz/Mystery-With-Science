package com.gameframe.code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.gameframe.elementmodel.OrganInfo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JEditorPane;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;

public class HumanFrame {

	private JFrame frmHumanOrgan;
	static Background o;
	public static String s[]=new String[1];

	/**
	 * Launch the application.
	 */
	//OrganInfo org[]=new OrganInfo[10];
	int hit,score,i;
	int xMouse,yMouse;
	ArrayList<OrganInfo> list = new ArrayList<OrganInfo>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanFrame window = new HumanFrame();
					window.frmHumanOrgan.setVisible(true);
					window.frmHumanOrgan.setOpacity(.95F);
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
	public HumanFrame() {
		initOrgans();
		initialize();
	}

	private void initOrgans() {
		// TODO Auto-generated method stub
		i=0;
		hit=10;
		score=0;
		/*
		org[0]=new OrganInfo("brain","This organ is the master of all \n the actions and the organs of a human body."+"\nIt is located usually close to the \n primary sensory organs for such senses as\n vision, hearing, balance, taste, and smell.");
		org[1]=new OrganInfo("skin", "It performs its excretory function \n via the sweat glandnull,\n and protects our body from the harsh environments.");
		org[2]=new OrganInfo("heart"," Important organ of the human body \n without which human survival is \n next to impossible.\n It acts like pump \n circulating blood in the body.\n Blood containing carbon dioxide is provided to \n lungs for the exchange of gases where \n as blood containing oxygen is supplied \n to the human body through veins. \n It weighs 250 – 350 grams and is about the size of a fist.");
		org[3]=new OrganInfo("windpipe", " Helps in breathing.");
		org[4]=new OrganInfo("lungs", "Being the most important organ \n related to respiratory system,\n these  are located on the either sides of the heart. \n They are like air bags. Breathing in, \n expands them and breathing out contracts them. ");
		org[5]=new OrganInfo("bladder","It is the organ that collects \n waste excreted by the kidneys prior \n to disposal by urination. \n It is a hollow muscular, and \n distensible (or elastic) organ, and sits \n on the pelvic floor. \n Urine enters here via the ureters \n and exits via the urethra.");
		org[6]=new OrganInfo("liver", "It is a vital organ and existence \n of a human without it is next to  impossible. \n Thought technology has created some \n short term substitutes of it, but for \n long term, research is still in process. ");
		org[7]=new OrganInfo("sintestine","Helps in primary digestion of food");
		org[8]=new OrganInfo("stomach", "Playing an important role in the \n digestive system, this organ lies between food pipe \n and the small intestine. \n It releases enzymenull, acids and gastric \n juices which help in digestion by breaking \n food into smaller segments and converting \n them into breakable and adaptable \n organic substances.");
		org[9]=new OrganInfo("lintestine", "Here the last stage of digestion occurs");
	
	*/
		list.add(new OrganInfo("brain","This organ is the master of all \n the actions and the organs of a human body."+"\nIt is located usually close to the \n primary sensory organs for such senses as\n vision, hearing, balance, taste, and smell."));
		list.add(new OrganInfo("skin", "It performs its excretory function \n via the sweat glandnull,\n and protects our body from the harsh environments."));
		list.add(new OrganInfo("heart"," Important organ of the human body \n without which human survival is \n next to impossible.\n It acts like pump \n circulating blood in the body.\n Blood containing carbon dioxide is provided to \n lungs for the exchange of gases where \n as blood containing oxygen is supplied \n to the human body through veins. \n It weighs 250 – 350 grams and is about the size of a fist."));
		list.add(new OrganInfo("windpipe", " Helps in breathing."));
		list.add(new OrganInfo("lungs", "Being the most important organ \n related to respiratory system,\n these  are located on the either sides of the heart. \n They are like air bags. Breathing in, \n expands them and breathing out contracts them. "));
		list.add(new OrganInfo("bladder","It is the organ that collects \n waste excreted by the kidneys prior \n to disposal by urination. \n It is a hollow muscular, and \n distensible (or elastic) organ, and sits \n on the pelvic floor. \n Urine enters here via the ureters \n and exits via the urethra."));
		list.add(new OrganInfo("liver", "It is a vital organ and existence \n of a human without it is next to  impossible. \n Thought technology has created some \n short term substitutes of it, but for \n long term, research is still in process. "));
		list.add(new OrganInfo("sintestine","Helps in primary digestion of food"));
		list.add(new OrganInfo("stomach", "Playing an important role in the \n digestive system, this organ lies between food pipe \n and the small intestine. \n It releases enzymenull, acids and gastric \n juices which help in digestion by breaking \n food into smaller segments and converting \n them into breakable and adaptable \n organic substances."));
		list.add(new OrganInfo("lintestine", "Here the last stage of digestion occurs"));
		
		Collections.shuffle(list);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHumanOrgan = new JFrame();
		frmHumanOrgan.setIconImage(Toolkit.getDefaultToolkit().getImage(HumanFrame.class.getResource("/com/gameframe/code/icon.jpg")));
		frmHumanOrgan.setTitle("Human Organ");
		frmHumanOrgan.setResizable(false);
		frmHumanOrgan.setBounds(100, 100, 700, 600);
		frmHumanOrgan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHumanOrgan.setUndecorated(true);
		frmHumanOrgan.getContentPane().setLayout(null);
		
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 622, 23);
		frmHumanOrgan.getContentPane().add(TitleBar);
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
		
			
			JLabel back = new JLabel("");
			back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			back.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Sound.main(null,Sound.CLICK);
					frmHumanOrgan.dispose();
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
			back.setBounds(21, 11, 59, 23);
			frmHumanOrgan.getContentPane().add(back);
		
		JEditorPane desc = new JEditorPane();
		desc.setEditable(false);
		desc.setForeground(new Color(255, 255, 255));
		desc.setFont(new Font("Tahoma", Font.BOLD, 15));
		desc.setBounds(293, 257, 397, 232);
		frmHumanOrgan.getContentPane().add(desc);
		desc.setText(list.get(i).getDes()/*org[0].getDes()*/);
		desc.setOpaque(false);
		
		JLabel lblscore = new JLabel("0");
		lblscore.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblscore.setForeground(new Color(173, 255, 47));
		lblscore.setBounds(605, 109, 59, 23);
		frmHumanOrgan.getContentPane().add(lblscore);
		
		JLabel hits = new JLabel("10");
		hits.setForeground(new Color(173, 255, 47));
		hits.setFont(new Font("Tahoma", Font.BOLD, 23));
		hits.setBounds(605, 135, 59, 23);
		frmHumanOrgan.getContentPane().add(hits);
		
		JLabel brain = new JLabel("");
		brain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		brain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(brain.getToolTipText() == list.get(i).getName()/*org[i].getName()*/){
					i++;
					score+=5;
				}
				else{
					score-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				
				hit--;
				if(hit==0){
					frmHumanOrgan.dispose();
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
					
					ScorecardFrame.main(s, score);
					
				}
				desc.setText(list.get(i).getDes()/*org[0].getDes()*/);
				hits.setText(String.valueOf(hit));
				lblscore.setText(String.valueOf(score));
				
			}
		});
		brain.setToolTipText("brain");
		brain.setBounds(108, 11, 59, 32);
		frmHumanOrgan.getContentPane().add(brain);
		
		JLabel heart = new JLabel("");
		heart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		heart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(heart.getToolTipText() == list.get(i).getName()/*org[i].getName()*/){
					i++;
					score+=5;
				}
				else{
					score-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				
				hit--;
				if(hit==0){
					frmHumanOrgan.dispose();
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
					
					ScorecardFrame.main(s, score);
					
				}
				desc.setText(list.get(i).getDes()/*org[0].getDes()*/);
				hits.setText(String.valueOf(hit));
				lblscore.setText(String.valueOf(score));
			}
		});
		heart.setToolTipText("heart");
		heart.setBounds(130, 154, 23, 23);
		frmHumanOrgan.getContentPane().add(heart);
		
		JLabel lungs = new JLabel("");
		lungs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lungs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(lungs.getToolTipText() == list.get(i).getName()/*org[i].getName()*/){
					i++;
					score+=5;
				}
				else{
					score-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				
				hit--;
				if(hit==0){
					frmHumanOrgan.dispose();
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
					
					ScorecardFrame.main(s, score);
					
				}
				desc.setText(list.get(i).getDes()/*org[0].getDes()*/);
				hits.setText(String.valueOf(hit));
				lblscore.setText(String.valueOf(score));
			}
		});
		lungs.setToolTipText("lungs");
		lungs.setBounds(96, 120, 84, 38);
		frmHumanOrgan.getContentPane().add(lungs);
		
		JLabel liver = new JLabel("");
		liver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		liver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(liver.getToolTipText() == list.get(i).getName()/*org[i].getName()*/){
					i++;
					score+=5;
				}
				else{
					score-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				
				hit--;
				if(hit==0){
					frmHumanOrgan.dispose();
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
					
					ScorecardFrame.main(s, score);
					
				}
				desc.setText(list.get(i).getDes()/*org[0].getDes()*/);
				hits.setText(String.valueOf(hit));
				lblscore.setText(String.valueOf(score));
			}
		});
		liver.setToolTipText("liver");
		liver.setBounds(95, 188, 59, 23);
		frmHumanOrgan.getContentPane().add(liver);
		
		JLabel stomach = new JLabel("");
		stomach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		stomach.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(stomach.getToolTipText() == list.get(i).getName()/*org[i].getName()*/){
					i++;
					score+=5;
				}
				else{
					score-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				
				hit--;
				if(hit==0){
					frmHumanOrgan.dispose();
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
					
					ScorecardFrame.main(s, score);
					
				}
				desc.setText(list.get(i).getDes()/*org[0].getDes()*/);
				hits.setText(String.valueOf(hit));
				lblscore.setText(String.valueOf(score));
			}
		});
		stomach.setToolTipText("stomach");
		stomach.setBounds(130, 213, 50, 23);
		frmHumanOrgan.getContentPane().add(stomach);
		
		JLabel sinstentine = new JLabel("");
		sinstentine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		sinstentine.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(sinstentine.getToolTipText() == list.get(i).getName()/*org[i].getName()*/){
					i++;
					score+=5;
				}
				else{
					score-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				
				hit--;
				if(hit==0){
					frmHumanOrgan.dispose();
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
					
					ScorecardFrame.main(s, score);
					
				}
				desc.setText(list.get(i).getDes()/*org[0].getDes()*/);
				hits.setText(String.valueOf(hit));
				lblscore.setText(String.valueOf(score));
			}
		});
		sinstentine.setToolTipText("sintestine");
		sinstentine.setBounds(119, 247, 46, 32);
		frmHumanOrgan.getContentPane().add(sinstentine);
		
		JLabel lintestine = new JLabel("");
		lintestine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lintestine.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(lintestine.getToolTipText() == list.get(i).getName()/*org[i].getName()*/){
					i++;
					score+=5;
				}
				else{
					score-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				
				hit--;
				if(hit==0){
					frmHumanOrgan.dispose();
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
					
					ScorecardFrame.main(s, score);
					
				}
				desc.setText(list.get(i).getDes()/*org[0].getDes()*/);
				hits.setText(String.valueOf(hit));
				lblscore.setText(String.valueOf(score));
			}
		});
		lintestine.setToolTipText("lintestine");
		lintestine.setBounds(174, 234, 15, 55);
		frmHumanOrgan.getContentPane().add(lintestine);
		
		JLabel bladder = new JLabel("");
		bladder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		bladder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(bladder.getToolTipText() == list.get(i).getName()/*org[i].getName()*/){
					i++;
					score+=5;
				}
				else{
					score-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				
				hit--;
				if(hit==0){
					frmHumanOrgan.dispose();
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
					
					ScorecardFrame.main(s, score);
					
				}
				desc.setText(list.get(i).getDes()/*org[0].getDes()*/);
				hits.setText(String.valueOf(hit));
				lblscore.setText(String.valueOf(score));
			}
		});
		bladder.setToolTipText("bladder");
		bladder.setBounds(129, 295, 24, 14);
		frmHumanOrgan.getContentPane().add(bladder);
		
		JLabel windpipe = new JLabel("");
		windpipe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		windpipe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(windpipe.getToolTipText() == list.get(i).getName()/*org[i].getName()*/){
					i++;
					score+=5;
				}
				else{
					score-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				
				hit--;
				if(hit==0){
					frmHumanOrgan.dispose();
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
					
					ScorecardFrame.main(s, score);
					
				}
				desc.setText(list.get(i).getDes()/*org[0].getDes()*/);
				hits.setText(String.valueOf(hit));
				lblscore.setText(String.valueOf(score));
			}
		});
		windpipe.setToolTipText("windpipe");
		windpipe.setBounds(130, 94, 23, 38);
		frmHumanOrgan.getContentPane().add(windpipe);
		
		JLabel skin = new JLabel("");
		skin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		skin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(skin.getToolTipText() == list.get(i).getName()/*org[i].getName()*/){
					i++;
					score+=5;
				}
				else{
					score-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				
				hit--;
				if(hit==0){
					frmHumanOrgan.dispose();
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
					
					ScorecardFrame.main(s, score);
					
				}
				desc.setText(list.get(i).getDes()/*org[0].getDes()*/);
				hits.setText(String.valueOf(hit));
				lblscore.setText(String.valueOf(score));
			}
		});
		skin.setToolTipText("skin");
		skin.setBounds(89, 104, 31, 8);
		frmHumanOrgan.getContentPane().add(skin);
		
		JLabel lblMin = new JLabel("");
		lblMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblMin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmHumanOrgan.setState(Frame.ICONIFIED);
			}
		});
		lblMin.setBounds(621, 0, 40, 25);
		frmHumanOrgan.getContentPane().add(lblMin);
		
		JLabel close = new JLabel("");
		close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmHumanOrgan.dispose();
				System.exit(0);
			}
		});
		close.setBounds(660, 0, 40, 23);
		frmHumanOrgan.getContentPane().add(close);
		
		
		
	
		
		JLabel bg = new JLabel("");
		
	
		bg.setIcon(new ImageIcon(HumanFrame.class.getResource("/com/gameframe/mainframe/OrganFrame.png")));
		bg.setBounds(0, 0, 700, 600);
		frmHumanOrgan.getContentPane().add(bg);
	}
	

	   private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        int x=evt.getXOnScreen();
	        int y=evt.getYOnScreen();
	        frmHumanOrgan.setLocation(x-xMouse, y-yMouse);

	    }                                     

	    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        xMouse=evt.getX();
	        yMouse=evt.getY();

	    }    
}
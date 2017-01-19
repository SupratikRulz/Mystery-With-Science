package com.gameframe.code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.gameframe.elementmodel.ScientistInfo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;

public class PhysicsHome {

	private JFrame frmMysteryWithPhysics;
	static Background o;
	public static String s[]=new String[1];

	/**
	 * Launch the application.
	 */
	
	
	//ScientistInfo arr[]=new ScientistInfo[9];
	int i,h,sc;
	private int xMouse,yMouse;
	ArrayList<ScientistInfo> list = new ArrayList<ScientistInfo>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhysicsHome window = new PhysicsHome();
					window.frmMysteryWithPhysics.setVisible(true);
					window.frmMysteryWithPhysics.setOpacity(.95F);
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
	public PhysicsHome() {
		initArray();
		initialize();
	}

	private void initArray() {
		// TODO Auto-generated method stub
		i=0;
		h=9;
		sc=0;
		/*
		arr[0]=new ScientistInfo("Robert", "Law of Elasticity");
		arr[1]=new ScientistInfo("Albert", "Advancing the Theory of Relativity");
		arr[2]=new ScientistInfo("Niels", "Quantum theory, nuclear reactions and nuclear fission");
		arr[3]=new ScientistInfo("Kelvin", "Advancement of the 1st and 2nd laws of thermodynamics.");
		arr[4]=new ScientistInfo("Marie", "Discovered radioactivity nature of thorium and the discovery of polonium and radium");
		arr[5]=new ScientistInfo("Stephen", "Explaining Black holes and Advances on the General Theory of Relativity and Quantum");
		arr[6]=new ScientistInfo("Isaac","Explaining the theories of gravity and mechanics");
		arr[7]=new ScientistInfo("Galileo", "Providing a mathematical analysis of the relationship between astronomy and physics");
		arr[8]=new ScientistInfo("Nikola", "Created the first Alternating Current system");
		 */
		list.add(new ScientistInfo("Robert", "Law of Elasticity"));
		list.add(new ScientistInfo("Albert", "Advancing the Theory of Relativity"));
		list.add(new ScientistInfo("Niels", "Quantum theory, nuclear reactions and nuclear fission"));
		list.add(new ScientistInfo("Kelvin", "Advancement of the 1st and 2nd laws of thermodynamics."));
		list.add(new ScientistInfo("Marie", "Discovered radioactivity nature of thorium and the discovery of polonium and radium"));
		list.add(new ScientistInfo("Stephen", "Explaining Black holes and Advances on the General Theory of Relativity and Quantum"));
		list.add(new ScientistInfo("Isaac","Explaining the theories of gravity and mechanics"));
		list.add(new ScientistInfo("Galileo", "Providing a mathematical analysis of the relationship between astronomy and physics"));
		list.add(new ScientistInfo("Nikola", "Created the first Alternating Current system"));
		
		Collections.shuffle(list);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMysteryWithPhysics = new JFrame();
		frmMysteryWithPhysics.setIconImage(Toolkit.getDefaultToolkit().getImage(PhysicsHome.class.getResource("/com/gameframe/code/icon.jpg")));
		frmMysteryWithPhysics.setResizable(false);
		frmMysteryWithPhysics.setTitle("Mystery With Physics ");
		frmMysteryWithPhysics.setBounds(100, 100, 900, 600);
		frmMysteryWithPhysics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMysteryWithPhysics.setUndecorated(true);
		frmMysteryWithPhysics.getContentPane().setLayout(null);
		
		//JLabel contri = new JLabel(arr[i].getContribution());
		JLabel contri = new JLabel(list.get(i).getContribution());
		contri.setBounds(355, 501, 495, 64);
		frmMysteryWithPhysics.getContentPane().add(contri);
		
		JLabel back = new JLabel("");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmMysteryWithPhysics.dispose();
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
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.setBounds(35, 45, 94, 40);
		frmMysteryWithPhysics.getContentPane().add(back);
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 816, 34);
		frmMysteryWithPhysics.getContentPane().add(TitleBar);
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
        
		
		JLabel lblMin = new JLabel("");
		lblMin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmMysteryWithPhysics.setState(Frame.ICONIFIED);
			}
		});
		lblMin.setBounds(815, 0, 45, 35);
		lblMin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frmMysteryWithPhysics.getContentPane().add(lblMin);
		
		JLabel lblClose = new JLabel("");
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				System.exit(0);
			}
		});
		lblClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblClose.setBounds(860, 0, 40, 34);
		frmMysteryWithPhysics.getContentPane().add(lblClose);
		
		JLabel score = new JLabel(String.valueOf(sc));
		score.setForeground(new Color(255, 255, 0));
		score.setFont(new Font("Tahoma", Font.BOLD, 30));
		score.setBounds(819, 67, 71, 34);
		frmMysteryWithPhysics.getContentPane().add(score);
		
		JLabel hits = new JLabel(String.valueOf(h));
		hits.setForeground(new Color(255, 255, 0));
		hits.setFont(new Font("Tahoma", Font.BOLD, 30));
		hits.setBounds(815, 135, 71, 34);
		frmMysteryWithPhysics.getContentPane().add(hits);
		
		JLabel albert = new JLabel("");
		albert.setCursor(new Cursor(Cursor.HAND_CURSOR));
		albert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(albert.getToolTipText()==list.get(i).getName()/*arr[i].getName()*/){
					i++;
					sc+=5;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				h--;
				score.setText(String.valueOf(sc));
				hits.setText(String.valueOf(h));
				
				if(h==0){
					frmMysteryWithPhysics.dispose();
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
					ScorecardFrame.main(s, sc);
				}
				contri.setText(list.get(i).getContribution()/*arr[i].getContribution()*/);
			}
		});
		albert.setToolTipText("Albert");
		albert.setBounds(38, 193, 121, 116);
		frmMysteryWithPhysics.getContentPane().add(albert);
		
		JLabel neils = new JLabel("");
		neils.setCursor(new Cursor(Cursor.HAND_CURSOR));
		neils.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(neils.getToolTipText()==list.get(i).getName()/*arr[i].getName()*/){
					i++;
					sc+=5;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				h--;
				score.setText(String.valueOf(sc));
				hits.setText(String.valueOf(h));
				if(h==0){
					frmMysteryWithPhysics.dispose();
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
					ScorecardFrame.main(s, sc);
				}
				contri.setText(list.get(i).getContribution()/*arr[i].getContribution()*/);
			}
		});
		neils.setToolTipText("Niels");
		neils.setBounds(225, 191, 121, 118);
		frmMysteryWithPhysics.getContentPane().add(neils);
		
		JLabel stephen = new JLabel("");
		stephen.setCursor(new Cursor(Cursor.HAND_CURSOR));
		stephen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(stephen.getToolTipText()==list.get(i).getName()/*list.get(i).getName()/*arr[i].getName()*/){
					i++;
					sc+=5;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				h--;
				score.setText(String.valueOf(sc));
				hits.setText(String.valueOf(h));
				if(h==0){
					frmMysteryWithPhysics.dispose();
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
					ScorecardFrame.main(s, sc);
				}
				contri.setText(list.get(i).getContribution()/*arr[i].getContribution()*/);
			}
		});
		stephen.setToolTipText("Stephen");
		stephen.setBounds(404, 193, 121, 116);
		frmMysteryWithPhysics.getContentPane().add(stephen);
		
		JLabel isaac = new JLabel("");
		isaac.setCursor(new Cursor(Cursor.HAND_CURSOR));
		isaac.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(isaac.getToolTipText()==list.get(i).getName()/*list.get(i).getName()/*arr[i].getName()*/){
					i++;
					sc+=5;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				h--;
				score.setText(String.valueOf(sc));
				hits.setText(String.valueOf(h));
				if(h==0){frmMysteryWithPhysics.dispose();
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
				ScorecardFrame.main(s, sc);	}
				contri.setText(list.get(i).getContribution()/*arr[i].getContribution()*/);
			}
		});
		isaac.setToolTipText("Isaac");
		isaac.setBounds(584, 193, 121, 114);
		frmMysteryWithPhysics.getContentPane().add(isaac);
		
		JLabel nikola = new JLabel("");
		nikola.setCursor(new Cursor(Cursor.HAND_CURSOR));
		nikola.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(nikola.getToolTipText()==list.get(i).getName()/*list.get(i).getName()/*arr[i].getName()*/){
					i++;
					sc+=5;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				h--;
				score.setText(String.valueOf(sc));
				hits.setText(String.valueOf(h));
				if(h==0){
					frmMysteryWithPhysics.dispose();
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
				ScorecardFrame.main(s, sc);
				}
				contri.setText(list.get(i).getContribution()/*arr[i].getContribution()*/);
			}
		});
		nikola.setToolTipText("Nikola");
		nikola.setBounds(756, 191, 121, 116);
		frmMysteryWithPhysics.getContentPane().add(nikola);
		
		JLabel galileo = new JLabel("");
		galileo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		galileo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(galileo.getToolTipText()==list.get(i).getName()/*list.get(i).getName()/*arr[i].getName()*/){
					i++;
					sc+=5;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				h--;
				score.setText(String.valueOf(sc));
				hits.setText(String.valueOf(h));
				if(h==0){
					frmMysteryWithPhysics.dispose();
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
					ScorecardFrame.main(s, sc);
				}
				contri.setText(list.get(i).getContribution()/*arr[i].getContribution()*/);
			}
		});
		galileo.setToolTipText("Galileo");
		galileo.setBounds(126, 312, 121, 118);
		frmMysteryWithPhysics.getContentPane().add(galileo);
		
		JLabel marie = new JLabel("");
		marie.setCursor(new Cursor(Cursor.HAND_CURSOR));
		marie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(marie.getToolTipText()==list.get(i).getName()/*list.get(i).getName()/*arr[i].getName()*/){
					i++;
					sc+=5;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				h--;
				score.setText(String.valueOf(sc));
				hits.setText(String.valueOf(h));
				if(h==0){
					frmMysteryWithPhysics.dispose();
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
					ScorecardFrame.main(s, sc);
				}
				contri.setText(list.get(i).getContribution()/*arr[i].getContribution()*/);
			}
		});
		marie.setToolTipText("Marie");
		marie.setBounds(314, 312, 121, 116);
		frmMysteryWithPhysics.getContentPane().add(marie);
		
		JLabel kelvin = new JLabel("");
		kelvin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		kelvin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(kelvin.getToolTipText()==list.get(i).getName()/*arr[i].getName()*/){
					i++;
					sc+=5;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				h--;
				score.setText(String.valueOf(sc));
				hits.setText(String.valueOf(h));
				if(h==0){
					frmMysteryWithPhysics.dispose();
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
					ScorecardFrame.main(s, sc);
				}
				contri.setText(list.get(i).getContribution()/*arr[i].getContribution()*/);
			}
		});
		kelvin.setToolTipText("Kelvin");
		kelvin.setBounds(488, 311, 121, 119);
		frmMysteryWithPhysics.getContentPane().add(kelvin);
		
		JLabel robert = new JLabel("");
		robert.setCursor(new Cursor(Cursor.HAND_CURSOR));
		robert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(robert.getToolTipText()==list.get(i).getName()/*arr[i].getName()*/){
					i++;
					sc+=5;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");
				}
				h--;
				score.setText(String.valueOf(sc));
				hits.setText(String.valueOf(h));
				if(h==0){
					frmMysteryWithPhysics.dispose();
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
					ScorecardFrame.main(s, sc);
				}
				contri.setText(list.get(i).getContribution()/*arr[i].getContribution()*/);
			}
		});
		robert.setToolTipText("Robert");
		robert.setBounds(678, 313, 121, 114);
		frmMysteryWithPhysics.getContentPane().add(robert);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(PhysicsHome.class.getResource("/com/gameframe/mainframe/PhysicsFrame.png")));
		bg.setBounds(0, 0, 900, 600);
		frmMysteryWithPhysics.getContentPane().add(bg);
	}
	 private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        int x=evt.getXOnScreen();
	        int y=evt.getYOnScreen();
	        frmMysteryWithPhysics.setLocation(x-xMouse, y-yMouse);

	    }                                     

	    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        xMouse=evt.getX();
	        yMouse=evt.getY();

	    }  


}

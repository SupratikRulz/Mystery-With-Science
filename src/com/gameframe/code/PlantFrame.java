package com.gameframe.code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.gameframe.elementmodel.PlantInfo;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;

public class PlantFrame {

	private JFrame frmPlantStructure;
	

	/**
	 * Launch the application.
	 */
	//PlantInfo arr[]=new PlantInfo[10];
	ArrayList<PlantInfo> list = new ArrayList<PlantInfo>();
	
	int sc,i,h;
	int xMouse,yMouse;
	static Background o;
	public static String s[]=new String[1];
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlantFrame window = new PlantFrame();
					window.frmPlantStructure.setVisible(true);
					window.frmPlantStructure.setOpacity(.95F);
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
	public PlantFrame() {
		initArray();
		initialize();
	}

	private void initArray() {
		// TODO Auto-generated method stub
		
		sc=0;
		h=9;
		i=0;
		/*
		arr[0]=new PlantInfo("shoot tip","Topmost part of shoot");
		arr[1]=new PlantInfo("primary root","Anchor the plant in the soil,Absorb water and nutrients");
		arr[2]=new PlantInfo("root hairs"," Take mineral up through the roots to the rest of the plant");
		arr[3]=new PlantInfo("fruit","The ripened ovary of an angiosperm flower");
		arr[4]=new PlantInfo("vascular tissue","Include xylem and phloem to conducts minerals and dissolved nutrients.");
		arr[5]=new PlantInfo("flower","They are reproductive organs of plant.");
		arr[6]=new PlantInfo("node","Ion flow across the membrane occurs only at this part.");
		arr[7]=new PlantInfo("leaf","Photosynthesis occurs here.");
		arr[8]=new PlantInfo("ground tissue","Parenchyma, collenchyma, and sclerenchyma are found here.");
		*/
		list.add(new PlantInfo("shoot tip","Topmost part of shoot"));
		list.add(new PlantInfo("primary root","Anchor the plant in the soil,Absorb water and nutrients"));
		list.add(new PlantInfo("root hairs"," Take mineral up through the roots to the rest of the plant"));
		list.add(new PlantInfo("fruit","The ripened ovary of an angiosperm flower"));
		list.add(new PlantInfo("vascular tissue","Include xylem and phloem to conducts minerals and dissolved nutrients."));
		list.add(new PlantInfo("flower","They are reproductive organs of plant."));
		list.add(new PlantInfo("node","Ion flow across the membrane occurs only at this part."));
		list.add(new PlantInfo("leaf","Photosynthesis occurs here."));
		list.add(new PlantInfo("ground tissue","Parenchyma, collenchyma, and sclerenchyma are found here."));
		
		Collections.shuffle(list);	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPlantStructure = new JFrame();
		frmPlantStructure.setIconImage(Toolkit.getDefaultToolkit().getImage(PlantFrame.class.getResource("/com/gameframe/code/icon.jpg")));
		frmPlantStructure.setTitle("Plant Structure");
		frmPlantStructure.setResizable(false);
		frmPlantStructure.setBounds(100, 100,700, 600);
		frmPlantStructure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPlantStructure.setUndecorated(true);
		frmPlantStructure.getContentPane().setLayout(null);
		
		JLabel description = new JLabel(list.get(i).getDesc()/*arr[i].getDesc()*/);
		description.setHorizontalAlignment(SwingConstants.CENTER);
		description.setForeground(new Color(220, 20, 60));
		description.setFont(new Font("Times New Roman", Font.BOLD, 16));
		description.setBounds(215, 379, 485, 48);
		frmPlantStructure.getContentPane().add(description);
		
		
		
		JLabel back = new JLabel("");
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmPlantStructure.dispose();
				
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
		back.setBounds(10, 27, 94, 42);
		frmPlantStructure.getContentPane().add(back);
		
		JLabel lblMin = new JLabel("");
		lblMin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblMin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmPlantStructure.setState(Frame.ICONIFIED);
			}
		});
		lblMin.setBounds(609, 0, 44, 33);
		frmPlantStructure.getContentPane().add(lblMin);
		
		JLabel close = new JLabel("");
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				System.exit(0);
			}
		});
		close.setBounds(654, 0, 46, 33);
		frmPlantStructure.getContentPane().add(close);
		
		JLabel score = new JLabel("0");
		score.setForeground(new Color(220, 20, 60));
		score.setFont(new Font("Tahoma", Font.BOLD, 26));
		score.setBounds(556, 131, 80, 27);
		frmPlantStructure.getContentPane().add(score);
		
		JLabel hits = new JLabel("9");
		hits.setForeground(new Color(220, 20, 60));
		hits.setFont(new Font("Tahoma", Font.BOLD, 26));
		hits.setBounds(556, 193, 80, 27);
		frmPlantStructure.getContentPane().add(hits);
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 609, 33);
		frmPlantStructure.getContentPane().add(TitleBar);
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
		
		JLabel shoottip = new JLabel("");
		shoottip.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				Sound.main(null,Sound.CLICK);
				
				if(shoottip.getToolTipText()==list.get(i).getName()/*arr[i].getName()*/){
					sc+=5;
					i++;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");		
				}
				h--;
				hits.setText(String.valueOf(h));
				score.setText(String.valueOf(sc));
				if(h==0){
					frmPlantStructure.dispose();
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
				description.setText(list.get(i).getDesc()/*arr[i].getDesc()*/);
			}
		});
		shoottip.setToolTipText("shoot tip");
		shoottip.setBounds(156, 114, 15, 14);
		frmPlantStructure.getContentPane().add(shoottip);
		shoottip.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JLabel epidermis = new JLabel("");
		epidermis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(epidermis.getToolTipText()==list.get(i).getName()/*arr[i].getName()*/){
					sc+=5;
					i++;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");		
				}
				h--;
				hits.setText(String.valueOf(h));
				score.setText(String.valueOf(sc));
				if(h==0){
					frmPlantStructure.dispose();
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
				description.setText(list.get(i).getDesc()/*arr[i].getDesc()*/);
			}
		});
		epidermis.setToolTipText("epidermis");
		epidermis.setBounds(154, 144, 15, 14);
		frmPlantStructure.getContentPane().add(epidermis);
		epidermis.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JLabel flower = new JLabel("");
		flower.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(flower.getToolTipText()==list.get(i).getName()/*list.get(i).getName()/*arr[i].getName()*/){
					sc+=5;
					i++;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");		
				}
				h--;
				hits.setText(String.valueOf(h));
				score.setText(String.valueOf(sc));
				if(h==0){
					frmPlantStructure.dispose();
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
				description.setText(list.get(i).getDesc()/*arr[i].getDesc()*/);
			}
		});
		flower.setToolTipText("flower");
		flower.setBounds(184, 193, 15, 14);
		frmPlantStructure.getContentPane().add(flower);
		flower.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JLabel node = new JLabel("");
		node.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(node.getToolTipText()==list.get(i).getName()/*list.get(i).getName()/*arr[i].getName()*/){
					sc+=5;
					i++;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");		
				}
				h--;
				hits.setText(String.valueOf(h));
				score.setText(String.valueOf(sc));
				if(h==0){
					frmPlantStructure.dispose();
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
				description.setText(list.get(i).getDesc()/*arr[i].getDesc()*/);
			}
		});
		node.setToolTipText("node");
		node.setBounds(144, 227, 15, 14);
		frmPlantStructure.getContentPane().add(node);
		node.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JLabel fruit = new JLabel("");
		fruit.setToolTipText("fruit");
		fruit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(fruit.getToolTipText()==list.get(i).getName()/*arr[i].getName()*/){
					sc+=5;
					i++;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");		
				}
				h--;
				hits.setText(String.valueOf(h));
				score.setText(String.valueOf(sc));
				if(h==0){	frmPlantStructure.dispose();
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
				description.setText(list.get(i).getDesc()/*arr[i].getDesc()*/);
			}
		});
		fruit.setBounds(184, 342, 44, 42);
		frmPlantStructure.getContentPane().add(fruit);
		fruit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JLabel leaf = new JLabel("");
		leaf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(leaf.getToolTipText()==list.get(i).getName()/*arr[i].getName()*/){
					sc+=5;
					i++;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");		
				}
				h--;
				hits.setText(String.valueOf(h));
				score.setText(String.valueOf(sc));
				if(h==0){	frmPlantStructure.dispose();
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
				description.setText(list.get(i).getDesc()/*arr[i].getDesc()*/);
			}
		});
		leaf.setToolTipText("leaf");
		leaf.setBounds(184, 227, 80, 85);
		frmPlantStructure.getContentPane().add(leaf);
		leaf.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JLabel vasculartissue = new JLabel("");
		vasculartissue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(vasculartissue.getToolTipText()==list.get(i).getName()/*arr[i].getName()*/){
					sc+=5;
					i++;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");		
				}
				h--;
				hits.setText(String.valueOf(h));
				score.setText(String.valueOf(sc));
				if(h==0){	frmPlantStructure.dispose();
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
				description.setText(list.get(i).getDesc()/*arr[i].getDesc()*/);
			}
		});
		vasculartissue.setToolTipText("vascular tissue");
		vasculartissue.setBounds(150, 285, 21, 14);
		frmPlantStructure.getContentPane().add(vasculartissue);
		vasculartissue.setCursor(new Cursor(Cursor.HAND_CURSOR));
		JLabel groundtissue = new JLabel("");
		groundtissue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(groundtissue.getToolTipText()==list.get(i).getName()/*arr[i].getName()*/){
					sc+=5;
					i++;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");		
				}
				h--;
				hits.setText(String.valueOf(h));
				score.setText(String.valueOf(sc));
				if(h==0){	frmPlantStructure.dispose();
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
				description.setText(list.get(i).getDesc()/*arr[i].getDesc()*/);
			}
		});
		groundtissue.setToolTipText("ground tissue");
		groundtissue.setBounds(150, 413, 21, 14);
		frmPlantStructure.getContentPane().add(groundtissue);
		groundtissue.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel roothairs = new JLabel("");
		roothairs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(roothairs.getToolTipText()==list.get(i).getName()/*arr[i].getName()*/){
					sc+=5;
					i++;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");		
				}
				h--;
				hits.setText(String.valueOf(h));
				score.setText(String.valueOf(sc));
				if(h==0){
					frmPlantStructure.dispose();
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
				description.setText(list.get(i).getDesc()/*arr[i].getDesc()*/);
			}
		});
		roothairs.setToolTipText("root hairs");
		roothairs.setBounds(172, 575, 15, 14);
		frmPlantStructure.getContentPane().add(roothairs);
		roothairs.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel primaryroot = new JLabel("");
		primaryroot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(primaryroot.getToolTipText()==list.get(i).getName()/*arr[i].getName()*/){
					sc+=5;
					i++;
				}
				else{
					sc-=3;
					JOptionPane.showMessageDialog(null, "Wrong Answer!");		
				}
				h--;
				hits.setText(String.valueOf(h));
				score.setText(String.valueOf(sc));
				if(h==0){	frmPlantStructure.dispose();
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
				description.setText(list.get(i).getDesc()/*arr[i].getDesc()*/);
			}
		});
		primaryroot.setToolTipText("primary root");
		primaryroot.setBounds(160, 521, 8, 49);
		frmPlantStructure.getContentPane().add(primaryroot);
		primaryroot.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(PlantFrame.class.getResource("/com/gameframe/mainframe/plant.png")));
		bg.setBounds(0, 0, 700, 600);
		frmPlantStructure.getContentPane().add(bg);
	}
	
	 private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        int x=evt.getXOnScreen();
	        int y=evt.getYOnScreen();
	        frmPlantStructure.setLocation(x-xMouse, y-yMouse);

	    }                                     

	    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        xMouse=evt.getX();
	        yMouse=evt.getY();

	    }  
}

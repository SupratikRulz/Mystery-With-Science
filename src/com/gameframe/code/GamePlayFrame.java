package com.gameframe.code;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.gameframe.elementmodel.ElementInfo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;

public class GamePlayFrame {

	private JFrame frmMysteryWithChemistry;
	private int xMouse,yMouse;
	private int hits,score,present;
	int lvl;
	//public ElementInfo element[] = new ElementInfo[22]; 
	static Background o;
	public static String s[]=new String[1];
	ArrayList<ElementInfo> list = new ArrayList<ElementInfo>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamePlayFrame window = new GamePlayFrame();
					window.frmMysteryWithChemistry.setVisible(true);
					window.frmMysteryWithChemistry.setOpacity(.95F);
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
	public GamePlayFrame() {
		lvl=HomeFrame.level;
		initializeElements();
		initialize();
	}

	private void initializeElements() {
		// TODO Auto-generated method stub
		/*
		element[0]=new ElementInfo("10", "Ne", "Neon", "Colourless, odourless, gas", "None", "None", "None", "Minute quantities found in atmosphere", "2,8","-246.08","-248.59");
		element[1]=new ElementInfo("20", "Ca", "Calcium", "Silver-white, light, ductile, malleable", "Slow", "Rapid", "Rapid", "Minute quantities found in atmosphere", "2,8,8,2","1494","842");
		element[2]=new ElementInfo("22", "Ti", "Titanium", "Silvery-white, metallic, malleable, ductile", "Slow", "Slow", "Slow", "Never found in pure form in nature; occurs as an oxide in several minerals", "2,8,10,2","3289.0","3289.0");
		element[3]=new ElementInfo("1", "H", "Hydrogen", "Colourless, tasteless, odourless, gas", "Explosive", "None", "None", "Found in greatest quantities in water", "1","-252.87","-259.34");
		element[4]=new ElementInfo("7", "N", "Nitrogen", "Colourless, odourless, tasteless, gas", "None", "None", "None", "Occurs freely in nature", "2,5","-195.8","-210.0");
		element[5]=new ElementInfo("18", "Ar", "Argon", "Colourless, odourless, gas", "None", "None", "None", "Found in atmosphere", "2,8,8","-185.87","-189.35");
		element[6]=new ElementInfo("2", "He", "Helium", "Colourless, odourless, gas", "None", "None", "None", "From wells in Kansas, Oklahoma and Texas", "2","-268.9","-272.2");
		element[7]=new ElementInfo("8", "O", "Oxygen", "Colourless, odourless, tasteless, gas", "None", "None", "None", "Occurs naturally in atmosphere", "2,6","-182.97","-218.79");
		element[8]=new ElementInfo("6", "C", "Carbon", "As one of 4 allotropes;graphite - black, soft, lustrous; amorphouphus,fullerenes", "None", "None", "None", "Occurs in more compounds than any other element;", "2,4","3900","3500");
		element[9]=new ElementInfo("4", "Be", "Beryllium", "Grey, brittle, metal", "Very Slow", "Slow", "Fast", "Found in many mineral species", "2,2","2472.0","1289.0");
		element[10]=new ElementInfo("17", "Cl", "Chlorine", "Greenish-yellow, gas", "None", "Fast", "Rapid", "Does not occur in pure form; relatively abundant in compounds", "2,8,7","-33.9","-101");
		element[11]=new ElementInfo("16", "S", "Sulphur", "Yellow, tasteless, odourless, non-metallic", "None", "None", "Slow", "Occurs in pure and compound forms", "2,8,6","444.67","115.22");
		element[12]=new ElementInfo("5", "B", "Boron", "3 forms are crystalline and look like metals; one form amorphous and looks like hard black powder", "Slow", "Slow", "Slow", "Occurs as Orthoboric acid in certain volcanic spring waters", "2,3","2550","2030");
		element[13]=new ElementInfo("14", "Si", "Silicon", "Hard, metallic, greyish black crystals, brown amorphous powder", "None", "None", "Slow", "Not found in pure form,found in common minerals", "2,8,4","3267.0","1414.0");
		element[14]=new ElementInfo("9", "F", "Fluorine", "Pale, greenish-yellow, gas", "Fast", "Rapid", "Rapid", "occurs naturally in combined forms", "2,7","-188","-217");
		element[15]=new ElementInfo("3", "Li", "Lithium", "Silvery-white, metal", "Fast", "Very Fast", "Rapid", "Does not exist in pure form in nature, only as compounds", "2,1","1342","180");
		element[16]=new ElementInfo("12", "Mg", "Magnesium", "Silver-white metal, malleable, ductile", "Slow", "Rapid", "Rapid", "naturally in combination with other elements", "2,8,2","1090","650");
		element[17]=new ElementInfo("11", "Na", "Sodium", "Soft, silvery-white, metallic", "Rapid", "Rapid", "Very Rapid", "Widespread in salt", "2,8,1","883","97.8");
		element[18]=new ElementInfo("19", "K", "Potassium", "Soft, silver-white, metallic", "Rapid", "Rapid", "Very Rapid", "Occurs in wide variety of minerals", "2,8,8,1","759","63.71");
		element[19]=new ElementInfo("13", "Al", "Aluminium", "Silvery-white, metal, ductile", "Slow", "Slow", "Slow", "Occurs in the form of minerals", "2,8,3","2520.0","660.45");
		element[20]=new ElementInfo("15", "P", "Phosphorus", "3 allotropic forms: white, red, black; White turns to yellow in sunlight", "Explosive", "Slow", "Slow", "Occurs in several minerals", "2,8,5","280","44.14");
		element[21]=new ElementInfo("21", "Sc", "Scandium", "Found in some rare minerals", "Slow", "Slow", "Slow", "Found in some rare minerals", "2,8,9,2","2836","1541");
		*/
		
		list.add(new ElementInfo("10", "Ne", "Neon", "Colourless, odourless, gas", "None", "None", "None", "Minute quantities found in atmosphere", "2,8","-246.08","-248.59"));
		list.add(new ElementInfo("20", "Ca", "Calcium", "Silver-white, light, ductile, malleable", "Slow", "Rapid", "Rapid", "Minute quantities found in atmosphere", "2,8,8,2","1494","842"));
		list.add(new ElementInfo("22", "Ti", "Titanium", "Silvery-white, metallic, malleable, ductile", "Slow", "Slow", "Slow", "Never found in pure form in nature; occurs as an oxide in several minerals", "2,8,10,2","3289.0","3289.0"));
		list.add(new ElementInfo("1", "H", "Hydrogen", "Colourless, tasteless, odourless, gas", "Explosive", "None", "None", "Found in greatest quantities in water", "1","-252.87","-259.34"));
		list.add(new ElementInfo("7", "N", "Nitrogen", "Colourless, odourless, tasteless, gas", "None", "None", "None", "Occurs freely in nature", "2,5","-195.8","-210.0"));
		list.add(new ElementInfo("18", "Ar", "Argon", "Colourless, odourless, gas", "None", "None", "None", "Found in atmosphere", "2,8,8","-185.87","-189.35"));
		list.add(new ElementInfo("2", "He", "Helium", "Colourless, odourless, gas", "None", "None", "None", "From wells in Kansas, Oklahoma and Texas", "2","-268.9","-272.2"));
		list.add(new ElementInfo("8", "O", "Oxygen", "Colourless, odourless, tasteless, gas", "None", "None", "None", "Occurs naturally in atmosphere", "2,6","-182.97","-218.79"));
		list.add(new ElementInfo("6", "C", "Carbon", "As one of 4 allotropes;graphite - black, soft, lustrous; amorphouphus,fullerenes", "None", "None", "None", "Occurs in more compounds than any other element;", "2,4","3900","3500"));
		list.add(new ElementInfo("4", "Be", "Beryllium", "Grey, brittle, metal", "Very Slow", "Slow", "Fast", "Found in many mineral species", "2,2","2472.0","1289.0"));
		list.add(new ElementInfo("17", "Cl", "Chlorine", "Greenish-yellow, gas", "None", "Fast", "Rapid", "Does not occur in pure form; relatively abundant in compounds", "2,8,7","-33.9","-101"));
		list.add(new ElementInfo("16", "S", "Sulphur", "Yellow, tasteless, odourless, non-metallic", "None", "None", "Slow", "Occurs in pure and compound forms", "2,8,6","444.67","115.22"));
		list.add(new ElementInfo("5", "B", "Boron", "3 forms are crystalline and look like metals; one form amorphous and looks like hard black powder", "Slow", "Slow", "Slow", "Occurs as Orthoboric acid in certain volcanic spring waters", "2,3","2550","2030"));
		list.add(new ElementInfo("14", "Si", "Silicon", "Hard, metallic, greyish black crystals, brown amorphous powder", "None", "None", "Slow", "Not found in pure form,found in common minerals", "2,8,4","3267.0","1414.0"));
		list.add(new ElementInfo("9", "F", "Fluorine", "Pale, greenish-yellow, gas", "Fast", "Rapid", "Rapid", "occurs naturally in combined forms", "2,7","-188","-217"));
		list.add(new ElementInfo("3", "Li", "Lithium", "Silvery-white, metal", "Fast", "Very Fast", "Rapid", "Does not exist in pure form in nature, only as compounds", "2,1","1342","180"));
		list.add(new ElementInfo("12", "Mg", "Magnesium", "Silver-white metal, malleable, ductile", "Slow", "Rapid", "Rapid", "naturally in combination with other elements", "2,8,2","1090","650"));
		list.add(new ElementInfo("11", "Na", "Sodium", "Soft, silvery-white, metallic", "Rapid", "Rapid", "Very Rapid", "Widespread in salt", "2,8,1","883","97.8"));
		list.add(new ElementInfo("19", "K", "Potassium", "Soft, silver-white, metallic", "Rapid", "Rapid", "Very Rapid", "Occurs in wide variety of minerals", "2,8,8,1","759","63.71"));
		list.add(new ElementInfo("13", "Al", "Aluminium", "Silvery-white, metal, ductile", "Slow", "Slow", "Slow", "Occurs in the form of minerals", "2,8,3","2520.0","660.45"));
		list.add(new ElementInfo("15", "P", "Phosphorus", "3 allotropic forms: white, red, black; White turns to yellow in sunlight", "Explosive", "Slow", "Slow", "Occurs in several minerals", "2,8,5","280","44.14"));
		list.add(new ElementInfo("21", "Sc", "Scandium", "Found in some rare minerals", "Slow", "Slow", "Slow", "Found in some rare minerals", "2,8,9,2","2836","1541"));
		
		Collections.shuffle(list);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(){
		frmMysteryWithChemistry = new JFrame();
		frmMysteryWithChemistry.setIconImage(Toolkit.getDefaultToolkit().getImage(GamePlayFrame.class.getResource("/com/gameframe/code/icon.jpg")));
		frmMysteryWithChemistry.setResizable(false);
		frmMysteryWithChemistry.setTitle("Mystery With Chemistry - Gameplay");
		frmMysteryWithChemistry.setBounds(100, 100, 1009, 650);
		frmMysteryWithChemistry.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMysteryWithChemistry.setUndecorated(true);
		frmMysteryWithChemistry.getContentPane().setLayout(null);
		
		
		hits=21;
		score=0;
		present=0;
		
		
		JLabel lblHits = new JLabel("25");
		lblHits.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblHits.setBounds(932, 574, 41, 24);
		frmMysteryWithChemistry.getContentPane().add(lblHits);
		
		
		
		JLabel lblMinimize = new JLabel("");
		lblMinimize.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmMysteryWithChemistry.setState(Frame.ICONIFIED);
			}
		});
		lblMinimize.setBounds(945, 0, 33, 19);
		frmMysteryWithChemistry.getContentPane().add(lblMinimize);
		
		JLabel lblClose = new JLabel("");
		lblClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				System.exit(0);
			}
		});
		lblClose.setBounds(976, 0, 33, 19);
		frmMysteryWithChemistry.getContentPane().add(lblClose);
		
		JLabel lblBack = new JLabel("");
		lblBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				frmMysteryWithChemistry.dispose();
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
		lblBack.setBounds(840, 476, 130, 24);
		frmMysteryWithChemistry.getContentPane().add(lblBack);
		
		JLabel lblAppearance = new JLabel("");
		lblAppearance.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAppearance.setBounds(312, 404, 486, 24);
		frmMysteryWithChemistry.getContentPane().add(lblAppearance);
		
		JLabel lblRAir = new JLabel("");
		lblRAir.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRAir.setBounds(312, 439, 486, 24);
		frmMysteryWithChemistry.getContentPane().add(lblRAir);
		
		JLabel lblRWater = new JLabel("");
		lblRWater.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRWater.setBounds(312, 474, 486, 24);
		frmMysteryWithChemistry.getContentPane().add(lblRWater);
		
		JLabel lblRAcid = new JLabel("");
		lblRAcid.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRAcid.setBounds(312, 505, 486, 24);
		frmMysteryWithChemistry.getContentPane().add(lblRAcid);
		
		JLabel lblOccurance = new JLabel("");
		lblOccurance.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblOccurance.setBounds(312, 534, 486, 24);
		frmMysteryWithChemistry.getContentPane().add(lblOccurance);
		
		JLabel lblEShell = new JLabel("");
		lblEShell.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEShell.setBounds(312, 566, 486, 24);
		frmMysteryWithChemistry.getContentPane().add(lblEShell);
		
		JLabel lblBp = new JLabel("");
		lblBp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblBp.setBounds(312, 591, 486, 24);
		frmMysteryWithChemistry.getContentPane().add(lblBp);
		
		JLabel lblMp = new JLabel("");
		lblMp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMp.setBounds(312, 615, 486, 24);
		frmMysteryWithChemistry.getContentPane().add(lblMp);
		
		JLabel TitleBar = new JLabel("");
		TitleBar.setBounds(0, 0, 946, 14);
		frmMysteryWithChemistry.getContentPane().add(TitleBar);
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
	    JLabel lblScore = new JLabel("0");
	    lblScore.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblScore.setBounds(945, 526, 64, 32);
		frmMysteryWithChemistry.getContentPane().add(lblScore);
		
	        
		
		JLabel H = new JLabel("");
		H.setToolTipText("H");
		H.setBounds(42, 24, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(H);
		H.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		H.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				
				if(H.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				
				hits--;
				if(hits==0){
					//JOptionPane.showMessageDialog(null, "Your Score is: "+lblScore.getText());
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		
	
		
		JLabel Li = new JLabel("");
		Li.setToolTipText("Li");
		Li.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(Li.getToolTipText()== list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		Li.setBounds(42, 61, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(Li);
		Li.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel Be = new JLabel("");
		Be.setToolTipText("Be");
		Be.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(Be.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		Be.setBounds(93, 61, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(Be);
		Be.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel Na = new JLabel("");
		Na.setToolTipText("Na");
		Na.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Na.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(Na.getToolTipText()== list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		Na.setBounds(42, 98, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(Na);
		
		JLabel Mg = new JLabel("");
		Mg.setToolTipText("Mg");
		Mg.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Mg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(Mg.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				}
		});
		Mg.setBounds(93, 98, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(Mg);
		
		JLabel K = new JLabel("");
		K.setToolTipText("K");
		K.setCursor(new Cursor(Cursor.HAND_CURSOR));
		K.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(K.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		K.setBounds(42, 133, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(K);
		
		JLabel Ca = new JLabel("");
		Ca.setToolTipText("Ca");
		Ca.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Ca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(Ca.getToolTipText()== list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		Ca.setBounds(93, 133, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(Ca);
		
		JLabel Sc = new JLabel("");
		Sc.setToolTipText("Sc");
		Sc.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Sc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(Sc.getToolTipText()== list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		Sc.setBounds(144, 133, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(Sc);
		
		JLabel Ti = new JLabel("");
		Ti.setToolTipText("Ti");
		Ti.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Ti.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(Ti.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		Ti.setBounds(196, 133, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(Ti);
		
		JLabel B = new JLabel("");
		B.setToolTipText("B");
		B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(B.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		B.setBounds(659, 61, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(B);
		
		JLabel C = new JLabel("");
		C.setToolTipText("C");
		C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(C.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		C.setBounds(710, 61, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(C);
		
		JLabel N = new JLabel("");
		N.setToolTipText("N");
		N.setCursor(new Cursor(Cursor.HAND_CURSOR));
		N.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(N.getToolTipText()== list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		N.setBounds(763, 61, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(N);
		
		JLabel O = new JLabel("");
		O.setToolTipText("O");
		O.setCursor(new Cursor(Cursor.HAND_CURSOR));
		O.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(O.getToolTipText()== list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		O.setBounds(811, 61, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(O);
		
		JLabel F = new JLabel("");
		F.setToolTipText("F");
		F.setCursor(new Cursor(Cursor.HAND_CURSOR));
		F.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(F.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		F.setBounds(864, 61, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(F);
		
		JLabel He = new JLabel("");
		He.setToolTipText("He");
		He.setCursor(new Cursor(Cursor.HAND_CURSOR));
		He.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(He.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		He.setBounds(913, 24, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(He);
		
		JLabel Ne = new JLabel("");
		Ne.setToolTipText("Ne");
		Ne.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Ne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				//System.out.println(Ne.getToolTipText() + " " + list.get(present).getSymbol());
				if(Ne.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		Ne.setBounds(913, 61, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(Ne);
		
		JLabel Al = new JLabel("");
		Al.setToolTipText("Al");
		Al.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Al.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(Al.getToolTipText()== list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		Al.setBounds(659, 98, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(Al);
		
		JLabel Si = new JLabel("");
		Si.setToolTipText("Si");
		Si.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Si.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(Si.getToolTipText()== list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		Si.setBounds(710, 98, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(Si);
		
		JLabel P = new JLabel("");
		P.setToolTipText("P");
		P.setCursor(new Cursor(Cursor.HAND_CURSOR));
		P.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(P.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		P.setBounds(763, 98, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(P);
		
		JLabel S = new JLabel("");
		S.setToolTipText("S");
		S.setCursor(new Cursor(Cursor.HAND_CURSOR));
		S.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(S.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		S.setBounds(811, 98, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(S);
		
		JLabel Ar = new JLabel("");
		Ar.setToolTipText("Ar");
		Ar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Ar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(Ar.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		Ar.setBounds(913, 98, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(Ar);
		
		JLabel Cl = new JLabel("");
		Cl.setToolTipText("Cl");
		Cl.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Cl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sound.main(null,Sound.CLICK);
				if(Cl.getToolTipText() == list.get(present).getSymbol()){
					score+=2;
					present++;
					lblHits.setText(String.valueOf(hits));
					lblAppearance.setText(list.get(present).getAppearance());
					lblRAir.setText(list.get(present).getRair());
					lblRWater.setText(list.get(present).getRwater());
					lblRAcid.setText(list.get(present).getRacid());
				}
				else{
					score-=1;
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
				hits--;
				if(hits==0){
					frmMysteryWithChemistry.dispose();
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
				lblHits.setText(String.valueOf(hits));
				lblScore.setText(String.valueOf(score));
				if(lvl<3 && lvl>=1){
					lblOccurance.setText(list.get(present).getOccurance());
					lblBp.setText(list.get(present).getBp());
					lblMp.setText(list.get(present).getMp());
				}
				if(lvl==1)
					lblEShell.setText(list.get(present).getEshell());
				
			}
		});
		Cl.setBounds(864, 98, 46, 32);
		frmMysteryWithChemistry.getContentPane().add(Cl);
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon(GamePlayFrame.class.getResource("/com/gameframe/mainframe/GamePlayBlankFinal.png")));
		lblBg.setBounds(0, 0, 1009, 650);
		frmMysteryWithChemistry.getContentPane().add(lblBg);

		/***DEFAULT***/
		lblHits.setText(String.valueOf(hits));
		lblAppearance.setText(list.get(present).getAppearance());
		lblRAir.setText(list.get(present).getRair());
		lblRWater.setText(list.get(present).getRwater());
		lblRAcid.setText(list.get(present).getRacid());
		if(lvl<3 && lvl>=1){
			lblOccurance.setText(list.get(present).getOccurance());
			lblBp.setText(list.get(present).getBp());
			lblMp.setText(list.get(present).getMp());
		}
		if(lvl==1)
			lblEShell.setText(list.get(present).getEshell());

		lblHits.setText(String.valueOf(hits));
		lblScore.setText(String.valueOf(score));
		
		
	}

	   private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        int x=evt.getXOnScreen();
	        int y=evt.getYOnScreen();
	        frmMysteryWithChemistry.setLocation(x-xMouse, y-yMouse);

	    }                                     

	    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {                                      
	        // TODO add your handling code here:
	        xMouse=evt.getX();
	        yMouse=evt.getY();

	    }    
}

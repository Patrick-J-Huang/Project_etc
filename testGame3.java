package COMSC;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class testGame3 {

	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 30);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea,titleTextArea;
	int playerHP, monsterHP, silverRing;
	String weapon, position;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
	
	public static void main(String[] args) {
				new testGame3();
	}
	
	
	public testGame3()
	{
		// WINDOW FRAME
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		//Title of GAME
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.black);

		titleTextArea = new JTextArea("Adventure Game: By Silas and Patrick");
		titleTextArea .setBounds(100, 100, 600, 150);
		titleTextArea .setBackground(Color.blue);
		titleTextArea.setForeground(Color.white);
		titleTextArea.setFont(titleFont);
		titleTextArea.setLineWrap(true);  // Format long ass text



		// Start button
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.red);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler); // handle the Start buttton (lead to next screen-createGameScreen)
		startButton.setFocusPainted(false);

		// Adding Everything up
		titleNamePanel. add(titleTextArea);
		startButtonPanel.add(startButton);
		con.add(titleNamePanel);
		con.add(startButtonPanel);

	}

	public void createGameScreen()
	{
		//Creating PANEL
		titleNamePanel.setVisible(false); // disable the title's text & Panel
		startButtonPanel.setVisible(false); // disable the START's button
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100,100,600,250);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);

		//Adding TEXT
		position = "Beginning";
		mainTextArea = new JTextArea("(*)Beginning");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);

		//Create BUTTON panel
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 350, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);

		//Create CHOICE's Button
		choice1 = new JButton("Specialize ");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1"); // tells the difference between buttons
		choiceButtonPanel.add(choice1);

		choice2 = new JButton("Adventure");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);

		choice3 = new JButton(" ");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);

		choice4 = new JButton("   ");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);
	}


	public void playerSetup(){
//		playerHP = 15;
//		monsterHP = 20;
//		weapon = "Knife";
//		weaponLabelName.setText(weapon);
//		hpLabelNumber.setText("" + playerHP);
//
//		townGate();
	}

	public void Specialize()
	{
		position = "Specialize";
		mainTextArea.setText("Scene 1");
		choice1.setText("Warrior");
		choice2.setText("Mage");
		choice3.setText("Ranger");
		choice4.setText("   ");

	}

	public void Warrior()
	{
		position = "Warrior";
		mainTextArea.setText("Scene 1.2");
		choice1.setText("go to 3");
		choice2.setText("go to 4");
		choice3.setText("    ");
		choice4.setText("   ");
	}

	public void Mage()
	{
		position = "Mage";
		mainTextArea.setText("Scene 1.2");
		choice1.setText("go to 3");
		choice2.setText("go to 4");
		choice3.setText("    ");
		choice4.setText("   ");
	}

	public void Ranger()
	{
		position = "Ranger";
		mainTextArea.setText("Scene 1.2");
		choice1.setText("go to 3");
		choice2.setText("go to 4");
		choice3.setText("    ");
		choice4.setText("   ");
	}

	public void Adventurer()
	{
		position = "Scene 2";

		mainTextArea.setText("Scene 2");
		choice1.setText("go 5");
		choice2.setText("go 6");
		choice3.setText("   ");
		choice4.setText("   ");
	}
	public void Scene3()
	{
		position = "Scene 3";
		mainTextArea.setText("Scene 3");
		choice1.setText("go 7");
		choice2.setText("go 8");
		choice3.setText("   ");
		choice4.setText("   ");

	}

	public void Scene4()
	{
		position = "Scene 4";
		mainTextArea.setText("Scene 4");
		choice1.setText("go 9");
		choice2.setText("go 10");
		choice3.setText("   ");
		choice4.setText("   ");

	}

	public void Scene5()
	{
		position = "Scene 5";
		mainTextArea.setText("Scene 5");
		choice1.setText("go to 11");
		choice2.setText("go to 12");
		choice3.setText("    ");
		choice4.setText("   ");
	}
	public void Scene6()
	{
		position = "Scene 6";
		mainTextArea.setText("Scene 6");
		choice1.setText("go to 13");
		choice2.setText("go to 14");
		choice3.setText("    ");
		choice4.setText("   ");
	}

	/// 3RD LAYER
	public void Scene7()
	{
		position = "Scene 7";
		mainTextArea.setText("Scene 7");
		choice1.setText("FINAL");
		choice2.setText("    ");
		choice3.setText("    ");
		choice4.setText("   ");
	}

	public void Scene8()
	{
		position = "Scene 8";
		mainTextArea.setText("Scene 8");
		choice1.setText("FINAL");
		choice2.setText("  ");
		choice3.setText("    ");
		choice4.setText("   ");
	}

	public void Scene9()
	{
		position = "Scene 9";
		mainTextArea.setText("Scene 9");
		choice1.setText("FINAL");
		choice2.setText("");
		choice3.setText("    ");
		choice4.setText("   ");
	}

	public void Scene10()
	{
		position = "Scene 10";
		mainTextArea.setText("Scene 10");
		choice1.setText("FINAL");
		choice2.setText("");
		choice3.setText("    ");
		choice4.setText("   ");
	}

	public void Scene11()
	{
		position = "Scene 11";
		mainTextArea.setText("Scene 11");
		choice1.setText("FINAL");
		choice2.setText("");
		choice3.setText("    ");
		choice4.setText("   ");
	}
	public void Scene12()
	{
		position = "Scene 12";
		mainTextArea.setText("Scene 12");
		choice1.setText("FINAL");
		choice2.setText("");
		choice3.setText("    ");
		choice4.setText("   ");
	}
	public void Scene13()
	{
		position = "Scene 13";
		mainTextArea.setText("Scene 13");
		choice1.setText("FINAL");
		choice2.setText("");
		choice3.setText("    ");
		choice4.setText("   ");
	}

	public void Scene14()
	{
		position = "Scene 14";
		mainTextArea.setText("Scene 14");
		choice1.setText("FINAL");
		choice2.setText("");
		choice3.setText("    ");
		choice4.setText("   ");
	}

	///FINAL LAYER
	public void finalBoss()
	{
		position = "Scene Final";
		mainTextArea.setText("Scene Final");
		choice1.setText(" ");
		choice2.setText(" ");
		choice3.setText("    ");
		choice4.setText("   ");
	}




	// Class that allows that allows the TITLE to continue to the GAME
	public class TitleScreenHandler implements ActionListener
	{
		public void actionPerformed (ActionEvent event)  {createGameScreen();}
	}

	//Class that handles the rest of the game choices
	public class ChoiceHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String yourChoice = event.getActionCommand(); // if c1 is clicked, then c1 will be putted in yourChoice
			switch(position)
			{
				case "Beginning":
					switch (yourChoice)
					{
						case "c1" : Specialize(); break;
						case "c2" : Adventurer(); break;
					} break;
				case "Specialize":
					switch (yourChoice)
					{
						case "c1" : Warrior(); break;
						case "c2" : Mage(); break;
						case "c3" : Ranger(); break;
					}break;

				case "Warrior":
					switch(yourChoice)
					{
						case "c1" : Scene3(); break;
						case "c2" : Scene4(); break;
					}break;
				case "Mage":
					switch (yourChoice)
					{
						case "c1" : Scene3(); break;
						case "c2" : Scene4(); break;
					}break;
				case "Ranger":
					switch (yourChoice)
					{
						case "c1" : Scene3(); break;
						case "c2" : Scene4(); break;
					}break;
				case "Scene 2":
					switch (yourChoice)
					{
						case "c1" : Scene5(); break;
						case "c2" : Scene6(); break;

					}break;

				case "Scene 3" :
					switch (yourChoice)
					{
						case "c1" : Scene7(); break;
						case "c2" : Scene8(); break;
					}break;

				case "Scene 4" :
					switch (yourChoice)
					{
						case "c1" : Scene9(); break;
						case "c2" : Scene10(); break;
					}break;
				case "Scene 5" :
					switch (yourChoice)
					{
						case "c1" : Scene11(); break;
						case "c2" : Scene12(); break;
					}break;
				case "Scene 6" :
					switch (yourChoice)
					{
						case "c1" : Scene13(); break;
						case "c2" : Scene14(); break;
					}break;
				case "Scene 7" :
					switch (yourChoice)
					{
						case "c1" : finalBoss(); break;
					}break;
				case "Scene 8" :
					switch (yourChoice)
					{
						case "c1" : finalBoss(); break;
					}break;
				case "Scene 9" :
					switch (yourChoice)
					{
						case "c1" : finalBoss(); break;
					}break;
				case "Scene 10" :
					switch (yourChoice)
					{
						case "c1" : finalBoss(); break;
					}break;
				case "Scene 11" :
					switch (yourChoice)
					{
						case "c1" : finalBoss(); break;
					}break;
				case "Scene 12" :
					switch (yourChoice)
					{
						case "c1" : finalBoss(); break;
					}break;
				case "Scene 13" :
					switch (yourChoice)
					{
						case "c1" : finalBoss(); break;
					}break;
				case "Scene 14" :
					switch (yourChoice)
					{
						case "c1" : finalBoss(); break;
					}break;
			}
		}
	}



	}

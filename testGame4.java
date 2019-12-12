package COMSC;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class testGame4 {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 35);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea,titleTextArea;
    int playerHP, monsterHP, silverRing;
    String weapon, position;

    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();

    public static void main(String[] args) {
        new testGame4();
    }


    public testGame4()
    {
        // WINDOW FRAME
        window = new JFrame();
        window.setSize(1000, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        //Title of GAME
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 900, 150);
        titleNamePanel.setBackground(Color.black);

        titleTextArea = new JTextArea("Playing with Death: By Silas and Patrick");
        titleTextArea .setBounds(100, 100, 600, 150);
        titleTextArea .setBackground(Color.blue);
        titleTextArea.setForeground(Color.white);
        titleTextArea.setFont(titleFont);
        titleTextArea.setLineWrap(true);  // Format long ass text



        // Start button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 500, 100);
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
        mainTextPanel.setBounds(100,100,850,450);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        //Adding TEXT
        position = "Beginning";
        mainTextArea = new JTextArea("Welcome to Playing with Death, a fun adventure game that allows you to choose your destiny! You will be roleplaying as a freelancer who just accepted a bounty on a great evil demon.\n"+ "  Before you start, please select your first path. Do you wish to commit to one of the specializations or do you feel brave enough to venture into the unknown and….um…..wing it?");
        mainTextArea.setBounds(100, 100, 800, 500);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        //Create BUTTON panel
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 500, 150);
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
//
    }
    public void enemySetup(){
//		playerHP = 15;
//		monsterHP = 20;
//		weapon = "Knife";
//		weaponLabelName.setText(weapon);
//		hpLabelNumber.setText("" + playerHP);
//
//
    }
    public void Specialize()
    {
        position = "Specialize";
        mainTextArea.setText("The world is a dangerous place, especially when you’re looking to defeat the evil demon. You have decided that the best way to combat the evil demon is to prepare more and learn the best you can of a class. Which of the following classes to you wish to specialize?”");
        choice1.setText("Warrior");
        choice2.setText("Mage");
        choice3.setText("Ranger");
        choice4.setText("   ");

    }

    public void Warrior()
    {
        position = "Warrior";
        mainTextArea.setText("After spending quite a long time to master the melee arts of your chosen class you have finally\n"+ " decided that you already to head out. Which path do you choose?");
        choice1.setText("Take the Merchant Road");
        choice2.setText("Take the Unforeseen Forest");
        choice3.setText("    ");
        choice4.setText("   ");
    }

    public void Mage()
    {
        position = "Mage";
        mainTextArea.setText("After spending quite a long time to master the magic arts of your chosen class you have finally\n"+ " decided that you already to head out. Which path do you choose?");
        choice1.setText("Take the Merchant Road");
        choice2.setText("Take the Unforeseen Forest");
        choice3.setText("    ");
        choice4.setText("   ");
    }

    public void Ranger()
    {
        position = "Ranger";
        mainTextArea.setText("After spending quite a long time to master the ranged arts of your chosen class you have finally\n"+ " decided that you already to head out. Which path do you choose?");
        choice1.setText("Take the Merchant Road");
        choice2.setText("Take the Unforeseen Forest");
        choice3.setText("    ");
        choice4.setText("   ");
    }

    public void Adventurer()
    {
        position = "Scene 2";

        mainTextArea.setText("You are an overconfident fool in everyone's opinion. You're mediocre at best.\n"+ " No one knows why you decided to pursue this quest, which is obviously above your current skill. Perhaps you have something to prove, maybe you are actually an impressive adventurer,\n"+ " or even have a death wish. You are an idiot without a doubt. A very lucky idiot. \n"+ "After seeing the quest to defeat the demon king, do you decide to: ");
        choice1.setText("Travel through the whispering cave");
        choice2.setText("Join the bandit crew in the local tavern");
        choice3.setText("   ");
        choice4.setText("   ");
    }
    public void Scene3()
    {
        position = "Scene 3";
        mainTextArea.setText("You are armed, trained, and ready for your adventure!\n"+" You are traveling through the Merchant Road. While traveling, you have reached the crossroad.\n"+" All other three paths are blocked by trees and what seem to be the remains of a recently\n"+ " raid stagecoach. A gang of 3 bandits appeared. Do you:");
        choice1.setText("Keep traveling on the Merchant Road");
        choice2.setText("Visit a nearby town to rest ");
        choice3.setText("   ");
        choice4.setText("   ");

    }

    public void Scene4()
    {
        position = "Scene 4";
        mainTextArea.setText("You bravely venture through the Unforeseen Forest. As you navigate through the thick and mystic forest, you have discovered a giant footprint belonging to the legendary Forest Guardian, a giant grizzly bear. As a newly trained adventurer you start to feel unease at the site of what remains to be the Forest Guardian's hunting ground. The sun eventually falls and you have decided to make a camp to rest for a night. While preparing to bed, you hear a loud noise from shadows. Your worst fears have became true. The Forest Guardian appears before you. The Forest Guardian shows its beastly teeth and claws,read to make a meal out of a wandering adventurer. You decide to");
        choice1.setText("Continue traveling through the forest");
        choice2.setText("You get out of the forest and visit a nearby Holiday Inn");
        choice3.setText("   ");
        choice4.setText("   ");

    }

    public void Scene5()
    {
        position = "Scene 5";
        mainTextArea.setText("You decided to take the most dangerous and possibly the quickest shortcut to the demon king’s \n"+ "layer, the Whispering Cave. \n"+ "The Whispering Cave is known as the home to monstrous creatures that are now serving the demon king. No one dares to venture there unless well-prepared, let alone going there alone. \n"+ "Being the fool that you are, you march through the cave.\n"+ " Minutes after you entered the cave, you are lost. The next thing you know you are surrounded by a murderous pack of goblins. You manage to make it to the other end of the cave. When you exit the cave you see two paths. One to the Unforeseen Forest and the other to the Inn. You");
        choice1.setText("Go to the Holiday Inn");
        choice2.setText("Get out of the forest and visit a nearby Holiday Inn");
        choice3.setText("    ");
        choice4.setText("   ");
    }
    public void Scene6()
    {
        position = "Scene 6";
        mainTextArea.setText("Realizing how a much of a fool you are to travel alone, you decided to join, what you believe to be, a group of adventurers. After buying them a few rounds of drinks and entertaining them, the group finally let you join their party. The next morning you and your new gang travel through the Merchant Road. When you arrived on the crossroad your party starts setting up ambush on the passing stagecoach. Once the stagecoach arrived, your party attacks and raids the stagecoach, murdering and pillaging loots. You finally realized that you did not join an adventure party, but found a group of bandits. Too dumbfounded and awkward to say anything about the confusion to one of the bandits, you spotted an adventurer arriving to the crossroad. The bandits once again ambush the traveler. You join the fight and stick with your new bandit friends. After such an ordeal, you think to yourself that you would be better off venturing alone and reach a crossroads. Do you ");
        choice1.setText("Travel to town and rest in the inn");
        choice2.setText("Walk into the mysterious vortex");
        choice3.setText("    ");
        choice4.setText("   ");
    }

    /// 3RD LAYER
    public void Scene7()
    {
        position = "Scene 7";
        mainTextArea.setText("As you travelled down the Merchant Road, You came across a group of orcs attacking a lady in the hood. Do you");
        choice1.setText("FINAL");
        choice2.setText("    ");
        choice3.setText("    ");
        choice4.setText("   ");
    }

    public void Scene8()
    {
        position = "Scene 8";
        mainTextArea.setText("You decided to rest up at the nearby Inn. The Inn also sells items that may aid you in your journey. You decide to take a look at them");
        choice1.setText("FINAL");
        choice2.setText("  ");
        choice3.setText("    ");
        choice4.setText("   ");
    }

    public void Scene9()
    {
        position = "Scene 9";
        mainTextArea.setText("As you continue through the forest you stumble upon the remains of a village that has recently been pillage.");
        choice1.setText("FINAL");
        choice2.setText("");
        choice3.setText("    ");
        choice4.setText("   ");
    }

    public void Scene10()
    {
        position = "Scene 10";
        mainTextArea.setText("You decided to rest up at the nearby Inn. The Inn also sells items that may aid you in your journey. You decide to take a look at them");
        choice1.setText("FINAL");
        choice2.setText("");
        choice3.setText("    ");
        choice4.setText("   ");
    }

    public void Scene11()
    {
        position = "Scene 11";
        mainTextArea.setText("You decided to rest up at the nearby Inn. The Inn also sells items that may aid you in your journey. You decide to take a look at them");
        choice1.setText("FINAL");
        choice2.setText("");
        choice3.setText("    ");
        choice4.setText("   ");
    }
    public void Scene12()
    {
        position = "Scene 12";
        mainTextArea.setText("You realize that you have stumbled onto the Unforeseen Forest. Suddenly the Forest Guardian\n"+ " appears before you. The Guardian looks mighty hungry. Do you");
        choice1.setText("FINAL");
        choice2.setText("");
        choice3.setText("    ");
        choice4.setText("   ");
    }
    public void Scene13()
    {
        position = "Scene 13";
        mainTextArea.setText("You decided to rest up at the nearby Inn. The Inn also sells items that may aid you in your journey. You decide to take a look at them");
        choice1.setText("FINAL");
        choice2.setText("");
        choice3.setText("    ");
        choice4.setText("   ");
    }

    public void Scene14()
    {
        position = "Scene 14";
        mainTextArea.setText("The moment you step out of the vortex you realize you are standing on something wet and red.\n"+ " You looking around and found yourself standing on a throne in the Demon King’s Palace.\n"+ " You look down again. You blink. You look down again. Then it hits you. You are standing on what used to be the Demon King. \n"+ "The Mysterious Vortex is a dimensional gateway to the literal Demon King. “What a bizarre day”, \n"+ "said you. You effortlessly defeated the Demon King. \n"+ "You, the lucky idiot, has defeated this game greatest foe. Are you proud of yourself?");
        choice1.setText("THE END");
        choice2.setText("");
        choice3.setText("    ");
        choice4.setText("   ");
    }

    ///FINAL LAYER
    public void finalBoss()
    {
        position = "Scene Final";
        mainTextArea.setText("This is the moment you have been waiting for. The Demon King’s Palace stands tall and menacing before you. You enter the Palace. You notice that the Palace is empty.\n"+ " You then enter the throne room. \n"+ "Sitting on the throne is a humongous creature with terrifying spikes and bat-liked wings. \n"+ "The creature stands, screeches, and looks at you. The Demon King has awakened from his slumber. The Demon king Knows why you are here. The Demon King prepares to claim your remains after your defeat. You take your stance and prepare to fight the greatest battle of all time");
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
//                case "Scene 14" :
//                    switch (yourChoice)
//                    {
//                        case "c1" : finalBoss(); break;
//                    }break;
            }
        }
    }



}
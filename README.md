# Igpay Atinlay ( Pig Latin )

**Table of Contents**
- [What is Igpay Atinlay?](#what-is-igpay-atinlay)
- [How to play?](#how-to-play)
- [How to install?](#how-to-install-the-game)
- [What does we learn?](#what-does-we-learn-from-doing-this-project)
- [Contributors](#contributors)

## What is Igpay Atinlay?
This program is a language game that words in English are altered by adding a fabricated suffix or by moving the onset or initial consonant or consonant cluster of a word to the end of the word and adding a vocalic syllable to create such a suffix.
    
![banner](gameScreenShotandFont/Banner.png)

## How to play?
**1.** Click **Start** button

![Main](gameScreenShotandFont/Frame1.png)

**2.** Type your name then click :arrow_right: button (or click :arrow_left: button to go back to main menu )

![Name](gameScreenShotandFont/Frame4.png)

**3.** Select level you want to play (If you want to change player name click :arrow_left: button)

![Level](gameScreenShotandFont/Frame5.png)

- **Easy**

    In easy level, we'll give a word and choices for players. The players need to choose a correct answer and type letter into the answer box.
    **Score:**
    For easy level -  this level contains 10 questions with 10 points each. Full score is 100 points.
        
![EZ](gameScreenShotandFont/Frame6.png)
        
- **Medium**

    In medium level, we'll only give a word to players and the players need to type a correct answer into the answer box below.
    **Score:**
    For medium level - this level contains 10 questions with 50 points each. Full score is 500 points.
    
![MD](gameScreenShotandFont/Frame8.png)
    
- **Hard**

    In hard level, we'll give a phrase or a sentence to players and the players need to type a correct answer into the answer box below.
    **Score:**
    For hard level - this level contains 5 questions with 200 points each. Full score is 1000 points.
        
![H](gameScreenShotandFont/Frame7.png)
        
    
### Score Info 
Score Info will show correct and wrong problems amount of players, name score and some word depends on the score that players got.
    
![ST](gameScreenShotandFont/Frame9.png)
    
### More buttons features :
- click **Help** button to read described of the game and see some examples.
- click **About** button to read credits of the game.
- click **Restart** button to restart the game with level you're selected before.
- click **Main** button to go back to main menu of the game.
- click **New Game** button to have new game (link back to input player's name window).
- click **Exit** button to exit the game.

## How to install the game?
### Installation
To run and play this program, your computer need:
 - Java version 8 or newer
 - IgpayAtinlay.jar
 
 ### How to run
 1. Download a runnable JAR file by click at 'IgpayAtinlay.jar' file above then click download.
 2. Runs IgpayAtinlay.jar file.

## What does we learn from doing this project?
From doing this project, we had learned about **Graphic User Interface (GUI)** by using Java Swing and also learned about other commands to use in JFrame Form. For example, ...
- Command for close one frame and open another frame.
```
new GameAbout().setVisible(true);
dispose();
```
- Commands for set some properties of a frame

**Example:** to set title of frame
```
setTitle("Igpay Altinlay [Pig Latin]");
```
**Example:** to set that the frame can be resize or not
 ```
setResizable(false);
```
**Example:** to set size of the frame
```
setPreferredSize(new java.awt.Dimension(600, 522));
```
**Example:** Commands for get input from players by using JTextField then get input from Text Field and change it into String to use.
```
JTextField ezAns = new JTextField();
String inputAns = ezAns.getText();
```

**We also used knowledge from the lesson in the class, those are…**
- Use **Encapsulation** to protect some of our data.
```
static private String[] qEasy;
```
- **Read data from file** and use **List** for keep questions, choices and answers.
```
static String menuFileEasy = "qData/easyQandA.txt";
static private String itemsEasy[];
static Random rand = new Random();

static void setQEasy() {
    ClassLoader loader = Question.class.getClassLoader();
    ArrayList<String> easySet = new ArrayList<>();
    InputStream in = loader.getResourceAsStream(menuFileEasy);
    if (in == null) {
        System.out.println("Could not access file " + menuFileEasy);
        return;
    }
    Scanner scanFile = new Scanner(in);
    while (scanFile.hasNextLine()) {
        String line = scanFile.nextLine();
        if (line.startsWith("#") || line.startsWith(" #") || line.equals("")) {
            continue;
        }
        easySet.add(line);
    }
    scanFile.close();

    itemsEasy = new String[10];
    for (int i = 0; i < itemsEasy.length; i++) {
        int r = rand.nextInt(easySet.size() - 1) + 1;
        itemsEasy[i] = easySet.get(r);
        easySet.remove(r);
    }
}
```
- Use **Data Types in Java** for help to decide types of variables in project.
```
static String inAns;
static int score = 0;
static boolean check;
```
- Use **Inheritance** to use methods from other classes.
**Example:** QA_Easy class inherit JFrame class.
```
public class QA_Easy extends javax.swing.JFrame
```
- Use **Object** lesson to create JButton objects, JLabel objects, JTextField objects and also JFrame objects.
```
JTextField ezAns = new JTextField();
JButton nxtBtn = new JButton();
JLabel ezBG = new JLabel();
```

## Contributors
   - [**Kunyaruk Katebunlu**](https://github.com/NokKbl) (ID: 6010545692)
   - [**Vichakorn Yotboonrueang**](https://github.com/Newaz2542) (ID: 6010545889)
   
**Note**
    This program is a project of Programming 1 course for the first semester which created by students in Faculty of Software and Knowledge Engineering, Kasetsart University.

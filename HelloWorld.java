/*
 * Java Checkpoint Project at Codédex: https://www.codedex.io/java/checkpoint-project/pet-simulator
 * Program Name: Pet Simulator
 * Author: Taruna Choudhary
 * Description: This program simulates a pet's actions and tracks its stats.
 * The pet has three main stats: Hunger, Energy, and Social.
 * The user can perform three actions: Play, Eat, and Sleep, which affect these stats.
 * The program ensures that the stats remain within the range of 0 to 10.
 * The actions can be performed based on the current values of the stats.
 *
 * All ASCII art used in this program is sourced from:
 * https://www.asciiart.eu/animals/dogs
 */
import java.util.Scanner;

public class HelloWorld{
    private static int social;
    private static int hunger;
    private static int energy;

    private static int tempSocial;
    private static int tempHunger;
    private static int tempEnergy;

    public static void main(String[] args) {
        social = 10;
        hunger = 10;
        energy = 10;
        Scanner scanner = new Scanner(System.in);

        // Introducing the sim and actions
        System.out.println("************************************");
        System.out.println("Name of Sim: Rover\n");
        System.out.println("  /^ ^\\\n / 0 0 \\\n V\\ Y /V\n  / - \\\n /    |\nV__) ||\n");
        System.out.println("************************************");
        System.out.println("*   List of actions available:    *");
        System.out.println("*   p (play)                      *");
        System.out.println("*   e (eat)                       *");
        System.out.println("*   s (sleep)                     *");
        System.out.println("*   q (quit the simulation)       *");
        System.out.println("************************************");
        System.out.println(" ");

        while (social >= 0 && hunger >= 0 && energy >= 0) {
            System.out.println("************************************");
            System.out.println("*        Current Stats:           *");
            System.out.println("************************************");
            System.out.println("Hunger: "+ hunger);
            System.out.println("Social: "+ social);
            System.out.println("Energy: "+ energy);
            System.out.println("************************************");
            System.out.println(" ");

            System.out.print("What's your next action? : ");
            char action = scanner.next().charAt(0);
            System.out.println(" ");

            switch (action) {
                case 'p':
                    play();
                    break;
                case 'e':
                    eat();
                    break;
                case 's':
                    sleep();
                    break;
                case 'q':
                    byeBye();
                    break;
                default:
                    System.out.println("Command not found! Try again");
            }
        }
    }


    public static void play() {
        // tempVariables temporarily stores the value of stats after play is performed to check if the action is viable
        tempSocial = social - 1;
        tempHunger = hunger - 2;
        tempEnergy = energy - 2;
        if (tooMuch()){
            return;
        }
        else if (tooLess()){
            return;
        }
        else{
            social = tempSocial;
            hunger = tempHunger;
            energy = tempEnergy;
        }
        System.out.println("             .--~~,__\n:-....,-------`~~'._.'\n `-,,,  ,_      ;'~U'\n  _,-' ,'`-__; '--.\n (_/'~~      ''''(;");
    }

    public static void eat() {
        // tempVariables temporarily stores the value of stats after eat is performed to check if the action is viable
        tempHunger = hunger + 2;
        tempEnergy = energy - 1;
        if (tooMuch()){
            return;
        }
        else if (tooLess()){
            return;
        }
        else{
            hunger = tempHunger;
            energy = tempEnergy;
        }
        System.out.println("    ,    /-. \n   ((___/ __> \n   /      } \n   \\ .--.(    ___ \njgs \\\\   \\\\  /___\\");
    }

    public static void sleep() {
        // tempVariables temporarily stores the value of stats after sleep is performed to check if the action is viable
        tempSocial = social + 1;
        tempEnergy = energy + 2;

        if (tooMuch()){
            return;
        }
        else if (tooLess()){
            return;
        }
        else{
            social = tempSocial;
            energy = tempEnergy;
        }

        System.out.println( "              _\n            ,/A\\,\n          .//`_`\\\\,\n        ,//`____-`\\\\,\n      ,//`[_ROVER_]`\\\\,\n    ,//`=  ==  __-  _`\\\\,\n   //|__=  __- == _  __|\\\\\n   ` |  __ .-----.  _  | `\n     | - _/       \\-   |\n     |__  | .-\"-. | __=|\n     |  _=|/)   (\\|    |\n     |-__ (/ a a \\) -__|\njgs  |___ /`\\_Y_/`\\____|\n          \\)8===8(/");
    }

    public static boolean tooMuch()
    {
        //Checks if any stat (energy, social, hunger) exceeds 10.
        if (tempEnergy > 10)
        {
            System.out.println("Can we go play, paw-lease... \n");
            System.out.println("        .-\"-. \n       /|6 6|\\\n      {/(_0_)\\}\n       _/ ^ \\_\njgs   (/ /^\\)-'\n       \"\"' '\"\"");
            return true;
        }
        else if (tempSocial > 10)
        {
            System.out.println("but I don't wanna, let's PLAY instead? \n");
            System.out.println("                  ;~~,__\n   :-....,-------'`-'._.'\n    `-,,,  ,       ;'~~'\n       ,'_,'~.__; '--.\n      //'       ````(;\n     `-'" + "\n");
            return true;
        }
        else if (tempHunger > 10)
        {
            System.out.println("Can't eat no more \n");
            System.out.println("             ____\n            /    \\__\n|\\         /    @   \\\n\\ \\_______|    \\  .:|>\n \\      ##|    | \\__/\n  |    ####\\__/   \\\n  /  /  ##       \\|\n /  /__________\\  \\\n L_JJ           \\__JJ");
            return true;
        }
        return false;
    }

    public static boolean tooLess()
    {
        //Checks if any stat (energy, social, hunger) is below a certain threshold.
        if (tempEnergy < 0)
        {
            System.out.println("I'm exhausted \n");
            System.out.println("   / \\__\n  (    @\\___\n  /         O\n /   (_____/ \n/_____/   U");
            return true;
        }
        else if (tempSocial < 0)
        {
            System.out.println("I wanna go home, no more socialization please human \n");
            System.out.println("              /\\___/\\\n              `)9 9('\n              {_:Y:.}_\nhjw ----------( )U-'( )----------\n              ```   '''");
            return true;

        }
        else if (tempHunger < 0)
        {
            System.out.println("Food!!! I need sustenance\n");
            System.out.println("  __      _\no'')}____//\n `_/      )\n (_(_/-(_/" + "\n");
            return true;
        }
        return false;
    }

    public static void byeBye()
    {
        System.out.println("************************************");
        System.out.println("Byeee, Thank you for spending time");
        System.out.println("with me!!");
        System.out.println("************************************");
        System.out.println("       '''',\n    o_)O \\)____)\"\n     \\_        )\nwoof!  '',,,,,,\n         ||  ||\n        \"--'\"--'");
        System.out.println("************************************");
        System.exit(0);
    }
}

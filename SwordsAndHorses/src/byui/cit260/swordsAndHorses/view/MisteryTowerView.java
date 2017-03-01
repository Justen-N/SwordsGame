/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;

import byui.cit260.swordsAndHorses.control.Puzzles;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class MisteryTowerView {
    
private String Menu;


    
 public void displayMisteryTowerView() {
    
     this.Menu = "Welcome to the Mistery Tower. Would you like to enter the tower and see what is inside?"
     +"\n*** Y = Yes, N = No";
     
        boolean done = false;
        do{
            String menuOption = this.getInput();
            
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

private boolean doAction(String menuOption) {
System.out.println("\n*** doAction() function called ***");
return true;
}

public String getInput() {

Scanner keyboard = new Scanner(System.in);
boolean valid = false;
String selection = null;

//While a valid name has not been retrieved

while (!valid) {
    //get the value entered from keyboard
    selection = keyboard.nextLine();
    selection = selection.trim();

    if (selection.length()<1 ){
    System.out.println("\n*** Invalid selection ***Try again");
    continue;
    }
    break;
    }

return selection;// return the name
}

public void doAction(char choice){
    switch (choice) {
case 'Y': //create start new game
        //MisteryTower.displayScene1();
        System.out.println("\n Not implemented yet");
        break;
case 'N':
        System.out.println("\n Not implemented yet");
       default:
        System.out.println("\n***Invalid selection*** Try again");
        break;
}

}
}
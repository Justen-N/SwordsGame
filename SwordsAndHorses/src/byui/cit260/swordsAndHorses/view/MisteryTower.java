/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;

/**
 *
 * @author Eduardo y Sandra
 */
class MisteryTower {
    private String Menu;


    
 public void displayScene1() {
    
     this.Menu = "Welcome to the Mistery Tower. Would you like to enter the tower and see what is inside?"
     +"\n*** Y = Yes, N = No";
      
        boolean done = false;
        do{
            String menuOption = this.getInput();
            
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doAction(String menuOption) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

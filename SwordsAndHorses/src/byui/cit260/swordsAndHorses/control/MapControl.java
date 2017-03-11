/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.control;

import byui.cit260.swordsAndHorses.model.Map;
import byui.cit260.swordsAndHorses.model.Scene;
import byui.cit260.swordsAndHorses.model.SceneType;

/**
 *
 * @author andre_000
 */
public class MapControl {

    public static Map createMap() {
        Map map= new Map(15,15);
        Scene[] scenes=createScenes();
        GameControl.assignScenesToLocations( map,scenes);
       
        return map;
       }

    public static void moveActorsToStart(Map map) {
        System.out.println("called moveActors Function");
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
        Scene throneRoom= new Scene();
        throneRoom.setDescription(" YOu enter an opulent throne room. the King sits in court, with a wizard and a steward in attendence"
                +"He tells you the story of the princess' curse. In order to cure her, the wizard needs a dragon's heart."
                +"THe steward says the only way to obtain one is to kill a dragon in the Dragon Wilds.");
        throneRoom.setPassable(true);
        scenes [SceneType.throneRoom.ordinal()]=throneRoom;
        
        Scene starterZone= new Scene();
        starterZone.setDescription("You have arrived in a small meadow" );
        starterZone.setPassable(true);
        scenes[SceneType.starterZone.ordinal()]=starterZone;
        
        Scene ogreIsland= new Scene();
        ogreIsland.setDescription("The island is covered in the bones of sheep and small mammals. the smell is tremendous.");
        ogreIsland.setPassable(false);
        scenes[SceneType.ogreIsland.ordinal()]=ogreIsland;
        
        Scene dragonCave= new Scene();
        dragonCave.setDescription("the cave is dark and smells of sulfur.");
        dragonCave.setPassable(true);
        scenes[SceneType.dragonCave.ordinal()]= dragonCave;
        
        Scene misteryTower=new Scene();
        misteryTower.setDescription(" You have arrived at the outside of a tall tower, covered in mystical signs");
        misteryTower.setPassable(true);
        scenes[SceneType.misteryTower.ordinal()]=misteryTower;
        
        Scene magiciansHut= new Scene();
        magiciansHut.setDescription("you have arrived at a magicians hut. there is strange colored smoke rising from the chimney, and a large duck with a riding saddle outside.");
        magiciansHut.setPassable(true);
        scenes[SceneType.magiciansHut.ordinal()]=magiciansHut;
        
    return scenes;
    }
    
}

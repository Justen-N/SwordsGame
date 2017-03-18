/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.model;


public enum CharacterTrait  {
    ranger,
    warrior,
    wizard,
    ogre,
    goblin,
    dragon,
    
    ;
    private final double strength;
    private final double wisdom;
    private final double dex;
    private final double health;
    private final double mana;
    private final double coordX;
    private final double coordY;
    private final double defenseValue;
   

CharacterTrait(double strength, double wisdom, double dex, double health, double mana, double coordX, double coordY,double defenseValue) {
    this.strength=strength;
    this.wisdom= wisdom;
    this.dex= dex;
    this.health=health;
    this.coordX=coordX;
    this.coordY=mana;
    this.mana=mana;
    this.defenseValue=defenseValue;
}

    public double getDefenseValue() {
        return defenseValue;
    }
    public double getStrength() {
        return strength;
    }

    public double getWisdom() {
        return wisdom;
    }
    
    public double getDex() {
        return dex;
    }

    public double getHealth() {
        return health;
    }

    public double getMana() {
        return mana;
    }

    public double getCoordinateX() {
        return coordX;
    }
    
    public double getCoordY() {
        return coordY;
    }
 }

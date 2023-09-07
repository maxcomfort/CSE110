// CSE 110     : 14869 / Online
// Assignment  : 08
// Author      : Max Comfort & 1219098192
// Description : Player Class for Assignment 08

public class Player {
    //instance variables
    private String name;
    private double attackStat;
    private double blockStat;
    
    // Overloaded Constructor
    public Player(String name, double attackStat, double blockStat) {
        this.name = name;
        this.attackStat = attackStat;
        this.blockStat = blockStat;
    }
    
    // getter method for player name
    public String getName() {
        return name;
    }
    
    // getter method for attack stats
    public double getAttackStat() {
        return attackStat;
    }
    
    // setter method for attack stat
    public void setAttackStat(double attackStat) {
        this.attackStat = attackStat;
    }
    
    // getter method for block stat
    public double getBlockStat() {
        return blockStat;
    }
    
    // seeter method for block stat
    public void setBlockStat(double blockStat) {
        this.blockStat = blockStat;
    }
    
    // method to print player info
    public void printPlayerInfo(){
        System.out.printf("\n" + name);
        System.out.printf(" (attack = %.2f", attackStat);
        System.out.printf(", block = %.2f)", blockStat);
    }
}
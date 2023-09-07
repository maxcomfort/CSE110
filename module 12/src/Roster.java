// CSE 110     : 14869 / Online
// Assignment  : 08
// Author      : Max Comfort & 1219098192
// Description : Roster class for Assignment 08

import java.io.*;
import java.util.*;

public class Roster {
    // instance variable for player array list
    private ArrayList<Player>players;

    // default constructor
    public Roster() {
        players = new ArrayList<>();
    }

    // overloaded constructor
    public Roster(String filename) throws FileNotFoundException{
        players = new ArrayList<>();
        String name;
        double attackStat;
        double blockStat;
        File text = new File(filename);
        Scanner in = new Scanner(text);
        
        // to read the .dat files
        while(in.hasNext()){
            name = in.next();
            name += " " + in.next();
            attackStat = in.nextDouble();
            blockStat = in.nextDouble();
            players.add(new Player(name, attackStat, blockStat));
        }
        
        in.close();
    }
    
    //method to add playes to roster
    public void addPlayer(String name,double attackStat,double blockStat){
        players.add(new Player(name, attackStat, blockStat));
    }
    
    //method to count players
    public int countPlayers(){
        return players.size();
    }
    
    //getter to get player by name
    public Player getPlayerByName (String name){
        for(Player P:players){
            if(P.getName().equals(name)){
                return P;
            }
        }
            return null;
    }
    
    // method to print top attackers
    public void printTopAttackers(){
        Player secondLargest = players.get(0);
        Player largest = players.get(0);
        
        for (int i = 0; i < players.size(); i++){
            if(players.get(i).getAttackStat() > largest.getAttackStat()){
                secondLargest = largest;
                largest = players.get(i);
            }
            
            if((players.get(i).getAttackStat() > secondLargest.getAttackStat()) && players.get(i) != largest){
                secondLargest = players.get(i);
            }
        }
        largest.printPlayerInfo();
        secondLargest.printPlayerInfo();
    }
  
    //method to print top blockers
    public void printTopBlockers(){
        Player secondLargest = players.get(countPlayers()-1);
        Player largest = players.get(0);
        
        for (int i = 0; i < players.size(); i++){
            if(players.get(i).getBlockStat()> largest.getBlockStat()){
                largest = players.get(i);
            }
            
            if(players.get(i).getBlockStat() > secondLargest.getBlockStat() && players.get(i).getBlockStat() != largest.getBlockStat()){
                secondLargest = players.get(i);
            }
        }
        largest.printPlayerInfo();
        secondLargest.printPlayerInfo();
    }

    // method to print all players
    public void printAllPlayers(){
        for(Player P:players){
            P.printPlayerInfo();
        }
    }

}
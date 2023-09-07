// CSE 110     : 14869 / Online
// Assignment  : 07
// Author      : Max Comfort & 1219098192
// Description : Weapon class for Assignment 07

class Weapon {
    private String name; //private instance
    private int maxDamage; //private instance

    public Weapon(){ //default constructor
        name="Pointy Stick";
        maxDamage = 1;
    }
    
    public Weapon(String name, int maxDamage){ //overloaded constructor
        this.name = name;
        this.maxDamage = maxDamage;
    }
    
    public String getName(){ //getter for weapon anme
        return name;
    }

    public void setName(String name){ //setter for weapon name
        this.name = name;
    }

    public int getMaxDamage(){ //getter for weapon max damage
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage){ //setter for weapon max damage
        this.maxDamage = maxDamage;
    }
    
}//end of class

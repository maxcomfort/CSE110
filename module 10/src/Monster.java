// CSE 110     : 14869 / Online
// Assignment  : 07
// Author      : Max Comfort & 1219098192
// Description : Monster class for Assignment 07

class Monster {
    private String name; //private instance
    private int healthScore; //private instance
    private Weapon weapon; //private instance

     public Monster(String name, int healthScore, Weapon weapon){ //overloaded constructor
         this.name = name;
         this.healthScore = healthScore;
         this.weapon = weapon;
     }

     public String getName(){ //getter for monster name
         return name;
     }

     public int getHealthScore(){ //getter for monster health score
         return healthScore;
     }

     public String getWeaponName(){ //getter for weapon name
         return weapon.getName();
     }

     public int attack(Monster monster){ //method for determining attach damage
        int damage = (int)(Math.random() * weapon.getMaxDamage()); //getting random double value between 0 and max damage of weapon and converting it to an int
        monster.healthScore -= damage; //subtracting damage from healthscore
         
        if(monster.getHealthScore() < 0){ //if healthscore is less than 0, make healthscore 0 to not display negative number
            monster.healthScore = 0;
        }
        
        return damage;
     }


}

/**
 * The Character class represents a character in the game
 * The class holds the character's stats
 * To Do: Implement Inventory system
 * To Do: Implement the super class Character that holds basic stats for a character
 * To Do: Implement Creature class that extends character for fight-able characters
 * @author crimsondevi
 * @verion 0.1
 * @since 2019-10-27
 * */

public class PlayerCharacter {

    String name;
    int level;
    int experience;
    //To Do: Collection<Mutation> mutations;
    //To Do: Collection<Skill> skills;
    /**BATTLE STATS
     * Stats that are used in battles
     * */
    int hitPoints;
    /**Offensive Stats
     * //To Do: Implement damage class to handle damage types and modifiers
     * Physical damage
     * Elemental damage
     * Special damage, delayed, damaged over time, status effects
     * */
    int damage;
    /**Defensive Stats
     * Physical defense
     * Elemental resistances
     * % defenses that cap
     * # flat defenses
     * To Do: Implement defense class to handle defense types and modifiers
     * works in parallel to teh Damage Class
     * */
    int armor;
    /**Base Stats
     * Starter stats that grow slowly
     * To Do: Implement rules for how and what the stats modify
     * */
    int Strength; //Melee modifiers
    int Vitality; //Health and defense modifiers
    int Intelligence; //Magic modifiers
    int Wisdom; //Secondary magic modifier
    int Dexterity; //Ranged modifiers
    int Agility; //Secondary ranged modifiers
    /**Miscellaneous Stats
     * Non battle stats
     * */
    //double itemQuantity;
    //double itemRarity;
    //To Do: implement Currency class
    //To Do: implement Reputation class
    //To Do: implement item generator


    public PlayerCharacter(String name, int hitPoints, int strength, int vitality, int intelligence, int wisdom, int dexterity, int agility) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.hitPoints = hitPoints;
        Strength = strength;
        Vitality = vitality;
        Intelligence = intelligence;
        Wisdom = wisdom;
        Dexterity = dexterity;
        Agility = agility;
    }
}



/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 * 
 * @author Bill Crosbie
 * @version 2025-04 v1.1
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Elf and the human class is responsible for
     * return a Elf object with values in the appropriate range
     * 
     */
    public Elf()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP        
        );
          
    }
    
    
    // attack() - not overridden because Elf generate basic damage
    /**
     * Attack - 10% percent chance to double the damage 
     * @return amount of famage done due to strength (and possible magic)
     */
    public int attack()
    {
        int tempDamage; //holds the attack value from Creature
        
        tempDamage = super.attack(); // Get the value based on strength that all creatures do
        // calculate if we do double damage
        if(Randomizer.nextInt(10) == 1)
        {
            tempDamage = tempDamage * 2; //result if successful
        }
        
        return tempDamage;
    }
    
    // takeDamage(int) - not overridden, because Elf take all damage assigned to them

}

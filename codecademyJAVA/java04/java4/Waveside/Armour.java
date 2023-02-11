package java4.Waveside;

import java.io.Serializable;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Armour implements Serializable {
    private static final long serialVersionUID = 1L;

    /* Class Variables */



    /* Instance Variables */
    private final String name;
    private int durability;
    private int defenseRating;

    /* Constructors */
    public Armour(String name, int durability, int defenseRating) {
        this.name = name;
        this.durability = durability;
        this.defenseRating = defenseRating;
    }

    /* Instance Methods */
    public void reduceDurability(int reduction) {
        durability -= reduction;
        if (durability <= 0) {
            System.out.println("Your " + name + " has been rendered useless. It cannot be repaired and must be sold for scraps.");
            defenseRating = 0;
        }
    }

    public void repairArmour(int amount) {
        durability += amount;
        if (durability > 100) {
            durability = 100;
        }
    }

    /* Getters & Setters */
    public int getDefenseRating() {
        return (int) (defenseRating * (durability / 100.0)) ;
    }

    @Override
    public String toString() {
        return name + ", Defense Rating: " + defenseRating + "\n";
    }
}

package java4.Waveside;

import java.io.Serializable;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Shirt extends Armour implements Serializable {
    private static final long serialVersionUID = 1L;

    /* Class Variables */


    /* Constructors */
    public Shirt(String name, int durability, int defenseRating) {
        super(name, durability, defenseRating);
    }
}

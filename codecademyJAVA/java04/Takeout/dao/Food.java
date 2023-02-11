package java4.Takeout.dao;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Food implements PricedItem {
    private String name;
    private String description;
    private int priceFood;
    public Food() {
    }

    public Food(String name, String description, int priceFood) {
        this.name = name;
        this.description = description;
        this.priceFood = priceFood;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(int priceFood) {
        this.priceFood = priceFood;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priceFood=" + priceFood +
                '}';
    }

    @Override
    public <T> void Number() {

    }

    @Override
    public <T> void getPrice() {

    }

    @Override
    public <T> void setPrice() {

    }
}

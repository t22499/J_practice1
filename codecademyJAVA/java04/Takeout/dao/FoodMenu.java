package java4.Takeout.dao;

import java.util.ArrayList;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class FoodMenu extends Food {
    private ArrayList <Food> menu = new ArrayList<>();


    public Food getFood(int index){
        Food food = menu.get(index);
        if (food == null){
            return null;
        }else {
            return food;
        }

    }

    public void setFood(Food food){
        menu.add(food);
    }

    public int getPriceFood(){
       return super.getPriceFood();
    }

    public String  getDescriptio(){
        return super.getDescription();
    }

    public String  getName(){
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

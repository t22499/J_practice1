package java4.Takeout.dao;

/**
 * @avthor 刘添
 * @varsion 1.0
 *
 */
public class Customer {
    private String name;
    private int money;

    public Customer() {
    }

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}

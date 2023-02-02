package Collection02;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice06 {
    public static void main(String[] args) {
        Tiger<Double, String, Integer> d = new Tiger<>("jack");
        d.setT(10.9);


    }
}
class Tiger<T,R,M>{
    String name;
    R r;
    M m;
    T t;

    T[] ts;

    public Tiger(R r, M m, T t) {
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                '}';
    }
}
package object03.use;

import object03.xiaoqiang.Dog;


public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog);//com.xiaoqiang.Dog@1540e19d

        object03.xiaoming.Dog dog1 = new object03.xiaoming.Dog();
        System.out.println(dog1);//com.xiaoming.Dog@677327b6


        System.out.println(Math.abs(-1));
    }
}

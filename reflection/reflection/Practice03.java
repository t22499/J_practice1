package reflection.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice03 {
    public static void main(String[] args) {


    }
    @Test
    public void p1() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classPath = "com.Class.PrivateTest";
        Class cla = Class.forName(classPath);
        Object o = cla.newInstance();
        Field name = cla.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"修改完");
        System.out.println(name);
    }

    @Test
    public void p2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cls = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        Constructor<?> declaredConstructors2 = cls.getDeclaredConstructor(String.class);
        String filePath = "aaa.txt";
        Object file = declaredConstructors2.newInstance(filePath);
        System.out.println(file.getClass());
        System.out.println("创建文件成功" + filePath);




    }

}

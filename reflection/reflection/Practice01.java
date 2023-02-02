package reflection.reflection;


import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @avthor 刘添
 * @varsion 1.0
 *
 */
public class Practice01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //properties读取文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath =" + classfullpath);
        System.out.println("method =" + method);

        //通过反射机制解决
        //加载类，返回class类型的对象
        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
        System.out.println(cls);
        System.out.println("o的运行类型=" + o.getClass());

        Method method2 = cls.getMethod(method);

        System.out.println("=========");
        System.out.println(method2);
        method2.invoke(o);

    }
}

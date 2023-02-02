package reflection.reflection;

import java.lang.reflect.Method;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice02 {
    public static void main(String[] args) throws Exception {
        //反射调用优化 + 关闭访问检查
        //加载类，返回class类型的对象
        Class cls = Class.forName("reflection.reflection.Cat");
        Object o = cls.newInstance();
        Method method = cls.getMethod("hi");
        method.setAccessible(true);//在反射调用方法时，取消访问检查

        System.out.println("=========");
        System.out.println(method);
        method.invoke(o);
    }
}

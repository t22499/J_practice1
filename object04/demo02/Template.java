package object04.demo02;

abstract public class Template {
    public abstract void job();
    public void caleTimes(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }

}

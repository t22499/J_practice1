package object04.demo02;

public class BB extends Template{
    //计算任务
    public void job(){//
        long num = 0;
        for (long i = 1; i <=800000;i++){
            num *= i;
        }
    }
}

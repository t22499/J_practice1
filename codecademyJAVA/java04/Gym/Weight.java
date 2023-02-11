package java4.Gym;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// 枚举的大小和数字，所有的重量在健身房。
public enum Weight {
    SMALL_5LBS, MEDIUM_10LBS, LARGE_25LBS;

    static final Map<Weight, Integer> numOfWeightsInGym = new HashMap<>();

    static {
        numOfWeightsInGym.put(SMALL_5LBS, 110);
        numOfWeightsInGym.put(MEDIUM_10LBS, 90);
        numOfWeightsInGym.put(LARGE_25LBS, 75);
    }

    // 返回一个随机的权重大小
    public static Weight getRandomWeight() {
        return Weight.values()[new Random().nextInt(Weight.values().length)];
    }
}

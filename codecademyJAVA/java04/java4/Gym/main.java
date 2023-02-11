package java4.Gym;

import java.util.HashMap;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class main {
    public static void main(String[] args) {
        Gym globoGym = new Gym(5, new HashMap() {
            {
                put(MachineType.LEGPRESSMACHINE, 5);
                put(MachineType.BARBELL, 5);
                put(MachineType.SQUATMACHINE, 5);
                put(MachineType.LEGEXTENSIONMACHINE, 5);
                put(MachineType.LEGCURLMACHINE, 5);
                put(MachineType.LATPULLDOWNMACHINE, 5);
                put(MachineType.CABLECROSSOVERMACHINE, 5);
            }
        });
    }
}

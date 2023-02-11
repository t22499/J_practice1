package java4.Gym;
import java.util.Random;

// 所有健身房设备的枚举
public enum MachineType {
    LEGPRESSMACHINE("Leg Press"), BARBELL("Bar Bells"), SQUATMACHINE("Squat Machine"), LEGEXTENSIONMACHINE("Leg Extensions"),
    LEGCURLMACHINE("Leg Curls"), LATPULLDOWNMACHINE("Lat Pull Downs"), PECDECKMACHINE("Pec Deck Machine"),
    CABLECROSSOVERMACHINE("Cable Crossovers");

    public final String machineName;

    MachineType(String machineName) {
        this.machineName = machineName;
    }

    //返回一件随机的健身器材
    public static MachineType getRandomEquipment() {
        return MachineType.values()[new Random().nextInt(MachineType.values().length)];
    }
}

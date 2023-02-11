package java4.Gym;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Gym {
    private final int totalGymMembers;
    private Map<MachineType, Integer> availableMachines;

    public static void main(String[] args) {

    }


    public Gym(int totalGymMembers, Map<MachineType, Integer> availableMachines) {
        this.totalGymMembers = totalGymMembers;
        this.availableMachines = availableMachines;
    }

    public void openForTheDay() {
        List<Thread> gymMembersRoutines;
        gymMembersRoutines = IntStream.rangeClosed(1, this.totalGymMembers).mapToObj(
                (id) -> {
                    Member member = new Member(id);
                    return new Thread(() -> {
                        // 线程的功能
                    });
                }).collect(Collectors.toList());

        //标准lambda语法:
        gymMembersRoutines.forEach( (t) -> t.start());

        // 方法引用语法(使用双冒号)
        gymMembersRoutines.forEach(Thread::start);
        }

    public Thread createSupervisor(){
        Thread supervisor = new Thread(() -> {
            //线程Lambda体
        });
        return supervisor;

    }







}

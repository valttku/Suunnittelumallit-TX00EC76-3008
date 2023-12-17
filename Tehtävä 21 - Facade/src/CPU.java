public class CPU {

    void freeze() {
        // Jäädyttää prosessorin suorituksen
        System.out.println("CPU: Jäädytetään...");
    }

    void jump(long position) {
        // Hyppää prosessorissa määriteltyyn osoitteeseen
        System.out.println("CPU: Hyppää osoitteeseen " + position);
    }

    void execute() {
        // Suorittaa prosessorissa olevan ohjelman
        System.out.println("CPU: Suoritetaan...");
    }

}

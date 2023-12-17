public class ComputerFacade {

    private static final long kBootAddress = 0;
    private static final long kBootSector = 0;
    private static final int kSectorSize = 512;

    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    // Tietokoneen käynnistys
    void start() {
        cpu.freeze();
        memory.load(kBootAddress, hardDrive.read(kBootSector, kSectorSize));
        memory.printData();
        cpu.jump(kBootAddress);
        cpu.execute();
    }

}

package Facade_mode;

public class MainFrame {
	private Memory memory;
	private CPU cpu;
	private HardDisk harddisk;
	private OS os;
	public MainFrame() {
		// TODO Auto-generated constructor stub
		memory=new Memory();
		cpu=new CPU();
		harddisk=new HardDisk();
		os=new OS();
	}
	public void on()
	{
		try {
			memory.check();
			cpu.run();
			harddisk.read();
			os.load();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ÏµÍ³Æô¶¯Ê§°Ü");
		}
		
	}
}

public class Utama {
	public static void main(String[] args) {
		Manager andi = new Manager("Andi",5_000_000,9_000_000);
		Programmer riko = new Programmer("Riko",7_000_000,3_000_000);

		// Set Pegawai
		andi.cetakInfo();
		riko.cetakInfo();


	}
}
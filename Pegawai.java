public class Pegawai {
	String nama;
	double gajiPokok;

	// Setter
	public Pegawai(String nama, double gajiPokok) {
		this.nama = nama;
		this.gajiPokok = gajiPokok;
	}

	// Getter
	public String getNama() {
		return this.nama;
	}

	public double getGajiPokok() {
		return this.gajiPokok;
	}

	// Cetak
	public void cetakInfo() {
		System.out.println("Nama 		: " + getNama());
		System.out.println("Gaji Pokok 	: " + getGajiPokok());
	}
}
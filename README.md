# Tugas PBO Pertemuan 9

Nama: Muhammad Dhaffa Ardhana Rianto Putra

NIM: 312110029

Kelas: TI.21.C.2

---

Disini saya akan menunjukkan tutorial membuat Constructor

## Buat file dan kode Java

- Buat file dengan nama bebas seperti `Utama` dengan ekstensi file `.java`
- Tulis kode java seperti berikut

```
public class Utama {
	public static void main(String[] args) {
	
	}
}
```

### Buat file Pegawai class

- Untuk membuat super class constructor, buat file di folder yang sama dengan nama `Pegawai.java`
- Tulis kode java seperti berikut

```
public class Pegawai {
	String nama;
	double gajiPokok;
}
```

- Lalu buat Constructor dan Getter sebagai berikut

```
public Pegawai(String nama, double gajiPokok) {
	this.nama = nama;
	this.gajiPokok = gajiPokok;
}

public String getNama() {
	return this.nama;
}

public double getGajiPokok() {
	return this.gajiPokok;
}
```

- Setelah itu buat function `cetakInfo()` untuk mencetak informasi dari Pegawai

```
public void cetakInfo() {
	System.out.println("Nama 		: " + getNama());
	System.out.println("Gaji Pokok 	: " + getGajiPokok());
}
```

### Buat file Manager sebagai subclass dari Pegawai

- Setelah diawal telah membuat super class, sekarang kita akan membuat sub class dengan menggunakan syntac `extend` setelah nama sub class
- Sebelum itu buat file baru dengan nama `Manager.java` dan ketik kode tersebut


```
public class Manager extends Pegawai { 

}
```

- Lalu buat variabel tunjangan, Constructor, dan Getter. Karena kita menggunakan Constructor di super class Pegawai, kita perlu menambahkan syntax `super()` agar bisa diambil informasi dari Pegawai


```
double tunjangan;

public Manager(String nama, double gajiPokok, double tunjangan) {
	super(nama, gajiPokok);
	this.tunjangan = tunjangan;
}

public double getTunjangan() {
	return this.tunjangan; }
```

- Buat juga cetak info

```
public void cetakInfo() {
	System.out.println("Manager");
	super.cetakInfo();
	System.out.println("Tunjangan 	: " + getTunjangan() + "\n");
}
```

### Buat file Programmer sebagai subclass juga

- Setelah itu buat file baru dengan nama `Programmer.java`
- Lalu buat variabel bonus, Constructor, dan Getter

```
double bonus;

public Programmer(String nama, double gajiPokok, double bonus) {
	super(nama, gajiPokok);
	this.bonus = bonus;
}

public double getBonus() {
	return this.bonus; }
```

- Buat cetak info dan cetak bonus dengan cara yang sama dengan Manager

```
public void cetakInfo() {
	System.out.println("Programmer");
	super.cetakInfo();
	System.out.println("Bonus 		: " + getBonus() + "\n");
}
```

### Di dalam file `Utama.java`

- Tambahkan kode didalam `main()` dengan kode sebagai berikut, untuk menambahkan objek baru dari class constructor yang sudah dibuat dan juga jangan lupa isi datanya sekaligus di dalam `Manager()`
- Variabel andi sebagai Manager dan riko sebagai Programmer

```
Manager andi = new Manager("Andi",5_000_000,9_000_000);
Programmer riko = new Programmer("Riko",7_000_000,3_000_000);
```

### Cetak hasil koding

- Print hasil dengan menggunakan function `cetakInfo()`

```
andi.cetakInfo();
riko.cetakInfo();
```

- Save semua file
- Buka cmd (Command Prompt)
- Pergi menuju folder yang sudah dibuat dengan menggunakan `cd ...`
- Lalu eksekusi dengan mengetik `javac` lalu file yang akan di kompile yaitu `Utama.java`, `Pegawai.java`, `Manager.java`, dan `Programmer.java`.
- Jika berhasil dan tidak ada error, ketik

```
java Utama
```

- Tampilan nya akan seperti ini

```
Manager
Nama 		: Andi
Gaji Pokok 	: 5000000.0
Tunjangan 	: 9000000.0

Programmer
Nama 		: Riko
Gaji Pokok 	: 7000000.0
Bonus 		: 3000000.0
```

[Klik disini untuk melihat Hasil screenshot]()

___
Terima kasih telah mengikuti tutorial dari saya, kurang lebihnya mohon maaf.

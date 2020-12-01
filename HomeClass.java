import java.util.*;

public class HomeClass {
	private static String nama, nisn, kelas, semester, pramuka, kelakukan, kerajinan, kerapihan;
	private static int nilaiRapor, sakit, izin, alpa;
	private static int[] nilaiMapel = new int[10];
	private static String[] namaKelas = { "IA", "IB", "IIA", "IIB", "IIIA", "IIIB", "IVA", "IVB", "VA", "VB", "VIA", "VIB" };
	private static HashMap<String, String> akunGuru = new HashMap<String, String>();
	
	private static void main(String[] args) {
		akunGuru.put("guru1", "gurusatu");
		akunGuru.put("guru2", "gurudua");
		System.out.println("SELAMAT DATANG DI APLIKASI E-RAPOR");
		tampilkanMenuLoginGuru();
		//pilihKelas();
		//inputNilai();
	}
	
	/**
	 * Method ini akan menampilkan menu login guru
	 */
	private static void tampilkanMenuLoginGuru() {
		Scanner input = new Scanner(System.in);
		System.out.println("LOGIN Guru");
		System.out.print("Username: ");
		String username = input.next();
		System.out.print("Password: ");
		String password = input.next();
		if (checkLogin(username, password)) {
			System.out.println("");
			System.out.println("LOGIN Berhasil!");
			pilihKelas();
		}
		else
			tampilkanMenuLoginGuru();
		
	}
	
	/**
	 * Method ini akan memeriksa login dari username dan password
	 * @param username username yang dimasukkan
	 * @param password password yang dimasukkan
	 * @return true atau false
	 */
	private static boolean checkLogin(String username, String password) {
		if (akunGuru.containsKey(username)) {
			if(akunGuru.get(username).equals(password)) {
				return true;
			} else {
				System.out.println("Password salah!");
			}
		} else {
			System.out.println("Username tidak ada!");
		}
		return false;
	}
	
	/**
	 * Method ini akan menampilkan menu pilihan kelas
	 */
	private static void pilihKelas() {
		Scanner input = new Scanner(System.in);
		System.out.println("Pilih Kelas:");
		for (int i = 0; i < namaKelas.length; i++) {
			System.out.println(namaKelas[i]);
		}

		System.out.print("Pilihan: ");
		kelas = input.next();
		boolean isInputKelas = verifikasiInputKelas(kelas);

		while (isInputKelas == false) {
			System.out.println("Input Kelas Salah!");
			System.out.print("Pilihan:");
			kelas = input.next();
			isInputKelas = verifikasiInputKelas(kelas);
		}

		System.out.println("Pilih Semester:");
		System.out.println("I");
		System.out.println("II");
		System.out.print("Pilihan: ");
		semester = input.next();
		boolean isInputSemester = verifikasiInputSemester(semester);

		while (isInputSemester == false) {
			System.out.println("Input Semester Salah");
			System.out.print("Pilihan: ");
			semester = input.next();
			isInputSemester = verifikasiInputSemester(semester);
		}

		inputDataAnak();

	}

	/**
	 * Method ini akan melakukan verifikasi terhadap inputan kelas yang dimasukkan.
	 * 
	 * @param input nama kelas
	 * @return hasil true atau false
	 */
	private static boolean verifikasiInputKelas(String input) {
		for (int i = 0; i < namaKelas.length; i++) {
			if (input.equals(namaKelas[i]))
				return true;
		}
		return false;
	}

	/**
	 * Method ini akan melakukan verifikasi terhadap input semester yang dimasukkan.
	 * 
	 * @param input semester
	 * @return hasil true atau false
	 */
	private static boolean verifikasiInputSemester(String input) {
		if (input.equals("II"))
			return true;
		else if (input.equals("I"))
			return true;
		else
			return false;
	}

	/**
	 * Method ini akan melakukan verifikasi terhadap input Menu Lanjutan yang dimasukkan.
	 * 
	 * @param input semester
	 * @return hasil true atau false
	 */
	private static boolean verifikasiInputMenuLanjutan(String input) {
		if (input.equals("1"))
			return true;
		else if (input.equals("2"))
			return true;
		else
			return false;
	}
	
	/**
	 * Method ini akan melakukan verifikasi terhadap input Menu Lanjutan yang dimasukkan.
	 * 
	 * @param input semester
	 * @return hasil true atau false
	 */
	private static boolean verifikasiInputPilihanMataPelajaranAtauCekRapor(String input) {
		if (input.equals("1"))
			return true;
		else if (input.equals("2"))
			return true;
		else if (input.equals("3"))
			return true;
		else if (input.equals("4"))
			return true;
		else if (input.equals("5"))
			return true;
		else if (input.equals("6"))
			return true;
		else if (input.equals("7"))
			return true;
		else if (input.equals("8"))
			return true;
		else if (input.equals("9"))
			return true;
		else if (input.equals("10"))
			return true;
		else if (input.equals("11"))
			return true;
		else
			return false;
	}

	/**
	 * Method ini akan menampilkan menu untuk input data kelas dan melakukan verifikasi NISN
	 */
	private static void inputDataAnak() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nama Siswa: ");
		nama = input.nextLine();
		try {
			System.out.print("NISN: ");
			nisn = input.next();
			int nisnInt = Integer.parseInt(nisn);
			pilihMapel();
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Input NISN Salah!");
			System.out.println("");
			inputDataAnak();
		}

	}

	/**
	 * Method ini akan menampilkan menu pilihan mata pelajaran
	 */
	private static void pilihMapel() {
		System.out.println("");
		System.out.println("Pilih Mata Pelajaran / Cek Rapor:");
		System.out.println("1. Pendidikan Agama");
		System.out.println("2. Pendidikan Pancasila dan Kewarganegaraan");
		System.out.println("3. Bahasa Indonesia");
		System.out.println("4. Matematika");
		System.out.println("5. Ilmu Pengetahuan Alam");
		System.out.println("6. Ilmu Pengetahuan Sosial");
		System.out.println("7. Kerajinan Tangan dan Kesenian");
		System.out.println("8. Pendidikan Jasmani dan Kesehatan");
		System.out.println("9. Pendidikan Lingkungan dan Budaya Jakarta");
		System.out.println("10. Bahasa Inggris");
		System.out.println("11. Cek Nilai");

		Scanner input = new Scanner(System.in);
		System.out.print("Pilihan : ");
		String mapel = input.next();
		boolean isInputMapel = verifikasiInputPilihanMataPelajaranAtauCekRapor(mapel);
		while (isInputMapel == false) {
			System.out.println("Input Menu Salah!");
			System.out.print("Pilihan: ");
			mapel = input.next();
			isInputMapel = verifikasiInputPilihanMataPelajaranAtauCekRapor(mapel);
		}
		switch (mapel) {
		case "1":
			Agama();
			break;
		case "2":
			PPKN();
			break;
		case "3":
			BahasaIndonesia();
			break;
		case "4":
			Matematika();
			break;
		case "5":
			IPA();
			break;
		case "6":
			IPS();
			break;
		case "7":
			Kesenian();
			break;
		case "8":
			Penjaskes();
			break;
		case "9":
			PLBJ();
			break;
		case "10":
			BahasaIng();
			break;
		case "11":
			CekNilai();
			break;
		}
	}

	/**
	 * 10 Method di bawah ini akan melakukan input nilai akhir per-mata pelajaran
	 */
	private static void Agama() {
		nilaiMapel[0] = inputNilai();
		pilihMapel();
	}

	private static void PPKN() {
		nilaiMapel[1] = inputNilai();
		pilihMapel();
	}

	private static void BahasaIndonesia() {
		nilaiMapel[2] = inputNilai();
		pilihMapel();
	}

	private static void Matematika() {
		nilaiMapel[3] = inputNilai();
		pilihMapel();
	}

	private static void IPA() {
		nilaiMapel[4] = inputNilai();
		pilihMapel();
	}

	private static void IPS() {
		nilaiMapel[5] = inputNilai();
		pilihMapel();
	}

	private static void Kesenian() {
		nilaiMapel[6] = inputNilai();
		pilihMapel();
	}

	private static void Penjaskes() {
		nilaiMapel[7] = inputNilai();
		pilihMapel();
	}

	private static void PLBJ() {
		nilaiMapel[8] = inputNilai();
		pilihMapel();
	}

	private static void BahasaIng() {
		nilaiMapel[9] = inputNilai();
		pilihMapel();
	}
	
	/**
	 * Method ini akan melakukan input nilai per-atribut
	 */
	private static int inputNilai() {
		int[] nilai = new int[7];
		int nilaiAkhir = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai dari skala 0-100");
		try {
			System.out.print("Ulangan harian 1 : ");
			nilai[0] = input.nextInt();
			while(nilai[0] < 0 || nilai[0] > 100) {
				System.out.println("Nilai tidak sesuai!");
				System.out.print("Ulangan harian 1 : ");
				nilai[0] = input.nextInt();
	        }
			System.out.print("Ulangan harian 2 : ");
			nilai[1] = input.nextInt();
			while(nilai[1] < 0 || nilai[1] > 100) {
				System.out.println("Nilai tidak sesuai!");
				System.out.print("Ulangan harian 2 : ");
				nilai[1] = input.nextInt();
	        }
			System.out.print("Ulangan harian 3 : ");
			nilai[2] = input.nextInt();
			while(nilai[2] < 0 || nilai[2] > 100) {
				System.out.println("Nilai tidak sesuai!");
				System.out.print("Ulangan harian 3 : ");
				nilai[2] = input.nextInt();
	        }
			System.out.print("Ulangan harian 4 : ");
			nilai[3] = input.nextInt();
			while(nilai[3] < 0 || nilai[3] > 100) {
				System.out.println("Nilai tidak sesuai!");
				System.out.print("Ulangan harian 4 : ");
				nilai[3] = input.nextInt();
	        }
			System.out.print("Akumulasi Nilai Tugas : ");
			nilai[4] = input.nextInt();
			while(nilai[4] < 0 || nilai[4] > 100) {
				System.out.println("Nilai tidak sesuai!");
				System.out.print("Akumulasi Nilai Tugas : ");
				nilai[4] = input.nextInt();
	        }
			System.out.print("Ulangan Tengah Semester : ");
			nilai[5] = input.nextInt();
			while(nilai[5] < 0 || nilai[5] > 100) {
				System.out.println("Nilai tidak sesuai!");
				System.out.print("Ulangan Tengah Semester : ");
				nilai[5] = input.nextInt();
	        }
			System.out.print("Ulangan Akhir Semester : ");
			nilai[6] = input.nextInt();
			while(nilai[6] < 0 || nilai[6] > 100) {
				System.out.println("Nilai tidak sesuai!");
				System.out.print("Ulangan A Semester : ");
				nilai[6] = input.nextInt();
	        }
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Input Salah!");
			System.out.println("Silakan ulangi Input!");
			System.out.println("");
			inputNilai();
		}
		nilaiAkhir = (nilai[0] + nilai[1] + nilai[2] + nilai[3] + nilai[4] + nilai[5] + nilai[6]) / 7;
		return nilaiAkhir;
	}

	
	/**
	 * Method ini akan menghitung nilai akhir rapor
	 */
	private static int RataRapor() {
		int nilaiRapor = (nilaiMapel[0] + nilaiMapel[1] + nilaiMapel[2] + nilaiMapel[3] + nilaiMapel[4] + nilaiMapel[5]
				+ nilaiMapel[6] + nilaiMapel[7] + nilaiMapel[8] + nilaiMapel[9]) / 10;
		return nilaiRapor;
	}
	
	/**
	 * Method ini akan menampilkan hasil inputan nilai rapor
	 */
	private static void CekNilai() {
		int nilaiRaporSementara = RataRapor();
		System.out.println("Laporan Hasil Belajar Siswa");
		System.out.println("========================================================");
		System.out.println("Nama Siswa : " + nama);
		System.out.println("NISN	   : " + nisn);
		System.out.println("Kelas      : " + kelas);
		System.out.println("Semester   : " + semester);
		System.out.println("*********************************************************");
		System.out.println("Pendidikan Agama: " + nilaiMapel[0]);
		System.out.println("Pendidikan Pancasila dan Kewarganegaraan: " + nilaiMapel[1]);
		System.out.println("Bahasa Indonesia: " + nilaiMapel[2]);
		System.out.println("Matematika: " + nilaiMapel[3]);
		System.out.println("Ilmu Pengetahuan Alam: " + nilaiMapel[4]);
		System.out.println("Ilmu Pengetahuan Sosial: " + nilaiMapel[5]);
		System.out.println("Kerajinan Tangan dan Kesenian: " + nilaiMapel[6]);
		System.out.println("Pendidikan Jasmani dan Kesehatan: " + nilaiMapel[7]);
		System.out.println("Pendidikan Lingkungan dan Budaya Jakarta: " + nilaiMapel[8]);
		System.out.println("Bahasa Inggris: " + nilaiMapel[9]);
		System.out.println("*********************************************************");
		System.out.println("Nilai Akhir Rapor: " + nilaiRaporSementara);
		System.out.println("========================================================");

		System.out.println("Ubah Nilai / Lanjut:");
		System.out.println("1. Ubah Nilai");
		System.out.println("2. Lanjut");

		Scanner input = new Scanner(System.in);
		System.out.print("Pilihan : ");
		String pilihan = input.next();
		
		boolean isInputNilaiLanjut = verifikasiInputMenuLanjutan(pilihan);
		while (isInputNilaiLanjut == false) {
			System.out.println("Input salah!");
			System.out.print("Pilihan: ");
			pilihan = input.next();
			isInputNilaiLanjut = verifikasiInputMenuLanjutan(pilihan);
		}
		
		switch (pilihan) {
		case "1":
			pilihMapel();
			break;
		case "2":
			nilaiRapor = nilaiRaporSementara;
			inputNilaiEkskul();
			break;
		}
	}
	
	/**
	 * Method ini akan menampilkan menu input nilai ekskul dan melakukan verifikasi nilai ekskul
	 */
	private static void inputNilaiEkskul() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nilai Pramuka(A-D): ");
		String pilihan = input.next();
		if (pilihan.equalsIgnoreCase("A")) {
			pramuka = "A";
		} else if (pilihan.equalsIgnoreCase("B")) {
			pramuka = "B";
		} else if (pilihan.equalsIgnoreCase("C")) {
			pramuka = "C";
		} else if (pilihan.equalsIgnoreCase("D")) {
			pramuka = "D";
		} else {
			System.out.println("Input Salah");
			inputNilaiEkskul();
		}
		inputNilaiSikap();
	}
	
	/**
	 * Method ini akan menampilkan menu input nilai sikap
	 */
	private static void inputNilaiSikap() {
		Scanner input = new Scanner(System.in);
		System.out.print("Kelakuan(A-D)	: ");
		String sikap1 = input.next();
		kelakukan = cekNilaiSikap(sikap1);
		System.out.print("Kerajinan(A-D)	: ");
		String sikap2 = input.next();
		kerajinan = cekNilaiSikap(sikap2);
		System.out.print("Kerapihan(A-D)	: ");
		String sikap3 = input.next();
		kerapihan = cekNilaiSikap(sikap2);

		inputAbsen();

	}
	
	/**
	 * Method ini akan melakukan verifikasi nilai sikap
	 * 
	 * @param input nilai sikap
	 * @return nilai sikap
	 */
	private static String cekNilaiSikap(String A) {
		String nilaiABCD = "";
		if (A.equalsIgnoreCase("A")) {
			nilaiABCD = "A";
		} else if (A.equalsIgnoreCase("B")) {
			nilaiABCD = "B";
		} else if (A.equalsIgnoreCase("C")) {
			nilaiABCD = "C";
		} else if (A.equalsIgnoreCase("D")) {
			nilaiABCD = "D";
		} else {
			System.out.println("Input Salah");
			inputNilaiSikap();
		}
		return nilaiABCD;
	}

	
	/**
	 * Method ini akan menampilkan menu input data kehadiran/absen
	 */
	private static void inputAbsen() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Sakit: ");
			sakit = input.nextInt();
			System.out.print("Izin: ");
			izin = input.nextInt();
			System.out.print("Tanpa Keterangan: ");
			izin = input.nextInt();
			cetakRapor();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Input salah!");
			System.out.println("Silakan ulangin Input!");
			System.out.println("");
			inputAbsen();
		}
		

	}

	
	/**
	 * Method ini akan menampilkan keseluruhan rapor siap cetak
	 */
	private static void cetakRapor() {

		System.out.println("LAPORAN HASIL BELAJAR SISWA");
		System.out.println("========================================================");
		System.out.println("Nama Siswa : " + nama);
		System.out.println("NISN	   : " + nisn);
		System.out.println("Kelas      : " + kelas);
		System.out.println("Semester   : " + semester);
		System.out.println("*********************************************************");
		System.out.println("Pendidikan Agama: " + nilaiMapel[0]);
		System.out.println("Pendidikan Pancasila dan Kewarganegaraan: " + nilaiMapel[1]);
		System.out.println("Bahasa Indonesia: " + nilaiMapel[2]);
		System.out.println("Matematika: " + nilaiMapel[3]);
		System.out.println("Ilmu Pengetahuan Alam: " + nilaiMapel[4]);
		System.out.println("Ilmu Pengetahuan Sosial: " + nilaiMapel[5]);
		System.out.println("Kerajinan Tangan dan Kesenian: " + nilaiMapel[6]);
		System.out.println("Pendidikan Jasmani dan Kesehatan: " + nilaiMapel[7]);
		System.out.println("Pendidikan Lingkungan dan Budaya Jakarta: " + nilaiMapel[8]);
		System.out.println("Bahasa Inggris: " + nilaiMapel[9]);
		System.out.println("*********************************************************");
		System.out.println("Nilai Akhir Rapor: " + nilaiRapor);
		System.out.println("========================================================");
		System.out.println("Ekstrakulikuler");
		System.out.println("Pramuka			: " + pramuka);
		System.out.println("========================================================");
		System.out.println("Nilai Sikap");
		System.out.println("Kelakuan  (A-D)	: " + kelakukan);
		System.out.println("Kerajinan (A-D)	: " + kerajinan);
		System.out.println("Kerapihan (A-D)	: " + kerapihan);
		System.out.println("========================================================");
		System.out.println("Kehadiran");
		System.out.println("Sakit: " + sakit);
		System.out.println("Izin: " + izin);
		System.out.println("Tanpa Keterangan: " + alpa);
		System.out.println("========================================================");
	}

}

import java.util.*;
public class HomeClass {
	static String nama, nisn, kelas, semester, pramuka, kelakukan, kerajinan, kerapihan;
	static int mapel, nilaiRapor, sakit, izin, alpa;
	static int[] nilaiMapel	= new int[10];
	
	public static void main(String[] args) {
		System.out.println("SELAMAT DATANG DI APLIKASI E-RAPOR");
		pilihKelas();
	}
	public static void pilihKelas(){
		Scanner input = new Scanner(System.in);
		System.out.println("Pilih Kelas:");
		System.out.println("IA");
		System.out.println("IB");
		System.out.println("IIA");
		System.out.println("IIB");
		System.out.println("IIIA");
		System.out.println("IIIB");
		System.out.println("IVA");
		System.out.println("IVB");
		System.out.println("VA");
		System.out.println("VB");
		System.out.println("VIA");
		System.out.println("VIB");
		
		System.out.println("Pilihan:");
		kelas = input.next();
		
		System.out.println("Pilih Semester:");
		System.out.println("I");
		System.out.println("II");
		System.out.println("Pilihan:");
		semester = input.next();
		
		inputDataAnak();
		
	}
	
	public static void inputDataAnak(){
		Scanner input = new Scanner(System.in);
		System.out.println("Nama Anak : ");
		nama = input.nextLine();
		System.out.println("NISN : ");
		nisn = input.next();
		pilihMapel();
	}
	
	
	
	public static void pilihMapel() {
		
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
		System.out.println("Pilihan : ");
		mapel = input.nextInt();
		
		switch(mapel){
			case 1:
				Agama();
				break;
			case 2:
				PPKN();
				break;
			case 3:
				BahasaIndonesia();
				break;
			case 4:
				Matematika();
				break;
			case 5:
				IPA();
				break;
			case 6:
				IPS();
				break;
			case 7:
				Kesenian();
				break;
			case 8:
				Penjaskes();
				break;
			case 9:
				PLBJ();
				break;
			case 10:
				BahasaIng();
				break;
			case 11:
				CekNilai();
				break;
			default:
				System.out.println("Input Salah");
				pilihMapel();
		}
	}
	
	public static void Agama() {
		nilaiMapel[0] = inputNilai();
		pilihMapel();
	}
	public static void PPKN() {
		nilaiMapel[1] = inputNilai();
		pilihMapel();
	}
	public static void BahasaIndonesia() {
		nilaiMapel[2] = inputNilai();
		pilihMapel();
	}
	public static void Matematika() {
		nilaiMapel[3] = inputNilai();
		pilihMapel();
	}
	public static void IPA() {
		nilaiMapel[4] = inputNilai();
		pilihMapel();
	}
	public static void IPS() {
		nilaiMapel[5] = inputNilai();
		pilihMapel();
	}
	public static void Kesenian() {
		nilaiMapel[6] = inputNilai();
		pilihMapel();
	}
	public static void Penjaskes() {
		nilaiMapel[7] = inputNilai();
		pilihMapel();
	}
	public static void PLBJ() {
		nilaiMapel[8] = inputNilai();
		pilihMapel();
	}
	public static void BahasaIng() {
		nilaiMapel[9] = inputNilai();
		pilihMapel();
	}
	public static int inputNilai() {
		int[] nilai	= new int[7];
		int nilaiAkhir = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Ulangan harian 1 : ");
		nilai[0] = input.nextInt();
		System.out.println("Ulangan harian 2 : ");
		nilai[1] = input.nextInt();
		System.out.println("Ulangan harian 3 : ");
		nilai[2] = input.nextInt();
		System.out.println("Ulangan harian 4 : ");
		nilai[3] = input.nextInt();
		System.out.println("Akumulasi Nilai Tugas : ");
		nilai[4] = input.nextInt();
		System.out.println("Ulangan Tengah Semester : ");
		nilai[5] = input.nextInt();
		System.out.println("Ulangan Akhir Semester : ");
		nilai[6] = input.nextInt();
		nilaiAkhir = (nilai[0]+nilai[1]+nilai[2]+nilai[3]+nilai[4]+nilai[5]+nilai[6])/7;
		return nilaiAkhir;
	}
	public static int RataRapor() {
		int nilaiRapor = (nilaiMapel[0]+nilaiMapel[1]+nilaiMapel[2]+nilaiMapel[3]+nilaiMapel[4]+
					nilaiMapel[5]+nilaiMapel[6]+nilaiMapel[7]+nilaiMapel[8]+nilaiMapel[9])/10;
		return nilaiRapor;
	}
	public static void CekNilai() {
		int nilaiRaporSementara = RataRapor();
		System.out.println("Laporan Hasil Belajar Siswa");
		System.out.println("========================================================");
		System.out.println("Nama Siswa : " + nama);
		System.out.println("NISN	   : " + nisn);
		System.out.println("Kelas      : "+ kelas);
		System.out.println("Semester   : " + semester);
		System.out.println("*********************************************************");
		System.out.println("Pendidikan Agama						 	: " + nilaiMapel[0]);
		System.out.println("Pendidikan Pancasila dan Kewarganegaraan	: " + nilaiMapel[1]);
		System.out.println("Bahasa Indonesia							: " + nilaiMapel[2]);
		System.out.println("Matematika									: " + nilaiMapel[3]);
		System.out.println("Ilmu Pengetahuan Alam						: " + nilaiMapel[4]);
		System.out.println("Ilmu Pengetahuan Sosial						: " + nilaiMapel[5]);
		System.out.println("Kerajinan Tangan dan Kesenian				: " + nilaiMapel[6]);
		System.out.println("Pendidikan Jasmani dan Kesehatan			: " + nilaiMapel[7]);
		System.out.println("Pendidikan Lingkungan dan Budaya Jakarta	: " + nilaiMapel[8]);
		System.out.println("Bahasa Inggris								: " + nilaiMapel[9]);
		System.out.println("*********************************************************");
		System.out.println("Nilai Akhir Rapor 							: " + nilaiRaporSementara);
		System.out.println("========================================================");
		
		
		System.out.println("Ubah Nilai / Lanjut:");
		System.out.println("1. Ubah Nilai");
		System.out.println("2. Lanjut");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Pilihan : ");
		int pilihan = input.nextInt();
		
		switch(pilihan){
			case 1:
				pilihMapel();
				break;
			case 2:
				nilaiRapor = nilaiRaporSementara;
				inputNilaiEkskul();
				break;
		}
	}
	public static void inputNilaiEkskul() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nilai Pramuka(A-D): ");
		String pilihan = input.next();
		if(pilihan.equalsIgnoreCase("A")) {
			pramuka = "A";
		}
		else if(pilihan.equalsIgnoreCase("B")) {
			pramuka = "B";
		}
		else if(pilihan.equalsIgnoreCase("C")) {
			pramuka = "C";
		}
		else if(pilihan.equalsIgnoreCase("D")) {
			pramuka = "D";
		}
		else {
			System.out.println("Input Salah");
			inputNilaiEkskul();
		}
		inputNilaiSikap();	
	}
	
	public static void inputNilaiSikap() {
		Scanner input = new Scanner(System.in);
		System.out.println("Kelakuan(A-D)	: ");
		String sikap1 = input.next();
		kelakukan = cekNilaiSikap(sikap1);
		System.out.println("Kerajinan(A-D)	: ");
		String sikap2 = input.next();
		kerajinan = cekNilaiSikap(sikap2);
		System.out.println("Kerapihan(A-D)	: ");
		String sikap3 = input.next();
		kerapihan = cekNilaiSikap(sikap2);
		
		inputAbsen();
		
	}
	
	public static String cekNilaiSikap(String A) {
		String nilaiABCD = "";
		if(A.equalsIgnoreCase("A")) {
			nilaiABCD = "A";
		}
		else if(A.equalsIgnoreCase("B")) {
			nilaiABCD = "B";
		}
		else if(A.equalsIgnoreCase("C")) {
			nilaiABCD = "C";
		}
		else if(A.equalsIgnoreCase("D")) {
			nilaiABCD = "D";
		}
		else {
			System.out.println("Input Salah");
			inputNilaiSikap();
		}
		return nilaiABCD;
	}
	
	public static void inputAbsen() {
		Scanner input = new Scanner(System.in);
		System.out.println("Sakit				: ");
		sakit = input.nextInt();
		System.out.println("Izin				: ");
		izin = input.nextInt();
		System.out.println("Tanpa Keterangan	: ");
		izin = input.nextInt();
		
		cetakRapor();
	
	}
	public static void cetakRapor() {
		
		System.out.println("LAPORAN HASIL BELAJAR SISWA");
		System.out.println("========================================================");
		System.out.println("Nama Siswa : " + nama);
		System.out.println("NISN	   : " + nisn);
		System.out.println("Kelas      : "+ kelas);
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

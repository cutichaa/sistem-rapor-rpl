import java.util.*;

public class Erapot{
	static String nama;
	static String kelas;
	int pilihmatpel = 0;
	static int[] nilaimat	= new int[10];
	static int[] nilaiipa = new int[10];
	static int[] nilaiips = new int[10];
	static int[] nilaibhs = new int[10];
	static int[] nilaiagama  = new int[10];
	static int mathhasil, ipahasil, ipshasil, bhshasil, agamahasil = 0;
	Scanner input2 = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);
	


	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("");	
		Erapot calling = new Erapot();

		System.out.println("Selamat Datang di Aplikasi e rapot");
		System.out.println("Nama Anak : ");
		nama = input1.nextLine();
		System.out.println("Kelas : ");
		kelas = input1.next();

		calling.pilihamatpel();
		
		
	}
	public void pilihamatpel(){
		System.out.println("pilih Mata Pelajaran yang akan diinput");
		System.out.println("1. Matematika");
		System.out.println("2. IPA");
		System.out.println("3. IPS");
		System.out.println("4. Bahasa Indonesia");
		System.out.println("5. Agama");
		System.out.println("6. Hasil Rapot");
		pilihmatpel = input2.nextInt();
		Erapot calling = new Erapot();
		if(pilihmatpel == 1){
		calling.matematika();
		}else if(pilihmatpel == 2){
		calling.ipa();
		}else if(pilihmatpel == 3){
		calling.ips();
		}else if(pilihmatpel == 4){
		calling.bahasa();
		}else if(pilihmatpel == 5){
		calling.agama();
		}
		else if(pilihmatpel == 6){
		calling.hasilrapot();
		}
	}
	public static void matematika(){
		System.out.println("Ulangan harian 1 : ");
		nilaimat[0] = input.nextInt();
		System.out.println("Ulangan harian 2 : ");
		nilaimat[1] = input.nextInt();
		System.out.println("Ulangan harian 3 : ");
		nilaimat[2] = input.nextInt();
		System.out.println("Ulangan harian 4 : ");
		nilaimat[3] = input.nextInt();
		System.out.println("Akumulasi Nilai Tugas : ");
		nilaimat[4] = input.nextInt();
		System.out.println("Ulangan Tengah Semester : ");
		nilaimat[5] = input.nextInt();
		System.out.println("Ulangan Akhir Semester : ");
		nilaimat[6] = input.nextInt();
		Erapot calling = new Erapot();
		calling.hasilmat();
		calling.pilihamatpel();
		
	}
	public static void hasilmat(){
		mathhasil = (nilaimat[0] + nilaimat[1] + nilaimat[2] + nilaimat[3] + nilaimat[4] + nilaimat[5] + nilaimat[6]) /7;
		

	}
	public static void ipa(){
		System.out.println("Ulangan harian 1 : ");
		nilaiipa[0] = input.nextInt();
		System.out.println("Ulangan harian 2 : ");
		nilaiipa[1] = input.nextInt();
		System.out.println("Ulangan harian 3 : ");
		nilaiipa[2] = input.nextInt();
		System.out.println("Ulangan harian 4 : ");
		nilaiipa[3] = input.nextInt();
		System.out.println("Akumulasi Nilai Tugas : ");
		nilaiipa[4] = input.nextInt();
		System.out.println("Ulangan Tengah Semester : ");
		nilaiipa[5] = input.nextInt();
		System.out.println("Ulangan Akhir Semester : ");
		nilaiipa[6] = input.nextInt();
		Erapot calling = new Erapot();
		calling.hasilipa();
		calling.pilihamatpel();
		
		
	}
	public static void hasilipa(){
		ipahasil = (nilaiipa[0] + nilaiipa[1] + nilaiipa[2] + nilaiipa[3] + nilaiipa[4] + nilaiipa[5] + nilaiipa[6]) /7;
		

	}
	public static void bahasa(){
		System.out.println("Ulangan harian 1 : ");
		nilaibhs[0] = input.nextInt();
		System.out.println("Ulangan harian 2 : ");
		nilaibhs[1] = input.nextInt();
		System.out.println("Ulangan harian 3 : ");
		nilaibhs[2] = input.nextInt();
		System.out.println("Ulangan harian 4 : ");
		nilaibhs[3] = input.nextInt();
		System.out.println("Akumulasi Nilai Tugas : ");
		nilaibhs[4] = input.nextInt();
		System.out.println("Ulangan Tengah Semester : ");
		nilaibhs[5] = input.nextInt();
		System.out.println("Ulangan Akhir Semester : ");
		nilaibhs[6] = input.nextInt();
		Erapot calling = new Erapot();
		calling.hasilbhs();
		calling.pilihamatpel();
		
	}
	public static void hasilbhs(){
		bhshasil = (nilaibhs[0] + nilaibhs[1] + nilaibhs[2] + nilaibhs[3] + nilaibhs[4] + nilaibhs[5] + nilaibhs[6]) /7;

		

	}
	public static void ips(){
		System.out.println("Ulangan harian 1 : ");
		nilaiips[0] = input.nextInt();
		System.out.println("Ulangan harian 2 : ");
		nilaiips[1] = input.nextInt();
		System.out.println("Ulangan harian 3 : ");
		nilaiips[2] = input.nextInt();
		System.out.println("Ulangan harian 4 : ");
		nilaiips[3] = input.nextInt();
		System.out.println("Akumulasi Nilai Tugas : ");
		nilaiips[4] = input.nextInt();
		System.out.println("Ulangan Tengah Semester : ");
		nilaiips[5] = input.nextInt();
		System.out.println("Ulangan Akhir Semester : ");
		nilaiips[6] = input.nextInt();
		Erapot calling = new Erapot();
		calling.hasilips();
		calling.pilihamatpel();
		
		
	}
	public static void hasilips(){
		ipshasil = (nilaiips[0] + nilaiips[1] + nilaiips[2] + nilaiips[3] + nilaiips[4] + nilaiips[5] + nilaiips[6]) /7;
		
		

	}
	public static void agama(){
		System.out.println("Ulangan harian 1 : ");
		nilaiagama[0] = input.nextInt();
		System.out.println("Ulangan harian 2 : ");
		nilaiagama[1] = input.nextInt();
		System.out.println("Ulangan harian 3 : ");
		nilaiagama[2] = input.nextInt();
		System.out.println("Ulangan harian 4 : ");
		nilaiagama[3] = input.nextInt();
		System.out.println("Akumulasi Nilai Tugas : ");
		nilaiagama[4] = input.nextInt();
		System.out.println("Ulangan Tengah Semester : ");
		nilaiagama[5] = input.nextInt();
		System.out.println("Ulangan Akhir Semester : ");
		nilaiagama[6] = input.nextInt();
		Erapot calling = new Erapot();
		calling.hasilagama();
		calling.pilihamatpel();
		
		
	}
	public static void hasilagama(){
		agamahasil = (nilaiagama[0] + nilaiagama[1] + nilaiagama[2] + nilaiagama[3] + nilaiagama[4] + nilaiagama[5] + nilaiagama[6]) /7;
		

	}
	public void hasilrapot(){
		Erapot calling = new Erapot();
		System.out.println("Laporan Hasil Belajar Siswa");
		System.out.println("TAHUN AJARAN 2020 - 2021");
		System.out.println("=================================");
		System.out.println("Nama Siswa : " + nama);
		System.out.println("Kelas      : "+ kelas);
		System.out.println("*********************************");
		System.out.println("Matematika : " + mathhasil);
		System.out.println("IPA : " + ipahasil);
		System.out.println("IPS : " + ipshasil);
		System.out.println("Bahasa Indonesia : " + bhshasil);
		System.out.println("Agama : " + agamahasil);
		

		
	}
}
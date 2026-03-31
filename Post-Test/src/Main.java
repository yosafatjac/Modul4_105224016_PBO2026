
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Pendaftaran Akun DuitKu ===");
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine(); 
        
        System.out.print("Masukkan Nomor Ponsel Aktif: ");
        String noHp = input.nextLine(); 
        
        DuitKu akunBaru = new DuitKu(nama, noHp);
        System.out.println("Akun atas nama " + akunBaru.namaLengkap + " berhasil dibuat!");
        System.out.println("-----------------------------------------");

        System.out.print("Masukkan nominal setoran pertama: Rp ");
        double setor1 = input.nextDouble(); 
        akunBaru.setorDana(setor1);
        System.out.println("-----------------------------------------");

        System.out.print("Masukkan nominal tagihan listrik: Rp ");
        double tagihan = input.nextDouble(); 
        akunBaru.lunasiTagihan(tagihan);
        System.out.println("-----------------------------------------");

        System.out.print("Masukkan nominal setoran kedua: Rp ");
        double setor2 = input.nextDouble(); 
        akunBaru.setorDana(setor2);
        System.out.println("-----------------------------------------");

        System.out.println("Mencoba melunasi tagihan listrik kembali...");
        akunBaru.lunasiTagihan(tagihan);
        System.out.println("-----------------------------------------");

        akunBaru.tampilkanSisaUang();

        input.close();
    }
}

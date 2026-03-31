
public class DuitKu {
    
    String namaLengkap;
    String nomorPonsel;
    double saldo;

    public DuitKu(String namaLengkap, String nomorPonsel) {
        this.namaLengkap = namaLengkap;
        this.nomorPonsel = nomorPonsel;
        this.saldo = 0; 
    }
    public void setorDana(double nominal) {

        if (nominal < 10000) {
            
            System.out.println("[PERINGATAN KERAS] Transaksi diblokir! Minimum setoran adalah Rp 10.000.");
        } else {
            
            this.saldo += nominal;
            System.out.println("[RESI] Setoran Rp " + nominal + " berhasil. Saldo saat ini: Rp " + this.saldo);
        }
    }

    public void lunasiTagihan(double nominalTagihan) {
        System.out.println("Memproses tagihan sebesar Rp " + nominalTagihan + "...");
        
        
        if (this.saldo >= nominalTagihan) {
            
            this.saldo -= nominalTagihan; 
            System.out.println("[BERHASIL] Tagihan lunas! Saldo Anda terpotong.");
        } else {
            
            System.out.println("[GAGAL MUTLAK] Dana tidak mencukupi! Transaksi dibatalkan tanpa memotong sepeser pun.");
        }
    }

    public void tampilkanSisaUang() {
        System.out.println("Sisa uang " + this.namaLengkap + " paling akurat di sistem: Rp " + this.saldo);
    }
}

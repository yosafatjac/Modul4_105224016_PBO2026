public class MesinKopi {
    
   
    int bijiKopi; 
    int air;      
    int susu;     

    
    public MesinKopi() {
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
    }

    
    public void isiUlangBahan(int tambahKopi, int tambahAir, int tambahSusu) {
        this.bijiKopi += tambahKopi;
        this.air += tambahAir;
        this.susu += tambahSusu;
        
        
        System.out.println("Bahan baku berhasil diisi ulang!");
    }

    
    public void cekKetersediaanCappuccino() {
        
        if (this.bijiKopi >= 15 && this.air >= 50 && this.susu >= 100) {
            
            System.out.println("Bisa! Bahan mencukupi untuk membuat Cappuccino.");
        } else {
            
            System.out.println("Tidak bisa! Bahan belum mencukupi untuk membuat Cappuccino.");
        }
    }
}


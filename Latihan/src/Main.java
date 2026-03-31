
public class Main {
    public static void main(String[] args) {
        
     
        MesinKopi mesinLobby = new MesinKopi();
        
       
        System.out.println("Status awal mesin kopi:");
        
      
        mesinLobby.cekKetersediaanCappuccino();
        
        
        System.out.println("\nmengisi ulang bahan baku");
        

        mesinLobby.isiUlangBahan(50, 100, 200); 


        System.out.println("\nStatus setelah isi ulang:");
        
        mesinLobby.cekKetersediaanCappuccino();
    }
}

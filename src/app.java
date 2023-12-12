import java.util.Scanner;

public class app {
    
    public static void main(String[] args) {
        
        try {
            penjualan x = new penjualan();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nama Pelanggan : ");
            String namaPelanggan = scanner.nextLine();
            System.out.print("Alamat         : ");
            String alamatPelanggan = scanner.nextLine();
            String namaKasir = "Yala";
            x.aA(namaPelanggan, alamatPelanggan, namaKasir);

            System.out.print("Kode Barang    : ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Jumlah Beli    : ");
            int jumlahBeli = scanner.nextInt();
            x.bB(kodeBarang, jumlahBeli);
            System.out.println(" ");

            x.aAA();
            x.bBB();

            scanner.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

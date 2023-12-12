public class pelanggan implements IniSupermarket {
    public String namaPelanggan;
    public String alamat;
    public String kasir;

    public void aA (String namaPelanggan, String alamat, String kasir){
        this.namaPelanggan = namaPelanggan;
        this.alamat = alamat;
        this.kasir = kasir;
    }

    public void aAA(){
        System.out.println("     IniSupermarket     ");
        System.out.println("==============================\t");
        System.out.println("DATA PELANGGAN");
        System.out.println("------------------------------\t");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Alamat         : " + alamat);
        System.out.println("++++++++++++++++++++++++++++++\t");
    }
}

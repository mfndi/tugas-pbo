import ProdukController.*;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App{
    public static void main(String[] args) throws Exception {
        BufferedReader cliScreen = new BufferedReader(new InputStreamReader(System.in));
        

        System.out.print("Masukan Nama Produk : ");
        String nama = cliScreen.readLine();

        System.out.print("Masukan Harga Produk : ");
        int harga = Integer.parseInt(cliScreen.readLine());

         System.out.print("Masukan Nama Tanggal : ");
        String tanggal = cliScreen.readLine();

        Produk produk = new Produk();
        produk.namaProduk = nama;
        produk.setHarga(harga);
        produk.setTanggal(tanggal);
        produk.setCode();

        System.out.println("========== Detail ==========");
        System.out.println("Nama Produk : " + produk.namaProduk);
        System.out.println("Harga Produk : " + produk.getHarga());
        System.out.println("Tanggal Produk : " + produk.getTanggal());
        System.out.println("Code Produk : " + produk.getCode());
        


        cliScreen.close();
    }
}

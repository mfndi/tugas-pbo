package ProdukController;   

import java.util.Random;

public class Produk {
     public String namaProduk;
     protected int hargaProduk;
     private String codeProduk;
     String tanggalPembuatan;


    public void setCode(){
        int length = 20;

        String characters = "0123456789";
        StringBuilder randomString = new StringBuilder();

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            randomString.append(randomChar);
        }

        this.codeProduk = randomString.toString();
    }

    public String getCode(){
        return this.codeProduk;
    }

    public void setHarga(int harga){
        this.hargaProduk = harga;
    }

    public int getHarga(){
        return this.hargaProduk;
    }


    public void setTanggal(String tanggal){
        this.tanggalPembuatan = tanggal;
    }

    public String getTanggal(){
        return this.tanggalPembuatan;
    }

}



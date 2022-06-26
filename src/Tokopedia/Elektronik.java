package Tokopedia;
import java.util.Scanner;
//Superclass
//Menggunakan Konsep Inheritance dan Konsep Constructor
public class Elektronik {
    Scanner scanner = new Scanner(System.in);
    public String NamaBarang, Barang1, Barang2;
    public int harga,jumlahProduk, pakai, DiskonBarang;
    public int BiayaOngkir, DiskonOngkir,pilihDiskon, hargaBarang1, hargaBarang2;
    public  String pembeli,alamat,pos,tlpn, NamaKurir;
    Scanner isi = new Scanner(System.in);
    
    //Constructor
    public Elektronik(String Barang1, String Barang2,int hargaBarang1,int hargaBarang2){
        //penggunaan this
        this.Barang1=Barang1; this.Barang2=Barang2; 
        this.hargaBarang1=hargaBarang1; this.hargaBarang2=hargaBarang2;
    }
//Method    
public void pilihFitur(){
    int beli;
    System.out.println("*ELEKTRONIK");
    System.out.println("1. " +Barang1+ " | Rp "+hargaBarang1);
    System.out.println("2. " +Barang2+ " | Rp "+hargaBarang2);
    System.out.print("Kamu mau beli apa : ");
    beli = scanner.nextInt();
    //seleksi kondisi switch case
    switch (beli){
case 1 : 
NamaBarang = Barang1; harga=hargaBarang1;
break;
case 2:
NamaBarang = Barang2; harga=hargaBarang2;
break;
}
}
//Method
public void PilihKurir(){
    System.out.println("");
    System.out.println("*Jasa Pengiriman*");
    System.out.println("Pilih jasa pengiriman");
    System.out.println("1. JNE regular");
    System.out.println("2. SiCepat REG");
    System.out.println("3. J&T Express");
    System.out.println("4. Ninja Xpress");
    System.out.println("5. ID Express");
          System.out.print("Input pilihanmu : ");
          int kurir= scanner.nextInt();
          //seleksi kondisi switch case
                    switch (kurir){
              case 1 :
                  NamaKurir = "JNE regular"; BiayaOngkir = 50000;
                  break;
              case 2 :
                  NamaKurir = "SiCepat REG"; BiayaOngkir = 40000;
                  break;
              case 3:
                  NamaKurir = "J&T Express"; BiayaOngkir= 60000;
                  break;
              case 4:
                  NamaKurir = "Ninja Xpress"; BiayaOngkir = 50000;
                  break;
              case 5:
                  NamaKurir = "JNE regular"; BiayaOngkir = 40000;
                  break;
                    }
}
//Method
public void VoucherOngkirDiskon(){
    //Voucher GratisOngkir
    int pilihGratisOngkir;
    System.out.println("");
    System.out.println("*Gratis Ongkir*"); 
    System.out.println("Pilih voucher Gratis ongkir kamu");
    System.out.println("1. Gratis ongkir 10%");
    System.out.println("2. Gratis ongkir 20%");
    System.out.println("3. Gratis ongkir 30%");
    System.out.println("4. Gratis ongkir 40%");
    System.out.println("5. Gratis ongkir 50%");
    System.out.print("Input Pilihanmu : ");
    pilihGratisOngkir=isi.nextInt();
    //seleksi kondisi if else if
    if (pilihGratisOngkir==1){
    DiskonOngkir=BiayaOngkir*10/100;
    
    }
    else if (pilihGratisOngkir==2){
    DiskonOngkir=BiayaOngkir*20/100;
 
    }
    else if (pilihGratisOngkir==3){
    DiskonOngkir=BiayaOngkir*30/100;
    }
    else if (pilihGratisOngkir==4){
    DiskonOngkir=BiayaOngkir*40/100;   
    }
    else if (pilihGratisOngkir==5){
    DiskonOngkir=BiayaOngkir*50/100; 
    }
    
    //Voucher Diskon dan Cashback
    System.out.println("");
    System.out.println("*Voucher/Diskon*");
    System.out.println("Pilih voucher Diskon / Cashback kamu");  
    System.out.println("1. Diskon 10%");
    System.out.println("2. Diskon 5%");
    System.out.println("3. Diskon 15%");
    System.out.print("Input Pilihanmu : ");
    pilihDiskon=scanner.nextInt();
    //seleksi kondisi if else if
    if (pilihDiskon==1){
    DiskonBarang=harga*10/100;
    }
    else if (pilihDiskon==2){
    DiskonBarang=harga*5/100;
    }
    else if (pilihDiskon==3){
    DiskonBarang=harga*5/100;
    }   
    }
   //Method
public void Checkout(){
    int TotalPembayaran = harga+BiayaOngkir-DiskonOngkir-DiskonBarang;
    System.out.println("");
     System.out.print("Masukkan nama pembeli   : ");
     pembeli = scanner.next();
     System.out.print("Masukkan Alamat pembeli : " );
     alamat= scanner.next();
     System.out.print("Masukkan nomor telepon  : ");
     tlpn = scanner.next();
     System.out.println();
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("<Checkout>");
       System.out.println("Nama penerima                : " +pembeli);
       System.out.println("Alamat penerima              : " +alamat);
       System.out.println("Nomor telepon                : " +tlpn);
       System.out.println("Nama Barang                  : " + NamaBarang);
       System.out.println("Jasa Pengiriman              : " +NamaKurir);
       System.out.println("Subtotal Barang              : Rp " +harga);
       System.out.println("Subtotal Pengiriman          : Rp " +BiayaOngkir);
       System.out.println("Diskon Pengiriman            : Rp " +DiskonOngkir);
       System.out.println("Diskon Barang                : Rp " +DiskonBarang);
       System.out.println("Total Pembayaran             : Rp " +TotalPembayaran);   
       }
    }



//Menggunakan Konsep inheritance dan constructor
//Subclass
class Otomotif extends Elektronik{
    Scanner scanner = new Scanner(System.in);
    Scanner isi = new Scanner(System.in);
    
    //Constructor
    public Otomotif(String Barang1, String Barang2,int hargaBarang1,int hargaBarang2){
        //penggunaan super
        super (Barang1, Barang2, hargaBarang1,hargaBarang2);
    }
//Overriding Method    
public void pilihFitur(){
    int beli;
    System.out.println("*Otomotif");
    System.out.println("1. " +Barang1+ " | Rp "+hargaBarang1);
    System.out.println("2. " +Barang2+ " | Rp "+hargaBarang2);
    System.out.print("Kamu mau beli apa : ");
    beli = scanner.nextInt();
    //seleksi kondisi switch case
    switch (beli){
case 1 : 
NamaBarang = Barang1; harga=hargaBarang1;
break;
case 2:
NamaBarang = Barang2; harga=hargaBarang2;
break;
}
}
//Overriding Method
public void PilihKurir(){
    System.out.println("");
    System.out.println("*Jasa Pengiriman*");
    System.out.println("Pilih jasa pengiriman");
    System.out.println("1. JNE regular");
    System.out.println("2. SiCepat REG");
    System.out.println("3. J&T Express");
    System.out.println("4. Ninja Xpress");
    System.out.println("5. ID Express");
          System.out.print("Input pilihanmu : ");
          int kurir= scanner.nextInt();
          //seleksi kondisi switch case
                    switch (kurir){
              case 1 :
                  NamaKurir = "JNE regular"; BiayaOngkir = 50000;
                  break;
              case 2 :
                  NamaKurir = "SiCepat REG"; BiayaOngkir = 40000;
                  break;
              case 3:
                  NamaKurir = "J&T Express"; BiayaOngkir= 60000;
                  break;
              case 4:
                  NamaKurir = "Ninja Xpress"; BiayaOngkir = 50000;
                  break;
              case 5:
                  NamaKurir = "JNE regular"; BiayaOngkir = 40000;
                  break;
                    }
}
//Overriding Method
public void VoucherOngkirDiskon(){
    //Voucher GratisOngkir
    int pilihGratisOngkir;
    System.out.println("");
    System.out.println("*Gratis Ongkir*"); 
    System.out.println("Pilih voucher Gratis ongkir kamu");
    System.out.println("1. Gratis ongkir 10%");
    System.out.println("2. Gratis ongkir 20%");
    System.out.println("3. Gratis ongkir 30%");
    System.out.println("4. Gratis ongkir 40%");
    System.out.println("5. Gratis ongkir 50%");
    System.out.print("Input Pilihanmu : ");
    pilihGratisOngkir=isi.nextInt();
    //seleksi kondisi if else if
    if (pilihGratisOngkir==1){
    DiskonOngkir=BiayaOngkir*10/100;
    
    }
    else if (pilihGratisOngkir==2){
    DiskonOngkir=BiayaOngkir*20/100;
 
    }
    else if (pilihGratisOngkir==3){
    DiskonOngkir=BiayaOngkir*30/100;
    }
    else if (pilihGratisOngkir==4){
    DiskonOngkir=BiayaOngkir*40/100;   
    }
    else if (pilihGratisOngkir==5){
    DiskonOngkir=BiayaOngkir*50/100; 
    }
    
    //Voucher Diskon dan Cashback
    System.out.println("");
    System.out.println("*Voucher/Diskon*");
    System.out.println("Pilih voucher Diskon / Cashback kamu");  
    System.out.println("1. Diskon 10%");
    System.out.println("2. Diskon 5%");
    System.out.println("3. Diskon 15%");
    System.out.print("Input Pilihanmu : ");
    pilihDiskon=scanner.nextInt();
    //seleksi kondisi if else if
    if (pilihDiskon==1){
    DiskonBarang=harga*10/100;
    }
    else if (pilihDiskon==2){
    DiskonBarang=harga*5/100;
    }
    else if (pilihDiskon==3){
    DiskonBarang=harga*5/100;
    }   
    }
   //Overriding Method
public void Checkout(){
    int TotalPembayaran = harga+BiayaOngkir-DiskonOngkir-DiskonBarang;
    System.out.println("");
     System.out.print("Masukkan nama pembeli   : ");
     pembeli = scanner.next();
     System.out.print("Masukkan Alamat pembeli : " );
     alamat= scanner.next();
     System.out.print("Masukkan nomor telepon  : ");
     tlpn = scanner.next();
     System.out.println();
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("<Checkout>");
       System.out.println("Nama penerima                : " +pembeli);
       System.out.println("Alamat penerima              : " +alamat);
       System.out.println("Nomor telepon                : " +tlpn);
       System.out.println("Nama Barang                  : " + NamaBarang);
       System.out.println("Jasa Pengiriman              : " +NamaKurir);
       System.out.println("Subtotal Barang              : Rp " +harga);
       System.out.println("Subtotal Pengiriman          : Rp " +BiayaOngkir);
       System.out.println("Diskon Pengiriman            : Rp " +DiskonOngkir);
       System.out.println("Diskon Barang                : Rp " +DiskonBarang);
       System.out.println("Total Pembayaran             : Rp " +TotalPembayaran);   
       }
    }


//Menggunakan Konsep inheritance dan constructor
//Subclass
class Fashion extends Elektronik{
    Scanner scanner = new Scanner(System.in);
    Scanner isi = new Scanner(System.in);
    
    //Constructor
    public Fashion(String Barang1, String Barang2,int hargaBarang1,int hargaBarang2){
        //penggunaan this
        super (Barang1, Barang2, hargaBarang1,hargaBarang2);
    }
//Overriding Method    
public void pilihFitur(){
    int beli;
    System.out.println("*Fashion");
    System.out.println("1. " +Barang1+ " | Rp "+hargaBarang1);
    System.out.println("2. " +Barang2+ " | Rp "+hargaBarang2);
    System.out.print("Kamu mau beli apa : ");
    beli = scanner.nextInt();
    //seleksi kondisi switch case
    switch (beli){
case 1 : 
NamaBarang = Barang1; harga=hargaBarang1;
break;
case 2:
NamaBarang = Barang2; harga=hargaBarang2;
break;
}
}
//Overriding Method
public void PilihKurir(){
    System.out.println("");
    System.out.println("*Jasa Pengiriman*");
    System.out.println("Pilih jasa pengiriman");
    System.out.println("1. JNE regular");
    System.out.println("2. SiCepat REG");
    System.out.println("3. J&T Express");
    System.out.println("4. Ninja Xpress");
    System.out.println("5. ID Express");
          System.out.print("Input pilihanmu : ");
          int kurir= scanner.nextInt();
          //seleksi kondisi switch case
                    switch (kurir){
              case 1 :
                  NamaKurir = "JNE regular"; BiayaOngkir = 50000;
                  break;
              case 2 :
                  NamaKurir = "SiCepat REG"; BiayaOngkir = 40000;
                  break;
              case 3:
                  NamaKurir = "J&T Express"; BiayaOngkir= 60000;
                  break;
              case 4:
                  NamaKurir = "Ninja Xpress"; BiayaOngkir = 50000;
                  break;
              case 5:
                  NamaKurir = "JNE regular"; BiayaOngkir = 40000;
                  break;
                    }
}
//Overriding Method
public void VoucherOngkirDiskon(){
    //Voucher GratisOngkir
    int pilihGratisOngkir;
    System.out.println("");
    System.out.println("*Gratis Ongkir*"); 
    System.out.println("Pilih voucher Gratis ongkir kamu");
    System.out.println("1. Gratis ongkir 10%");
    System.out.println("2. Gratis ongkir 20%");
    System.out.println("3. Gratis ongkir 30%");
    System.out.println("4. Gratis ongkir 40%");
    System.out.println("5. Gratis ongkir 50%");
    System.out.print("Input Pilihanmu : ");
    pilihGratisOngkir=isi.nextInt();
    //seleksi kondisi if else if
    if (pilihGratisOngkir==1){
    DiskonOngkir=BiayaOngkir*10/100;
    
    }
    else if (pilihGratisOngkir==2){
    DiskonOngkir=BiayaOngkir*20/100;
 
    }
    else if (pilihGratisOngkir==3){
    DiskonOngkir=BiayaOngkir*30/100;
    }
    else if (pilihGratisOngkir==4){
    DiskonOngkir=BiayaOngkir*40/100;   
    }
    else if (pilihGratisOngkir==5){
    DiskonOngkir=BiayaOngkir*50/100; 
    }
    
    //Voucher Diskon dan Cashback
    System.out.println("");
    System.out.println("*Voucher/Diskon*");
    System.out.println("Pilih voucher Diskon / Cashback kamu");  
    System.out.println("1. Diskon 10%");
    System.out.println("2. Diskon 5%");
    System.out.println("3. Diskon 15%");
    System.out.print("Input Pilihanmu : ");
    pilihDiskon=scanner.nextInt();
    //seleksi kondisi if else if
    if (pilihDiskon==1){
    DiskonBarang=harga*10/100;
    }
    else if (pilihDiskon==2){
    DiskonBarang=harga*5/100;
    }
    else if (pilihDiskon==3){
    DiskonBarang=harga*5/100;
    }   
    }
 //Overriding Method
public void Checkout(){
    int TotalPembayaran = harga+BiayaOngkir-DiskonOngkir-DiskonBarang;
    System.out.println("");
     System.out.print("Masukkan nama pembeli   : ");
     pembeli = scanner.next();
     System.out.print("Masukkan Alamat pembeli : " );
     alamat= scanner.next();
     System.out.print("Masukkan nomor telepon  : ");
     tlpn = scanner.next();
     System.out.println();
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("<Checkout>");
       System.out.println("Nama penerima                : " +pembeli);
       System.out.println("Alamat penerima              : " +alamat);
       System.out.println("Nomor telepon                : " +tlpn);
       System.out.println("Nama Barang                  : " + NamaBarang);
       System.out.println("Jasa Pengiriman              : " +NamaKurir);
       System.out.println("Subtotal Barang              : Rp " +harga);
       System.out.println("Subtotal Pengiriman          : Rp " +BiayaOngkir);
       System.out.println("Diskon Pengiriman            : Rp " +DiskonOngkir);
       System.out.println("Diskon Barang                : Rp " +DiskonBarang);
       System.out.println("Total Pembayaran             : Rp " +TotalPembayaran);   
       }
    }


//Menggunakan Konsep inheritance dan constructor
//Subclass
class Food extends Elektronik{
    Scanner scanner = new Scanner(System.in);
    Scanner isi = new Scanner(System.in);
    
    //Constructor
    public Food(String Barang1, String Barang2,int hargaBarang1,int hargaBarang2){
        //penggunaan this
        super (Barang1, Barang2, hargaBarang1,hargaBarang2);
    }
//Overriding Method    
public void pilihFitur(){
    int beli;
    System.out.println("*Food");
    System.out.println("1. " +Barang1+ " | Rp "+hargaBarang1);
    System.out.println("2. " +Barang2+ " | Rp "+hargaBarang2);
    System.out.print("Kamu mau beli apa : ");
    beli = scanner.nextInt();
    //seleksi kondisi switch case
    switch (beli){
case 1 : 
NamaBarang = Barang1; harga=hargaBarang1;
break;
case 2:
NamaBarang = Barang2; harga=hargaBarang2;
break;
}
}
//Overriding Method   
public void PilihKurir(){
    System.out.println("");
    System.out.println("*Jasa Pengiriman*");
    System.out.println("Pilih jasa pengiriman");
    System.out.println("1. JNE regular");
    System.out.println("2. SiCepat REG");
    System.out.println("3. J&T Express");
    System.out.println("4. Ninja Xpress");
    System.out.println("5. ID Express");
          System.out.print("Input pilihanmu : ");
          int kurir= scanner.nextInt();
          //seleksi kondisi switch case
                    switch (kurir){
              case 1 :
                  NamaKurir = "JNE regular"; BiayaOngkir = 50000;
                  break;
              case 2 :
                  NamaKurir = "SiCepat REG"; BiayaOngkir = 40000;
                  break;
              case 3:
                  NamaKurir = "J&T Express"; BiayaOngkir= 60000;
                  break;
              case 4:
                  NamaKurir = "Ninja Xpress"; BiayaOngkir = 50000;
                  break;
              case 5:
                  NamaKurir = "JNE regular"; BiayaOngkir = 40000;
                  break;
                    }
}
//Overriding Method   
public void VoucherOngkirDiskon(){
    //Voucher GratisOngkir
    int pilihGratisOngkir;
    System.out.println("");
    System.out.println("*Gratis Ongkir*"); 
    System.out.println("Pilih voucher Gratis ongkir kamu");
    System.out.println("1. Gratis ongkir 10%");
    System.out.println("2. Gratis ongkir 20%");
    System.out.println("3. Gratis ongkir 30%");
    System.out.println("4. Gratis ongkir 40%");
    System.out.println("5. Gratis ongkir 50%");
    System.out.print("Input Pilihanmu : ");
    pilihGratisOngkir=isi.nextInt();
    //seleksi kondisi if else if
    if (pilihGratisOngkir==1){
    DiskonOngkir=BiayaOngkir*10/100;
    
    }
    else if (pilihGratisOngkir==2){
    DiskonOngkir=BiayaOngkir*20/100;
 
    }
    else if (pilihGratisOngkir==3){
    DiskonOngkir=BiayaOngkir*30/100;
    }
    else if (pilihGratisOngkir==4){
    DiskonOngkir=BiayaOngkir*40/100;   
    }
    else if (pilihGratisOngkir==5){
    DiskonOngkir=BiayaOngkir*50/100; 
    }
    
    //Voucher Diskon dan Cashback
    System.out.println("");
    System.out.println("*Voucher/Diskon*");
    System.out.println("Pilih voucher Diskon / Cashback kamu");  
    System.out.println("1. Diskon 10%");
    System.out.println("2. Diskon 5%");
    System.out.println("3. Diskon 15%");
    System.out.print("Input Pilihanmu : ");
    pilihDiskon=scanner.nextInt();
    //seleksi kondisi if else if
    if (pilihDiskon==1){
    DiskonBarang=harga*10/100;
    }
    else if (pilihDiskon==2){
    DiskonBarang=harga*5/100;
    }
    else if (pilihDiskon==3){
    DiskonBarang=harga*5/100;
    }   
    }
//Overriding Method   
public void Checkout(){
    int TotalPembayaran = harga+BiayaOngkir-DiskonOngkir-DiskonBarang;
    System.out.println("");
     System.out.print("Masukkan nama pembeli   : ");
     pembeli = scanner.next();
     System.out.print("Masukkan Alamat pembeli : " );
     alamat= scanner.next();
     System.out.print("Masukkan nomor telepon  : ");
     tlpn = scanner.next();
     System.out.println();
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("<Checkout>");
       System.out.println("Nama penerima                : " +pembeli);
       System.out.println("Alamat penerima              : " +alamat);
       System.out.println("Nomor telepon                : " +tlpn);
       System.out.println("Nama Barang                  : " + NamaBarang);
       System.out.println("Jasa Pengiriman              : " +NamaKurir);
       System.out.println("Subtotal Barang              : Rp " +harga);
       System.out.println("Subtotal Pengiriman          : Rp " +BiayaOngkir);
       System.out.println("Diskon Pengiriman            : Rp " +DiskonOngkir);
       System.out.println("Diskon Barang                : Rp " +DiskonBarang);
       System.out.println("Total Pembayaran             : Rp " +TotalPembayaran);   
       }
    }


//Menggunakan Konsep inheritance dan constructor
//Subclass
class HandphoneTablet extends Elektronik{
    Scanner scanner = new Scanner(System.in);
    Scanner isi = new Scanner(System.in);
    
    //Constructor
    public HandphoneTablet(String Barang1, String Barang2,int hargaBarang1,int hargaBarang2){
        //penggunaan this
        super (Barang1, Barang2, hargaBarang1,hargaBarang2);
    }
//Overriding Method    
public void pilihFitur(){
    int beli;
    System.out.println("*Handphone & Tablet");
    System.out.println("1. " +Barang1+ " | Rp "+hargaBarang1);
    System.out.println("2. " +Barang2+ " | Rp "+hargaBarang2);
    System.out.print("Kamu mau beli apa : ");
    beli = scanner.nextInt();
    //seleksi kondisi switch case
    switch (beli){
case 1 : 
NamaBarang = Barang1; harga=hargaBarang1;
break;
case 2:
NamaBarang = Barang2; harga=hargaBarang2;
break;
}
}
//Overriding Method 
public void PilihKurir(){
    System.out.println("");
    System.out.println("*Jasa Pengiriman*");
    System.out.println("Pilih jasa pengiriman");
    System.out.println("1. JNE regular");
    System.out.println("2. SiCepat REG");
    System.out.println("3. J&T Express");
    System.out.println("4. Ninja Xpress");
    System.out.println("5. ID Express");
          System.out.print("Input pilihanmu : ");
          int kurir= scanner.nextInt();
          //seleksi kondisi switch case
                    switch (kurir){
              case 1 :
                  NamaKurir = "JNE regular"; BiayaOngkir = 50000;
                  break;
              case 2 :
                  NamaKurir = "SiCepat REG"; BiayaOngkir = 40000;
                  break;
              case 3:
                  NamaKurir = "J&T Express"; BiayaOngkir= 60000;
                  break;
              case 4:
                  NamaKurir = "Ninja Xpress"; BiayaOngkir = 50000;
                  break;
              case 5:
                  NamaKurir = "JNE regular"; BiayaOngkir = 40000;
                  break;
                    }
}
//Overriding Method 
public void VoucherOngkirDiskon(){
    //Voucher GratisOngkir
    int pilihGratisOngkir;
    System.out.println("");
    System.out.println("*Gratis Ongkir*"); 
    System.out.println("Pilih voucher Gratis ongkir kamu");
    System.out.println("1. Gratis ongkir 10%");
    System.out.println("2. Gratis ongkir 20%");
    System.out.println("3. Gratis ongkir 30%");
    System.out.println("4. Gratis ongkir 40%");
    System.out.println("5. Gratis ongkir 50%");
    System.out.print("Input Pilihanmu : ");
    pilihGratisOngkir=isi.nextInt();
    //seleksi kondisi if else if
    if (pilihGratisOngkir==1){
    DiskonOngkir=BiayaOngkir*10/100;
    
    }
    else if (pilihGratisOngkir==2){
    DiskonOngkir=BiayaOngkir*20/100;
 
    }
    else if (pilihGratisOngkir==3){
    DiskonOngkir=BiayaOngkir*30/100;
    }
    else if (pilihGratisOngkir==4){
    DiskonOngkir=BiayaOngkir*40/100;   
    }
    else if (pilihGratisOngkir==5){
    DiskonOngkir=BiayaOngkir*50/100; 
    }
    
    //Voucher Diskon dan Cashback
    System.out.println("");
    System.out.println("*Voucher/Diskon*");
    System.out.println("Pilih voucher Diskon / Cashback kamu");  
    System.out.println("1. Diskon 10%");
    System.out.println("2. Diskon 5%");
    System.out.println("3. Diskon 15%");
    System.out.print("Input Pilihanmu : ");
    pilihDiskon=scanner.nextInt();
    //seleksi kondisi if else if
    if (pilihDiskon==1){
    DiskonBarang=harga*10/100;
    }
    else if (pilihDiskon==2){
    DiskonBarang=harga*5/100;
    }
    else if (pilihDiskon==3){
    DiskonBarang=harga*5/100;
    }   
    }
//Overriding Method 
public void Checkout(){
    int TotalPembayaran = harga+BiayaOngkir-DiskonOngkir-DiskonBarang;
    System.out.println("");
     System.out.print("Masukkan nama pembeli   : ");
     pembeli = scanner.next();
     System.out.print("Masukkan Alamat pembeli : " );
     alamat= scanner.next();
     System.out.print("Masukkan nomor telepon  : ");
     tlpn = scanner.next();
     System.out.println();
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("<Checkout>");
       System.out.println("Nama penerima                : " +pembeli);
       System.out.println("Alamat penerima              : " +alamat);
       System.out.println("Nomor telepon                : " +tlpn);
       System.out.println("Nama Barang                  : " + NamaBarang);
       System.out.println("Jasa Pengiriman              : " +NamaKurir);
       System.out.println("Subtotal Barang              : Rp " +harga);
       System.out.println("Subtotal Pengiriman          : Rp " +BiayaOngkir);
       System.out.println("Diskon Pengiriman            : Rp " +DiskonOngkir);
       System.out.println("Diskon Barang                : Rp " +DiskonBarang);
       System.out.println("Total Pembayaran             : Rp " +TotalPembayaran);   
       }
    }
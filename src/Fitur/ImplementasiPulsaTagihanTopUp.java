package Fitur;
import java.util.Scanner;
public class ImplementasiPulsaTagihanTopUp implements PulsaTagihanTopUp{
    private String NominalPulsa;
    protected String TokenListrik, NominalOvo;
    private int HargaPulsa, HargaOvo;
    Scanner scanner = new Scanner(System.in);
    @Override
    public void pilihanPulsaTagihanTopUp(){
    System.out.println("*Pulsa, Tagihan & Top Up ovo");
    System.out.println("1. Pulsa");
    System.out.println("2. Token Listrik");
    System.out.println("3. Top Up ovo");
    System.out.print("Masukkan pilihanmu : ");
    }
    //overriding Method
    @Override
    public void pulsa (){
        System.out.println("");
        System.out.print("Masukkan nomor HP : ");
        String NomorHp=scanner.nextLine();
        System.out.println("Pilihan Pulsa");
        System.out.println("1. Nominal 5.000 = Rp 6000");
        System.out.println("2. Nominal 10.000 = Rp 11000");
        System.out.println("3. Nominal 20.000 = Rp 21000");
        System.out.println("4. Nominal 30.000 = Rp 31000");
        System.out.println("5. Nominal 40.000 = Rp 41000");
        System.out.println("6. Nominal 50.000 = Rp 51000");
        System.out.print("Masukkan pilihanmu : ");
        int PilihanPulsa = scanner.nextInt();
        //seleksi kondisi switch case
        switch (PilihanPulsa){
            case 1: 
                NominalPulsa = "5.000";
                HargaPulsa = 6000;
                break;
            case 2:
                NominalPulsa = "10.000";
                HargaPulsa = 11000;
                break;
            case 3 :
                NominalPulsa = "20.000";
                HargaPulsa = 21000;
                        break;
            case 4 :
                NominalPulsa = "30.000";
                HargaPulsa = 31000;
                break;
            case 5 :
                NominalPulsa = "40.000";
                HargaPulsa = 41000;
                break;
            case 6 :
                NominalPulsa = "50.000";
                HargaPulsa = 51000;
                break;
            default :
            System.out.println("Pilihanmu tidak ada");
             break; 
        }
        System.out.println("*Nota");
        System.out.println("Nomer Hp      = " +NomorHp);
        System.out.println("Nominal Pulsa = " +NominalPulsa);
        System.out.println("Harga Pulsa   = Rp " +HargaPulsa);
    }
    //overriding Method
public void TokenListrik(){
    System.out.println("");
  System.out.print("Masukkan ID PLN : ");
        String IDpln=scanner.nextLine();
        System.out.println("Pilihan Produk");
        System.out.println("1. Token 20.000 = Rp 21000");
        System.out.println("2. Token 50.000 = Rp 51000");
        System.out.print("Masukkan pilihanmu : ");
        int PilihanPulsa = scanner.nextInt();
        //seleksi kondisi switch case
                switch (PilihanPulsa){
            case 1: 
                NominalPulsa = "20.000";
                TokenListrik = "1245 5674 2456 2786 0987";
                HargaPulsa = 21000;
                break;
            case 2:
                NominalPulsa = "50.000";
                TokenListrik = "9076 5674 2456 2786 9654";
                HargaPulsa = 51000;
                break;
            default :
            System.out.println("Pilihan yang anda masukkan tidak ada");
             break; 
        }
        System.out.println("*Nota");
        System.out.println("Id PLN        = " +IDpln);
        System.out.println("Token Listrik = " +TokenListrik);
        System.out.println("Nominal Pulsa = " +NominalPulsa);
        System.out.println("Harga Pulsa   = Rp " +HargaPulsa);
}
 public void TopUpOvo(){
     System.out.println("");
        System.out.print("Masukkan nomor ovo : ");
        String NomorOvo=scanner.nextLine();
        System.out.println("Mau TopUp berapa");
        System.out.println("1. Nominal 5.000 = Rp 7000");
        System.out.println("2. Nominal 10.000 = Rp 12000");
        System.out.println("3. Nominal 20.000 = Rp 22000");
        System.out.println("4. Nominal 30.000 = Rp 32000");
        System.out.println("5. Nominal 40.000 = Rp 42000");
        System.out.println("6. Nominal 50.000 = Rp 52000");
        System.out.print("Masukkan pilihanmu : ");
        int PilihanPulsa = scanner.nextInt();
        //seleksi kondisi switch case
        switch (PilihanPulsa){
            case 1: 
                NominalOvo = "5.000";
                HargaOvo = 7000;
                break;
            case 2:
                NominalOvo = "10.000";
                HargaOvo = 12000;
                break;
            case 3 :
                NominalOvo = "20.000";
                HargaOvo = 22000;
                break;
            case 4 :
                NominalOvo = "30.000";
                HargaOvo = 32000;
                break;
            case 5 :
                NominalOvo = "40.000";
                HargaOvo = 42000;
                break;
            case 6 :
                NominalPulsa = "50.000";
                HargaOvo = 52000;
                break;
            default :
            System.out.println("Pilihanmu tidak ada");
             break; 
        }
        System.out.println("*Nota");
        System.out.println("Nomer Hp      = " +NomorOvo);
        System.out.println("Nominal Pulsa = " +NominalOvo);
        System.out.println("Harga Pulsa   = Rp " +HargaOvo);
    }
}

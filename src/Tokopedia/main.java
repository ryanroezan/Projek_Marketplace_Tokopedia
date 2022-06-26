package Tokopedia;
import Fitur.ImplementasiPulsaTagihanTopUp;
import java.util.Scanner;
//Main class
//final keyword
final class main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    //Objek
    Elektronik FiturElektronik = new Elektronik("Smart TV xiomi", "Kulkas 2 pintu", 2500000, 3800000);
    Otomotif FiturOtomotif = new Otomotif("Helm INK full face", "Jas Hujan Premium", 1000000, 250000);
    Fashion FiturFashion = new Fashion ("Cardigan Rajut", "Denim Long Pants", 15000, 206000);
    Food FiturFood = new Food ("Burger Jumbo", "Super Fried Chicken", 50000, 45000);
    HandphoneTablet FiturHPtablet = new HandphoneTablet("Samsung Galaxy S20", "Tablet Infinx max", 5000000, 5400000);
    ImplementasiPulsaTagihanTopUp FiturPulsaTagihanTopUp = new ImplementasiPulsaTagihanTopUp();
    
    System.out.println("==========================================");
    System.out.println("\t\tTOKOPEDIA");
    System.out.println("==========================================");
    System.out.println("Fitur");
    System.out.println("1. Elektronik");
    System.out.println("2. Otomotif");
    System.out.println("3. Fashion");
    System.out.println("4. Food");
    System.out.println("5. Handphone & Tablet");
    System.out.println("6. Pulsa, Tagihan & TopUp ovo");
    System.out.print("Masukkann Pilihanmu : ");
    int PilihFitur=in.nextInt();
    System.out.println("");
    
    //seleksi kondisi untuk pemanggilan method sesuai dengan yang di inputkan
    if (PilihFitur==1){
        FiturElektronik.pilihFitur();
        FiturElektronik.PilihKurir();
        FiturElektronik.VoucherOngkirDiskon();
        FiturElektronik.Checkout();
}
    else if (PilihFitur==2){
        FiturOtomotif.pilihFitur();
        FiturOtomotif.PilihKurir();
        FiturOtomotif.VoucherOngkirDiskon();
        FiturOtomotif.Checkout();
    }
        else if (PilihFitur==3){
        FiturFashion.pilihFitur();
        FiturFashion.PilihKurir();
        FiturFashion.VoucherOngkirDiskon();
        FiturFashion.Checkout();
}
        else if (PilihFitur==4){
        FiturFood.pilihFitur();
        FiturFood.PilihKurir();
        FiturFood.VoucherOngkirDiskon();
        FiturFood.Checkout();
        }
        else if (PilihFitur==5){
        FiturHPtablet.pilihFitur();
        FiturHPtablet.PilihKurir();
        FiturHPtablet.VoucherOngkirDiskon();
        FiturHPtablet.Checkout();
        }
        else if (PilihFitur==6){
        FiturPulsaTagihanTopUp.pilihanPulsaTagihanTopUp();
        int pilihan =in.nextInt();
        switch (pilihan){
            case 1:
                FiturPulsaTagihanTopUp.pulsa();
                break;
            case 2: 
                FiturPulsaTagihanTopUp.TokenListrik();
                break;
            case 3:
                FiturPulsaTagihanTopUp.TopUpOvo();
                break;
        }
        }
    }
    }
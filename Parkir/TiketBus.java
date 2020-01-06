import java.util.Scanner;

public class TiketBus{
    public static void main(String[] args){
        
        String jurusan="";
        int biayaAC=0;
        int biayaNA=0;
        int total=0;
        int harga=0;
        for(int i = 0 ; i < 2; i++){
            Scanner myObj = new Scanner(System.in);

            System.out.println("nama  : ");
            String nama =myObj.nextLine();

            System.out.println("Rute perjalanan (1/2/3)     : ");
            int rute = myObj.nextInt();

            System.out.println("Jumlah kursi    : ");
            int jumlahKursi = myObj.nextInt();

            System.out.println("1. AC ");
            System.out.println("2. NA ");
            System.out.println("Fasilitas    : ");
            int fasilitas = myObj.nextInt();
            System.out.println("harga");

            
            if(rute==1){
                if(fasilitas==1){
                    harga = 90000;
                    jurusan="Jakarta - Bandung";
                }
                else if(fasilitas==2){
                    harga = 130000;
                    jurusan="Jakarta - Bandung";
                }
            }
            else if(rute==2){
                if(fasilitas==1){
                    harga = 70000;
                    jurusan="Bandung - Jakarta";
                }
                else if(fasilitas==2){
                    harga = 150000;
                    jurusan="Bandung - Jakarta";
                }

            }
            else if(rute==3){
                if(fasilitas==1){
                    harga = 50000;
                    jurusan="Jakarta - Tasikmalaya";
                }
                else if(fasilitas==2){
                    harga = 70000;
                    jurusan="Jakarta - Tasikmalaya";
                }
            }
            else{
                System.out.println("Jenis Rute tidak terdaftar");
            }
            total = harga*jumlahKursi;
            
            System.out.println("Terimakasih telah memesan tiket dengan rincian sebagai berikut:");
            System.out.println("nama    : "+nama);
            System.out.println("Rute    : "+jurusan);
            System.out.println("Jumlah Kursi    : "+jumlahKursi);
            System.out.println("Fasilitas   : "+fasilitas);
            System.out.println("Harga satuan    : "+harga);
            System.out.println("Total biaya     : "+total);
            System.out.println("silahkan membayar di Alfamart terdekat");
        }
    }
}
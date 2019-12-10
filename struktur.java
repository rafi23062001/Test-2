public class struktur{
    public static void main(String[] args){
        boolean hujan = false;
        boolean adapayung = false;

        if(hujan == true && adapayung == true){
            System.out.println("boleh keluar rumah");
        }
        else if(hujan == true && adapayung == true){
            System.out.println("tidak boleh keluar rumah");
        }
        else if(hujan == false && adapayung == false){
            System.out.println("boleh keluar rumah tapi payungnya gak kebawa");
        }
        else{
            System.out.println("boleh keluar rumah meski payung tidak ada");
        }
    }
}
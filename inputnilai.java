public class inputnilai{
    public static void main(String[] args){         
        
        try{
            int nilai = Integer.parseInt(args[0]);
            System.out.println(nilai);

        if(nilai >= 100){
            System.out.println("anda mendapatkan nilai A");
        }
        
        else if(nilai >= 84){
            System.out.println("anda mendapatkan nilai B");
        }
        
        else if(nilai >= 74){
            System.out.println("anda mendapatkan nilai C");
        }
        
        else if(nilai >= 64){
            System.out.println("anda mendapatkan nilai D");
        }
        
        else if(nilai >= 44){
            System.out.println("anda mendapatkan nilai E");
        }
        else{
            System.out.println("nilai di bawah rata-rata");
        }
    }

        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("tidak boleh diinput huruf");
        }
        }
    }
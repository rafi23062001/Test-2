public class bilangan{
    public static void main(String[] args){
        
        int nilai = Integer.parseInt(args[0]);
        String read = nilai%2 == 0 ? "genap" : "ganjil";
        System.out.println(read);
    }
}
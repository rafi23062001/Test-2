public class Bilangan{
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(i%3==0&&i%2==0){
                System.out.println("Indonesia");
            }else if(i%2==0){
                System.out.println(i);
            }else if(i%2==1){
                System.out.println("ganjil");
            }
        }
    }
}
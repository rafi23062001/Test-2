public class assignment{
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        System.out.println(a); //a =10
        a = b;
        System.out.println(a); //a = 5
        a+=b;
        System.out.println(a);//a = 10
        b-=a;
        System.out.println(b);//b = -5
        b*=b;
        System.out.println(b);//b = 25
        b/=a;
        System.out.println(b);
        a%=b;
        System.out.println(a);
    }
}
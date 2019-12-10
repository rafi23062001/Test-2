public class ternary{
    public static void main(String[] args){
        boolean hujan = true;

        System.out.println(hujan?"bawa payung":"tidak usah bawa payung");

        String nama = "afi";

        String access = nama == "rafi" ? "selamat datang admin.":"anda bukan admin";
        
        System.out.println(access);

        String password = "secrect";
        boolean loggedln = password == "secrect" ? true:false;
        System.out.println(loggedln);
    }
}
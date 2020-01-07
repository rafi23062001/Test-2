public class Penghasilan{
    public static void main(String[] args){
        double gajipokok = 4600897;
        double tunjanganSI = gajipokok*0.1;
        double tunjanganA = 4*(0.2*gajipokok);
        double pensiunan = 0.04*gajipokok;
        double bruto = gajipokok+tunjanganA+tunjanganSI;
        double netto = bruto-pensiunan; 

        System.out.println("Gaji Pokok          :"+gajipokok);
        System.out.println("Tunjangan Suami     :"+tunjanganSI);
        System.out.println("Tunjangan Anak       :"+tunjanganA);
        System.out.println("Tunjangan Anak      :"+bruto);
        System.out.println("luran Pensiunan     :"+pensiunan);
        System.out.println("Gaji Bersih         :"+netto);
    }
}
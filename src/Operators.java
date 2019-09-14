
public class Operators {
    enum Ukuran {EXPERT, HIGH, MEDIUM, SMALL};
    public static void main(String[] args) {
        // Aghniya Rahma Y.


        // Aji M. Zapar.


        // Andi F. Dewantara.
        double Angka = 36;
        double Hasil = Math.sqrt(36);
        Hasil = Math.pow(2,3);
        System.out.println(Hasil);

        int NumberBulat = 5;
        float NumberKoma = NumberBulat;
        System.out.println(NumberKoma);

        Angka = 9.997f;
        NumberBulat = (int) Angka;
        System.out.println(NumberBulat);
        char huruf = (char)NumberBulat;
        System.out.println(huruf);

        NumberBulat = 4;
        NumberBulat = NumberBulat + 4;
        System.out.println(NumberBulat);
        NumberBulat = 4;
        NumberBulat += 4;
        System.out.println(NumberBulat);

        NumberBulat++;
        System.out.println(NumberBulat);
        NumberBulat--;
        NumberBulat = 7;
        System.out.println(2*++NumberBulat);
        System.out.println(2*NumberBulat++);

        System.out.println(3 & 5);
        // 011 dan 101 hasilnya 001
        System.out.println(3 | 5);
        System.out.println(~3 & 5);
        System.out.println(3 ^ 5);

        System.out.println(true && true || false);
        int AwalA = 5, TengahA = 6, AkhirA = 7;
        System.out.println(AwalA += TengahA += AkhirA);
        AwalA = 5; TengahA = 6; AkhirA = 7;
        System.out.println(AwalA += (TengahA += AkhirA));


        Ukuran baju = Ukuran.SMALL;
        System.out.println(baju);

        // Fahmi Widianto.


        // M. Ilham Surya.

        System.out.println("Akar dari 4 = " + Math.sqrt(4));
        System.out.println("Kuadrat dari 4 = " + Math.pow(4, 2));
        double ceil = Math.ceil(7.643);
        System.out.println("Pembulatan dari 7.643 = " + ceil);
        double floor = Math.floor(7.643);// dibulatkan jadi = 8.0
        double log1= Math.log(1);
        int min = Math.min(10, 20);
        int max = Math.max(10, 20);
        double roundedDown = Math.round(23.445);
        double roundedUp= Math.round(23.545);
        double random = Math.random();

        double x = 9.97;
        int nx = (int) x;

        x= 20;
        x+= 5;
        int n = 5;
        n++;
        int m = 10;
        m--;
        int a = 2;
        a = a* ++a; // now a is 6 equal to 2*3
        // 3 == 7 // is false, 3 != 7 //is true
        // 5 < 10 ? 5 : 10;
        System.out.println("5&7 = "+ (5 & 7)); // 5=0101 & 7=0111 => 0101 = 5



        // Rezky Wahyuda S.


        // Salma Meldiyana.

    }
}

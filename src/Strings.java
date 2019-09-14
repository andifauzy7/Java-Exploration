public class Strings {
    public static void main(String[] args) {
        // Aghniya Rahma Y.
        String greeting = "Hello";
        String s = greeting.substring(3,5);
        System.out.println(s);

        greeting = greeting.substring(0, 3) + "p!";
        System.out.println(greeting);

        String str = "";
        System.out.println(str == null || str.length() == 0);        // true
        System.out.println(str.length() == 0);

        s = "Strings are immutable";
        char result = s.charAt(8);
        System.out.println(result);

        // create a StringBuilder object
        StringBuilder stre = new StringBuilder();

        // add the String to StringBuilder Object
        stre.append("Geek");

        // get unicode of char at position 1
        int unicode = stre.codePointAt(1);

        // print the result
        System.out.println("StringBuilder Object"
                + " contains = " + stre);
        System.out.println("Unicode of Character"
                + " at Position 1 "
                + "in StringBuilder = "
                + unicode);

        // get unicode of char at position 3
        unicode = stre.codePointAt(3);

        // print the result
        System.out.println("Unicode of Character "
                + "at Position 3 "
                + "in StringBuilder = "
                + unicode);

        // Aji M. Zapar.


        // Andi F. Dewantara.
        String nama = "Andi";
        String second = "Fauzy";
        String lengkap = nama + second;

        int angka = 7;
        System.out.println(nama + angka);

        String awal = String.join(" ","Andi","Fauzy","Dewantara");
        String tanggal = String.join("-","31","Agustus","2019");

        awal = "Hello";
        System.out.println(awal.equals("Hi"));

        awal = "HELLO";
        System.out.println(awal.equals("Hello"));
        System.out.println(awal.equalsIgnoreCase("Hello"));

        awal = "Hello";
        System.out.println(awal=="Hello");
        // Hasil True
        System.out.println(awal.substring(0,3)=="Hel");

        awal = "Dewantara";
        System.out.println(awal.length()); // 9
        System.out.println(awal.codePointCount(1, awal.length())); // 8

        awal = "Dewantara";
        System.out.println(awal.charAt(3));
        // Hasil False


        // Fahmi Widianto.


        // M. Ilham Surya.


        // Rezky Wahyuda S.


        // Salma Meldiyana.


    }
}

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        // Aghniya Rahma Y.

        // Aji M. Zapar.

        // Andi F. Dewantara.
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        // Next tidak membaca spasi.
        System.out.println(name);

        double Angka = 10000.0 / 3.0;
        System.out.println(Angka);
        System.out.printf("%8.2f\n", Angka);
        System.out.printf("%,.2f", Angka);

        Scanner in_ = new Scanner(Paths.get("D:\\myfile.txt"), "UTF-8");

        // Fahmi Widianto.

        // M. Ilham Surya.

        // Rezky Wahyuda S.

        // Salma Meldiyana.

    }
}

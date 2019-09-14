import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        // Aghniya Rahma Y.

        int yourSales=100000;
        int target=300000, bonus;
        String performance;

        Scanner Masukkan=new Scanner(System.in);
        System.out.println("masukkan bonus anda? ");

        yourSales=Masukkan.nextInt();

        if (yourSales >= 2 * target){
            performance = "riExcellent";
            bonus = 1000;
        }
        else if (yourSales >= 1.5 * target) {
            performance = "Fine";
            bonus = 500;
        }
        else if (yourSales >= target) {
            performance = "Satisfactory";
            bonus = 100;
        }
        else {
            performance = "You're Fired";

        }
        System.out.println(performance);

        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();


        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

         /*
        21 * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
        22 */

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        // Aji M. Zapar.

        // Andi F. Dewantara.
        String awal = "Dewantara";
        if(awal.length()==0 && awal.equals("")){
            System.out.println("Kosong");
        } else {
            System.out.println("Tidak Kosong");
        }

        int angka = 5;
        if(angka<5){
            System.out.println("Zzzz...");
        } else if(angka==5){
            System.out.println("Bingo!");
        } else if(angka>5){
            System.out.println("Roar!");
        }

        int i=0;
        while(i<=5){
            if(i==3)continue;
            System.out.println("Bingow!" + i);
            i++;
        }

        do {
            System.out.println("Buzz!");
            i++;
        } while (i<0);

        for(int j=0; j<5; j++){
            System.out.println("Pake For "+j);
        }

        int choice = 3;
        switch (choice){
            case 1:
                System.out.println("Regular");
                break;
            case 2:
                System.out.println("Member");
                break;
            case 3:
                System.out.println("Premium");
                break;
            default:
                System.out.println("Anda Tidak Terdaftar");
                break;
        }



        // Fahmi Widianto.

        // M. Ilham Surya.

        // Rezky Wahyuda S.

        // Salma Meldiyana.

        int v;
        {
            v=8;
        }
        int t=2, m=0;
        while(m<=t) {
            m=m+1;
            System.out.println("Hello");
        }
        double balance=100, payment=200;
        double interestRate=10;
        int year=2000;
        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;
            // print current balance
            // ask if ready to retire and get input
            System.out.println("Salma");
        } while (balance==300);

        System.out.print("Select an option (1, 2) ");
        choice = in.nextInt();
        switch (choice)
        {
            case 1:
                System.out.print("Salma");
                break;
            case 2:
                System.out.println("JTK");
                break;
        }
    }
}

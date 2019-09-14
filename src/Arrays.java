import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        // Aghniya Rahma Y.

        // Aji M. Zapar.

        // Andi F. Dewantara.
        if (args.length == 0 || args[0].equals("-h"))
            System.out.print("Hello,");
        else if (args[0].equals("-g"))
            System.out.print("Goodbye,");
        // print the other command-line arguments
        for (int i = 1; i < args.length; i++)
            System.out.print(" " + args[i]);
        System.out.println("!");

        //int[] AdaArray = {1,5,4,2,4,8};
        int[] AdaArray = new int[] {1,5,4,2,4,8};
        int[] ArrayKedua = AdaArray;
        ArrayKedua[2] = 3;
        System.out.println(ArrayKedua[2]);
        System.out.println(AdaArray[2]);

        for(int i=0; i<AdaArray.length; i++){
            System.out.print(AdaArray[i]);
        }
        java.util.Arrays.sort(AdaArray);
        System.out.println("");
        for(int element : AdaArray){
            System.out.print(element);
        }

        int[][] DuaDimensi = {
                {2,3,4,5},
                {2,1,3,3},
                {3,1,4,5},
                {2,1,4,7}
        };
        System.out.println(DuaDimensi.length);
        System.out.println(DuaDimensi[0].length);
        for (int i=0; i<DuaDimensi.length; i++){
            for (int j=0; j<DuaDimensi[i].length; j++){
                System.out.print(DuaDimensi[i][j]);
            }
            System.out.println("");
        }

        int[][] ArrayRagged = new int[3][];
        ArrayRagged[0] = new int[3];
        ArrayRagged[1] = new int[2];
        ArrayRagged[2] = new int[4];




        // Fahmi Widianto.
        int ab[] = new int[100];
        for (int i = 0; i < ab.length; i++){
            ab[i]=i;
            System.out.println(ab[i]);
        }

        int[] smallPrimes = new int[] { 17, 19, 23, 29, 31, 37 };
        // ini adalah cara lain nya
        int[] anonymous = { 17, 19, 23, 29, 31, 37 };
        smallPrimes = anonymous;

        // M. Ilham Surya.

        // Rezky Wahyuda S.
        int[] intArray = new int[4];
        int[] a = {1,2,3};
        int[] b = {2,4,3};
        intArray[0] = a[0];
        intArray[1] = a[1];
        intArray[2] = b[0];
        intArray[3] = b[1];

        int[] nums = a;
        int simpan = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = simpan;

        // Salma Meldiyana.

    }

}

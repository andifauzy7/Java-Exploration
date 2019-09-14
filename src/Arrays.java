public class Arrays {
    public static void main(String[] args) {
        // Aghniya Rahma Y.

        // Aji M. Zapar.

        // Andi F. Dewantara.

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

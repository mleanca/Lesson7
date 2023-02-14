public class Lesson7Ex3Of3 {
    public static void main(String[] args) {
        int array1[] = new int[] {10, 20, 30, 40};
        int array2[] = new int[4];

        for (int i = 0; i < array1.length; ++i) {
            array2[i] = array1[i]; //to copy original array
        }

        System.out.print("Elemente array original: ");
        for (int i = 0; i < array1.length; ++i) {
            System.out.print(array1[i] + " ");
        }

        System.out.println(" ");

        System.out.print("Elemente array copy: ");
        for (int i = 0; i < array2.length; ++i) {
            System.out.print(array2[i] + " ");
        }
    }
}

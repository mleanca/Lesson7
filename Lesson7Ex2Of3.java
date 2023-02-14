public class Lesson7Ex2Of3 {
    public static void main(String[] args) {

        int uniArray[] = new int[] {1, 2, 3, 4, 5, 6};
        int biArray[][] = {{7, 8, 9}, {10, 11, 12}};
        int suma = 0;
        int pare = 0;
        int impare = 0;

        System.out.println("ELemente array unidimensional:");
        for (int i = 0; i < uniArray.length; ++i) {
            System.out.print(uniArray[i] + " "); // 1 2 3 4 5 6
        }

        for (int i = 0; i < uniArray.length; ++i) {
            suma += uniArray[i];
            // suma = suma + uniArray[0] = 0 + 1, 1st iteration
            // suma = 0 + 2 = 2, 2nd iteration and so on.. outputs 21
        }

        System.out.println(" ");

        System.out.println("Suma array unidimensional: " + suma); // Suma array unidimensional: 21
        System.out.println("Medie array unidimensional: " + suma / uniArray.length); // Medie array unidimensional: 3

        for (int i = 0; i < uniArray.length; ++i) {
            if (uniArray[i] % 2 == 0) {
                pare++;
            } else {
                impare++;
            }
        }

        System.out.println("Numarul elemente pare: " + pare); // Numarul elemente pare: 3
        System.out.println("Numarul element impare: " + impare); // Numarul elemente pare: 3
    }

}

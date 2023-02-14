public class PracticeArray {
    public static void main(String[] args) {

        //primitive datatype
        int intArray[] = new int[] {3, 9, 126, 22};

        //object
        String objArray[] = new String[] {"Julia", "Anna", "Tom", "Maddie"};


        //DECLARATION OF AN ARRAY, syntax versions are all equivalent
        int intArray2[]; //unidimensional
        String[] objArray2;

        int intArray3[][]; //bidimensional
        double[][] doubleArray;
        String[] objArray3[];


        //ALLOCATING MEMORY/DATA FOR AN ARRAY
        int intArray4[] = new int[5]; //unidimensional

        int[][] intArray5 = new int[4][4]; //bidimensional
        String[][] objArray4 = new String[3][4];


        //INITIALIZATION -- SHORTHAND version is in line 5 & 8 --
        for (int position = 0; position <intArray4.length; position++) {
            intArray4[position] = position + 5;
        } //unidimensional

        for (int row = 0; row <intArray5.length; row++) {
            for (int col = 0; col <intArray5[row].length; col++) {
                intArray5[row][col] = row + col;
            }
        } //bidimensional


        //ACCESSING ARRAYS
        System.out.println("Int 3rd in order: " + intArray[2]); //Int 3rd in order: 126
        System.out.println(objArray[0]); //Julia

        int[][] intArray6 = {{2, 9, 6, 7}, {126, 7, 8}};
        System.out.println(intArray6[1][2]); //8


        //MODIFYING ARRAYS
        intArray[3] = 136;
        intArray[2] = 1;
        System.out.println(intArray[3] + intArray[2]); // 137

        intArray6[1][2] = 11;
        System.out.println(intArray6[1][2]); // 11


        //ARRAY DIMENSION
        System.out.println("Array length is: " + intArray.length); //4


        //RUNNING AN ARRAY
        for (int position = 0; position <intArray.length; position++) {
            System.out.println("Array values: " + intArray[position]); // 3 9 1 16
        }
    }
}

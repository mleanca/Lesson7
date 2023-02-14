public class Lesson7Ex1Of3 {
    public static void main(String[] args) {

        int numberArray[] = new int[5]; //declara un array tip int si aloca memorie
        numberArray[0] = 10;
        numberArray[1] = 15;
        numberArray[2] = 25;
        numberArray[3] = 40;
        numberArray[4] = 65; //initializa array

        System.out.println("Array values are:");

        for (int i = 0; i <numberArray.length; i++) {
            System.out.println(numberArray[i]); //afisa elemente
        }

    }
}

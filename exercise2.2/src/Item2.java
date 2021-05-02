public class Item2 {
    public static void main(String[] args) {
        float myFloatA = 10.1f;
        System.out.println("myFloatA value: " + myFloatA);
        int myIntA = (int) myFloatA;
        System.out.println("myIntA value: " + myIntA);

        int myIntB = 10;
        System.out.println("myIntB value: " + myIntB);
        float myFloatB = myIntB;
        System.out.println("myFloatB value: " + myFloatB);

        double myDoubleC = 10.0;
        System.out.println("myDoubleC value: " + myDoubleC);
        float myFloatC = (float) myDoubleC;
        System.out.println("myFloatC value: " + myFloatC);

        char myCharD = 'a';
        System.out.println("myCharD value: " + myCharD);
        int myIntD = (int) myCharD;
        System.out.println("myIntD value: " + myIntD);
    }
}

public class item1 {
    public static void main(String[] args) {
        int i = 20;
        System.out.println("initial i = " + i);
        for (int j = 1; j <= 5; j++) {
            i++;
        }
        System.out.println ("i++ 5 times: "+ i);
        for (int k = 1; k <= 5; k++) {
            --i;
        }
        System.out.println ("--i 5 times: "+ i);
    }
}

public class item2 {
    public static void main(String[] args) {
        boolean isHandSome = false;
        int score = 40;
        if (isHandSome == true) {
            System.out.println("Good ... !");
        } else {
            if (score >= 80) {
                System.out.println("Good");
            } else if (score >= 50) {
                System.out.println("normal");
            } else if (score < 50) {
                System.out.println("fail");
            }
        }
    }
}

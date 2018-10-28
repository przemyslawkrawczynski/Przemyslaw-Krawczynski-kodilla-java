package test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge sc = new SecondChallenge();

        try {

            String newEx = sc.probablyIWillThrowException(2, 1.5);
            System.out.println(newEx);

        } catch (Exception e) {

            System.out.println("We have new Exception-->" + e);
        }
    }
}

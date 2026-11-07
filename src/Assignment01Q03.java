
public class Assignment01Q03 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int firstTerm = 1, secondTerm = 1;
        int numOdd = 0;

        for (int i = 0; i < x; i++) {
            if (firstTerm % 2 != 0) {
                numOdd++;
            }

            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;

            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
        System.out.println();

        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}

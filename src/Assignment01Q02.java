public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        int denominator = 1;
        boolean isPositiveSummand = true;

        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            double summand = (1.0 / denominator);
            approxPi = (isPositiveSummand) ? (approxPi + summand) : (approxPi - summand);

            denominator += 2;
            isPositiveSummand = !isPositiveSummand;
        }
        
        approxPi *= 4;

        System.out.println(approxPi + " " + actualPi);
    }
}

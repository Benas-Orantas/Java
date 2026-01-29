package validating;

public class Calculator {

    public int factorial(int num) {
        int answer = 1;
        if (num < 0) {
            throw new IllegalArgumentException("Number cannot be lower than 0");
        } else {
            for (int i = 1; i <= num; i++) {
                answer *= i;
            }
        }
        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0) {
            throw new IllegalArgumentException("Neither of the parameters can be less than 0");
        } else if (subsetSize > setSize) {
            throw new IllegalArgumentException("The subset size cannot be bigger than the set size");
        } else {
            int numerator = factorial(setSize);
            int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

            return numerator / denominator;
        }
    }
}

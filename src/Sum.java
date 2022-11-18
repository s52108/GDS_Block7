import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sumUpIterative(3));
        System.out.println(sumUpRecursive(3));
        System.out.println(sumUpRecurrsiveAcc(3, 0));
        ArrayList<Integer> numbers = new ArrayList<Integer>(3); //new Arraylist Strg + Alt + V
        System.out.println("numbers = " + numbers);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("numbers = " + numbers);
        System.out.println(iterativeSum(numbers));
        System.out.println(recursiveSum(numbers));


    }

    public static int iterativeSum(ArrayList<Integer> values) {
        int sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        return sum;
    }

    public static int recursiveSum(ArrayList<Integer> values) {
        if (values.size() == 0) {
            return 0;
        }
        Integer value = values.remove(0);
        return value + recursiveSum(values);

    }


    public static int sumUpRecurrsiveAcc(int n, int acc) {
        if (n <= 0) {
            return acc;
        }
        acc = acc + n;
        return sumUpRecurrsiveAcc(n - 1, acc);

    }

    public static int sumUpRecursive(int n) {
        if (n <= 0) {
            return n;
        }
        return n + sumUpIterative(n - 1);
    }

    public static int sumUpIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {//Beginne mit 1, laufe solange du kleiner gleich n bist, erhöhe nach jeder Iteration um1
            sum = sum + i;
        }
        return sum;
    }
}

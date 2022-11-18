public class Sum {
    public static void main(String[] args) {
        System.out.println(sumUpIterative(3));
        System.out.println(sumUpRecursive(3));
        System.out.println(sumUpRecurrsiveAcc(3, 0));

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

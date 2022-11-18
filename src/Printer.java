public class Printer {
    public static void main(String[] args) {
        // printFromNToZero(5);
        // printFromNToZeroRecursive(5);
        printFromZeroToNRecursiv(5);

    }

    //Methodendeklaration
    public static void printFromNToZero(int n) {
        while (n >= 0) {
            System.out.println("n = " + n);
            n--;
        }

    }

    public static void printFromNToZeroRecursive(int n) {
        //Abbruchsbestimmung
        if (n < 0) {
            return;
        }
        System.out.println("n = " + n);

        //rufe mich selbst nochmal auf
        printFromNToZero(n - 1);  //n updaten (um 1 verringern)
    }

    public static void printFromZeroToNRecursiv(int n) {
        if (n < 0) {
            return;
        }

        printFromZeroToNRecursiv(n - 1);
        System.out.println("n = " + n);
    }

}

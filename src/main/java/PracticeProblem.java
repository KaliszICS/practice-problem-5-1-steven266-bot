public class PracticeProblem {

	public static void main(String args[]) {

	}
    public static int[] createIntArray() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static String[] createArray(String a, String b, String c, String d) {
        String[] arr = new String[4];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        return arr;
    }

    public static String getElement(int n, String[] arr) {
        return arr[n];
    }

    public static void replaceElement(int n, double value, double[] arr) {
        arr[n] = value;
    }
}



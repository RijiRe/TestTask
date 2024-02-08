public class Main {
    public static void main(String[] args) {
        int[] m = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = m[0];
        int min = m[0];
        for (int i = 1; i < m.length; i++) {
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println("Hello");
    }
}
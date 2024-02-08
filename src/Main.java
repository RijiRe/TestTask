public class Main {
    public static void main(String[] args) {
        System.out.println("1 задание");
        int[] m = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < m.length; i++) {
            if (m[i] == 0) {
                m[i] = 1;
            } else {
                m[i] = 0;
            }
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }

        System.out.println(" ");
        System.out.println("2 задание");
        int[] m2 = new int[100];
        for (int i = 0; i < m2.length; i++) {
            m2[i] = i + 1;
        }
        for (int i = 0; i < m2.length; i++) {
            System.out.print(m2[i] + " ");
        }

        System.out.println(" ");
        System.out.println("3 задание");
        int[] m3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < m3.length; i++) {
            if (m3[i] < 6) {
                m3[i] *= 2;
            }
        }
        for (int i = 0; i < m3.length; i++) {
            System.out.print(m3[i] + " ");
        }

        System.out.println(" ");
        System.out.println("4 задание");
        int n = 5;
        int[][] m4 = new int[n][n];
        for (int i = 0; i < n; i++) {
            m4[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("5 задание");
        int len = 5;
        int initialValue = 10;
        int[] m5 = createArray(len, initialValue);
        for (int i = 0; i < len; i++) {
            System.out.print(m5[i] + " ");
        }

        System.out.println(" ");
        System.out.println("6 задание");
        int[] m6 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = m6[0];
        int min = m6[0];
        for (int i = 1; i < m6.length; i++) {
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static int[] createArray(int len, int initialValue) {
        int[] m5 = new int[len];
        for (int i = 0; i < len; i++) {
            m5[i] = initialValue;
        }
        return m5;
    }
}
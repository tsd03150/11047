import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] money = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            money[i] = kb.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            int tmp = k / money[i];

            if (tmp > 0) {
                k = k % money[i];
                answer += tmp;
            }
        }

        System.out.println(answer);
    }

}

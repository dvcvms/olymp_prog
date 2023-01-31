package olymp.yandex.training.two.hm1.a_Interactor;

import java.util.Scanner;

//OK
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r;
        int i;
        int c;
        int result;

        r = scanner.nextInt();
        i = scanner.nextInt();
        c = scanner.nextInt();

        switch (i) {
            case 0:
                result = r != 0 ? 3 : c;
                break;
            case 1:
                result = c;
                break;
            case 4:
                result = r != 0 ? 3 : 4;
                break;
            case 6:
                result = 0;
                break;
            case 7:
                result = 1;
                break;
            default:
                result = i;
                break;
        }
        System.out.println(result);
    }
}

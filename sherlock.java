import java.util.Scanner;

public class sherlock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int a[] = new int[26];
        int length = s.length(), big, small;
        int c, t,c1=0;
        boolean b = true;
        for (int i = 0; i < 26; i++)
            a[i] = 0;
        for (int i = 0; i < length; i++) {
            a[(int) s.charAt(i) - 97]++;
        }

        for (int i = 0; i < 25; i++) {
            for (int j = i + 1; j < 26; j++) {
                if (a[i] < a[j]) {
                    c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }

        t = a[0];
        for (int i = 1; i < 26; i++) {
            if (a[i] == t - 1||a[i]==0) {
                
                continue;
            }
            else
            {
                b = false;
                break;
            }

        }if(b)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}

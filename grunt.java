import java.util.Scanner;

public class grunt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt(), i, max = 0, tempmax = 0;
        String s = in.nextLine();
        s = in.nextLine();
        int ch[] = new int[26];
        for (i = 0; i < 26; i++)
            ch[i] = 0;


        char ch2;
        int j;


        for (i = 0; i < len; i++)      // counter
        {
            ch2 = s.charAt(i);
            ch[(int) ch2 - 97]++;
        }


        for (i = 0; i < 25; i++) {
            for (j = i + 1; j < 26; j++) {
                if (ch[i] != 0 && ch[j] != 0) {
                    tempmax = newword((char) (i + 97), (char) (j + 97), s);
                }
                if (max < tempmax)
                    max = tempmax;
            }
        }
        System.out.println(max);


    }


    public static int newword(char ch1, char ch2, String s) {
        int len = s.length();
        char ch3, ch4 = ')', ch5 = '0', swap;
        boolean b = true,finals=true;
        StringBuffer s2 = new StringBuffer(s);
        while (b) {
            for (int i = 0; i < len; i++) {
                ch3 = s2.charAt(i);
                if (ch3 == ch1 || ch3 == ch2) {
                    ch4 = ch3;
                    b = false;

                    break;
                }
            }
            if (ch4 == ch1)
                ch5 = ch2;
            else
                ch5 = ch1;
        }


        for (int i = 0; i < len; i++) {

            ch3 = s2.charAt(i);
            if (ch3 == ch1 || ch3 == ch2)
                continue;
            else {
                s2.delete(i, i + 1);
                len = s2.length();
                i--;
            }
        }

        for(int i=0;i<s2.length();i++)
        {
            ch3=s2.charAt(i);
            if(ch4==ch3) {

                swap=ch4;
                ch4=ch5;
                ch5=swap;
                continue;
            }

            else
            {
                finals=false;
                break;
            }
        }
        if(finals)
            return s2.length();
        else
            return 0;

    }
}
import java.util.Scanner;

public class cont
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StringBuffer b=new StringBuffer(in.nextLine());
        int length,i,j=0;
        char ch,ch2;
        boolean condition=true;
        while(condition)
        {
            j=0;
            length=b.length();
            for(i=0;i<length-1;i++)
            {
                ch=b.charAt(i);
                ch2=b.charAt(i+1);
                if(ch==ch2) {
                    j = 1;
                    break;
                }
            }
            if(j==0)
                condition=false;
            else
                b=delete(b);
        }
        if(b.length()==0)
            System.out.println("Empty String");
        else
            System.out.println(b);

    }

    public static StringBuffer delete(StringBuffer b)
    {
        int lenght=b.length();
        int length2;

        char ch,ch2;
        for(int i=0;i<lenght-1;i++)
        {
            length2=lenght;
            lenght=b.length();
            if(lenght!=length2)
            {
                i=0;
            }
            ch=b.charAt(i);
            ch2=b.charAt(i+1);
            if(ch==ch2)
            {
                b.delete(i,i+2);

            }

        }
        return b;

    }
}

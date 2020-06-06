package P5;

public class Q1 {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i=1 ; i<=100 ; i++)
        {
            if (i % 2 ==0 )
                a[i-1]=7;
            else
                a[i-1]=3;
            System.out.println(a[i-1]);
        }

    }
}

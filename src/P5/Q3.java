package P5;

public class Q3 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int i = 1;
        int j = 100;
        int i1 = 0;
        while (i1<100)
        {
            if (i1 % 2 == 0) {
                a[i1] = j;
                j--;
            }
            else {
                a[i1] = i;
                i++;
            }
            i1++;
        }
        for (int k = 0 ; k<100 ; k ++)
        {
            System.out.println(a[k]);
        }
    }
}

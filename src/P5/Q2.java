package P5;

public class Q2 {
    public static void main(String[] args) {

        float[] a = new float[100];
        int i = 0;
        float j = 1;
        while (i<100)
        {
            a[i] = j;
            j+=0.1;
            System.out.println(a[i]);
            i++;
        }
    }
}

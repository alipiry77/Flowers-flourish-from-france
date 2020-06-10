package flowers;
import java.util.Scanner;
public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            if (line.equals("*"))
                break;
            if (isGood(line))
            {
                System.out.println("Y");
            }
            else
                System.out.println("N");
                }
            }
    public static boolean isGood(String s)
    {
        String[] line  = s.split(" ");
        char first = line[0].charAt(0);
        for(String str : line)
        {
            if ( str.charAt(0) != first)
            {
                return false;
            }
        }
        return true;
    }
}

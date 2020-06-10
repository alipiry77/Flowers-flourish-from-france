package flowers;

import java.util.ArrayList;
import java.util.Scanner;

public class p {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        String  count = "";
        while (true)
        {
            String line = sc.nextLine();
            if (line.equals("*"))
            break;
            strings.add(line);
        }
        for (int j=0 ; j<strings.size() ; j++) {
            String[] s = strings.get(j).split(" ");
            char s1 = s[0].charAt(0);
            char s2;
            for (int i = 1; i < s.length; i++) {
                s2 = s[i].charAt(0);
                if (s1 == s2) {
                    count = "Y";
                } else {
                    count = "N";
                    break;
                }
            }
            System.out.println(count);
        }

    }
}

package ch1.p6;

public class student {

    String name ;
    course course ;
    Double score ;

    public void scorePass (Double score)
    {
        if (score >= 10)
            System.out.println("You Pass");
        else System.out.println("You Failed");
    }
}

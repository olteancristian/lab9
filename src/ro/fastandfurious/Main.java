package ro.fastandfurious;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final int IN_AGE = 18;

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(1,3,7,35,18,0,9,-1));
        int i = -1;
        for(int nr: myList) {
            if (i >= 0)
                break;
            if (isNotInAge(nr))
                continue;
            i = nr;
            System.out.println(nr);
        }
        String Name = "FastTrackIt";
        for (int i = 0; i<25; i++)
        { System.out.println(i+Name);}

    }

    private static boolean isNotInAge (int nr) {
        return nr < IN_AGE;
    }
}

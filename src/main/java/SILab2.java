import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) {                                //A
        if (list.size() <= 0) {                                                             //B
            throw new IllegalArgumentException("List length should be greater than 0");     //C
        }
        List<String> numMines = new ArrayList<>();                                          //D
        for (int i = 0; i < list.size(); i++) {                                             //E1 //E2 //E3
            if (!list.get(i).equals("#")) {                                                 //F
                int num = 0;                                                                //G
                if (i - 1 >= 0 && list.get(i - 1).equals("#")) {                            //H
                    num++;                                                                  //I
                }
                if (i + 1 < list.size() && list.get(i + 1).equals("#")) {                   //J
                    num++;                                                                  //K
                }
                numMines.add(String.valueOf(num));                                          //L
            } else {                                                                        //M
                numMines.add(list.get(i));                                  //N
            }
        }                                                                                   //O
        return numMines;                                                                    //P
    }                                                                                       //Q
}
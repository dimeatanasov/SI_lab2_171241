import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILab2Test {

    private final SILab2 siLab2 = new SILab2();


    private List<String> createNewArrayList(String... s) {
        return new ArrayList<>(Arrays.asList(s));
    }

    @Test
    void MultipleCondition(){
        Assert.assertEquals(new ArrayList<>(createNewArrayList("1", "#", "2", "#")), siLab2.function(createNewArrayList("0", "#", "0", "#")));
    }

    @Test
    void EveryBranch(){
        Assert.assertEquals(new ArrayList<>(createNewArrayList("1", "#", "2", "#")), siLab2.function(createNewArrayList("0", "#", "0", "#")));
    }
}

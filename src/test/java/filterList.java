import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


import java.util.List;

public class filterList extends TestCase {




   @Test
    public void testFilterList(){
        List<Object> actual0 = Task1.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231));
        List<Object> expected0 = List.of(1, 2, 231);
        Assert.assertEquals(expected0, actual0);

        List<Object> actual1 = Task1.filterList(List.of(1, 2, "a", "b"));
        List<Object> expected1 = List.of(1, 2);
        Assert.assertEquals(expected1, actual1);

        List<Object> actual2 = Task1.filterList(List.of(1, 2, "a", "b",0,15 ));
        List<Object> expected2 = List.of(1, 2,0,15);
        Assert.assertEquals(expected2, actual2);
    }



}

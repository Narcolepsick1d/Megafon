import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class filterList extends TestCase {




   @Test
    public void testfilterList1(){
        List<Object> actual = Task1.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231));
                List<Object> expected = List.of(1, 2, 231);
                assertEquals(expected,actual);
    }
    public void testfilterList2(){
        List<Object> actual = Task1.filterList(List.of(1, 2, "a", "b"));
        List<Object> expected = List.of(1, 2);
        assertEquals(expected,actual);
    }
    public void testfilterList3(){
        List<Object> actual = Task1.filterList(List.of(1, 2, "a", "b",0,15 ));
        List<Object> expected = List.of(1, 2,0,15);
        assertEquals(expected,actual);
    }


}

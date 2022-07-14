
import java.util.List;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] args) {

        filterList(List.of(1, 2, "a", "b")).forEach(System.out::println);
        filterList(List.of(1, 2, "a", "b", 0, 15)).forEach(System.out::println);
        filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)).forEach(System.out::println);

    }

    public static List<Object> filterList(final List<Object> list) {
        //есть ли элементы
        if(list.isEmpty()) {
            throw new NullPointerException("List pustoy");
        };
        //лист с инпутами
        List<Object> input = list.stream().filter(o -> {
            if(o.getClass()==Integer.class){
                //проверка и exception в случае не позитивного числа
                //проверка на int
                return true;
            }
            //string и другие элементы не допускаются
            return false;
            //должен вернуть этому методу лист с отбором
            //второй фильтр поможет избавиться от множества операторов if
        }).filter(o -> {
            if (Integer.parseInt(o.toString())<0) {
            throw new IllegalStateException("VVidite Positivnoe Chislo");
        }
        else return true;


        }).collect(Collectors.toList());

       return input;








    }
}



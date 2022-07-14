
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {

        filterList(List.of(1, 2, "a", "b")).forEach(System.out::println);
        filterList(List.of(1, 2, "a", "b", 0, 15)).forEach(System.out::println);
        filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)).forEach(System.out::println);

    }

    public static List<Object> filterList(final List<Object> list) {
        //лист с инпутами
        List<Object> input = list;
        //должен вернуть этому методу лист с отбором
       return input.stream().filter(o -> {
           //есть ли элементы
            if (o.toString()!=null){
                //проверка на int
                if(o.getClass()==Integer.class){
                    //проверка и exception в случае не позитивного числа
                    if (Integer.parseInt(o.toString())<0) {
                        throw new IllegalStateException("VVidite Positivnoe Chislo");
                    }
                    else return true;

                }
            }
            //string и другие элементы не допускаются
            return false;
            //нужно для возрата stream в list
        }).collect(Collectors.toList());

    }
}



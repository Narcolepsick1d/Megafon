
import java.util.List;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] args) {

        filterList(List.of(1, 2, "a", "b")).forEach(System.out::println);
        filterList(List.of(1, 2, "a", "b", 0, 15)).forEach(System.out::println);
        filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)).forEach(System.out::println);

    }

    public static List<Object> filterList(final List<Object> list) {
        //СТАЛО
        //есть ли элементы
        if(list.isEmpty()) {
            throw new NullPointerException("List pustoy");
        }
        //возрашаем методу filterList
        return list.stream().filter(o -> o instanceof Integer).//фильтр для нахождения int
                filter(o -> {
            //проверка и exception в случае не позитивного числа
            if (Integer.parseInt(o.toString())<0) {

                throw new IllegalStateException("VVidite Positivnoe Chislo");
            }
            else return true;

            //должен вернуть этому методу лист с отбором
        }).collect(Collectors.toList());
        //БЫЛО
       /* List<Object> input = list.stream().filter(o -> o instanceof Integer).filter(o -> {
            if ((int) o < 0) {
                throw new IllegalStateException("VVidite Positivnoe Chislo");
            }
            return true;
        }).collect(Collectors.toList());
        //возрашаем методу filterList
        return input;*/








    }
}



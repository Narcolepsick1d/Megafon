
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
        }
        //лист с инпутами

        List<Object> input = list.stream().filter(o -> {
            if(o.getClass()==Integer.class){

                //проверка на int
                return true;
            }
            //string и другие элементы не допускаются
            return false;

            //второй фильтр поможет избавиться от множества операторов if
        }).filter(o -> {
            //проверка и exception в случае не позитивного числа
            if (Integer.parseInt(o.toString())<0) {

                throw new IllegalStateException("VVidite Positivnoe Chislo");
            }
            else return true;

            //должен вернуть этому методу лист с отбором
        }).collect(Collectors.toList());
    //возрашаем методу filterList
        return input;
        //Тут чу чуть похимичил и это тоже рабочая логика скажите если она лучше
//        return list.stream().filter(o -> {
//            return o.getClass() == Integer.class;
//        }).filter(o -> {
//            if (Integer.parseInt(o.toString())<0) {
//                throw new IllegalStateException("VVidite Positivnoe Chislo");
//            }
//            else return true;
//        }).collect(Collectors.toList());








    }
}



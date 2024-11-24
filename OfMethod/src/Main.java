import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        var list = List.of("Andrzej", "Bartek", "Jan");
        System.out.println(list);
        var set = Set.of("Andrzej", "Bartek", "Jan");
        System.out.println(set);
        Map<Integer, String> map = Map.of(1, "Andrzej", 2, "Bartek", 3, "Cezary",
                4, "Dariusz", 5, "Edward", 6, "Filip", 7, "Grzegorz",
                8, "Henryk", 9, "Ignacy", 10, "Jan");

        String[] elements = {"Andrzej", "Bartek", "Cezary", "Dariusz"};
        List<String> listFromArray = List.of(elements);
        System.out.println(listFromArray);
    }
}
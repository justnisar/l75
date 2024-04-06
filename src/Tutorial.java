import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Tutorial {



    public static void main(String[] args) {


        int[] array = new int[]{1,2,3};
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, " Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.)
        };
        // Create stream -> using Stream class
        Stream<int[]> arrayStream = Stream.of(array);

        //Stream.of(arrayOfEmps);
        // Create stream using StringBuilder



    }
}

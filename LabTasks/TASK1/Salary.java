import java.util.Arrays;
import java.util.List;

public class Salary {
    public static void main(String[] args) {

        List<Integer> salaries = Arrays.asList(25000, 35000, 42000, 28000, 50000);

        salaries.stream()
                .map(salary -> (int)(salary * 1.10))
                .mapToInt(salary -> salary)
                .forEach(salary -> System.out.println(salary));
    }
}
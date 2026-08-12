import java.util.Arrays;
import java.util.List;

public class Salary {
    public static void main(String[] args) {

        List<Integer> salaries = Arrays.asList(1000, 2000, 3000, 4000, 5000);

        salaries.stream()
                .map(salary -> (int)(salary * 1.10))
                .mapToInt(salary -> salary)
                .forEach(salary -> System.out.println(salary));
    }
}

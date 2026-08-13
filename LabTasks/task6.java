import java.util.*;
import java.util.function.Function;

public class FairRide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        
        Map<String, Function<Integer, Integer>> fareCalculator = new HashMap<>();

        fareCalculator.put("Bike", distance -> distance * 5);
        fareCalculator.put("Auto", distance -> distance * 12);
        fareCalculator.put("Cab", distance -> distance * 12);

        for (int i = 0; i < n; i++) {

            String rideType = sc.next();
            int distance = sc.nextInt();

            try {

                if (distance <= 0) {
                    throw new Exception("Invalid distance");
                }

                Function<Integer, Integer> calculator =
                        fareCalculator.get(rideType);

                if (calculator == null) {
                    throw new Exception("Invalid ride type");
                }

                int fare = calculator.apply(distance);

                System.out.println(fare);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}

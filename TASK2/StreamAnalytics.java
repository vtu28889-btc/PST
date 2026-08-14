import java.util.*;
import java.util.stream.*;

class SensorReading {
    String id;
    double temp;

    SensorReading(String id, double temp) {
        this.id = id;
        this.temp = temp;
    }

    public String getId() { return id; }
    public double getTemp() { return temp; }
}

public class StreamAnalytics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        List<SensorReading> readings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            readings.add(new SensorReading(sc.next(), sc.nextDouble()));
        }

       
        readings.stream()
            .filter(r -> r.getTemp() > 50) 
            .collect(Collectors.groupingBy(    
                SensorReading::getId,
                Collectors.averagingDouble(SensorReading::getTemp) 
            ))
            .entrySet()
            .stream()
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) 
            .forEach(e -> System.out.printf("%s %.1f\n", e.getKey(), e.getValue()));
    }
}
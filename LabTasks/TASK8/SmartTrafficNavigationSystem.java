import java.util.*;

class SmartTrafficNavigationSystem {

    static boolean dfs(int current, int destination,
                       ArrayList<ArrayList<Integer>> graph,
                       boolean[] visited) {

        if (current == destination) {
            return true;
        }

        visited[current] = true;

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, destination, graph, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();
        int M = sc.nextInt();

        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

       
        int source = sc.nextInt();
        int destination = sc.nextInt();

        boolean[] visited = new boolean[N + 1];

        
        if (dfs(source, destination, graph, visited)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
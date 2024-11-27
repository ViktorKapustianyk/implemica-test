package org.viktor_kapustianyk;

import java.util.*;

public class Graph {
    private final Map<String, Integer> cityIndex = new HashMap<>();
    private final List<List<int[]>> adjacencyList = new ArrayList<>();
    private int cityCount = 0;

    /**
     * Adds a city to the graph.
     * @param cityName the name of the city
     */
    public void addCity(String cityName) {
        if (!cityIndex.containsKey(cityName)) {
            cityIndex.put(cityName, cityCount++);
            adjacencyList.add(new ArrayList<>());
        }
    }

    /**
     * Adds a connection between two cities with a transportation cost.
     * @param cityName the name of the source city
     * @param neighborIndex the index of the neighboring city
     * @param cost the transportation cost
     */
    public void addConnection(String cityName, int neighborIndex, int cost) {
        int cityIdx = cityIndex.get(cityName);
        adjacencyList.get(cityIdx).add(new int[]{neighborIndex - 1, cost}); // Convert to 0-based index
    }

    /**
     * Finds the minimum cost between two cities using Dijkstra's algorithm.
     * @param source the source city name
     * @param destination the destination city name
     * @return the minimum cost or -1 if no path exists
     */
    public int findMinimumCost(String source, String destination) {
        if (!cityIndex.containsKey(source) || !cityIndex.containsKey(destination)) {
            return -1;
        }
        int sourceIdx = cityIndex.get(source);
        int destinationIdx = cityIndex.get(destination);

        int[] distances = new int[cityCount];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[sourceIdx] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{sourceIdx, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentNode = current[0];
            int currentDistance = current[1];

            if (currentNode == destinationIdx) {
                return currentDistance;
            }

            for (int[] neighbor : adjacencyList.get(currentNode)) {
                int neighborNode = neighbor[0];
                int weight = neighbor[1];
                int newDistance = currentDistance + weight;

                if (newDistance < distances[neighborNode]) {
                    distances[neighborNode] = newDistance;
                    pq.add(new int[]{neighborNode, newDistance});
                }
            }
        }

        return -1; // No path found
    }
}

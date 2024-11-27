package org.viktor_kapustianyk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void testFindMinimumCost() {
        // Create a graph instance
        Graph graph = new Graph();

        // Add cities
        graph.addCity("gdansk");
        graph.addCity("bydgoszcz");
        graph.addCity("torun");
        graph.addCity("warszawa");

        // Add connections
        graph.addConnection("gdansk", 2, 1);
        graph.addConnection("gdansk", 3, 3);
        graph.addConnection("bydgoszcz", 1, 1);
        graph.addConnection("bydgoszcz", 3, 1);
        graph.addConnection("bydgoszcz", 4, 4);
        graph.addConnection("torun", 1, 3);
        graph.addConnection("torun", 2, 1);
        graph.addConnection("torun", 4, 1);
        graph.addConnection("warszawa", 2, 4);
        graph.addConnection("warszawa", 3, 1);

        // Test paths
        assertEquals(3, graph.findMinimumCost("gdansk", "warszawa"),
                "Expected minimum cost from gdansk to warszawa is 3");
        assertEquals(2, graph.findMinimumCost("bydgoszcz", "warszawa"),
                "Expected minimum cost from bydgoszcz to warszawa is 2");
        assertEquals(-1, graph.findMinimumCost("gdansk", "unknown"),
                "Expected -1 for a path to a non-existent city");
        assertEquals(-1, graph.findMinimumCost("unknown", "warszawa"),
                "Expected -1 for a path from a non-existent city");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

/**
 *
 * @author Tran Nhan Nghia
 */
public class Dijkstra {
    public static void main(String[] args) {

        Vertex vA = new Vertex("A");
        Vertex vB = new Vertex("B");
        Vertex vC = new Vertex("C");
        Vertex vD = new Vertex("D");
        Vertex vE = new Vertex("E");

        vA.addNeighbour(new Edge(3, vA, vC));
        vA.addNeighbour(new Edge(5, vA, vB));
        vC.addNeighbour(new Edge(2, vC, vB));
        vC.addNeighbour(new Edge(6, vC, vE));
        vC.addNeighbour(new Edge(5, vC, vD));
        vB.addNeighbour(new Edge(4, vB, vC));
        vB.addNeighbour(new Edge(3, vB, vD));
        vB.addNeighbour(new Edge(4, vB, vE));
        vE.addNeighbour(new Edge(2, vE, vD));

        PathFinder shortestPath = new PathFinder();
        shortestPath.ShortestPath(vA);
        System.out.println("Khoảng cách tối thiểu từ:");
        System.out.println("A đến B: " + vB.getDistance());
        System.out.println("A đến C: " + vC.getDistance());
        System.out.println("A đến D: " + vD.getDistance());
        System.out.println("A đến E: " + vE.getDistance());
        System.out.println("Đường đi ngắn nhất từ:");
        System.out.println("A đến B: " + shortestPath.getShortestPath(vB));
        System.out.println("A đến C: " + shortestPath.getShortestPath(vC));
        System.out.println("A đến D: " + shortestPath.getShortestPath(vD));
        System.out.println("A đến E: " + shortestPath.getShortestPath(vE));

    }
}

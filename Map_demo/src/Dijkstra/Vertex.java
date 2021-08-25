/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Nhan Nghia
 */
public class Vertex implements Comparable<Vertex>{
    private boolean visited;
    private String name;
    private List<Edge> List;
    private double dist = Double.MAX_VALUE;
    private Vertex pr;

    public Vertex(String name) {
        this.name = name;
        this.List = new ArrayList<>();
    }

    public List<Edge> getList() {
        return List;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setList(List<Edge> List) {
        this.List = List;
    }

    public void addNeighbour(Edge edge) {
        this.List.add(edge);
    }

    public boolean Visited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPr() {
        return pr;
    }

    public void setPr(Vertex pr) {
        this.pr = pr;
    }

    public double getDistance() {
        return dist;
    }

    public void setDistance(double dist) {
        this.dist = dist;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Vertex otherV) {
        return Double.compare(this.dist, otherV.getDistance());
    }
}

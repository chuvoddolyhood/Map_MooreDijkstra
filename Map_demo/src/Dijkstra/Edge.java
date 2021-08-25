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
public class Edge {
    private double weight;
    private Vertex startVert;
    private Vertex targetVert;

    public Edge(double weight, Vertex startVert, Vertex targetVert) {
        this.weight = weight;
        this.startVert = startVert;
        this.targetVert = targetVert;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex getStartVert() {
        return startVert;
    }

    public void setStartVert(Vertex startVert) {
        this.startVert = startVert;
    }

    public Vertex getTargetVert() {
        return targetVert;
    }

    public void setTargetVert(Vertex targetVert) {
        this.targetVert = targetVert;
    }
}

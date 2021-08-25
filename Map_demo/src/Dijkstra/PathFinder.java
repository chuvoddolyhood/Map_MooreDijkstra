/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author Tran Nhan Nghia
 */
public class PathFinder {
    public void ShortestPath(Vertex sourceV) {
        sourceV.setDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceV);
        sourceV.setVisited(true);

        while (!priorityQueue.isEmpty()) {
            Vertex actualVertex = priorityQueue.poll();
            for (Edge edge : actualVertex.getList()) {
                Vertex v = edge.getTargetVert();

                if (!v.Visited()) {
                    double newDistance = actualVertex.getDistance() + edge.getWeight();
                    if (newDistance < v.getDistance()) {
                        priorityQueue.remove(v);
                        v.setDistance(newDistance);
                        v.setPr(actualVertex);
                        priorityQueue.add(v);
                    }
                }
            }
            actualVertex.setVisited(true);
        }
    }

    public List<Vertex> getShortestPath(Vertex targetVertex) {
        List<Vertex> path = new ArrayList<>();
        for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPr()) {
            path.add(vertex);
        }
        Collections.reverse(path);
        return path;
    }
}

package com.galvanize.geometrics;

import java.util.HashSet;
import java.util.Set;

public class Polygon implements Shape {

    private Set<Vertex> vertices = new HashSet<>();

    public Polygon(Set<Vertex> vertices) {
        this.vertices = vertices;
    }

    public Set<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(Set<Vertex> vertices) {
        this.vertices = vertices;
    }

    @Override
    public int area() {
        return 0;
    }

    @Override
    public int perimeter() {
        return 0;
    }

    @Override
    public Set<Vertex> vertices() {
        return null;
    }

    @Override
    public void draw() {
    }

    @Override
    public int calculateDistance(Vertex a, Vertex b) {
        return 0;
    }

}

package com.galvanize.geometrics;

import java.util.Set;

public class Rectangle extends Polygon {

    public Rectangle(Set<Vertex> vertices) {
        super(vertices);
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

package com.galvanize.geometrics;
import java.util.Set;

public interface Shape {

    public int area();
    public int perimeter();
    public Set<Vertex> vertices();
    public void draw();
    public int calculateDistance(Vertex a, Vertex  b);

}

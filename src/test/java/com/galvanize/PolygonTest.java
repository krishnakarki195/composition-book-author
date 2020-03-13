package com.galvanize;

import com.galvanize.geometrics.Polygon;
import com.galvanize.geometrics.Square;
import com.galvanize.geometrics.Vertex;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;


public class PolygonTest {

    @Test
    public void test0(){

        Vertex vertex00 = new Vertex(0,0);
        Vertex vertex11 = new Vertex(1,1);
        Vertex vertex01 = new Vertex(0,1);
        Vertex vertex10 = new Vertex(1,0);

        Set<Vertex> squareVertices = new HashSet<>();
        squareVertices.add(vertex00);
        squareVertices.add(vertex11);
        squareVertices.add(vertex10);
        squareVertices.add(vertex01);

        Polygon square = new Square(squareVertices);

    }

}

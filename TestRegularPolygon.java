
/**
 * This program creates a regular polygon with specified number of sides and side length. 
 * The polygon is then circumscribed and inscribed by circles and the program calculates the
 * radius of the two circles. The program also calculates the area and perimeter of the polygon.
 * 
 * Emily Zhuang
 * Mr. Lantsberger
 * APCS:Period 4
 * 19 September 2016
 */

import apcslib.*;
import chn.util.*;

public class TestRegularPolygon
{
    public static void main(String[] args)
    {
        RegularPolygon triangle = new RegularPolygon();
        RegularPolygon square = new RegularPolygon(4, 10);
        RegularPolygon octagon = new RegularPolygon(8, 5.75);
        RegularPolygon enneadecagon = new RegularPolygon(19, 2);
        RegularPolygon enneacontakaihenagon = new RegularPolygon(91, 0.5);
        
        //triangle
        System.out.println("triangle");
        System.out.println("number of sides = " + triangle.getSideLength());
        System.out.println("length of sides = " + triangle.getNumSide());
        System.out.println("radius of circumscribed circle = " + Format.left(triangle.getR(), 5, 2));
        System.out.println("radius of inscribed circle = " + Format.left(triangle.getr(), 5, 2));
        System.out.println("vertex angle = " + Format.left(triangle.vertexAngle(), 5, 2));
        System.out.println("perimeter = " + triangle.perimeter());
        System.out.println("area = " + Format.left(triangle.area(), 5, 2));
        System.out.println();
        
        //square
        System.out.println("square");
        System.out.println("number of sides = " + square.getSideLength());
        System.out.println("length of sides = " + square.getNumSide());
        System.out.println("radius of circumscribed circle = " + Format.left(square.getR(), 5, 2));
        System.out.println("radius of inscribed circle = " + Format.left(square.getr(), 5, 2));
        System.out.println("vertex angle = " + Format.left(square.vertexAngle(), 5, 2));
        System.out.println("perimeter = " + square.perimeter());
        System.out.println("area = " + Format.left(square.area(), 5, 2));
        System.out.println();
        
        //octagon 
        System.out.println("octagon");
        System.out.println("number of sides = " + octagon.getSideLength());
        System.out.println("length of sides = " + octagon.getNumSide());
        System.out.println("radius of circumscribed circle = " + Format.left(octagon.getR(), 5, 2));
        System.out.println("radius of inscribed circle = " + Format.left(octagon.getr(), 5, 2));
        System.out.println("vertex angle = " + Format.left(octagon.vertexAngle(), 5, 2));
        System.out.println("perimeter = " + octagon.perimeter());
        System.out.println("area = " + Format.left(octagon.area(), 5, 2));
        System.out.println();
        
        //enneadecagon
        System.out.println("enneadecagon");
        System.out.println("number of sides = " + enneadecagon.getSideLength());
        System.out.println("length of sides = " + enneadecagon.getNumSide());
        System.out.println("radius of circumscribed circle = " + Format.left(enneadecagon.getR(), 5, 2));
        System.out.println("radius of inscribed circle = " + Format.left(enneadecagon.getr(), 5, 2));
        System.out.println("vertex angle = " + Format.left(enneadecagon.vertexAngle(), 5, 2));
        System.out.println("perimeter = " + enneadecagon.perimeter());
        System.out.println("area = " + Format.left(enneadecagon.area(), 5, 2));
        System.out.println();
        
        System.out.println("enneacontakaihenagon");
        System.out.println("number of sides = " + enneacontakaihenagon.getSideLength());
        System.out.println("length of sides = " + enneacontakaihenagon.getNumSide());
        System.out.println("radius of circumscribed circle = " + Format.left(enneacontakaihenagon.getR(), 5, 2));
        System.out.println("radius of inscribed circle = " + Format.left(enneacontakaihenagon.getr(), 5, 2));
        System.out.println("vertex angle = " + Format.left(enneacontakaihenagon.vertexAngle(), 5, 2));
        System.out.println("area = " + Format.left(enneacontakaihenagon.area(), 5, 2));
        System.out.println();
        
    }
}

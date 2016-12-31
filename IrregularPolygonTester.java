
/**
 * Lab 19.1 Irregular Polygon
 * 
 * Emily Zhuang
 * Mr. Lantsberger
 * APCS:Period 4
 * 6 December 2016
 */

import apcslib.*;       // for Format()
import java.awt.geom.*; // for Point2D.Double 

public class IrregularPolygonTester
{
    /**
     * Here is the main() method. This program will read in a given
     * number of coordinates for a polygon and draw out the polygon.
     * It will then calculate the perimeter and the area of the 
     * polygon based on the coordinates of the shape. 
     */
    public static void main(String[] args)
    {
        IrregularPolygon poly = new IrregularPolygon();
        
        //prompts and reads in coordinate values from user
        poly.input();   
        //draws the polygon based on the inputed coordinates
        poly.draw();
        
        //prints the calculated perimeter of the polygon
        System.out.println("The perimeter of the polygon is " + 
                            Format.left(poly.perimeter(), 5, 2) + " units");
        //prints the calculated area of the polygon
        System.out.println("The area of the polygon is " + 
                            Format.left(poly.area(), 5, 1) + " square units");
    }
}

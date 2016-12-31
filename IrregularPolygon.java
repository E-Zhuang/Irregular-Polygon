
/**
 * Lab 19.1 Irregular Polygon
 * 
 * Emily Zhuang
 * Mr. Lantsberger
 * APCS:Period 4
 * 6 December 2016
 */

import java.awt.geom.*; // for Point2D.Double 
import java.util.*; // for ArrayList 
import apcslib.*; // for DrawingTool
import chn.util.*;//for ConsoleIO

class IrregularPolygon
{
    private ArrayList myPolygon;    //this ArrayList stores a list of Point2D.Double objects
    
    /**
     * This constructor method instantiates the ArrayList to a length of 4 units. 
     */
    public IrregularPolygon() 
    { 
        myPolygon = new ArrayList(4);
    }
    
    /**
     * This method prompts the user for how many verticies they will be 
     * inputing and then asking for them to input the values of the 
     * verticies. The method then instantiates the coordinates as 
     * Point2D.Double objects and then using the method add() to 
     * add the object to the ArrayList. 
     */
    public void input()
    {
        ConsoleIO keyboard = new ConsoleIO();        
        Point2D.Double myPoint;       //the point that is currently being read in
        int vert;                     //total number of verticies
        double x, y;                  //x and y coordinates for the point
        
        //prompts the user for total number of verticies and read the value in
        System.out.print("How many verticies would you like to input? ");
        vert = keyboard.readInt();
        
        for (int k = 1; k <= vert; k++)     //loops based on the number of vert
        {
            //prompts the user for x value and stores under variable x
            System.out.print("Give me the x coordinate for point " + k + ": ");
            x = keyboard.readDouble();
            //prompts the user for y value and stores under variable y
            System.out.print("Give me the y coordinate for point " + k + ": ");
            y = keyboard.readDouble();
            
            //instantiates Point2D.Double based on values of x and y
            myPoint = new Point2D.Double(x,y);
            
            //call add() to add to ArrayList
            add(myPoint);
        }
    }
    
    /**
     * This method adds the given Point2D.Double to the end of the 
     * myPolygon ArrayList.
     */
    public void add(Point2D.Double aPoint) 
    { 
        myPolygon.add(aPoint);
    }
    
    /**
     * This method draws the polygon based on the input values by using 
     * DrawingTool and SketchPad (both which are part of the apcslib.* 
     * libraries. 
     */
    public void draw() 
    {
        //declares and instantiates the SketchPad and DrawingTool
        SketchPad paper = new SketchPad(200, 200);
        DrawingTool pencil = new DrawingTool(paper);
        //declares the Point2D.Double reference variables
        Point2D.Double point1, point;
        
        //lifts DrawingTool up, moves to first vertex, and sets DrawingTool down
        pencil.up();
        
        point1 = (Point2D.Double) myPolygon.get(0);
        pencil.move(point1.getX(), point1.getY());
        pencil.down();
        
        //continutes to move the DrawingTool to the given coordinates
        for (int k = 1; k < myPolygon.size(); k++)
        {
            point = (Point2D.Double) myPolygon.get(k);
            pencil.move(point.getX(), point.getY());
        }
        
        //moves the pencil back to the original vertex
        pencil.move(point1.getX(), point1.getY());
    }
    
    /**
     * This method calculates the perimeter of the polygon by using the
     * distance() method and adding all the distances together. 
     */
    public double perimeter() 
    {
        //the two endpoint of the line segment 
        Point2D.Double ptA, ptB;
        //declares and instantiates the perimeter variable
        double peri = 0;
        
        //adds all the distances of the polygon's sides 
        for (int k = 1; k < myPolygon.size(); k++)
        {
            ptA = (Point2D.Double)myPolygon.get(k - 1);
            ptB = (Point2D.Double)myPolygon.get(k);
            
            peri += ptA.distance(ptB);
        }
        
        //adds the length of the last side
        ptA = (Point2D.Double)myPolygon.get(0);
        ptB = (Point2D.Double)myPolygon.get(myPolygon.size() - 1);
        peri += ptA.distance(ptB);
        
        return peri;
    }
    
    /**
     * This method calculates and returns the area of the polygon by using a given
     * formula.
     */
    public double area() 
    { 
        //the two working points
        Point2D.Double pt1, pt2;
        //add and sub are variables used in the formula
        double add, sub;
        add = 0;
        sub = 0;
        
        //This loop adds the products of the nth x value to the nth + 1 y value
        for (int k = 1; k < myPolygon.size(); k++)
        {
            pt1 = (Point2D.Double) myPolygon.get(k - 1);
            pt2 = (Point2D.Double) myPolygon.get(k);
            
            add += pt1.getX() * pt2.getY();
        }
        pt1 = (Point2D.Double) myPolygon.get(myPolygon.size() - 1);
        pt2 = (Point2D.Double) myPolygon.get(0);
        add += pt1.getX() * pt2.getY();
        
        //This loop adds the products of the nth y value to the nth + 1 x value
        for (int k = 1; k < myPolygon.size(); k++)
        {
            pt1 = (Point2D.Double) myPolygon.get(k - 1);
            pt2 = (Point2D.Double) myPolygon.get(k);
            
            sub += pt1.getY() * pt2.getX();
        }
        pt1 = (Point2D.Double) myPolygon.get(myPolygon.size() - 1);
        pt2 = (Point2D.Double) myPolygon.get(0);
        sub += pt1.getY() * pt2.getX();
        
        //it returns the area
        return 0.5 * (add - sub);
    } 
}

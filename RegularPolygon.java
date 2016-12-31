
/**
 * This class has the class definitions of a regular polygon and it also creates 
 * methods that calculate the polygon's area and perimeter as well as the radius of the 
 * circumscribed and inscribed circles.
 */

class RegularPolygon
{
    private int myNumSides;        // # of sides
    private double mySideLength;   // length of sides
    private double myR;            //radius of circumscribed circle
    private double myr;            //radius of inscribed circle
    
    // constructors
    public RegularPolygon() 
    {
        myNumSides = 3;
        mySideLength = 10;
        calcR();
        calcr();
    }
    
    public RegularPolygon(int numSides, double sideLength) 
    {
        myNumSides = numSides;
        mySideLength = sideLength;
        calcR();
        calcr();
    }
    
    // private methods 
    private void calcR() //outer radius
    {
        myR = (0.5) * mySideLength / Math.sin(Math.PI / (double)myNumSides);
    }
    
    private void calcr()  //inner radius
    {
        myr = (0.5) * mySideLength / Math.tan(Math.PI / (double)myNumSides);
    }
    
    // public methods
    public double vertexAngle() 
    {
        return (((double)myNumSides - 2) / (double)myNumSides * 180);
    }
    
    public double perimeter() 
    {
        return ((double)myNumSides * mySideLength);
    }
    
    public double area() 
    {
        return (0.5) * (double)myNumSides * Math.pow(myR, 2) * Math.sin(2 * Math.PI / myNumSides);
    }
    
    public double getNumSide() 
    {
        return (double)myNumSides;
    }
    
    public double getSideLength() 
    {
        return mySideLength;
    }
    
    public double getR() 
    {
        return myR;
    }
    
    public double getr() 
    {
        return myr;
    }
}   


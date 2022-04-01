public class Point {

    private int x;
    private int y;
    private String label;

    public Point(String label, int x,int y)
    {
        this.label = label;
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString()
    {
        return label + " is at x =" + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object obj)
    {
        // safety check ("guard")
        if (obj == null || !(obj instanceof Point))
        {
            return false;
        }

        Point objPoint = (Point) obj;
        return (this.x == objPoint.x) && (this.y == objPoint.y);
    }
    }






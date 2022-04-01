public class ThreeDPoint extends Point{

    private int x;
    private int y;
    private String label;
    private int z;

    public ThreeDPoint(String label, int x,int y, int z)
    {
        super(label,x,y);
        this.z = z;
    }

    @Override
    public String toString()
    {
        return label + " is at x =" + x + ", y = " + y + ", z = " + z;
    }


    @Override
    public boolean equals(Object obj)
    {
        // safety check ("guard")
        if (obj == null || !(obj instanceof ThreeDPoint))
        {
            return false;
        }

        ThreeDPoint otherPoint = (ThreeDPoint) obj;
        return (super.equals(obj)) && (this.z == otherPoint.z);
    }
}


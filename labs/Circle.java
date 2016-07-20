package labs;

public class Circle extends Shape1
{

    int radius;

    public Circle()
    {
        this(0, 0, 1);
    }

    public Circle(final int r)
    {
        this(0, 0, r);
    }

    public Circle(final int x, final int y, final int r)
    {
        super(x, y, Color.RED);
        radius = r;
    }

    public Circle(final int x, final int y, final int r, final Color myColor)
    {
        super(x, y, myColor);
        radius = r;
    }

    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

}

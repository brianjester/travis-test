package labs;

public class Rectangle extends Shape1
{
    int   height;
    int   width;
    Color myColor;

    public Rectangle()
    {
        this(0, 0);
    }

    public Rectangle(final int h, final int w)
    {
        super(0, 0, Color.RED);
        height = h;
        width = w;
    }

    public Rectangle(final int x, final int y, final int h, final int w, final Color myColor)
    {
        super(x, y, myColor);
        height = h;
        width = w;
    }

    @Override
    public double getArea()
    {
        return height * width;
    }

}

package labs;

public abstract class Shape1
{

    int   x;
    int   y;
    Color myColor;

    public Shape1()
    {
        this.x = 0;
        this.y = 0;
        this.myColor = Color.RED;
    }

    public Shape1(final int x, final int y, final Color myColor)
    {
        this.x = x;
        this.y = y;
        this.myColor = myColor;
    }

    public int getX()
    {
        return x;
    }

    public void setX(final int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(final int y)
    {
        this.y = y;
    }

    public Color getMyColor()
    {
        return myColor;
    }

    public void setMyColor(final Color myColor)
    {
        this.myColor = myColor;
    }

    public abstract double getArea();
}

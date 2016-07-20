package labs;

public class ShapeTester
{
    public static void main(final String[] args)
    {
        final Shape1[] shapes = new Shape1[3];
        shapes[0] = new Rectangle(10, 20, 30, 40, Color.BLUE);
        shapes[1] = new Rectangle(5, 15);
        shapes[2] = new Circle(13);

        for (final Shape1 shape : shapes)
        {
            System.out.printf("The area is %1.2f \n", shape.getArea());
        }
    }

}

/**
 * Created by Maim on 16.11.2018.
 */
public class Ball
{
    private String color;
    private int diameter;

    public Ball(String c, int d)
    {
        color = c;
        diameter = d;
    }
    public Ball(String c)
    {
        color = c;
        diameter = 0;
    }
    public Ball()
    {
        color = "Red";
        diameter = 0;
    }
    public void setAge(int d)
    {
        diameter = d;
    }
    public void setColor(String c)
    {
        color = c;
    }
    public String getColor(String color)
    {
        return color;
    }
    public int getDiameter()
    {
        return diameter;
    }
    public String toString()
    {
        return color+", диаметр "+diameter;
    }
    public void intoBallColor()
    {
        System.out.println(color+" мяч,диаметром "+diameter+" ");
    }
}

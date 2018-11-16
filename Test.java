/**
 * Created by Maim on 16.11.2018.
 */
public class Test
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball("Красный", 12);
        Ball b2 = new Ball("Желтый", 10);
        Ball b3 = new Ball("Синий");
        b3.setAge(8);
        System.out.println(b1);
        b1.intoBallColor();
        b2.intoBallColor();
        b3.intoBallColor();
    }
}

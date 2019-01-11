import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class Card
{
    private boolean face_down = true;

    public Card()
    {

    }

    public boolean get_face_down()
    {
        return face_down;
    }

    public void flip_face_down()
    {
        if (face_down)
        {
            face_down = false;
        }

        else
        {
            face_down = true;
        }
    }
}

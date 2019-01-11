import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main{

    private static ArrayList <Card> list = new ArrayList <Card>();

    public static void main(String[] args)
    {
        for (int i = 1; i <= 20; i++)
        {
            Card temp = new Card();

            list.add(temp);
        }

        System.out.println ("Face down is " + 1 + " and face up is " + 0 + ".  Notice how the number constantly decreases on each line.  Because of this, it eventually has to reach all zeros (all the cards being face up).\n");

        while (at_least_one_face_down()) // Simulation runs while at least one card is still face down:
        {
            // Pick a random index in the list:

            int index = (int) (Math.random() * list.size());

            Card temp = list.get(index);

            // Only turn this card face up if it is currently facing down:

            if (temp.get_face_down())
            {
                temp.flip_face_down();

                // Now to flip the card immediately to the right:

                index ++;

                if (index < list.size())
                {
                    Card temp_2 = list.get(index);

                    temp_2.flip_face_down();
                }

                // Now to run a for loop that prints the cards.  0 represents facing down, 1 represents facing up:

                for (Card current: list)
                {
                    if (current.get_face_down())
                    {
                        System.out.print("1");
                    }

                    else
                    {
                        System.out.print("0");
                    }
                }

                System.out.print("\n\n");

            }

        } // end of while loop.


    } // end of main method.

    public static boolean at_least_one_face_down()
    {
        // Returns "true" if at least one of the cards is facing down.

        for (Card current: list)
        {
            if (current.get_face_down())
            {
                return true;
            }
        }

        return false;
    }
}

/*====================================================================================
 |    Assignment:    Program #1(a): Falling Object
 |        Author:    Gabriel Perez
 |  Sect. Leader:    Patrick Hickey
 |
 |        Course:    CSc 227
 |    Instructor:    L. McCann
 |      Due Date:    January 28, 2014, by 9:00 p.m. MST
 |
 |   Description:    Given a height (in feet) entered by the user, this
 |                   program determines how long (in seconds) it will take an
 |                   object dropped from that height to hit the ground, using
 |                   the kinematic equation t = sqrt(height / (0.5 * 32.174)),
 |                   where 32.174 is the average acceleration due to gravity
 |                   on Earth. In addition, it will report the object's speed
 |                   (s = 32.174 * t) at the time of impact.
 |
 | Deficiencies:     None known; this program meets specifications.
*====================================================================================*/
import java.util.Scanner;
                                                             

public class Prog1a
{

    public static void main (String [] args)
    {

        final double ACCEL_GRAVITY = 32.174;    // average acceleration due to
                                                // gravity (in ft/sec^2)

        double height,    // height (in feet) from which object is dropped
               time,      // duration of the object's fall (in seconds)
               speed;     // speed (in feet per second) at time of impact
        Scanner keyboard; // to reference Scanner object for keyboard input

        keyboard = new Scanner (System.in);

        System.out.println("\nThis program will determine how long it will "
                         + "take for an object dropped\nfrom a given height "
                         + "(in feet) to hit the ground here on Earth, and "
                         + "how fast\nit will be traveling when it hits.\n");

        System.out.print("How high (in feet) is the object?: ");
        height = keyboard.nextDouble();

        time = Math.sqrt(height / (0.5 * ACCEL_GRAVITY));
        speed = ACCEL_GRAVITY * time;

        System.out.println("\nIf you drop an object from "
                         + height + " feet, it will hit the ground\n"
                         + "in approximately " + time + " seconds "
                         + "at a speed\nof approximately "
                         + speed + " feet per second.\n");

    } // main

} // class FallTime


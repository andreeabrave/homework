package Exercitii;

import org.testng.annotations.Test;

public class INT_exercises {

    @Test

    // Calculate the Perimeter of a Rectangle
    public void calculPerimetru(){
        double length = 5.0;
        double width = 3.0;

        double perimeter = 2 * (length + width);

        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    // Convert Minutes into Seconds
    public void minutesConvertor(){
        int minutes = 5;
        int seconds = minutes * 60;

        System.out.println(minutes + " minutes is equal to " + seconds + " seconds.");

    }


}

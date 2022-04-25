/*
 
Program:.java          Last Date of this Revision: April 25, 2022
 
Purpose: Modify the ReviewCircle class to include a class method named displayAreaFormula, as shown in the previous section.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Assignments;

public class CirclePart3 {

	public static void main(String[] args)
	{

		ReviewCircle spot = new ReviewCircle(5);
		
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle area: " + spot.area());
		ReviewCircle.displayareaformula();

	}

}
/*
Circle radius: 5.0
Circle area: 78.5
The formula for the area of a circle is: a = Pi * r * r
*/
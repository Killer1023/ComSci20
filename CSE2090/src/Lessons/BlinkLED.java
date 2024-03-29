/*
 
Program:.java          Last Date of this Revision: May 30, 2022
 
Purpose: You will see the red LED blink.
 
Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 20
 
 
*/
package Lessons;

//Add Phidgets Library 
import com.phidget22.*;

public class BlinkLED {
  //Handle Exceptions 
  public static void main(String[] args) throws Exception{

      //Create 
      DigitalOutput redLED = new DigitalOutput();

      //Address 
      redLED.setHubPort(1);
      redLED.setIsHubPortDevice(true);

      //Open 
      redLED.open(1000);

      //Use your Phidgets 
      while(true){
          redLED.setState(true);
          Thread.sleep(1000);
          redLED.setState(false);
          Thread.sleep(1000);
      }
  }
}

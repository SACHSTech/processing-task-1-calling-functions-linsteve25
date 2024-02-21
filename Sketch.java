import javax.swing.text.StyledEditorKit.ForegroundAction;

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
    background(81, 201, 245);
    stroke(18, 18 ,18);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // print the window of the car
    
    fill(255, 0, 0);
    ellipse(215, 173, 180, 145);
    fill(92, 237, 225);
    ellipse(215, 180, 150, 130);
    line(250, 175, 250, 123);
    line(236, 175, 236, 118);

    // print rectangle body of the car 

    fill(255, 0, 0);
    rect(60, 175, 265, 75, 30);

    // print wheels of the car

    fill(0);
    circle(110, 250, 60);
    circle(275, 250, 60);

    // print headlights

    fill(230, 226, 37);
    rect(60, 190, 25, 25, 55);

    // print doorhandles 

    fill(0);
    rect(200, 190, 30, 10, 10);

    // print door

    line(236, 175, 236, 250);
    line(141, 175, 140, 250);

    // print foreground

    fill(121, 141, 143);
    rect(0, 280, 400, 280);
    
  }
  
  // define other methods down here.
}
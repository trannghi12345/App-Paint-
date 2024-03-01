/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;
import java.awt.geom.Ellipse2D;

public class MyCircle extends MyOval {
	public void setElip2d(Ellipse2D elip2d) {
		elip2d.setFrame(elip2d.getX(), elip2d.getY(), elip2d.getWidth(), elip2d.getWidth());
		super.setElip2d(elip2d);
	}	
}



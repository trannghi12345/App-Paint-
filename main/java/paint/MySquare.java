/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

import java.awt.Rectangle;

public class MySquare extends MyRectangle {
	public void setRect(Rectangle rect) {
		rect.setBounds(rect.x, rect.y , rect.width, rect.width);
		super.setRect(rect);
	}
}
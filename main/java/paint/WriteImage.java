/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class WriteImage extends JComponent{
	public WriteImage(){
		
	}
	public void Paint(GraphicAdapter g){
		g.getGraphicAdapter().drawImage(OpenFile.image, 0, 0, null);
	}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class pngSaveFilter extends FileFilter
{ 
	public boolean accept(File f)
	{
		if (f.isDirectory())
        {
           return false;
        }
		String s = f.getName();
		return s.endsWith(".png")||s.endsWith(".PNG");
  }
  public String getDescription() 
  {
      return "*.png,*.PNG";
  }
}


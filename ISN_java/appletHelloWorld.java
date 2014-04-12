/*
Copyright 2014  Yves Mercadier

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.
   
Sujet : applet helloworld
*/


import java.applet.*;
import java.awt.*;

public class appletHelloWorld extends Applet {
		
		public void init() {
	     
	   }
    public void paint(Graphics g) {
        g.drawString("Bonjour joli monde!", 50, 50);
    }
}

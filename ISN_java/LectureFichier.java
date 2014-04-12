/*
 Copyright 2014  Yves Mercadier

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.
   

Sujet : Lecture des lignes du fichier data.txt avec la classe scanner.
*/

import java.io.FileReader;
import java.util.Scanner;
 
public class LectureFichier {
  public static void main(String args[]) throws Exception { 
    FileReader file = new FileReader("data.txt");
 
    Scanner src = new Scanner(file);
 
    while (src.hasNext()) {
    System.out.println(src.next());
    }
    file.close();
  }
}

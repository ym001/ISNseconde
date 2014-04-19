/*
 * sans titre.java
 * 
 * Copyright 2014  Yves Mercadier
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;

public class RecursifMultiplication  {
    private static Scanner clavier = new Scanner(System.in);
	
	static int multiplication(int n,int m){
		
		if (n==0){return 0;}
		else{return multiplication(n-1,m)+m;}
		
		}
		
	public static void main (String args[]) {
		    System.out.println("-->    début du programme");
		    System.out.print("Donnez un entier positif : ");
		    int a = clavier.nextInt();
			System.out.print("Donnez un entier positif : ");
		    int b = clavier.nextInt();
		    System.out.println();
		    System.out.println("   "+a+" * "+b+" = "+multiplication(a,b)+"\n");
		    System.out.println("-->    fin du programme");

	}
}


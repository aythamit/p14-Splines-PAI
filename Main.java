/**
 * Main.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 14 : Splines
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 14 may. 2017
 *
 */
package splines.controlador;

import java.util.ArrayList;

import modelo.SplineInterpolator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Float> xArrayList = new ArrayList<>();
		
		xArrayList.add( (float) 2); 
		xArrayList.add( (float) 23); 
		xArrayList.add( (float) 59); 
		ArrayList<Float> yArrayList = new ArrayList<>();
		yArrayList.add( (float) 20);
		yArrayList.add( (float) 30);
		yArrayList.add( (float) 79);
		
		SplineInterpolator interpolator = SplineInterpolator.createMonotoneCubicSpline(xArrayList, yArrayList);
		System.out.println(interpolator);

	}

}

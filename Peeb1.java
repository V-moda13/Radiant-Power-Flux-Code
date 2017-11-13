// Peeb1

import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;
import java.lang.*;
public class Peeb1 {
	public static void main(String[] args){
		// use of scanners 
		System.out.println("Calculate radiant photon flux at a given wavelength");
		System.out.println("and temperature using Planck's Law"); // states what the program calculates
		Scanner s = new Scanner (System.in);
		System.out.print("wavelength in microns: ");
		double wavelength = s.nextDouble(); 
		System.out.print("temperature in degrees Kelvin: ");
		double temp = s.nextDouble();

		// declare the variables in planck's law
		double h = 6.626068 * Math.pow(10, -34); //planck's constant
		double c = 299792500; //speed of light in vacuum
		double k = 1.38066 * Math.pow(10,-23); //Boltzmann's constant
		double wave1 = wavelength * Math.pow(10, -6);

		// write the equation for plancks law
		double numerator = (2 * h * c * c * Math.pow(wave1, -5)); //numerator of the function
		double exp = ((h * c)/(wave1 * k * temp)); //the exponents solved that are raised to e
		double denominator = Math.pow(Math.E,((h * c)/(wave1*k*temp)))-1; //denominator of the function
		double b = numerator / denominator; //finding the radiant power flux
		DecimalFormat df1 =  new DecimalFormat("0.00E00");
		System.out.println("radiant flux B = " + df1.format(b).toLowerCase());
	}
}
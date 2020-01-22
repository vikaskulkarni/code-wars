package com.codewars.challenges.metalChemist;

public class Atom {

	public String element;
	public int id;

	@Override
	public String toString() {
		return "Atom(" + element + "." + id + ":" + element + ")";
	}

}

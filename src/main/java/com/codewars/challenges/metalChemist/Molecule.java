package com.codewars.challenges.metalChemist;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.NonNull;

@EqualsAndHashCode(callSuper = false)
public class Molecule {
	private String formula;
	private double molecularWeight;
	private List<Atom> atoms;
	@NonNull
	private String name;
	private boolean isThisLocked;

	public Molecule() {
	}

	public Molecule(@NonNull String name) {
		super();
		this.name = name;
	}

	public Molecule brancher(int... noOfCarbons) {
		return this;
	}

	public void bounder(T... carbonBranch) {

	}

	public void mutate(T... combination) throws LockedMolecule {

	}

	public void add(T... combination) {

	}

	public void addChaining(int nc, int nb, String... elements) {

	}

	public Molecule closer() throws LockedMolecule {
		return this;
	}

	public void unlock() throws EmptyMolecule {
		this.isThisLocked = false;
	}

	public String getFormula() throws UnlockedMolecule {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public double getMolecularWeight() throws UnlockedMolecule {
		return molecularWeight;
	}

	public void setMolecularWeight(double molecularWeight) {
		this.molecularWeight = molecularWeight;
	}

	public List<Atom> getAtoms() {
		return atoms;
	}

	public void setAtoms(List<Atom> atoms) {
		this.atoms = atoms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

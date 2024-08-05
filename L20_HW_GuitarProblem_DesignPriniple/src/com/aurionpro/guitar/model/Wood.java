package com.aurionpro.guitar.model;

public enum Wood {

	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLD, CEDAR, ADIRONDACK, ALDER, SITKA;

	public String toString() {
		switch (this) {
		case INDIAN_ROSEWOOD:
			return "indian_rosewood";
		case BRAZILIAN_ROSEWOOD:
			return "brazalian_rosewood";
		case MAHOGANY:
			return "mahogany";
		case MAPLE:
			return "maple";
		case COCOBOLD:
			return "cocobold";
		case CEDAR:
			return "cedar";
		case ADIRONDACK:
			return "adirondack";
		case ALDER:
			return "alder";
		case SITKA:
			return "sitka";
		default:
			return null;
		}
	}

}
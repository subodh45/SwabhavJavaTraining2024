package com.aurionpro.guitar.model;

public enum Builder {

	FENDER, MARTIN, GIBSONS, COLLINGS, OLSEN, RYAN, PRS, ANY;

	public String toString() {
		switch (this) {
		case FENDER:
			return "fender";
		case MARTIN:
			return "martin";
		case GIBSONS:
			return "gibsons";
		case COLLINGS:
			return "collings";
		case OLSEN:
			return "olsen";
		case RYAN:
			return "ryan";
		case PRS:
			return "prs";
		case ANY:
			return "any";
		default:
			return null;
		}
	}
}

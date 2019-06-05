package com.github.alexanderwe.bananaj.model.list.segment;

/**
 * Created by alexanderweiss on 04.02.16.
 */
public enum SegmentType {

    SAVED("saved"),
    STATIC("static"),
    FUZZY("fuzzy");

	private String stringRepresentation;
	
	SegmentType(String stringRepresentation ) {
		setStringRepresentation(stringRepresentation);
	}

	/**
	 * @return the stringRepresentation
	 */
	public String getStringRepresentation() {
		return stringRepresentation;
	}

	/**
	 * @param stringRepresentation the stringRepresentation to set
	 */
	private void setStringRepresentation(String stringRepresentation) {
		this.stringRepresentation = stringRepresentation;
	}
}

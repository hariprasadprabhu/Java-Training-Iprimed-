package com.cns;

public class Lion 
{
	String name;
	String forest;
	public Lion(String name, String forest) {
		super();
		this.name = name; // these are dependencies
		this.forest = forest;
	}
	@Override
	public String toString() {
		return "Lion [name=" + name + ", forest=" + forest +"]";
	}
	
	
}

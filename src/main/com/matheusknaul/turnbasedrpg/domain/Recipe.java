package main.com.matheusknaul.turnbasedrpg.domain;

import java.util.ArrayList;

import main.com.matheusknaul.turnbasedrpg.itens.Resource;

public class Recipe {
	private String name;
	private ArrayList<Resource> resources = new ArrayList<>();
	
	public Recipe() {
		super();
	}
	public Recipe(String name, ArrayList<Resource> resources) {
		super();
		this.name = name;
		this.resources = resources;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Resource> getResources() {
		return resources;
	}
	public void setResources(ArrayList<Resource> resources) {
		this.resources = resources;
	}
	
	
}

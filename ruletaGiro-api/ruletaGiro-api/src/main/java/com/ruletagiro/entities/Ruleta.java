package com.ruletagiro.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ruleta implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String id;
	private int giros;
	private String[][] matriz  = null;
	
	
	public Ruleta() {
		
	}

	
	//Getterrs y setters

	public String getId() {
		return id;
	}
	

	public void setId(String id) {
		this.id = id;
	}
	



	public String[][] getMatriz() {
		return matriz;
	}


	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}

	

	public int getGiros() {
		return giros;
	}


	public void setGiros(int giros) {
		this.giros = giros;
	}


	@Override
    public String toString() {
        return "Ruleta [id=" + id + ", estado="  + "]";
    }
	
}

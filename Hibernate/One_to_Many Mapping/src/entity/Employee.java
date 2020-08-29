package entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MY_DATA.Emp1")
public class Employee {
	
	

	@Id
	private int id;
	private String name;
	private ArrayList<Department> departmet;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public ArrayList<Department> getDepartmet() {
		return departmet;
	}



	public void setDepartmet(ArrayList<Department> departmet) {
		this.departmet = departmet;
	}

	

}

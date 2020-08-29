package entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "My_data.Emp1")
public class Employee 
{
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int id;
	private String name;
	
	@OneToMany(targetEntity = Department.class)
	private ArrayList role;

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

	public ArrayList getRole() {
		return role;
	}

	public void setRole(ArrayList<Department> list) {
		this.role = list;
	}
	
	
}
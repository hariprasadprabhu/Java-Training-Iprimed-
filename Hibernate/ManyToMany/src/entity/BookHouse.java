package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;


@Entity
@Table(name = "BookHouse", schema = "MY_DATA")
public class BookHouse {

	@Id
	int id;
	String name;
	@ManyToMany(targetEntity = Student1.class)
	private List std;
	public BookHouse() {
		
		
	}
	public BookHouse(int id, String name, List std) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
	}
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
	public List getStd() {
		return std;
	}
	public void setStd(ArrayList<Student1> list1) {
		this.std = (List) list1;
	}
	
}

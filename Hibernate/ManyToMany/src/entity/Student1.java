package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Student1", schema = "MY_DATA")
public class Student1 {
	@Id
	private int id;
	private String name;
	
	@ManyToMany(targetEntity = BookHouse.class)
	private List book;
	
	public Student1()
	{
		
	}
	
	public Student1(int id, String name, List book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
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
	public List getBook() {
		return book;
	}
	public void setBook(List book) {
		this.book = book;
	}
	
	

}

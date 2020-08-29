package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "My_data")
public class Course1 
{
	@Id
	private int c_id;
	private String c_name;
	
	@OneToOne
	private Student std;
	
	

	
	public Course1() 
	{

	}

	public Course1(int c_id, String c_name, Student std) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.std = std;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
		this.std = std;
	}

}

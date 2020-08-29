package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="My_data.Dept1")
public class Department 
{
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	 private int d_id;
	 private String d_roll;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_roll() {
		return d_roll;
	}
	public void setD_roll(String d_roll) {
		this.d_roll = d_roll;
	}
	 
}

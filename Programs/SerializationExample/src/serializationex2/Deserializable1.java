package serializationex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import serializationex.com.Student;

public class Deserializable1{

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fi = new FileInputStream("Student.txt");
		ObjectInputStream oi =new ObjectInputStream(fi);
		Student st = (Student)oi.readObject();
		fi.close();
		oi.close();
		System.out.println("De serialization succesfull");
		System.out.println("ID:"+st.id+"\nname:"+st.name+"\nMarks:"+st.marks);
	}

}

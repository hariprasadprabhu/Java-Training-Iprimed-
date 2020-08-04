package serializationex.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable1 {

	public static void main(String[] args) throws IOException {
		Student s =new Student(200, "hari", 98);
		System.out.println("ID:"+s.id+"\nname:"+s.name+"\nMarks:"+s.marks);
		
		/*File f = new File("Student.txt");
		f.createNewFile();*/
		
		FileOutputStream fo = new FileOutputStream("Student.txt",true);
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(s);
		oo.flush(); // used to write every thing to destination
		System.out.println("Serializable success");
	}

}

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

class Serialize {
	public static void main(String[] args) throws IOException {
		Student s = new Student(10, "Prasanjit", 29);
		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(s);
		out.flush();
		System.out.println("success");
	}
}
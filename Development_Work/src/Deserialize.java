import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize{
	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("f.txt");
		ObjectInputStream obj = new ObjectInputStream(fin);
		Student s = (Student) obj.readObject();
		System.out.println(s.id + " " + s.name + " " + s.age);
	}
}
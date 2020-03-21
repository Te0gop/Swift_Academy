package homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Reader;

public class Task0_SaveObjectsToFiles {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Movie movie = new Movie("Vikings", "Director", "Ragnar", 23);
		
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("task_0.txt"));
		obj.writeObject(movie);
		obj.close();
		
		Reader reader = new FileReader("task_0.txt");
		
		char[] buffer = new char[1024];
		
		while(reader.read(buffer) != -1) {
			System.out.println(buffer);
		}
		reader.close();
	}
}

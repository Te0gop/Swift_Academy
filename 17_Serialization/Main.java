package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

public class Main {
	
    public static void writeToJsonWithValues(String file) {
    	try(FileOutputStream fos = new FileOutputStream(file)) {
    		
    		Person person = new Person("John Smith", 25);
    		Values address = new Values("21 2nd Street", "New York", "NY", "10021", "home", "212 555-1234");
    		person.setValues(address);
    		Gson gson = new Gson();
    		String jsonFormat = gson.toJson(person);
    		System.out.println(jsonFormat);
    		fos.write(jsonFormat.getBytes());
    		
    		
    	} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    public static void readFromJson(String file) {
    	try(BufferedReader br = new BufferedReader(new FileReader(file))){
    		
    		String jsonObject = br.readLine();
    		
    		Gson gson = new Gson();
    		
    		Person person = gson.fromJson(jsonObject, Person.class);
    		System.out.println(person);
    		
    	} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	public static void main(String[] args) {
		
		writeToJsonWithValues("homework_with_JSON.json");
		readFromJson("homework_with_JSON.json");
		
	}
}

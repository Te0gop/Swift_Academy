package homework;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person implements Serializable {
	
	@XmlElement
	private String name;
	@XmlElement
	private int age;
	@XmlElement
	private Values values;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Values getValues() {
		return values;
	}


	public void setValues(Values values) {
		this.values = values;
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		Values values;
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + values + "]";
	}



	
	
	
}
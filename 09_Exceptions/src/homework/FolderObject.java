package homework;
import java.util.Arrays;
import javax.naming.InvalidNameException;
import org.omg.CosNaming.NamingContextPackage.InvalidName;

public class FolderObject extends FileSystemObject{
	
	private String children;
	
	String[] array = new String[10];

	
	int lines=0;

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}
	
	public void mkdir(String[] name) {
 		lines++;
		
		if(lines == 1) {
			array[0] = name[0];
			
		} else {
	
			for (int i = 1; i < name.length; i++) {
								
				try {
					for (int j = 0; j < name.length-1; j++) {
						int size = name.length-1-j;
						if((name[size].charAt(j) == '(' || name[size].charAt(j) == ')'
							      || name[size].charAt(j) == '_' || name[size].charAt(j) == '!'
							       || name[size].charAt(j) == '.' || name[size].charAt(j) == '&')) {
							throw new InvalidNameException();
						} else if (name[size].contains(".")) {
							throw new InvalidName();
						}
						else if(!(name[j].charAt(j) >= 'a' && name[j].charAt(j) <= 'z' 
								|| name[j].charAt(j) >= 'A' && name[j].charAt(j) <= 'Z')) {
							throw new InvalidNameException();
						} 

					}
				} catch (InvalidNameException e) {
					System.out.println("Invalid name specified");
					return;
				} catch (InvalidName e ) {
					System.out.println("Illegal operation");
					return;
				}
				
				
				try {
					if(name[name.length-1-i].equals(array[name.length-1-i])) {
						array[i] = name[i];
					} else {
						throw new IndexOutOfBoundsException();
					}
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Directory does not exist");
					break;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(array));
	}
	
	public void touch(String[] name) {
		for (int j = 1; j < name.length; j++) {
			try {
				int size = name.length-1-j;
				
				if((name[size].charAt(j) == '(' || name[size].charAt(j) == ')'
					      || name[size].charAt(j) == '_' || name[size].charAt(j) == '!'
					       || name[size].charAt(j) == '.' || name[size].charAt(j) == '&')) {
					throw new InvalidNameException();
				} else if(!(name[j].charAt(j) >= 'a' && name[j].charAt(j) <= 'z' 
						|| name[j].charAt(j) >= 'A' && name[j].charAt(j) <= 'Z')) {
					throw new InvalidNameException();
				} 
				

				if(name[name.length-1-j].equals(array[name.length-1-j])) {
					array[j] = name[j];
				} else {
					throw new InvalidName();
				}
			} catch (InvalidNameException e) {
				System.out.println("Invalid name specified");
				return;
			} catch (InvalidName e ) {
				System.out.println("Illegal operation");
				return;
			}
			
		}
	}

}

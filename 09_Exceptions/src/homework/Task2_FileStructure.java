package homework;
import java.util.Scanner;
public class Task2_FileStructure {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FolderObject object = new FolderObject();
		String command = sc.next();
		
		while(!command.equals("END")) {
			if(command.equals("mkdir")) {
				String[] name = sc.next().split("/");
				object.mkdir(name);
			} else if (command.equals("touch")) {
				String[] name = sc.next().split("/");
				object.touch(name);
			}
			command = sc.next();
		}
		sc.close();
	}
}



package homework;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task2_ListRelativeFileStructure {
	private static void listFiles(String path)
    {
        File folder = new File(path);
 
        File[] files = folder.listFiles();
 
        for (File file : files)
        {
            if (file.isFile())
            {
            	Path newPath = Paths.get(path);
            		 System.out.printf(newPath.getFileName() + "\\" + file.getName() + "\n");
            }
            else if (file.isDirectory())
            {
                listFiles(file.getAbsolutePath());
            }
        }
    }
	public static void main(String[] args) {
		
		listFiles("C:\\Users\\Teodor\\Documents\\workspace-sts-3.9.11.RELEASE\\Array");
		
		
	}
}

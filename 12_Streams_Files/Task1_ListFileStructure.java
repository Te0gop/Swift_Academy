package homework;
import java.io.File;

public class Task1_ListFileStructure {

	private static void listFiles(String path)
    {
        File folder = new File(path);
 
        File[] files = folder.listFiles();
 
        for (File file : files)
        {
            if (file.isFile())
            {
                System.out.println(file.getAbsolutePath());
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

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "blue", "green", "black");
        List<String> brands = Arrays.asList("Copic", "Feela", "Ohuhu", "Prismacolor", "Tanmit");

        Random r = new Random();
        String[] arrayOfMarkers = new String[50];

        for (int i = 0; i < arrayOfMarkers.length; i++) {
            WritingMaterial marker = new Marker(colors.get(r.nextInt(3)), r.nextInt(5), r.nextInt(500),
                    brands.get(r.nextInt(4)), r.nextBoolean(), r.nextBoolean());
            WritingMaterial pen = new Pen(colors.get(r.nextInt(3)), r.nextInt(5), r.nextInt(500),
                    brands.get(r.nextInt(4)), r.nextBoolean(), r.nextBoolean());

           arrayOfMarkers[i] = String.valueOf(marker);
           arrayOfMarkers[i] = String.valueOf(pen);
        }
        List<String> list = Arrays
                .stream(arrayOfMarkers)
                .collect(Collectors.toList());

        for (int i = 0; i < list.size() ; i++) {
            if(i % 2 == 0 && list.get(i).contains("blue") && list.get(i).endsWith("isWritable = true")) {
                String[] delimiter = list.get(i).split(",");
                System.out.println(delimiter[0] + ", " + delimiter[3]);
            }
        }
    }
}

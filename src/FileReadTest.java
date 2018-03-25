import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadTest {


    private void run(){
        System.out.println("Started...");
        try {
            Files.readAllLines(Paths.get("../../tmp/","kern"))
                    .forEach(

                            // Ez itt egy ú.n. lambda ... Javaban még nem láttam ilyet
                            s -> System.out.printf("line content: %s\n", s)
                    );

        } catch (IOException e){
            System.err.println(e.toString());
        }
    }


    public static void main(String[] args){
        FileReadTest ft=new FileReadTest();
        ft.run();
    }
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources{
    public static void main(String[] args)  {
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader("non-existFile.txt"))){

            String line=bufferedReader.readLine();
            while(line!=null){
                System.out.println(line);
                line= bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

    }
}
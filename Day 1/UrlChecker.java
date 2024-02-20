import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UrlChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern pattern = Pattern.compile("https://\\S+");
        String url;
        System.out.println("Enter the Url");
        url=sc.nextLine();
        Matcher matcher=pattern.matcher(url);
        boolean matchFound=matcher.find();
        if(matchFound){
            System.out.println("Secure URL");
        }else{
            System.out.println("Insecure URL");
        }
    }
}

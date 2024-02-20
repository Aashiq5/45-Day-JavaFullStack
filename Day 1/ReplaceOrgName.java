import java.util.Scanner;

public class ReplaceOrgName {
    static void printDetails(String orgName){
        System.out.println(orgName+" is a private organisation\n"+orgName+" is a product based company\nDBox is a "+orgName+" product");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String orgName;
        String newOrgName;
        System.out.println("Enter the company Name");
        orgName=sc.nextLine();
        printDetails(orgName);
        newOrgName=sc.nextLine();
        orgName=orgName.replaceAll(orgName,newOrgName);
        printDetails(orgName);

    }}

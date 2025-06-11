package spark_batch.basic_projects.verifier;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();

        System.out.print("Enter the AadhaarNumber: ");
        String aadhaarNumber = in.nextLine().replaceAll("\\s+", "");

        Aadhaar aadhaar = aadhaarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan = panService.getPanByAadhaar(aadhaarNumber);

        if (aadhaar != null && pan != null) {
            System.out.println("\nAadhaar Details:");
            System.out.println(aadhaar);
            System.out.println("\nPan Details:");
            System.out.println(pan);
        } else {
            System.out.println("No match found.");
        }
    }
}

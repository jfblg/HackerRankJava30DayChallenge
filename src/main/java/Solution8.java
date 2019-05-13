import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution8 {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<String, String>();
        int n = scan.nextInt();
        for(int i=0; i < n; i++) {
            String name = scan.next();
            String number = scan.next();x
            phoneBook.put(name, number);
        }

        while(scan.hasNext()) {
            String s = scan.next();
            String phoneNumber = phoneBook.get(s);
            System.out.println(
                    (phoneNumber != null) ? s + "=" + phoneNumber : "Not found"
            );
        }
        scan.close();


//        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//

    }
}

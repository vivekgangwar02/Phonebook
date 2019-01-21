import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionaries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
String[] arr=new String[10];
String[] arr1= new String[10];

for(int i=0;i<1;i++)
        {
            arr[i]=scanner.next();
            arr1[i]=scanner.next();
System.out.println(arr[i] + " "+ arr1[i]);
        }
Map<String,String> phone=new HashMap<String,String>();

phone.put(arr[0],arr1[0]);
System.out.println(phone.get("dfdf"));
    }

}

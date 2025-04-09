import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EvenNumbersByteStream {

    public static void main(String[] args) {
   
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try (FileOutputStream fos = new FileOutputStream("even_numbers.dat")) {
            for (int number : numbers) {
                if (number % 2 == 0) {
                    fos.write((number + "\n").getBytes()); 
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Even numbers from the array : ");
        try (FileInputStream fis = new FileInputStream("even_numbers.dat")) {
            StringBuilder sb = new StringBuilder();
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                sb.append((char) byteRead); 
            }
            String[] evenNumbers = sb.toString().split("\n");
            for (String number : evenNumbers) {
                if (!number.isEmpty()) { 
                    System.out.println(number);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
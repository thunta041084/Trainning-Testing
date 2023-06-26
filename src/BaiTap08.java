import java.util.*;
public class BaiTap08 {


        public static void main(String[] args) {
            List<String> testData = Arrays.asList("Java", "C#", "C++", "PyThon", "Golang", "Swift", "Scartch");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào vị trí (index): ");
            int index = scanner.nextInt();

            if (index >= 0 && index < testData.size()) {
                String value = testData.get(index);
                System.out.println("Giá trị tại vị trí " + index + " là: " + value);
            } else {
                System.out.println("Không tìm thấy");
            }
        }
    }

}

import java.time.LocalDate;
import java.util.HashMap;

public class BaiTap09 {
        public static void main(String[] args) {
            HashMap<String, Object> INFO = new HashMap<>();

            INFO.put("Tên", "John");
            INFO.put("Năm Sinh", 1990);
            INFO.put("Chiều cao", 180);

            // Tính số tuổi và thêm tuổi vào data
            int currentYear = LocalDate.now().getYear();
            int birthYear = (int) INFO.get("Năm Sinh");
            int age = currentYear - birthYear;

            INFO.put("Tuổi", age);

            // In thông tin
            System.out.println("Tên: " + INFO.get("Tên"));
            System.out.println("Năm Sinh: " + INFO.get("Năm Sinh"));
            System.out.println("Chiều cao: " + INFO.get("Chiều cao"));
            System.out.println("Tuổi: " + INFO.get("Tuổi"));
        }
    }

}

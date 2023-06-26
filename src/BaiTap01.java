public class BaiTap01 {
    public static void main(String[] args) {
        int[] testData = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] evenArray = new int[testData.length];
        int[] oddArray = new int[testData.length];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < testData.length; i++) {
            if (testData[i] % 2 == 0) {
                evenArray[evenIndex] = testData[i];
                evenIndex++;
            } else {
                oddArray[oddIndex] = testData[i];
                oddIndex++;
            }
        }

        System.out.print("Even Array: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArray[i] + " ");
        }

        System.out.println();

        System.out.print("Odd Array: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }
}

import java.util.*;

public class isPermutation {
    String str1;
    String str2;

    isPermutation(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    private void printValue() {
        char[] arr1 = this.str1.toCharArray();
        char[] arr2 = this.str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        isPermutation permutate = new isPermutation(input.nextLine(), input.nextLine());

        permutate.printValue();
    }

}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ToTable a = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = a.resize();
        System.out.println(Arrays.toString(arr[0])+ Arrays.toString(arr[1]) + Arrays.toString(arr[2]));


        ToLine a2 = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        int[] arr2 = a2.resize();
        System.out.println(Arrays.toString(arr2));

    }
}
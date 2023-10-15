public class ToLine {
    private int [][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }
    public int[] resize() {
        String str = "";
        for (int [] el :this.data) {
            for (int i = 0; i < el.length; i++) {
                str += Integer.toString(el[i]);
            }
        }

        int [] arr = new int[str.length()];
        for (int j = 0; j < str.length(); j++) {
            arr[j] = Integer.parseInt(String.valueOf(str.charAt(j)));
        }
        return arr;
    }
}

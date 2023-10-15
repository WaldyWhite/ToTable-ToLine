public class ToTable {
    private int x;
    private int y;
    private int[] data;

    public ToTable(int[] data, int x, int y) {
        this.x = x;
        this.y = y;
        this.data = data;
    }

    public int[][] resize() {
        int n = 0;
        int array[][] = new int[this.x][this.y];
        for (int[] el : array) {
            for (int i = 0; i < el.length; i++) {
                el[i] = this.data[n];
                n++;
            }
        }
        return array;
    }
}

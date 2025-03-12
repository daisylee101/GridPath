public class GridPath {
    private int[][] grid;
    public Location getNextLoc(int row, int col) {
        return null;
    }

    public int sumPath(int row, int col) {
        return 0;
    }

    public GridPath(int[][] values)
    {
    grid = values;
    }
    public String toString()
    {
    String s = "";
    for (int[] row : grid) {
        for (int col : row) {
            s += col + " ";
        }
        s += "\n";
    }
    return s;
} 
}
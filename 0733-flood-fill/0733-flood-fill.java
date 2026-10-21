
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalcolor = image[sr][sc];

        if (originalcolor == color) {
            return image;
        }

        dfs(image, sr, sc, originalcolor, color);
        return image;
    }

    void dfs(int[][] image, int r, int c, int originalcolour, int color) {

        if (r < 0 || r >= image.length ||
            c < 0 || c >= image[0].length) {
            return;
        }

        if (image[r][c] != originalcolour) {
            return;
        }

        image[r][c] = color;

        dfs(image, r - 1, c, originalcolour, color);
        dfs(image, r + 1, c, originalcolour, color);
        dfs(image, r, c - 1, originalcolour, color);
        dfs(image, r, c + 1, originalcolour, color);
    }
}

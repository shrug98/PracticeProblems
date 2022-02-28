class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int currentColor = image[sr][sc];
        changeDiagonal(image, sr, sc, currentColor, newColor);
        return image; 
    }
    public void changeDiagonal(int [][]image, int sr, int sc, int currentColor, int newColor){
        if(image[sr][sc] == currentColor){ //checks if pixel has already been changed
            image[sr][sc] = newColor; //if it hasn't it changes the color
            if(sr>=1) changeDiagonal(image,sr-1, sc, currentColor, newColor); //change top pixel
            if(sc>=1) changeDiagonal(image, sr, sc-1, currentColor, newColor); //change left pixel
            if(sr+1 < image.length) changeDiagonal(image, sr+1, sc, currentColor, newColor); //change bottom pixel making sure less than row length
            if(sc+1 < image[sr].length) changeDiagonal(image, sr, sc+1, currentColor, newColor); //change right pixel making sure less than column length
             
        }
    }
}

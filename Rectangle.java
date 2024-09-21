class Rectangle {
    private int length;
    private int width;

    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void draw() {
        String[][] RecAr = new String[length][width];

        // Fill the array with the rectangle character
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                RecAr[i][j] = "■";
            }
        }

        // Print the array
        for (String[] row : RecAr) {
            System.out.println(Arrays.toString(row));
        }
    }
}

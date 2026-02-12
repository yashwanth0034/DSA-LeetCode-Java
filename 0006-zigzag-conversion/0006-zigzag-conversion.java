class Solution {
    public String convert(String s, int numRows) {

        // Special case
        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        // Initialize each row
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Place characters
        for (char c : s.toCharArray()) {

            rows[currentRow].append(c);

            // Change direction at top or bottom
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move row pointer
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}

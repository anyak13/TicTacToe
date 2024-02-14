import java.awt.*;

/**
 * A class written to support the TicTacToe Game.
 *
 * Each Square object is one position of the TicTacToe
 * board. It maintains information on the marker, its
 * location on the board, and whether it is part
 * of the winning set.
 *
 * @author: Nandhini Namasivayam
 * @version: Jan 2023
 */

public class Square {

    private String marker;
    private int row;
    private int col;
    private boolean isWinningSquare;

    private Image oImage;
    private Image xImage;

    private TicTacToeView window;

    /**
     * Constructor to initialize one Square of the
     * TicTacToe board
     * @param row the row the square is in
     * @param col the column the square is in
     */
    public Square(int row, int col, TicTacToeView window) {
        this.row = row;
        this.col = col;

        this.window = window;
        oImage = window.getImages()[0];
        xImage = window.getImages()[1];
        this.marker = TicTacToe.BLANK;
        this.isWinningSquare = false;
    }

    /******************** Getters and Setters ********************/
    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public void setWinningSquare() {
        this.isWinningSquare = true;
    }

    /**
     * Checks if the square has the BLANK marker
     * @return True if the square is empty, False otherwise
     */
    public boolean isEmpty() {
        return this.marker.equals(TicTacToe.BLANK);
    }

    /**
     * @return the marker for the square
     */
    public String toString() {
        return this.marker;
    }

    public void draw(Graphics g) {
        int squareSize = 150;
        if (marker.equals(TicTacToe.O_MARKER)) {
            g.drawImage(oImage, 170+(squareSize*col), 225+(squareSize*row), 100, 100, window);
        }
        else if (marker.equals(TicTacToe.X_MARKER))
        {
            g.drawImage(xImage, 170+(squareSize*col), 225+(squareSize*row), 100, 100, window);
        }
        if (marker.equals(TicTacToe.O_MARKER)) {
            if (isWinningSquare) {
                g.setColor(Color.green);
                g.fillRect(150 + (squareSize * col), 200 + (squareSize * row), 150, 150);
                g.drawImage(oImage, 170+(squareSize*col), 225+(squareSize*row), 100, 100, window);
            }
        }
        if (marker.equals(TicTacToe.X_MARKER)) {
            if (isWinningSquare) {
                g.setColor(Color.green);
                g.fillRect(150 + (squareSize * col), 200 + (squareSize * row), squareSize-1, squareSize-1);
                g.drawImage(xImage, 170+(150*col), 225+(150*row), 100, 100, window);
            }
        }
    }
}

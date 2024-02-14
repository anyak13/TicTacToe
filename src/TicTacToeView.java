import javax.swing.*;
import java.awt.*;

public class TicTacToeView extends JFrame {
    // TODO: Complete this class
    private Image[] ticTacToeImages;
    private TicTacToe board;
    private static final int WINDOW_WIDTH = 800,
            WINDOW_HEIGHT = 800;

    public TicTacToeView(TicTacToe board) {
        this.board = board;
        ticTacToeImages = new Image[2];
        ticTacToeImages[0] = new ImageIcon("Resources/O.png").getImage();
        ticTacToeImages[1] = new ImageIcon("Resources/X.png").getImage();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("TicTacToe");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    public TicTacToe getBoard() {
        return board;
    }

    public Image[] getImages() {
        return ticTacToeImages;
    }

    public void paint(Graphics g) {
        // Label Axes
        g.setColor(Color.white);
        g.fillRect(0, 0, 800, 800);

        g.setColor(Color.red);
        g.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 50));
        int xHorizontalNums = 225;
        int yHorizontalNums = 150;
        g.drawString("0", xHorizontalNums, yHorizontalNums);
        g.drawString("1", xHorizontalNums + 150, yHorizontalNums);
        g.drawString("2", xHorizontalNums + 300, yHorizontalNums);
        int xVerticalNums = 50;
        int yVerticalNums = 275;
        g.drawString("0", xVerticalNums, yVerticalNums);
        g.drawString("1", xVerticalNums, yVerticalNums + 150);
        g.drawString("2", xVerticalNums, yVerticalNums + 300);
        g.setColor(Color.black);
        // Draw horizontal lines
        g.drawLine(150, 350, 600, 350);
        g.drawLine(150, 500, 600, 500);
        // Draw vertical lines
        g.drawLine(300, 200, 300, 650);
        g.drawLine(450, 200, 450, 650);

        if (board.getBoard()[0][0] != null) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board.getBoard()[i][j].draw(g);
                }
            }
        }

        if (board.getGameOver()) {
            g.setColor(Color.black);
            g.setFont(new Font("Serif", Font.BOLD, 50));
            if (board.checkTie()) {
                g.drawString("It's a Tie!", 200, 750);
            }
            g.drawString(board.getWinner() + " Wins", 300, 750);
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class
    private Square[][] board;
    private static final int    WINDOW_WIDTH = 800,
            WINDOW_HEIGHT = 600;

    public TicTacToeViewer(Square[][] board) {
        this.board = board;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("TicTacToe");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 50));
        for (int i = 0; i < board[0].length; i++)
        {
            for (int j = 0; j < board.length; j++)
            {

            }
        }
    }
}

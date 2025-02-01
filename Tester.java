package Chess;

import Chess.constant.PieceColor;
import Chess.constant.PlayerType;

import java.util.LinkedList;
import java.util.Queue;

public class Tester {
    public static void main(String[] args) {
        Player player1 = new Player("Ankit", PieceColor.WHITE, PlayerType.HUMAN);
        Player player2 = new Player("Sonu", PieceColor.BLACK, PlayerType.HUMAN);

        Queue<Player> playerQueue = new LinkedList<>();
        playerQueue.add(player1);
        playerQueue.add(player2);

        ChessBoard chessBoard = new ChessBoard(playerQueue);
        chessBoard.start();

    }
}

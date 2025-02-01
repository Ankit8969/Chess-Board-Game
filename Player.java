package Chess;

import Chess.constant.PieceColor;
import Chess.constant.PlayerType;
import Chess.entities.ChessCell;
import Chess.entities.Pair;

import java.util.List;
import java.util.Optional;

/**
 * Player has their own details (name, age etc)
 * player can move the pieces from one position to other valid position
 * player selected color ( Black or White )
 */

public class Player {
    private final String name;
    private final PieceColor pieceColor;
    private final PlayerType playerType;

    public Player(String name, PieceColor pieceColor, PlayerType playerType) {
        this.name = name;
        this.pieceColor = pieceColor;
        this.playerType = playerType;
    }

    public void move(List<List<ChessCell>> chessBoard, Pair selectedPosition, Pair desiredPosition) {
        // Get the selected chess cell
        ChessCell selectedCell = chessBoard.get(selectedPosition.getX()).get(selectedPosition.getY());

        // Move the piece to the desired position
        ChessCell newCell = new ChessCell(desiredPosition, selectedCell.getCellColor(), selectedCell.getCellPiece());
        chessBoard.get(desiredPosition.getX()).set(desiredPosition.getY(), newCell);

        // Empty the previous cell
        selectedCell.setCellPiece(Optional.empty());
    }
}

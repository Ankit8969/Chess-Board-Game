package Chess.entities;

import Chess.constant.PieceColor;

import java.util.Optional;

/**
 * Important class for chess board
 * 1. color of the cell
 * 2. which piece is present on the cell or not
 *
 *
 */

public class ChessCell {
    private final Pair position;
    private final PieceColor cellColor;
    Optional<Piece> cellPiece;

    public ChessCell(Pair position, PieceColor cellColor, Optional<Piece> cellPiece) {
        this.position = position;
        this.cellColor = cellColor;
        this.cellPiece = cellPiece;
    }

    public void setCellPiece(Optional<Piece> cellPiece) {
        this.cellPiece = cellPiece;
    }

    public Pair getPosition(){
        return this.position;
    }

    public PieceColor getCellColor() {
        return cellColor;
    }

    public Optional<Piece> getCellPiece() {
        return cellPiece;
    }
}

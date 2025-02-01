package Chess.entities;

import Chess.constant.PieceColor;

import java.util.List;

/**
 * We have total 16 piece of one Player
 * for 2 player it would be - 32
 * 8 - pawns
 * 2 - Rook
 * 2 - Knight
 * 2 - Bishop
 * 1 - King
 * 1 - Queen
 *
 *
 * EveryPieces has their diff name
 * EveryPiece has their color
 * EveryPiece has their rules to move
 *
 */

public abstract class Piece {
    private PieceName name;
    private PieceColor color;

    public Piece(PieceName name, PieceColor color) {
        this.name = name;
        this.color = color;
    }

    public PieceName getName() {
        return name;
    }

    public PieceColor getColor() {
        return color;
    }

    abstract List<Pair> rules();
}

package Chess.entities;

import Chess.constant.PieceColor;

import java.util.List;

public class Queen extends Piece{
    public Queen(PieceName name, PieceColor color) {
        super(name, color);
    }

    @Override
    List<Pair> rules() {
        return null;
    }
}

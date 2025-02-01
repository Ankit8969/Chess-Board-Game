package Chess.entities;

import Chess.constant.PieceColor;

import java.util.List;

public class Bishop extends Piece{
    public Bishop(PieceName name, PieceColor color) {
        super(name, color);
    }

    @Override
    List<Pair> rules() {
        return null;
    }
}

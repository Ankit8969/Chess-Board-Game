package Chess.entities;

import Chess.constant.PieceColor;

import java.util.List;

public class Rook extends Piece{
    public Rook(PieceName name, PieceColor color) {
        super(name, color);
    }

    @Override
    List<Pair> rules() {
        return null;
    }
}

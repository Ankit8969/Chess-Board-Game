package Chess.entities;

import Chess.constant.PieceColor;

import java.util.List;

public class Knight extends Piece{
    public Knight(PieceName name, PieceColor color) {
        super(name, color);
    }

    @Override
    List<Pair> rules() {
        return null;
    }
}

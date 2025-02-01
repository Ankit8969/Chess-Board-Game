package Chess.entities;

import Chess.constant.PieceColor;

import java.util.List;

public class King extends Piece{
    public King(PieceName name, PieceColor color) {
        super(name, color);
    }

    @Override
    List<Pair> rules() {
        return List.of();
    }
}

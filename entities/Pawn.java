package Chess.entities;

import Chess.constant.PieceColor;

import java.util.List;

public class Pawn extends Piece{
    public Pawn(PieceName name, PieceColor color) {
        super(name, color);
    }

    @Override
    List<Pair> rules() {

        return null;
    }
}

package Chess;


import Chess.constant.PieceColor;
import Chess.entities.*;
import java.util.*;

/**
 * In Chess Board class we need
 * 1. Board First
 * 2. Player Details
 * 3.
 */
public class ChessBoard {
    List<List<ChessCell>> board;
    Queue<Player> playerQueue;
    private final int NUMBER_OF_ROWS = 8;
    private final int NUMBER_OF_COLS = 8;

    public ChessBoard(Queue<Player> playerQueue) {
        this.playerQueue = playerQueue;
        this.initBoard();
    }

    private Optional<Piece> placeInitialPiece(int row, int col) {
        PieceColor color = (row < 2) ? PieceColor.WHITE : (row > 5) ? PieceColor.BLACK : null;
        if (color == null) return Optional.empty(); // No piece in the middle rows

        // Initialize Pawns
        if (row == 1 || row == 6) {
            return Optional.of(new Pawn(PieceName.valueOf("PAWN" + (col + 1)), color));
        }

        // Initialize other major pieces
        return switch (col) {
            case 0, 7 -> Optional.of(new Rook(PieceName.valueOf("ROOK" + (col == 0 ? "1" : "2")), color));
            case 1, 6 -> Optional.of(new Knight(PieceName.valueOf("KNIGHT" + (col == 1 ? "1" : "2")), color));
            case 2, 5 -> Optional.of(new Bishop(PieceName.valueOf("BISHOP" + (col == 2 ? "1" : "2")), color));
            case 3 -> Optional.of(new Queen(PieceName.QUEEN, color));
            case 4 -> Optional.of(new King(PieceName.KING, color));
            default -> Optional.empty();
        };
    }

    private void initBoard() {
        this.board = new ArrayList<>();
        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
            List<ChessCell> rowCells = new ArrayList<>();

            for (int col = 0; col < NUMBER_OF_COLS; col++) {
                PieceColor cellColor = (row + col) % 2 == 0 ? PieceColor.WHITE : PieceColor.BLACK;
                Optional<Piece> piece = placeInitialPiece(row, col); // Place pieces at starting positions
                rowCells.add(new ChessCell(new Pair(row, col), cellColor, piece));
            }
            board.add(rowCells);
        }
        return ;
    }

    private void printBoard() {
        for(int i=0;i<NUMBER_OF_ROWS;i++){
            for(int j=0;j<NUMBER_OF_COLS;j++) {
                ChessCell chessCell = this.board.get(i).get(j);
                if (chessCell.getCellPiece().isPresent()) {
                    Optional<Piece> piece = chessCell.getCellPiece();
                    Piece pieceObj = piece.get(); // Extract the actual Piece object
                    System.out.print(pieceObj.getName().toString().charAt(0) + "  "); // Get piece name correctly
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private boolean isOver() {
        return false;
    }

    public void start() {
        System.out.println("Game Start");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            printBoard();
            Player currentPlayer = playerQueue.poll();
            System.out.println("Selected Position: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Pair selectedPosition = new Pair(x, y);

            System.out.println("Desired Position: ");
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            Pair desiredPosition = new Pair(x2, y2);
            currentPlayer.move(this.board, selectedPosition, desiredPosition);

            playerQueue.add(currentPlayer);

        }

    }
}

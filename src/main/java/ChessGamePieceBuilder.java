/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class ChessGamePieceBuilder  implements ChessGamePieceBuilderI{
        ChessGamePiece piece;
    ChessGameBoard board;

    public ChessGamePieceBuilder(ChessGameBoard board,  String type) {
        this.reset(board, type);
    }

    @Override
    public ChessGamePieceBuilder withColor(int color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ChessGamePieceBuilder withColumn(int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ChessGamePieceBuilder withRow(int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ChessGamePieceBuilder withSkipMoveGeneration(boolean flag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ChessGamePieceBuilder withPossibleMoves() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ChessGamePieceBuilder withImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reset(ChessGameBoard board, String type) {
        this.board = board;
        switch (type){
            case "Bishop":
                this.piece =  new Bishop(board);
                break;
            case "King":
                this.piece = new King(board);
                break;
            case "Knight":
                this.piece = new Knight(board);
                break;
            case "pawn":
                this.piece = new Pawn(board);
                break;
            case "queen":
                this.piece = new Queen(board);
                break;
            case "rook":
                this.piece = new Rook(board);
                break;
            default:
                this.piece = null;
        }
    }

    @Override
    public ChessGamePiece build() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

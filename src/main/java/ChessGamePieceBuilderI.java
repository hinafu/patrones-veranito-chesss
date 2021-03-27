/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public interface ChessGamePieceBuilderI {
    ChessGamePieceBuilder withColor(int color);

    ChessGamePieceBuilder withColumn(int column);

    ChessGamePieceBuilder withRow(int row);

    ChessGamePieceBuilder withSkipMoveGeneration(boolean flag);

    ChessGamePieceBuilder withPossibleMoves();

    ChessGamePieceBuilder withImage();

    void reset(ChessGameBoard board, String type);

    ChessGamePiece build();
}

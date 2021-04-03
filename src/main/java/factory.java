/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class factory {

    public static ChessGamePiece createPiece(String piece, ChessGameBoard board, int row, int col, int color) {

        ChessGamePiece pieza = null;
        AgregadoConcreto agregado = new AgregadoConcreto();
        Iterador iterador = agregado.getIterador();

        System.out.println(iterador.actual().toString());
        while (iterador.hasNext() == true) {
            System.out.println("despues");
            System.out.println(iterador.actual().toString());
            if ("King".equals(iterador.actual().toString())) {
                System.out.println("Creando king");
                pieza = new King(board, row, col, color);
                iterador.next();
            } else if ("Queen".equals(iterador.actual().toString())) {
                System.out.println("Creando Queen");

                pieza = new Queen(board, row, col, color);
                iterador.next();

            } else if ("Knight".equals(iterador.actual())) {
                System.out.println("Creando Knight");

                pieza = new Knight(board, row, col, color);
                iterador.next();

            } else if ((iterador.actual().toString()) == "Queen") {

                pieza = new Queen(board, row, col, color);
                iterador.next();

            } else if ((iterador.actual().toString()) == "Pawn") {

                pieza = new Pawn(board, row, col, color);
                iterador.next();

            } else if (("Bishop".equals(iterador.actual()))) {
                System.out.println("Creando Bishop");

                pieza = new Bishop(board, row, col, color);
                iterador.next();

            } else if ((iterador.actual().toString()) == "Rook") {

                pieza = new Rook(board, row, col, color);
                iterador.next();

            } else {
                System.out.println("sino");
                return null;
            }
        }
        return pieza;

    }

}

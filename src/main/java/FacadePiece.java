
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Ricardo
 */
public class FacadePiece {
        private JsonAPI jsonApi;
        public FacadePiece(){
            jsonApi = new JsonAPI();
        }
        public ImageIcon createImagePiece(int typePiece){
           ImageIcon imagenIcon = jsonApi.createImageByPieceType(typePiece);
           return imagenIcon;
        }
}

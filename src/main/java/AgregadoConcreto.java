
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class AgregadoConcreto implements Agregado{
      protected Vector items = new Vector();

    public AgregadoConcreto(){
        this.llenar();
    }

    @Override
    public Iterador getIterador(){
        return new IteradorConcreto(this);
    }

    public void llenar()
    {        

        this.items.add( new String("King") );
        this.items.add( new String("Bishop") );
        this.items.add( new String("Knight") );
        this.items.add( new String("Pawn") );
        this.items.add( new String("Queen") );
        this.items.add( new String("Rook") );
    }
}

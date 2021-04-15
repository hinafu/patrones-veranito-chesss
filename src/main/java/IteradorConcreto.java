/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class IteradorConcreto implements Iterador {

    private AgregadoConcreto agregado;
    private int posicion_actual;

    public IteradorConcreto(AgregadoConcreto agregado) {
        this.agregado = agregado;
        this.posicion_actual = 0;
    }

    @Override
    public Object next() {
       Object obj = null;
        if( (this.posicion_actual ) < this.agregado.items.size() ){
            obj = this.agregado.items.elementAt(this.posicion_actual);
            this.posicion_actual = this.posicion_actual + 1;
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        boolean ok = false;
        if( this.posicion_actual < (this.agregado.items.size() ) ){
            ok = true;
        }
        return ok;
    }

    @Override
    public Object actual() {
         Object obj = null;
        if( this.posicion_actual < this.agregado.items.size() ){
            obj = this.agregado.items.elementAt( this.posicion_actual );
        }
        return obj;
    }
}

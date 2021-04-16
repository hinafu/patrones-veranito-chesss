
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
   private Target target;

   public void addFilter(Filter filter){
      filters.add(filter);
   }

   public void execute(String usuario,String password){
      for (Filter filter : filters) {
         filter.execute(usuario,password);
      }
      target.execute(usuario,password);
   }

   public void setTarget(Target target){
      this.target = target;
   }
}

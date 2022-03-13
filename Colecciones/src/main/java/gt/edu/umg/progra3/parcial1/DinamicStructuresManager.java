package gt.edu.umg.progra3.parcial1;

import java.util.*;
import java.util.Collections;

public class DinamicStructuresManager<T>{

   List<T> values;

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){
        Collections.sort(values,null);
        return values;
    }

    public List<T> ordenarInversa(){
        Collections.sort(values,Collections.reverseOrder());
        return values;
    }

}

package Factory;

import java.util.ArrayList;
import java.util.List;


public class GiftPaper extends Factory{
    public Toy wrappedToy;
    public void wrap (Toy toy){
        this.wrappedToy = toy;

    }
    public Toy unwrap (){
        Toy unwrappedToy = wrappedToy;
        wrappedToy = null;
        return unwrappedToy;
    }
}

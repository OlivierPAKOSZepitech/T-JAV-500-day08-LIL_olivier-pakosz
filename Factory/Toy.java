package Factory;

public abstract class Toy {
    public String title;

    protected Toy(String title){
        this.title = title;
    }
    public String getTitle (){
        return this.title;
    }
}
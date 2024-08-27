import java.util.List;

public abstract class Burger {
    private int patty;
    private List<String> vegetables;
    private List<String> extras;

    public Burger(int patty, List<String> vegetables, List<String> extras){
        this.patty = patty;
        this.vegetables = vegetables;
        this.extras = extras;
    }


    public abstract Burger recipe();

    public int getPatty() {
        return patty;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }
}
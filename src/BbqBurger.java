import java.util.List;

public class BbqBurger extends Burger {
    public String source;

    public BbqBurger(int patty, List<String> vegetables, List<String> extras) {
        super(patty, vegetables, extras);
        vegetables.add("tomato");
        vegetables.add("lettuce");
        vegetables.add("onion");
        vegetables.add("pickle");

    }

    @Override
    public BbqBurger recipe() {
        this.source = "BBQ Source";
        System.out.println("BBQ Source가 첨가됩니다.");
        for (int i = 0 ; i<getVegetables().size() ; i++){
            System.out.println(getVegetables().get(i)+"가 들어갑니다.");
        }
        System.out.println("BBQ 버거가 완성되었습니다.");

        return this;
    }
}
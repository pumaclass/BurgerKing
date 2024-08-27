import java.util.List;

public class Whopper extends Burger {
    private String bunOption;

    public Whopper(int patty, List<String> vegetables, List<String> extras) {
        super(patty, vegetables, extras);
        vegetables.add("tomato");
        vegetables.add("lettuce");
        vegetables.add("onion");
        vegetables.add("pickle");
        this.bunOption = "GLAZED";
    }


    @Override
    public Burger recipe() {
        grillPatty();
        System.out.println("그릴 패티가 들어갑니다.");
        for(int i = 0 ; i < getVegetables().size(); i++){
            System.out.println(getVegetables().get(i)+"가 들어갑니다.");
        }
        System.out.println("와퍼가 완성되었습니다.");
        return this;
    }

    private void grillPatty() {
        setPatty(110);
        System.out.println("패티 110g을 특별하개 굽습니다.");
    }


}

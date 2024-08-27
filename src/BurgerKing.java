public class BurgerKing implements Manager {
    String name;
    String pay;


    @Override
    public void recordGetIn(){
        System.out.println("주방 타이머 출근");
        System.out.println("카운터 출근");
    }

    public void recordGetOut() {
        System.out.println("주방 타이머 퇴근");
        System.out.println("카운터 퇴근");
    }

    @Override
   public void takeOrder(){
        System.out.println("주문을 받습니다.");
    }

    public void takeMoney() {
        System.out.println("계산을 합니다.");
    }

    @Override
    public Burger makeBurger(Burger burger) {
        System.out.println("파트타이머가 버거를 만듭니다.");
        burger.recipe();
        return burger;
    }

    @Override
    public Drink makeDrink(Drink drink) {
        System.out.println("파트타이머가 음료를 만듭니다.");
        drink.makeDrink();
        return drink;
    }
}

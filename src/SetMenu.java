import java.util.ArrayList;

public class SetMenu {
    Burger burger;
    Drink drink;

    public SetMenu(Burger burger, Drink drink){
        this.burger = burger;
        this.drink = drink;
    }

    public void order(String order){
        BurgerKing burgerKing = new BurgerKing();
        Burger whopper = new Whopper(110, new ArrayList<>(), new ArrayList<>());
        Burger bbqBurger = new BbqBurger(110, new ArrayList<>(), new ArrayList<>());
        Drink coke = new Coke();
        Drink sprite = new Sprite();
        if(order.equals("setMenu1")) {
            burgerKing.makeBurger(whopper);
            burgerKing.makeDrink(coke);
        }else if(order.equals("setMenu2")) {
            burgerKing.makeBurger(bbqBurger);
            burgerKing.makeDrink(sprite);
        }else if(order.equals("setMenu3")){
            burgerKing.makeBurger(whopper);
            burgerKing.makeDrink(sprite);
        }else{
            burgerKing.makeBurger(bbqBurger);
            burgerKing.makeDrink(coke);
        }
    }
}

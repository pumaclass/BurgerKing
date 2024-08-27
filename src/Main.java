import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BurgerKing burgerKing = new BurgerKing();
        List<String> vegetables = new ArrayList<>();
        List<String> extra = new ArrayList<>();
        SetMenu setMenu = new SetMenu(new Whopper(110, vegetables, extra), new Coke());


        //시작 부분
        burgerKing.recordGetIn();
        burgerKing.takeOrder();
        burgerKing.takeMoney();
        setMenu.order("setMenu1");
        burgerKing.recordGetOut();

        }

    }

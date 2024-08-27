public class Sprite extends Drink{
    public Sprite(){
        name = "스프라이트";
        size = "라지";
    }

    public Drink makeDrink() {
        System.out.println(name + "를 " + size + " 사이즈로 준비합니다.");
        return this;
    }
}
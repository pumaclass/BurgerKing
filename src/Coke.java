public class Coke extends Drink{
    public Coke(){
        name = "콜라";
        size = "라지";
    }

    public Drink makeDrink(){
        System.out.println(name+"를 "+size+" 사이즈로 준비합니다.");
        return this;
    }
}
public interface Cashier extends Staff {
    default void takeOrder(){}
    public void takeMoney();


    // 출근시간 기록
    // 퇴근시간 기록
}

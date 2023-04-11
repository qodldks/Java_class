package ch13;

import java.util.HashMap;

public class KakaoBank implements Bank{
    private static KakaoBank instance = new KakaoBank();
    private static int account;
    private static float rate;
    private static int money;
    private static HashMap<Integer, Integer> store = new HashMap<>();

    private KakaoBank(){
        account = 2000;
        rate = BankOfKorea.getInstance().getBaseRate() + 2.5f;
        money = 100000000;
    }


    public static KakaoBank getInstance() {
        if (instance == null){
            instance = new KakaoBank();
        }
        return instance;
    }

    @Override
    public void saving(int account, int money){
        if (store.get(account) != null){
            money += store.get(account);
        }
        store.put(account, money);
    }

    public int getAccount(int account){
        return store.get(account);
    }

    public int borrowMoney(Employee employee, int money){
        if (employee.getGrade() > 4){
            System.out.println("신용등급 4등급 이내만 대출이 가능합니다.");
            return 0;
        }
        if (this.money < money){
            System.out.println("은행 자금이 모자랍니다.");
            return 0;
        }

        this.money -= money;
        System.out.println("카카오뱅크에서 " + money + "원을 대출합니다. " +
                "금리는 " + rate + "%입니다. " +
                "연간 이자는 " + money*rate/100 + "원 입니다.");
        return  money;
    }

    public int makeAccount() {
        return ++account;
    }

    public static void setAccount(int account) {
        KakaoBank.account = account;
    }

    public static float getRate() {
        return rate;
    }
}

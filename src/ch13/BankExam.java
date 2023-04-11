package ch13;

public class BankExam {
    public static void main(String[] args) {
        // 1. 기준금리 3.5%
        BankOfKorea bankOfKorea = BankOfKorea.getInstance();
        bankOfKorea.setBaseRate(3.5f);

        // 2. 근로지(choi)는 은행별 계좌 생성
        Employee choi = new Employee("choi", 1);

        WooriBank wooriBank = WooriBank.getInstance();
        KakaoBank kakaoBank = KakaoBank.getInstance();

        choi.setWooriAccount(wooriBank.makeAccount());
        choi.setKakaoAccount(kakaoBank.makeAccount());

        System.out.println("기준금리 : " + bankOfKorea.getBaseRate() + "%");
        System.out.println("choi의 우리은행 계좌번호 : " + choi.getWooriAccount());
        System.out.println("choi의 카카오뱅크 계좌번호 : " + choi.getKakaoAccount());
        System.out.println("우리은행의 대출금리 : " + WooriBank.getRate());
        System.out.println("카카오뱅크의 대출금리 : " + KakaoBank.getRate());

        // 3. 저금
        // 3-1. 우리은행 5,000원
        choi.saving(wooriBank,5000);
        // 3-1. 카카오뱅크 5,000원
        choi.saving(kakaoBank, 5000);
        // 3-3. 우리은행 10,000원
        choi.saving(wooriBank,10000);

        choi.showMoney(wooriBank);
        choi.showMoney(kakaoBank);

        // 4. 대출
        // 4-1. 우리은행에 10,000원 대출
        choi.borrowMoney(wooriBank, 10000);
        // 4-2. 카카오 뱅크에 15,000원 대출
        choi.borrowMoney(kakaoBank, 15000);
    }
}

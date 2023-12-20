package poly.ex.pay;

public abstract class CheckOption {

    public static Pay checkOption(String option) {
        if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("kakao")) {
            return new KakaoPay();
        } else {
            return new DefaultPay();
        }
    }
}

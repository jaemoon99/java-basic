package access.b;

import access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 접근 가능
        data.publicField = 1;
        data.publicMethod();

        // default 접근 불가(다른 패키지)
        //data.defaultField = 2;
        //data.defaultMethod();

        // private 접근 불가
        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess();
    }
}

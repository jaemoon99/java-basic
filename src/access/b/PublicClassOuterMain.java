package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지에서 default 접근 불가
        // DefaultClass1 Class1 = new DefaultClass1();
        // DefaultClass2 Class2 = new DefaultClass2();
    }
}

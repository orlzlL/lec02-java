package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    private static LazySingleton lazy;      // 참조 자료형의 기본값인 null 이 들어감

    private LazySingleton() {}



    public static LazySingleton getInstance() {

        if(lazy == null){                   // static 변수인 lazy에 한 번도 객체가 생성 및 할당된 적이 없다면
            lazy = new LazySingleton();
        }
        return lazy;
    }
}

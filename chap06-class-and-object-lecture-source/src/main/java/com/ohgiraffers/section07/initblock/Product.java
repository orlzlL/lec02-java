package com.ohgiraffers.section07.initblock;

public class Product {

    private String name = "모토로라";                // 상품명
    private int price;                  // 상품가격
    private static String brand;        // 제조사

    {
        System.out.println("초기화 블럭 실행. . .");
        name = "싸이언";
        brand = "헬지";
    }

    /* 설명. static 초기화 블럭은 static 변수만 초기화가 가능하며 다른 초기화 블럭보다 먼저 실행된다. */
    static {
        System.out.println("static 초기화 블럭 실행. . .");
//        name = "싸이온";             // non-static 필드는 초기화 불가능
        brand = "엘지";
    }

    public Product() {
        System.out.println("Product 기본 생성자 실행됨 . . . ");
    }

    public Product(String name){
        this.name = name;
        System.out.println("Product 매개변수 1개 생성자 실행됨...");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand=" + Product.brand +
                '}';
    }
}

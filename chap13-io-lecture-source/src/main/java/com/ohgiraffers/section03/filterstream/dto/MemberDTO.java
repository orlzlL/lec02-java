package com.ohgiraffers.section03.filterstream.dto;

import java.io.Serializable;

/* 설명. MemberDTO 타입의 객체를 객체단위의 입출력(Object 관련 스트림)을 하기 위해서는 Serializable 인터페이스를 구현해야 된다. */
public class MemberDTO implements Serializable {
    private String id;

    /* 설명. transient 키워드가 붙은 필드는 직렬화에서 제외된다. */
    private /*  transient */ String pwd;
    private String name;
    private String email;
    private int age;
    private char gender;

    public MemberDTO() {
    }

    public MemberDTO(String id, String pwd, String name, String email, int age, char gender) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

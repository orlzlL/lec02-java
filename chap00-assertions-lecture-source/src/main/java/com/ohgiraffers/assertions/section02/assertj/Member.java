package com.ohgiraffers.assertions.section02.assertj;

public class Member {
    private int sequence;
    private String di;
    private String name;
    private int age;

    public Member(int sequence, String di, String name, int age) {
        this.sequence = sequence;
        this.di = di;
        this.name = name;
        this.age = age;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getDi() {
        return di;
    }

    public void setDi(String di) {
        this.di = di;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


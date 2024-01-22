package com.ohgiraffers.section02.extend.vo;

public class DrunkenBunny extends Rabbit {

    @Override
    public void cry(){
        System.out.println("봐니봐니 봐니봐니 당근! 당근! !$#@$@#$#");
    }

    public static class WildCardFarm {

        /* 설명. 어떤 타입의 RabbitFarm(제네릭 타입)이 와도 상관 없다. */
        public void anyType(RabbitFarm<?> farm){
            farm.getAnimal().cry();
        }

        /* 설명. RabbitFarm 중에서도 Bunny  또는 Bunny 하위 타입이 있는 RabbitFarm만 가능(Bunny 제네릭의 농장만 가능) */
        public void extendsType(RabbitFarm<? extends Bunny> farm){
            farm.getAnimal().cry();
        }

        /* 설명. RabbitFarm 중에서도 Bunny 상위 타입이 있는 RabbitFarm만 가능(Bunny이거나 Rabbit 제네릭의 농장만 가능) */
        public void superType(RabbitFarm<? super Bunny farm>){
            farm.getAnimal().cry();
        }
    }
}

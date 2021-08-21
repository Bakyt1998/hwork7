package com.company;

public  class Warrior extends Hero
        implements HavingSuperAbility{
    @Override
    public void applySuperAbility() {
        System.out.println("Боевой");

    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Боевой ");

    }
}



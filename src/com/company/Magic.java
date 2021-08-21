package com.company;

public  class Magic extends Hero
implements HavingSuperAbility{
    @Override
    public void applySuperAbility() {
        System.out.println("Магия");

    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Магический");

    }
}

package com.company.players;

import com.company.players.AbilityType;
import com.company.players.Boss;
import com.company.players.Hero;

public class Hunter extends Hero {

    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        setDamage(25);
        setDamage(getDamage() + boss.getDamage()/5);

            }
        }



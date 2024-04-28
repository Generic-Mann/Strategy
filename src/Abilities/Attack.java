package Abilities;

import Monsters.Monster;

public interface Attack extends Ability {
    public Integer attack(Monster target);
}

package quest.impl;

import quest.interfaces.Quest;

public class CurseUndeadKing implements Quest {
    private String description = "Curse of the Undead King: The Undead King and his army of undead warriors have risen, threatening the kingdom. As a brave knight, journey to the king's castle, battle his minions, and destroy the cursed amulet that gives him power. Beware of other dark creatures who will stop at nothing to prevent you from succeeding. Can you defeat the Curse of the Undead King and save the kingdom?" ;

    public CurseUndeadKing() {
    }

    public CurseUndeadKing(String description) {
        this.description = description;
    }

    @Override
    public String showDescription() {
        return description;
    }
}
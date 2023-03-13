package quest.impl;

import quest.interfaces.Quest;

public class IslandOfCurses  implements Quest {
    private String description;

    public IslandOfCurses(String description) {
        this.description = description;
    }

    @Override
    public String showDescription() {
        return description;
    }
}
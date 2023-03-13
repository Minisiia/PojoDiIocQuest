package quest.impl;

import quest.interfaces.Quest;

public class DarkForest implements Quest {
    private String description;

    public DarkForest() {
    }

    public DarkForest(String description) {
        this.description = description;
    }

    @Override
    public String showDescription() {
        return description;
    }
}

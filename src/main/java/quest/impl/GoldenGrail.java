package quest.impl;

import quest.interfaces.Quest;

public class GoldenGrail  implements Quest {
    private String description;

    public GoldenGrail(String description) {
        this.description = description;
    }

    @Override
    public String showDescription() {
       return description;
    }
}
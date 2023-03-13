package quest.pojo;

import quest.interfaces.Quest;

public class Knight {
    Quest quest;

    public Knight() {
    }

    public Knight(Quest quest) {
        this.quest = quest;
    }
    public void doingQuest() {
        System.out.println("Doing " + quest.showDescription());
    }
}

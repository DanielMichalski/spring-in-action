package people;

import org.springframework.beans.factory.annotation.Autowired;
import quests.Quest;

/**
 * Author: Daniel
 */
public class BraveKnight extends Knight {
    @Autowired
    private Quest quest;

    public void embarkOnQuest() {
        quest.embark();
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }
}

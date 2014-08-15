package quests;

/**
 * Author: Daniel
 */
public class SlayDragonQuest implements Quest {
    @Override
    public void embark() {
        System.out.println(SlayDragonQuest.class.getName() + ".embark()");
    }
}

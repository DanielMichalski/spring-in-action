import org.junit.Test;
import org.mockito.Mockito;
import people.BraveKnight;
import quests.Quest;

import static org.mockito.Mockito.*;

/**
 * Author: Daniel
 */
public class BraveKnightTest {
    @Test
    public void testEmbarkOnQuest() throws Exception {
        Quest mockQuest = mock(Quest.class);

        BraveKnight knight = new BraveKnight();
        knight.setQuest(mockQuest);
        knight.embarkOnQuest();

        Mockito.verify(mockQuest, times(1)).embark();
    }
}

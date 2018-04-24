package rockpaperscissors.codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameLogicTest {

    GameLogic gameLogic1;

    @Before
    public void before(){
        gameLogic1 = new GameLogic();
    }

    @Test
    public void canGetRandomAnswer(){
        assertEquals("Rock", gameLogic1.getRandomAnswer());
    }

}
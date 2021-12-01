import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameFactoryTest {

    @Test
    void shoudReturnExceptionForNonExistentGame() {
        try {
            IGame game = GameFactory.getGame("GTA");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("The game does not exist", e.getMessage());
        }
    }

    @Test
    void shoudReturnExceptionForInvalidGame() {
        try {
            IGame game = GameFactory.getGame("Tetris");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid game", e.getMessage());
        }
    }
}
public class GameFactory {

    public static IGame getGame(String game) {
        Class classToBeInstantiated = null;
        Object objectToBeCreated = null;

        try {
            classToBeInstantiated = Class.forName(game+"Game");
            objectToBeCreated = classToBeInstantiated.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("The game does not exist");
        }

        if(!(objectToBeCreated instanceof IGame)){
            throw new IllegalArgumentException("Invalid game");
        }
        return (IGame) objectToBeCreated;
    }
}

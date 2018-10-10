package oop.exe3;

public class Game {

    public Game(String gameUID, String name, int requiredMB, SimpleDate releaseDate) {

    }

    /**
     * Returns the amount of memory in Mega-bytes that this game require
     * */
    public int getRequiredMemory() {
        return 0;
    }

    /**
     * Checks if the current date (the current time which this program is running)
     * is after the release date of this game.
     * For example: If this game's release date is 1/1/2000
     *              And this program is being run at 20/12/1999 - the answer is false
     *
     * Hint: To implement this method it would be helpful to first implement the SimpleDate class
     * */
    public boolean isAvailable() {
        return false;
    }

    /**
     * Returns the unique identifier of the game
     * */
    public String getUID() {
        return "";
    }

    /**
     * Returns the name of the game
     * */
    public String getName() {
        return "";
    }
}

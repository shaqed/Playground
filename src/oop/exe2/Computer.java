package oop.exe2;

public class Computer {

    public Computer(int memoryInstalled) {
    }

    /**
     * This method will check if the game is already installed on the computer
     *
     * Hint: use the unique identifier for each game to compare between games
     * */
    public boolean isGameInstalled(Game game) {
        return false;
    }

    /**
     * This method will attempt to install a game on the computer
     * A game will be installed on the computer ONLY if the following conditions are met:
     *      1. The computer has enough free memory to accommodate the game
     *      2. The game is already available (the release date has passed)
     *      3. The game is not already installed on the computer
     *
     * In case of failure, the method will print an error message describing why it failed
     *
     * The method will return true or false to indicate successful installation
     * */
    public boolean installGame(Game game) {
        return false;
    }


    /**
     * Attempts to remove a game from this computer
     * Removing a game will free the memory it required.
     *
     * This method will fail if the game is not already installed
     * The method will return true or false to indicate successful removal of the desired game
     * */
    public boolean removeGame(Game game) {
        return false;
    }


    /**
     * This method returns an array the contains all of the games that are installed on the machine
     *
     * If there are no games installed on the computer, the array is empty.
     * Note that the returned value is an array of Game, not an array of Strings
     */
    public Game[] getInstalledGames() {
        return new Game[0];
    }

    /**
     * This method prints the names of all games installed on the computer
     * */
    public void printInstalledGames() {

    }


    /**
     * This method picks a random game from the installed games in the computer.
     * If there are no installed games, the method returns "null"
     * */
    public Game pickRandomGame() {
        return null;
    }
}

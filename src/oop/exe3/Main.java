package oop.exe3;


/**
 * Object Oriented - PC Gamer
 *
 * In this exercise, you will be implementing a computer trying to install games on it
 * The computer will have a fixed amount of memory installed, and the amount will not change
 *
 * Each game has its required memory, and the computer will install the game only if it has enough space for it
 * Each game also has a release date, indicated by the SimpleDate class, games that are not available yet cannot be installed
 *
 * You are required to implement the methods in each class according to their description,
 * also, you may add more inner methods as you wish if you think that it would help you.
 * And eventually, the main should run as described in the comments
 */
public class Main {

    public static void main(String[] args) {
        Game game1 = new Game("001", "Need For Speed: Most Wanted", 16, new SimpleDate(1,1,2000));
        Game game2 = new Game("002", "Half Life 3", 56, new SimpleDate(29,12,2037));
        Game game3 = new Game("003", "Counter Strike 1.6", 8, new SimpleDate(1,1,2002));
        Game game4 = new Game("004", "Smite", 24, new SimpleDate(1,12,2017));
        Game game5 = new Game("005", "World of Warcraft", 56, new SimpleDate(24,3,2004));


        Computer myPC = new Computer(64);

        myPC.printInstalledGames(); // Should print nothing

        System.out.println(myPC.installGame(game2)); // Fails, game not released yet

        System.out.println(myPC.installGame(game1)); // Success
        System.out.println(myPC.installGame(game3)); // Success
        System.out.println(myPC.installGame(game5)); // Fails, not enough memory

        myPC.printInstalledGames(); // Should print only 2 games

        System.out.println(myPC.removeGame(game5)); // Fails, game is not installed yet
        System.out.println(myPC.removeGame(game1)); // Success
        System.out.println(myPC.installGame(game5)); // Success
        System.out.println(myPC.installGame(game4)); // Fails, not enough memory

        // Print games installed
        // This should print game 3 and game 5
        for (Game game : myPC.getInstalledGames()) {
            System.out.println(game.getUID() + ": " + game.getName());
        }

        // Pick a random game
        Game randomGame = myPC.pickRandomGame();
        System.out.println("My random game: " + randomGame.getName());
    }
}

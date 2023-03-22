package org.example;

public class Main {
    public static void main(String[] args) {
        Subject gameConsole = new Subject();

        Player player1 = new Player();
        Player player2 = new Player();
        Journalist journalist1 = new Journalist();
        Journalist journalist2 = new Journalist();
        Developer developer1 = new Developer();

        gameConsole.addObserver(player1);
        gameConsole.addObserver(player2);
        gameConsole.addObserver(journalist1);
        gameConsole.addObserver(journalist2);
        gameConsole.addObserver(developer1);

        gameConsole.setGameTitle("New Game Title");
        gameConsole.setGameAchievements("Complete level 1 to unlock achievement 1");
        gameConsole.setGameInfo("New game title is a first-person shooter with an immersive storyline");
        gameConsole.setGameTechnicalInfo("The game runs on a custom game engine that supports ray tracing");

        gameConsole.removeObserver(journalist2);

        gameConsole.setGameTitle("Another New Game Title");
        gameConsole.setGameAchievements("Complete the game to unlock a secret ending");
        gameConsole.setGameInfo("Another new game title is an open-world game");
    }
}

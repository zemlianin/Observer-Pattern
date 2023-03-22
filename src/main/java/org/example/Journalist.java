package org.example;

public class Journalist implements Observer {
    @Override
    public void update(String gameTitle, String gameAchievements, String gameInfo, String gameTechnicalInfo) {
        System.out.println("New game released: " + gameTitle);
        System.out.println("Game info: " + gameInfo);
    }
}

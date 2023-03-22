package org.example;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String gameTitle;
    private String gameAchievements;
    private String gameInfo;
    private String gameTechnicalInfo;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(gameTitle, gameAchievements, gameInfo, gameTechnicalInfo);
        }
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
        notifyObservers();
    }

    public void setGameAchievements(String gameAchievements) {
        this.gameAchievements = gameAchievements;
        notifyObservers();
    }

    public void setGameInfo(String gameInfo) {
        this.gameInfo = gameInfo;
        notifyObservers();
    }

    public void setGameTechnicalInfo(String gameTechnicalInfo) {
        this.gameTechnicalInfo = gameTechnicalInfo;
        notifyObservers();
    }
}

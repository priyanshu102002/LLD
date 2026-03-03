package DesignPatterns.Observer;
import java.util.*;

public class Youtube implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String videoTitle;

    public void videoUpload(String title) {
        this.videoTitle = title;
        notifyObserver();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        for(Observer o : observers) {
            o.update(videoTitle);
        }
    }
}
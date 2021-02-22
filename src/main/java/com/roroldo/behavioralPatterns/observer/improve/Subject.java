package com.roroldo.behavioralPatterns.observer.improve;

/**
 *
 * @author 落霞不孤
 */
public interface Subject {
    void registerObserver(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}

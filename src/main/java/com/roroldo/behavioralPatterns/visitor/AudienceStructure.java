package com.roroldo.behavioralPatterns.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 观众
 * @author 落霞不孤
 */
public class AudienceStructure {
    private List<Person> personList = new LinkedList<>();

    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    public void display(Evaluation evaluation) {
        for (Person person : personList) {
            person.accept(evaluation);
        }
    }
}

package com.net.first.builder;

/**
 * Created by daidaijie on 2016/1/26.
 */
public class PersonDirector {
    private PersonBuilder pb;

    public PersonDirector(PersonBuilder pb) {
        this.pb = pb;
    }

    public void createPerson(){
        pb.buildHead();
        pb.buildBody();
        pb.builderArm();
        pb.BuilderLeg();
    }
}

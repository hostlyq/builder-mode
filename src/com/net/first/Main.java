package com.net.first;

import com.net.first.builder.PersonDirector;
import com.net.first.builder.PersonThinBuilder;

public class Main {

    public static void main(String[] args) {
	// write your code here'
        PersonThinBuilder ptb = new PersonThinBuilder();
        PersonDirector pd = new PersonDirector(ptb);
        pd.createPerson();
    }
}

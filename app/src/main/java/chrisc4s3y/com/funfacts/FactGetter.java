package chrisc4s3y.com.funfacts;

import java.util.Random;

/**
 * Created by Chris on 10/5/2014.
 */
public class FactGetter {

    private String[] facts = new String[]
    {"If you yelled for 8 years, 7 months and 6 days, you would have produced enough sound energy to heat one cup of coffee.",

    "The strongest muscle in proportion to its size in the human body is the tongue.",

    "Every time you lick a stamp, you're consuming 1/10 of a calorie.",

    "The human heart creates enough pressure when it pumps out to the body to squirt blood 30 feet.",

    "Banging your head against a wall uses 150 calories an hour.",

    "The average person falls asleep in seven minutes.",

    "Your stomach has to produce a new layer of mucus every two weeks otherwise it will digest itself",

    "Humans are the only primates that don't have pigment in the palms of their hands.",

    "Thirty-five percent of the people who use personal ads for dating are already married.",

    "It's possible to lead a cow upstairs...but not downstairs.",

    "Dogs have four toes on their hind feet, and five on their front feet.",

    "The ant can lift 50 times its own weight, can pull 30 times its own weight and always falls over on its right side when intoxicated.",

    "A cockroach will live nine days without it's head, before it starves to death.",

    "Butterflies taste with their feet.",

    "Elephants are the only mammals that can't jump.",

    "Starfish don't have brains.",

    "Polar bears are left handed.",

    "A duck's quack doesn't echo, and no one knows why.",

    "An ostrich's eye is bigger that it's brain.",

    "The longest recorded flight of a chicken is thirteen seconds.",

    "The fingerprints of koala bears are virtually indistinguishable from those of humans, so much so that they could be confused at a crime scene.",

    "Snails can sleep for 3 years without eating",

    "Porcupines float in water.",

    "Armadillos are the only animal besides humans that can get leprosy.",

    "Many hamsters only blink one eye at a time.",

    "A pregnant goldfish is called a twit.",

    "A male emperor moth can smell a female emperor moth up to 7 miles away.",

    "A giraffe can clean its ears with its 21-inch tongue!",

    "Orcas (killer whales) kill sharks by torpedoing up into to shark's stomach from underneath, causing the shark to explode.",

    "Ten percent of the Russian government's income comes from the sale of vodka.",

    "The number of possible ways of playing the first four moves per side in a game of chess is 318,979,564,000.",

    "Stewardesses' is the longest word that is typed with only the left hand.",

    "No word in the English language rhymes with month, orange, silver, or purple.",

    "The Hawaiian alphabet has 12 letters.",

    "111,111,111 x 111,111,111 = 12,345,678,987,654,321"};

    protected String getFact() {
        Random number = new Random();
        int rand = number.nextInt(facts.length);
        String fact = facts[rand];
        return fact;
    }


}

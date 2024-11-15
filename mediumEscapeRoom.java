import java.util.Scanner;

public class mediumEscapeRoom {

    private String q1 = "\nQuestion one. \nI’m lighter than a feather, but even the strongest person " +
            "in the world can’t hold me for very long.\n What am I? ( 2 lives in total.)\n" +
            " 1 : pillow. \n 2 : breath. \n 3 : rock. \n 4 : air. \n 5 : helium. \n" +
            "What is the right answer? : ";

    private String q2 = "\nQuestion two. \nMary’s parents have five daughters and no sons. Their daughters are " +
            " called Katie, Lily, Sophia and Victoria. \n What is the fifth daughter " +
            "called? : \n" +
            " 1 : Khadija. \n 2 : she only has four daughters. \n 3 : Katie. \n 4 : Mary. \n 5 : Josh. ";

    private String q3 = "\nQuestion three. \n I have seas with no water, coast with no sand, towns without people," +
            " mountains without land.\n What am I?\n" +
            " 1 : map. \n 2 : moon. \n 3 : a dream. \n 4 : an idea. \n 5 : land. \n" +
            "What is the right answer? : ";

    private String q4 = "\nQuestion four. \nI'm rarely touched but often held. If you have wit, you'll use me well.\n" +
            "What am I?\n" +
            " 1 : knife. \n 2 : words. \n 3 : breath. \n 4 : intelligence. \n 5 : tongue. \n" +
            "What is the right answer? : ";

    private String q5 = "\nQuestion five. \nI follow you everywhere you go but disappear when it gets dark. \n" +
            "What am I?\n" +
            " 1 : stalker. \n 2 : mother. \n 3 : shadow. \n 4 : ex-girlfriend/ex-boyfriend. \n 5 : roommate. \n" +
            "What is the right answer? : ";

    private String q6 = "\nQuestion six. \nIt belongs to you, but your friends use it more. \n" +
            "What is it?\n" +
            " 1 : Your name. \n 2 : Your toy. \n 3 : Your belongings. \n 4 : toothbrush. \n 5 : wedding ring. \n" +
            "What is the right answer? : ";

    private String q7 = "\nQuestion seven. \nI am neither a guest or an intruder. In this place I belong and also belongs " +
            "to me. \n" +
            "What is it?\n" +
            " 1 : Apartment. \n 2 : Stadium. \n 3 : Home. \n 4 : House. \n 5 : Boat. \n" +
            "What is the right answer? : ";

    private String q8 = "\nQuestion eight. \nWhat can you catch but never throw?\n" +
            " 1 : ball. \n 2 : heartbreak. \n 3 : weights. \n 4 : cold. \n 5 : spear. \n" +
            "What is the right answer? : ";

    private String q9 = "\nQuestion nine. \nWhat runs around the whole yard without moving?\n" +
            " 1 : fence. \n 2 : a child. \n 3 : wind. \n 4 : rabbit. \n 5 : dog. \n" +
            "What is the right answer? : ";

    private String q10 = "\nQuestion ten. \nWhat is always coming but never arrives?\n" +
            " 1 : Marriage. \n 2 : Death. \n 3 : bullet. \n 4 : A date. \n 5 : Tomorrow. \n" +
            "What is the right answer? : ";

        //  list of questions for medium difficulty.

    question[] questions = {
            new question(q1, 2),
            new question(q2, 4),
            new question(q3, 1),
            new question(q4, 5),
            new question(q5, 3),
            new question(q6, 1),
            new question(q7, 3),
            new question(q8, 4),
            new question(q9, 1),
            new question(q10, 5),

            //  An array of questions in medium difficulty
    };

  int lives = 2;

  //    number of lives
}

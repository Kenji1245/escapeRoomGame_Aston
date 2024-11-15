import java.util.Scanner;

public class hardEscapeRoom {

    private String q1 = "\nQuestion one. \nWhat is there one of in every corner and two of in every room? ( 1 life in total.)\n" +
            " 1 : toy\n 2 : shadow\n 3 : The letter O\n 4 : Air \n 5 : murderer \n 6 : dog \n" +
            "What is the right answer? : ";

    private String q2 = "\nQuestion two. \nWhat is it that no one wants, but no one wants to lose? \n" +
            " 1 : Lawsuit. \n " +
            "2 : poo. \n " +
            "3 : children. \n " +
            "4 : money. \n " +
            "5 : mother. \n " +
            "6 : boyfriend. \n " +
            "What is the right answer? : ";

    private String q3 = "\nQuestion three. \nThe more there is, the less you see. What am I? \n" +
            "1 : Light.\n" +
            "2 : Sun.\n" +
            "3 : shadow.\n" +
            "4 : Darkness.\n" +
            "5 : torch. \n" +
            "6 : star. \n" +
            "What is the right answer? :";

    private String q4 = "\nQuestion four. \nI’m full of holes but strong as steel. What am I? \n" +
            "1 : Cheese.\n" +
            "2 : Titanium.\n" +
            "3 : copper.\n" +
            "4 : bullet holes.\n" +
            "5 : sponge.\n" +
            "6 : Chain. \n" +
            "What is the right answer? :";

    private String q5 = "\nQuestion five. \nYou are my brother, but I am not your brother. Who am I? \n" +
            "1 : Father.\n" +
            "2 : Sister.\n" +
            "3 : Non-blood related.\n" +
            "4 : Child.\n" +
            "5 : Mother.\n" +
            "6 : Friend.\n" +
            "What is the right answer? :";

    private String q6 = "\nQuestion six. \nWhat has ten letters and starts with gas? \n" +
            "1 : gasoline.\n" +
            "2 : gas store.\n" +
            "3 : airplanes.\n" +
            "4 : gasqwrtyu.\n" +
            "5 : automobile.\n" +
            "6 : gases.\n" +
            "What is the right answer? :";

    private String q7 = "\nQuestion seven. \nWhat connects two people, but touches only one? \n" +
            "1 : Handshake.\n" +
            "2 : Bond.\n" +
            "3 : Connection.\n" +
            "4 : Wedding ring.\n" +
            "5 : rope. \n" +
            "6 : handcuffs. \n" +
            "What is the right answer? :";

    private String q8 = "\nQuestion eight. \nWhat ancient invention allows people to see through walls? \n" +
            "1 : Window. \n" +
            "2 : Super eye vision. \n" +
            "3 : Goggles. \n" +
            "4 : Laser vision. \n" +
            "5 : wheel. \n" +
            "6 : bomb. \n" +
            "What is the right answer? :";

    private String q9 = "\nQuestion nine. \nI don't have eyes, but once I did see. Once I had thoughts, but now I'm white and empty. \n" +
            "1 : Head. \n" +
            "2 : Skull. \n" +
            "3 : Water. \n" +
            "4 : Animal. \n" +
            "5 : brain. \n" +
            "6 : nothing. \n" +

            "What is the right answer? :";

    private String q10 = "\nQuestion ten. \nYou will always find me in the past. I can be created in the present, But the future can never" +
                 "taint me. What am I?\n" +
            "1 : Building. \n" +
            "2 : Memory. \n" +
            "3 : History. \n" +
            "4 : imagination. \n" +
            "5 : time. \n" +
            "6 : ancestor. \n" +
            "What is the right answer? :";

    //  list of questions for hard difficulty.

    question[] questions = {
            new question(q1, 3),
            new question(q2, 1),
            new question(q3, 4),
            new question(q4, 6),
            new question(q5, 2),
            new question(q6, 5),
            new question(q7, 4),
            new question(q8, 1),
            new question(q9, 2),
            new question(q10, 3),

            //  An array of questions in hard difficulty
    };

    int lives = 1;


}

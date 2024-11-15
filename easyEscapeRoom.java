import java.util.Scanner;
public class easyEscapeRoom {


        private String q1 = "\nQuestion one. \nWhat goes up but never comes down? ( 3 lives in total.)\n" +
                "1 : Age\n" +
                "2 : Number\n" +
                "3 : Bird\n" +
                "4 : Balloon\n" +
                "What is the right answer? : ";

        private String q2 = "\nQuestion two. \nThe more you take, the more you leave behind. What are they?\n" +
                "1 : Cake\n" +
                "2 : Money\n" +
                "3 : Footsteps\n" +
                "4 : Belongings\n" +
                "What is the right answer? : ";

        private String q3 = "\nQuestion three. \nA man shaves several times a day but still has a beard. How?\n" +
                "1 : He is bald.\n" +
                "2 : Beard grows back very fast.\n" +
                "3 : Doesn’t shave.\n" +
                "4 : He is a barber.\n" +
                "What is the right answer? : ";

        private String q4 = "\nQuestion four. \nWhat has to be broken before you can use it?\n" +
                "1 : Egg.\n" +
                "2 : Bottle.\n" +
                "3 : Lighter.\n" +
                "4 : Tin can.\n" +
                "What is the right answer? :";

        private String q5 = "\nQuestion five. \nI can fly but have no wings. I can cry but I have no eyes. Wherever I go, darkness follows me. What am I?\n" +
                "1 : Bird.\n" +
                "2 : Worm.\n" +
                "3 : Cloud.\n" +
                "4 : Person.\n" +
                "What is the right answer? :";

        private String q6 = "\nQuestion six. \nAfter a train crashed, every single person died. Who survived?\n" +
                "1 : All of the couples.\n" +
                "2 : No one was on the train.\n" +
                "3 : Everyone dies.\n" +
                "4 : No one dies.\n" +
                "What is the right answer? :";

        private String q7 = "\nQuestion seven. \nI go on red, but stop for green. What am I doing?\n" +
                "1 : Driving through a stop light.\n" +
                "2 : Eating a watermelon.\n" +
                "3 : Walking through grass.\n" +
                "4 : Walking across a stop light.\n" +
                "What is the right answer? :";

        private String q8 = "\nQuestion eight. \nA man in a car saw a golden door, a silver door, and a bronze door. Which door did he open first?\n" +
                "1 : Golden door.\n" +
                "2 : Silver door.\n" +
                "3 : Bronze door.\n" +
                "4 : Car door.\n" +
                "What is the right answer? :";

        private String q9 = "\nQuestion nine. \nWhat do you throw out when you want to use it, but take in when you don’t want to use it?\n" +
                "1 : Trash.\n" +
                "2 : Pencil.\n" +
                "3 : Anchor.\n" +
                "4 : Air.\n" +
                "What is the right answer? :";

        private String q10 = "\nQuestion ten. \nWhat gets bigger the more you take away?\n" +
                "1 : Hole.\n" +
                "2 : Window.\n" +
                "3 : Number.\n" +
                "4 : Money.\n" +
                "What is the right answer? :";

                //    list of questions for easy difficulty.


         question[] questions = {
                new question(q1, 1),
                new question(q2, 3),
                new question(q3, 4),
                new question(q4, 1),
                new question(q5, 3),
                new question(q6, 1),
                new question(q7, 2),
                new question(q8, 4),
                new question(q9, 3),
                new question(q10, 1),

                 //  An array of questions in easy difficulty


        };
         int lives = 3;

}

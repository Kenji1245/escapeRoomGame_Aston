import java.util.Scanner;

public class mainEscapeRoom {
        static public void main (String args[]){
            String introduction = "\nINTRODUCTION\n" +
                    "\nWelcome! You are trapped in a room and are required to answer " +
                    "ten multiple choice questions in order to leave.\n" +
                    "Each question answered correctly will open the door in front of you " +
                    "bringing you closer to escaping. \n" +
                    "However, if you answer incorrectly, a life is taken from you. \n" +
                    "If all your lives are lost you will die by a trap inside the room. \n" +
                    "You may select the level of difficulty between easy, medium and hard. \n" +
                    "The level of difficulty will determine the number of choices for answers given to you and number of lives you have.\n" +
                    "For example, easy has 4 choices and 3 lives. Medium has 5 choices and 2 lives. hard has 6 choices and 1 life. \n" +
                    "You must input the answer in numbers ranging from 1 - 6 for each question shown. Any other value will cause an error or be implemented as wrong. \n" +
                    "\nPlease input and click a number between 1, 2 and 3 to select the level of difficulty. \n" +
                    "1. easy. (four choices and three lives).\n" +
                    "2. medium. (five choices and two lives).\n" +
                    "3. hard. (six choices and one life).\n" +
                    "Input number here : ";

            System.out.println(introduction);

            //  The code above shows the introduction, explaining the rules of the game and allows the user to choice between three difficulty levels,
            //  easy, medium and hard.

            Scanner kin = new Scanner(System.in);

            int difficultyLevel = kin.nextInt();
            if (difficultyLevel == 1) {
                easyEscapeRoom easy = new easyEscapeRoom();
                beginQuestion(easy.questions, easy.lives);

            }
            if (difficultyLevel == 2) {
                mediumEscapeRoom medium = new mediumEscapeRoom();
                beginQuestion(medium.questions, medium.lives);

            }
            if (difficultyLevel == 3) {
                hardEscapeRoom hard = new hardEscapeRoom();
                beginQuestion(hard.questions, hard.lives);

                //  These codes are connected to the classes easyEscapeRoom, mediumEscapeRoom and HardEscapeRoom
                //  which each contains a list of questions for the user to read and answer.

            }
        }

        static public void beginQuestion (question[]inputQuestions,int lives){
        int leave;
        Scanner kin = new Scanner(System.in);
            do {
                int score = 0;
                int startingLives = lives;
                    for (int i = 0; i < inputQuestions.length; i++) {
                        System.out.println(inputQuestions[i].prompt);
                        int answer = kin.nextInt();
                        if (answer == (inputQuestions[i].answer)) {
                            System.out.println("Correct. The door in front of you has opened. ( " + startingLives + " lives in total.)\n");
                            score++;
                        } else if (startingLives == 1) {
                            startingLives--;
                            System.out.println("Incorrect. The whole floor starts to open revealing " +
                                    "sharp spikes at the bottom. \nHope turns to despair " +
                                    "as you realise your impeding doom. \nYou then fall to your death. ( " + startingLives + " lives in total.)");
                            break;
                        } else if (answer != (inputQuestions[i].answer)) {
                            startingLives--;
                            System.out.println("You have got the wrong answer! Next question. ( " + startingLives + " lives in total.) \n");
                        }

                        //  Once the difficulty has been selected the above code goes through an if statement which dictates if the user has answered
                        //  the question correctly. If the user answers the question incorrectly the lives variable gets decreases by one.
                    }

                    if (score > 7 && startingLives < 0) {
                        System.out.println("Well done! You have answer enough question correctly for you to exit the room to the outside with your life. " +
                                "Would you like to try again? ");

                        //  If score is bigger than 7 or lives is bigger than zero, the game declares that you won the game. If not then the game ends.
                    }

                System.out.println("Please enter 1 to continue or any other button to exit.");
                leave = kin.nextInt();

                    //  User is presented with an option to exit the code or restart the game.
                }
            while (leave == (1));
            System.out.println("Goodbye, thank you for playing my game!");
        }
}

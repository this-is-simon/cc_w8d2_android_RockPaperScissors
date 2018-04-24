package rockpaperscissors.codeclan.com.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collections;

public class GameLogic {

    ArrayList<String> computerAnswers;

    public GameLogic() {
        setUpComputerAnswers();
    }

    public void setUpComputerAnswers(){
        this.computerAnswers = new ArrayList();

        computerAnswers.add("Rock");
        computerAnswers.add("Paper");
        computerAnswers.add("Scissors");

    }

    public ArrayList<String> getComputerAnswers(){
        return new ArrayList<> (this.computerAnswers);
    }

    public String getRandomAnswer(){
        Collections.shuffle(this.computerAnswers);
        return this.computerAnswers.get(0);
    }

    public String pickWinner(){
        if (getRandomAnswer() == textView
        
//                if (gameLogic.getRandomAnswer() == textView.getText().toString()) {
//           return "It's a draw!";
//       }
    }
}

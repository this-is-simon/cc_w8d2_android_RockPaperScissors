package rockpaperscissors.codeclan.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    GameLogic gameLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.computerResultViewID);
        rockButton = findViewById(R.id.rockID);
        paperButton = findViewById(R.id.paperID);
        scissorsButton = findViewById(R.id.scissorsID);

        gameLogic = new GameLogic();

    }

    public void onRockButtonClick(View rockButton){
        String computerAnswer = "Computer: " + gameLogic.getRandomAnswer();
        String winnerStatement = gameLogic.pickWinner(computerAnswer, "Rock" );
        textView.setText("You pressed " + "Rock" + "\n" + computerAnswer + "\n" + winnerStatement);

    }

    public void onPaperButtonClick(View paperButton){
        String computerAnswer = "Computer: " + gameLogic.getRandomAnswer();
        textView.setText("You pressed Paper!" + "\n" + computerAnswer);
    }

    public void onScissorsButtonClick(View scissorsButton){
        String computerAnswer = "Computer: " + gameLogic.getRandomAnswer();
        textView.setText("You pressed Scissors!" + "\n" + computerAnswer);
    }

//    public String calculateWinner(){
//
//    }

}

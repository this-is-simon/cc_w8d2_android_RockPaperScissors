package rockpaperscissors.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    GameLogic gameLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = findViewById(R.id.rockID);
        paperButton = findViewById(R.id.paperID);
        scissorsButton = findViewById(R.id.scissorsID);

        gameLogic = new GameLogic();

    }

    public void onRockButtonClick(View rockButton){
        String computerAnswer = gameLogic.getRandomAnswer();
        String winnerStatement = gameLogic.pickWinner(computerAnswer, "Rock" );
        String gameResult = ("You pressed Rock" + "\n" + "The computer answered: " + computerAnswer + "\n" + winnerStatement);

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("gameResult", gameResult);
        startActivity(intent);

    }

    public void onPaperButtonClick(View paperButton){
        String computerAnswer = gameLogic.getRandomAnswer();
        String winnerStatement = gameLogic.pickWinner(computerAnswer, "Paper" );
        String gameResult = ("You pressed Paper!" + "\n" +"The computer answered: " + computerAnswer + "\n" + winnerStatement);

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("gameResult", gameResult);
        startActivity(intent);
    }

    public void onScissorsButtonClick(View scissorsButton){
        String computerAnswer = gameLogic.getRandomAnswer();
        String winnerStatement = gameLogic.pickWinner(computerAnswer, "Scissors" );
        String gameResult = ("You pressed Scissors!" + "\n" +"The computer answered: " + computerAnswer + "\n" + winnerStatement);

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("gameResult", gameResult);
        startActivity(intent);
    }

}

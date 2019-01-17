package jeff.wizardscorekeeper;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create main background color blue
        this.mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
        mainLayout.setBackgroundColor(Color.rgb(0,0,255));

        // set title color properties
        TextView title = (TextView)findViewById(R.id.title);
        title.setBackgroundColor(Color.rgb(255,0,0));
        title.setTextColor(Color.rgb(255,255,0));

        // create new game button listener
        Button newGameButton = (Button) findViewById(R.id.newGameButton);
        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
            }
        });

    }

    protected void newGame() {
        // remove all views
        mainLayout.removeAllViews();

        // create new title
        Space topSpace = new Space(this);
        mainLayout.addView(topSpace);
        topSpace.setMinimumHeight(100);
        TextView newGameTitle = new TextView(this);
        mainLayout.addView(newGameTitle);
        newGameTitle.setMinHeight(200);
        newGameTitle.setBackgroundColor(Color.rgb(255,0,0));
        newGameTitle.setTextColor(Color.rgb(255,255,0));
        newGameTitle.setText(R.string.new_game);
        newGameTitle.setGravity(Gravity.CENTER);
        newGameTitle.setTextSize(20);
    }
}

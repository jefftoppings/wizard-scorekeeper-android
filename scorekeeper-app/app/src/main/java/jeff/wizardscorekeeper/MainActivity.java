package jeff.wizardscorekeeper;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

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
        topSpace.setMinimumHeight(140);
        TextView newGameTitle = new TextView(this);
        mainLayout.addView(newGameTitle);
        newGameTitle.setMinHeight(200);
        newGameTitle.setBackgroundColor(Color.rgb(255,0,0));
        newGameTitle.setTextColor(Color.rgb(255,255,0));
        newGameTitle.setText(R.string.new_game);
        newGameTitle.setGravity(Gravity.CENTER);
        newGameTitle.setTextSize(20);

        // ask how many players
        Space midSpace = new Space(this);
        mainLayout.addView(midSpace);
        midSpace.setMinimumHeight(250);
        TextView howMany = new TextView(this);
        mainLayout.addView(howMany);
        howMany.setText(R.string.how_many_players);
        howMany.setTextSize(18);
        howMany.setTextColor(Color.WHITE);

        // put spinner to select how many players
        List<String> array = new ArrayList<>();
        for (int i=3; i<=6; i++) {
            array.add(Integer.toString(i));
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner selectPlayers = new Spinner(this);
        mainLayout.addView(selectPlayers);
        selectPlayers.setAdapter(adapter);
        selectPlayers.setGravity(Gravity.CENTER);
        selectPlayers.setBackgroundColor(Color.WHITE);

        // make okay button at bottom
        Space botSpace = new Space(this);
        mainLayout.addView(botSpace);
        botSpace.setMinimumHeight(300);
        Button okayButton = new Button(this);
        mainLayout.addView(okayButton);
        okayButton.setGravity(Gravity.CENTER);
        okayButton.setText(R.string.ok);
        okayButton.setWidth(2);
        okayButton.setMinimumWidth(2);
        okayButton.setMaxWidth(2);

        okayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                get_names();
            }
        });
    }

    public void get_names() {
        
    }
}

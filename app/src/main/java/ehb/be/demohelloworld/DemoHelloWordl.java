package ehb.be.demohelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DemoHelloWordl extends AppCompatActivity {


    private int counter;
    private Button button_counter, button_decrease;
    private TextView textView_title;

    //inner class gebruiken, om een interface te implementeren
    //onClick, wat doen indien op de knop geklikt
    private View.OnClickListener counterListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            counter++;
            textView_title.setText(String.valueOf(counter)); // ""+counter
        }
    };

    private View.OnClickListener decreaseListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textView_title.setText(String.valueOf(--counter));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_hello_wordl);

        counter = 0;
        //verwijzingen naar wat in het scherm zit
        button_counter = findViewById(R.id.button_counter);
        button_decrease = findViewById(R.id.button_decrease);
        textView_title = findViewById(R.id.tv_title);

        //acties koppelen aan button
        button_counter.setOnClickListener(counterListener);
        button_decrease.setOnClickListener(decreaseListener);

    }
}

package es.maili.revised214test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        Statics.profModel=p;
        textView.setText("Click the button, foo");
    }
    TextView textView;
    ProfModel p = new ProfModel();
    public void randProf(View view){
        textView.setText(p.getRandomProf());
    }
    public void addProf(){
        Intent i = new Intent(getApplicationContext(),InsertProf.class);
        startActivity(i);
    }
}

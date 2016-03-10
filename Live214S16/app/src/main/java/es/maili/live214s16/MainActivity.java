package es.maili.live214s16;

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
        profView=(TextView)this.findViewById(R.id.profView);
       profModel=Statics.p;
    }
    ProfModel profModel;
    TextView profView;
    public void updateProf(View view){
        profView.setText(profModel.getRandomProf());
    }
    public void switchToAdd(View view){
        Intent i = new Intent(getApplicationContext(),AddProf.class);
        Statics.p=profModel;
        startActivity(i);
    }
}

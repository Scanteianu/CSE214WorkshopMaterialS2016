package es.maili.live214s16;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddProf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_prof);
        profName=(EditText)this.findViewById(R.id.profName);
        profModel=Statics.p;
    }
    ProfModel profModel;
    EditText profName;
    public void addProf(View view){
        profModel.addProf(profName.getText().toString());
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}

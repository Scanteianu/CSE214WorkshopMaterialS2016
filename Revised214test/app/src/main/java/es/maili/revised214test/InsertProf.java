package es.maili.revised214test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class InsertProf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_prof);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        profName=(EditText) findViewById(R.id.editText);
        model=Statics.profModel;

    }
    EditText profName;
    ProfModel model;
    public void addProf(View view){
        if(profName.getText().length()>0)
            model.addProf(profName.getText().toString());
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }

}

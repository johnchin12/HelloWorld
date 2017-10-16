package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayName(View v){
        TextView textViewName;
        EditText editTextName;
        EditText editTextAge;

        textViewName = (TextView)findViewById(R.id.textView);
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);

        int age = Integer.parseInt(editTextAge.getText().toString());


        textViewName.setText(getString(R.string.greeting)+ " " + editTextName.getText()+", you will be "
        + (age+1) + " in 2018");


    }
}

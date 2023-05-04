package sg.edu.rp.c346.id22023219.week03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Step 1: Declare Variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //-	disable the EditText, editTextInput when the toggle button is unchecked
                //-	enable it when it is checked
                // Add your code for the action
                if (tbtn.isChecked()) {
                    etInput.setEnabled(true);
                    btnDisplay.setEnabled(true);
                }
                else{
                    etInput.setEnabled(false);
                    btnDisplay.setEnabled(false);
                }
            }
        });


    }
}
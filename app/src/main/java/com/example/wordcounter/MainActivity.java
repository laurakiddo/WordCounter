package com.example.wordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wordcounter.utils.TextUtils;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    EditText txMain;
    Spinner spOptionSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvResult = findViewById(R.id.tvResult);
        this.txMain = findViewById(R.id.txMain);
        this.spOptionSelection = findViewById(R.id.spOptionSelection);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counting_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spOptionSelection.setAdapter(adapter);
    }

    public void onBtnCalculateClick(View view) {
        if(true) {
            if (this.spOptionSelection.getSelectedItem().toString().equalsIgnoreCase("Words")) {
                String content = this.txMain.getText().toString();
                String wordsCount = String.valueOf(this.txMain.getText().toString().split("\\s+"));
                String wordsCountFormatted = String.valueOf(wordsCount);
                this.tvResult.setText(wordsCount);
            } else {
                int charactersCount = TextUtils.getCharsCount(this.txMain.getText().toString());
                String charactersCountFormatted = String.valueOf(charactersCount);
                this.tvResult.setText(charactersCount);

//           String content = ;
//           int charactersCount = this.txMain.getText().toString().length();
//           String charactersCountFormatted = String.valueOf(charactersCount);
//           this.tvResult.setText(charactersCount);
            }
        }
        else {
            this.txMain.getText().toString().isEmpty();
            Toast.makeText(this,"Text is empty", Toast.LENGTH_LONG).show();
        }
    }
}
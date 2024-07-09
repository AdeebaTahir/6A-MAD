package com.example.mad_bsse6a;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        // Initialize UI elements
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSub);
        buttonMultiply = findViewById(R.id.buttonMul);
        buttonDivide = findViewById(R.id.buttonDiv);
        textViewResult = findViewById(R.id.textViewResult);

        // Set click listeners for buttons
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('+');
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('-');
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('*');
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('/');
            }
        });
    }

    private void calculate(char operation) {
        // Get input values from EditText fields
        String number1Str = editText1.getText().toString();
        String number2Str = editText2.getText().toString();

        // Check if inputs are empty
        if (number1Str.isEmpty() || number2Str.isEmpty()) {
            Toast.makeText(this, "Please enter numbers in both fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // Convert input strings to numbers
        double number1 = Double.parseDouble(number1Str);
        double number2 = Double.parseDouble(number2Str);

        double result = 0;

        // Perform calculation based on operation
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                // Check for division by zero
                if (number2 == 0) {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                    return;
                }
                result = number1 / number2;
                break;
        }

        // Display result in TextView
        textViewResult.setText(String.format("Result: %.2f", result));
    }
}

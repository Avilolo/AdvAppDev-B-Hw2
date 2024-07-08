package com.example.advappdev_b_hw2;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.unitconvertion.Classes.LengthUnit;
import com.example.unitconvertion.Classes.TemperatureUnit;
import com.example.unitconvertion.Classes.UnitConverter;
import com.example.unitconvertion.Classes.WeightUnit;


public class MainActivity extends AppCompatActivity {


    private Spinner spinnerCategory;
    private EditText editTextAmount;
    private Button buttonConvert;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        findViews();
    }

    private void findViews() {
        spinnerCategory = findViewById(R.id.spinnerCategory);
        editTextAmount = findViewById(R.id.editTextAmount);
        buttonConvert = findViewById(R.id.buttonConvert);
        textViewResult = findViewById(R.id.textViewResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.categories, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategory.setAdapter(adapter);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = spinnerCategory.getSelectedItem().toString();
                String amountStr = editTextAmount.getText().toString();
                if (!amountStr.isEmpty()) {
                    double amount = Double.parseDouble(amountStr);
                    double result = 0.0;

                    switch (category) {
                        case "Temperature":
                            result = UnitConverter.convertTemperature(amount, TemperatureUnit.CELSIUS, TemperatureUnit.FAHRENHEIT);
                            textViewResult.setText(String.format("Converted Value: %.2f Fahrenheit", result));
                            break;
                        case "Weight":
                            result = UnitConverter.convertWeight(amount, WeightUnit.KILOGRAM, WeightUnit.GRAM);
                            textViewResult.setText(String.format("Converted Value: %.2f Grams", result));
                            break;
                        case "Length":
                            result = UnitConverter.convertLength(amount, LengthUnit.METER, LengthUnit.KILOMETER);
                            textViewResult.setText(String.format("Converted Value: %.2f Kilometers", result));
                            break;
                    }
                }
            }
        });
    }
}
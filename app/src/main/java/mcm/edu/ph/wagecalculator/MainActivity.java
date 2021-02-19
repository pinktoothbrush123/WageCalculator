package mcm.edu.ph.wagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculate;

        btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Double value = 0.0;
        Double answer = 100.0;

        int workhours = 8;
        int hourlyWage = 100;
        int overTimeWage = 130;

        EditText workHours;
        TextView txtAnswer;

        workHours = findViewById(R.id.workHours);
        txtAnswer = findViewById(R.id.txtAnswer);

        switch (v.getId()) {

            case R.id.btnCalculate:
                value = Double.parseDouble(workHours.getText().toString());
                if(value > workhours){
                    double hourlyWageworkHours = 100 * 8;
                    answer= (hourlyWageworkHours) + (value-8)*(overTimeWage);
                }
                else {
                    answer=(value * hourlyWage);
                }
                txtAnswer.setText(Double.toString(answer));

        }
    }
}
package br.ulbra.appcalculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtVA, edtVB;
    Button btnSoma, btnSub, btnDivi, btnMulti;
    TextView txtR1, txtR2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtVA = findViewById(R.id.edtValA);
        edtVB = findViewById(R.id.edtValB);
        btnSoma = findViewById(R.id.btnSomar);
        btnSub = findViewById(R.id.btnSubtrair);
        btnDivi = findViewById(R.id.btnDividir);
        btnMulti = findViewById(R.id.btnMultiplicar);
        txtR1 = findViewById(R.id.txtResultado);


        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valorA, valorB, result;
                try {
                    valorA = Double.parseDouble(edtVA.getText().toString());
                    valorB = Double.parseDouble(edtVB.getText().toString());
                    result = valorA + valorB;
                    txtR1.setText("Resultado: A soma é " + result);
                } catch (NumberFormatException e) {
                    Toast.makeText(view.getContext(),
                            "Por favor, preencha ambos os campos com números válidos", Toast.LENGTH_SHORT).show();
                }

            }


        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valorA, valorB, result;
                try {
                    valorA = Double.parseDouble(edtVA.getText().toString());
                    valorB = Double.parseDouble(edtVB.getText().toString());
                    result = valorA - valorB;
                    txtR1.setText("Resultado: A subtração é " + result);
                } catch (NumberFormatException e) {
                    Toast.makeText(view.getContext(),
                            "Por favor, preencha ambos os campos com números válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valorA, valorB, result;

                try {
                    valorA = Double.parseDouble(edtVA.getText().toString());
                    valorB = Double.parseDouble(edtVB.getText().toString());
                    result = valorA / valorB;
                    txtR1.setText("Resultado: A divisão é " + result);
                } catch (NumberFormatException e) {
                    Toast.makeText(view.getContext(),
                            "Por favor, preencha ambos os campos com números válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valorA, valorB, result;

                try {
                    valorA = Double.parseDouble(edtVA.getText().toString());
                    valorB = Double.parseDouble(edtVB.getText().toString());
                    result = valorA * valorB;
                    txtR1.setText("Resultado: A multiplicação é " + result);
                } catch (NumberFormatException e) {
                    Toast.makeText(view.getContext(),
                            "Por favor, preencha ambos os campos com números válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
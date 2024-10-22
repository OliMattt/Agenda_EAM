package com.example.exemplofragmento;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import org.w3c.dom.Text;

// Repositório com exemplo de Fragmentos estáticos

public class Fragmento1 extends Fragment {
    private Button Botao1;
    private Button Botao2;
    private Button Botao3;
    private Button Botao4;
    private TextView texto1;
    private View v;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla o layout para este fragmento
        // Recupera uma "View v" para acessar as propriedades e métodos do fragmento
        v = inflater.inflate(R.layout.fragmento1, container, false);

        Botao1 = (Button) v.findViewById(R.id.button1);
        Botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                AbreDialog = (Button) findViewById(R.id."Botao ID");
                AbreDialog.setOnClickListener(new View.OnCLickListener()
                {
                    public void onClick(View v)
                    {
                        Intent intent = new Intent("Digite o Nome da Tarefa:");
                        startActivity(intent);
                    }
                }
                 */

                Log.d("prints", "botao 1");
                TextView txt = (TextView) Fragmento2.frgto2.findViewById(R.id.texto_frg2);
                if (txt != null) txt.setText("Apertou botão 1");
            }
        });
        Botao2 = (Button) v.findViewById(R.id.button2);
        Botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                AbreDialog = (Button) findViewById(R.id."Botao ID");
                AbreDialog.setOnClickListener(new View.OnCLickListener()
                {
                    public void onClick(View v)
                    {
                        Intent intent = new Intent("Digite a Descricao:");
                        startActivity(intent);
                    }
                }
                 */
                Log.d("prints", "botao 2");
                TextView txt = (TextView) Fragmento2.frgto2.findViewById(R.id.texto_frg2);
                if (txt != null) txt.setText("Apertou botão 2");
            }
        });

        Botao3 = (Button) v.findViewById(R.id.button3);
        Botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                AbreDialog = (Button) findViewById(R.id."Botao ID");
                AbreDialog.setOnClickListener(new View.OnCLickListener()
                {
                    public void onClick(View v)
                    {
                        Intent intent = new Intent("Digite o horario da Tarefa:");
                        startActivity(intent);
                    }
                }
                 */
                Log.d("prints", "botao 3");
                TextView txt = (TextView) Fragmento2.frgto2.findViewById(R.id.texto_frg2);
                if (txt != null) txt.setText("Apertou botão 3");
            }
        });

        Botao4 = (Button) v.findViewById(R.id.button4);
        Botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("prints", "botao 4");
                DialogFragment fragmentoData = new FragmentoDatePicker();
                fragmentoData.show(getParentFragmentManager(), "datePicker");
            }
        });

        texto1 = (TextView) v.findViewById(R.id.texto1);
        texto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("prints", "texto 1");
                View outro_fragmento = inflater.inflate(R.layout.fragmento2, container, false);
                TextView txt = (TextView) Fragmento2.frgto2.findViewById(R.id.texto_frg2);
                if (txt != null) txt.setText("Apertou sobre o texto");
            }
        });
        return v;
    }
}

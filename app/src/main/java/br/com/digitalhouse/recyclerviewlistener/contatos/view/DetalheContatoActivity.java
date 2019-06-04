package br.com.digitalhouse.recyclerviewlistener.contatos.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.digitalhouse.recyclerviewlistener.R;
import br.com.digitalhouse.recyclerviewlistener.contatos.model.Contato;

public class DetalheContatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_contato);

        if (getIntent() != null && getIntent().getExtras() != null) {
            Contato contato = getIntent().getParcelableExtra("CONTATO");

            if (contato != null) {
            }
        }
    }
}

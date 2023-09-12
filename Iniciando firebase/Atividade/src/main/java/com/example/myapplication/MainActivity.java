package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    //private DatabaseReference minhaReferencia = FirebaseDatabase.getInstance().getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Write a message to the database
        database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("produtos");

        Produtos p = new Produtos();
        p.setNome("Ovomaltine");
        p.setPreco(15.00);

        myRef.child("777").setValue(p);

        /*minhaReferencia.child("produtos").child("001").child("descricao").setValue("coca-cola");
        minhaReferencia.child("produtos").child("001").child("preco").setValue("12.50");

        minhaReferencia.child("produtos").child("002").child("descricao").setValue("suco");
        minhaReferencia.child("produtos").child("002").child("preco").setValue("4.50");

        minhaReferencia.child("produtos").child("003").child("descricao").setValue("água");
        minhaReferencia.child("produtos").child("003").child("preco").setValue("6.50");

        minhaReferencia.child("produtos").child("004").child("descricao").setValue("café");
        minhaReferencia.child("produtos").child("004").child("preco").setValue("7.90");*/
    }
}
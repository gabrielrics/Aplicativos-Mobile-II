package com.example.myapplication;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity2 extends AppCompatActivity {
    private DatabaseReference minhaReferencia = FirebaseDatabase.getInstance().getReference();
    private FirebaseDatabase database = FirebaseDatabase.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

               DatabaseReference clientes = minhaReferencia.child("clientes");

        /*Clientes cliente = new Clientes();
        cliente.setId(1);
        cliente.setNome("Jorge");
        cliente.setTelefone(987654321);
        cliente.setRg(7654321);
        cliente.setEndereco("Rua tal de tal");
        cliente.setNumero(124);
        cliente.setBairro("Mooca");
        cliente.setComplemento("casa 1");
        cliente.setEstado("São Paulo");
        cliente.setCidade("São Paulo");


        // Salva o cliente no banco de dados
        clientes.child("2").setValue(cliente);*/

        clientes.addValueEventListener(new ValueEventListener() {
            @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                Log.i("FIREBASE", snapshot.getValue().toString());

            }

            @Override
                    public void onCancelled(@NonNull DatabaseError error){

            }
        });
    }
}

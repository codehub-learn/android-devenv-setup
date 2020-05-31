package com.codehub.vpigadas.courses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.codehub.vpigadas.courses.models.Animals;
import com.codehub.vpigadas.courses.models.Monkey;
import com.codehub.vpigadas.courses.models.Monkey2;

import java.util.ArrayList;
import java.util.List;

public class AddFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_fragment);
    }


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameLayout, new BlankFragment());
        transaction.replace(R.id.frameLayout, new BlankFragment());
        transaction.addToBackStack(null);

//        transaction.remove(new BlankFragment());
//
//        transaction.replace(R.id.frameLayout,new BlankFragment());
        transaction.commit();

        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
        transaction1.add(new BlankFragment(), "1");
        transaction1.add(new BlankFragment(), "2");
        transaction1.add(new BlankFragment(), null);
        transaction1.add(R.id.frameLayout, new BlankFragment(), null);
        transaction1.commit();

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animals animals = new Animals();

                List<Monkey> array = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    Monkey one = new Monkey();
                    one.setName("Tesla");
                    one.setLegs(4);
                    one.setEars(2);
                    array.add(one);
                }
                animals.setAnimals(array);
                List<Monkey2> array2 = new ArrayList<>();
                for (int i = 0; i < 10; i++) {

                    if(i == 9 ){
                        int number = 0;
                        number++;
                    }

                    Monkey2 one = new Monkey2();
                    one.setName("Tesla");
                    one.setLegs(4);
                    one.setEars(2);
                    array2.add(one);
                }
                animals.setAnimals2(array2);


                Monkey2 monkey = animals.getAnimals2().get(0);
                Intent intent = new Intent(AddFragmentActivity.this, Main2Activity.class);

//                intent.putExtra("name", "Nikoleta");
//                intent.putExtra("name1", "Manos");
//                intent.putExtra("monkey",monkey);

                Bundle parameter= new Bundle();
                parameter.putString("name","Nikoleta");
                parameter.putString("name1","Manos");
                parameter.putParcelable("monkey",monkey);

                intent.putExtras(parameter);


                startActivityForResult(intent,1000);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1000){
            if(resultCode == RESULT_OK){
                if(data != null){
                    String name = data.getStringExtra("name");
                    String status = data.getStringExtra("status");
                }
            }else if(resultCode == RESULT_CANCELED){

            }
        }
    }

    public void onActionStart() {
        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
        Fragment fragment = getSupportFragmentManager().getFragment(new Bundle(), "1");

        transaction2.add(R.id.frameLayout, fragment);
        transaction2.commit();
    }
}

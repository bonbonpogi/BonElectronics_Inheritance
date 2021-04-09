package mcm.edu.ph.bonelectronicsinheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHeroes = findViewById(R.id.btnHeroes);
        Button btnMonsters = findViewById(R.id.btnMonsters);
        btnHeroes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this,Heroes.class);
                startActivity(int1);
            }
        });
        btnMonsters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this,Monster.class);
                startActivity(int2);
            }
        });

}
}
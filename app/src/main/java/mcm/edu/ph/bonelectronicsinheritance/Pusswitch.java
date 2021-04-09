package mcm.edu.ph.bonelectronicsinheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pusswitch extends AppCompatActivity {
    TextView textdisplay,a,b,c,d,e,f,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pusswitch);
        textdisplay = findViewById(R.id.txtDMGPlague);
        textdisplay.setText("120 ~ 180");
        a = findViewById(R.id.txtHPPlague);
        a.setText("400");
        b = findViewById(R.id.txtMPPlague);
        b.setText("75");
        c = findViewById(R.id.txtDEFPlague);
        c.setText("15");
        d = findViewById(R.id.txtEvasionPlague);
        d.setText("Witch");
        e = findViewById(R.id.txtElementPlague);
        e.setText("Dark");
        f = findViewById(R.id.txtEvasionPlague);
        f.setText("10%");
        g = findViewById(R.id.txtParryPlague);
        g.setText("250%");
    }
}
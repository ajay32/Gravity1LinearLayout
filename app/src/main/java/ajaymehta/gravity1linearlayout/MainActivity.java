package ajaymehta.gravity1linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // gravity basically see space ...(match parent) ..space ,  (wrap content) no space
        // to to make gravity to work ...it works where it has space (match parent) ..then you can move child elements around ...

        // if child is wrap_content .means child has no space ..then you can move child with the help of parent (by setting gravity of parent)
        // if child is match parent ..then you dont need parent help to move child ..you can set gravity to child n make it work ..
    }
}

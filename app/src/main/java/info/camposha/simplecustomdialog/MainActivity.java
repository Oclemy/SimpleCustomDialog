package info.camposha.simplecustomdialog;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {


    Dialog dialog;
    TextView showBtn,cancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CREATE DIALOG
        createDialog();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(view -> {

            //show
            dialog.show();
        });

        //SHOW BTN CLIKCED
        showBtn.setOnClickListener(v -> Toast.makeText(MainActivity.this,"CLICKED",Toast.LENGTH_LONG).show());

        //CANCEL
        cancelBtn.setOnClickListener(v -> dialog.dismiss());


    }

    private void createDialog()
    {
        dialog=new Dialog(this);

        //SET TITLE
        dialog.setTitle("Player");

        //set content
        dialog.setContentView(R.layout.custom_layout);

        showBtn= (TextView) dialog.findViewById(R.id.showTxt);
        cancelBtn= (TextView) dialog.findViewById(R.id.cancelTxt);
    }


}

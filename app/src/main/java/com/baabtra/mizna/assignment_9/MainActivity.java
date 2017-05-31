package com.baabtra.mizna.assignment_9;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void oneClicked(View v){
        AlertDialog.Builder mybuilder=new AlertDialog.Builder(MainActivity.this);
        mybuilder.setTitle("One Button Alert Dialog");
        mybuilder.setMessage("Welcome to Baabtra");
        mybuilder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You clicked OK",Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog mydialog=mybuilder.create();
        mydialog.show();

    }
    public void twoClicked(View v){
        AlertDialog.Builder mybuilder=new AlertDialog.Builder(MainActivity.this);
        mybuilder.setTitle("Two Button Alert Dialog");
        mybuilder.setMessage("Do you want to continue?");
        mybuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You clicked YES!",Toast.LENGTH_SHORT).show();

            }
        });
        mybuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.dismiss();
            }
        });
        AlertDialog mydialog=mybuilder.create();
        mydialog.show();
    }
    public void threeClicked(View v){
        AlertDialog.Builder mybuilder=new AlertDialog.Builder(MainActivity.this);
        mybuilder.setTitle("Three Button Alert Dialog");
        mybuilder.setMessage("Are you sure?");
        mybuilder.setPositiveButton("SURE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You clicked Sure!",Toast.LENGTH_SHORT).show();
            }
        });
        mybuilder.setNegativeButton("NOT SURE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You clicked Not Sure!",Toast.LENGTH_SHORT).show();
            }
        });
        mybuilder.setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog mydialog=mybuilder.create();
        mydialog.show();

    }
}

package com.didiksazali.alertdialog;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button btnAlertDialog, btnAlertDialog2;
	TextView txtKeterangan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		txtKeterangan = (TextView) findViewById(R.id.txtKeterangan);
		btnAlertDialog = (Button) findViewById(R.id.btnAlerDialog);
		btnAlertDialog.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
				alertDialog.setTitle("Info");
				alertDialog.setMessage("Anda memilih alert dialog 1");
				alertDialog.setButton("Ok",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface arg0, int arg1) {
								// TODO Auto-generated method stub

							}
						});
				alertDialog.show();
			}
		});

		btnAlertDialog2 = (Button) findViewById(R.id.btnAlerDialog2);
		btnAlertDialog2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(MainActivity.this);
				alertDialog2.setTitle("Pertanyaan");
				alertDialog2.setMessage("Apakah anda sedang galau?");
				alertDialog2.setPositiveButton("Ya", new OnClickListener() {

					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						txtKeterangan.setText("Anda Sedang Galau");
					}
				});

				alertDialog2.setNeutralButton("Ntahlah", new OnClickListener() {

					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						txtKeterangan.setText("Anda Tidak Tahu Anda Sedang Galau Atau Tidak");
					}
				});

				alertDialog2.setNegativeButton("Tidak", new OnClickListener() {

					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						txtKeterangan.setText("Anda Tidak Sedang Galau");
					}
				});

				alertDialog2.show();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

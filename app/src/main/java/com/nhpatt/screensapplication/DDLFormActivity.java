package com.nhpatt.screensapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.liferay.mobile.screens.ddl.form.DDLFormListener;
import com.liferay.mobile.screens.ddl.form.DDLFormScreenlet;
import com.liferay.mobile.screens.ddl.model.DocumentField;
import com.liferay.mobile.screens.ddl.model.Record;

import org.json.JSONObject;

public class DDLFormActivity extends AppCompatActivity implements DDLFormListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ddlform);

		DDLFormScreenlet ddlFormScreenlet = (DDLFormScreenlet) findViewById(R.id.ddlform);
		ddlFormScreenlet.setListener(this);
	}

	@Override
	public void onDDLFormLoaded(final Record record) {

	}

	@Override
	public void onDDLFormRecordLoaded(final Record record) {

	}

	@Override
	public void onDDLFormRecordAdded(final Record record) {
		Toast.makeText(this, "DDL added!", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onDDLFormRecordUpdated(final Record record) {

	}

	@Override
	public void onDDLFormLoadFailed(final Exception e) {

	}

	@Override
	public void onDDLFormRecordLoadFailed(final Exception e) {

	}

	@Override
	public void onDDLFormRecordAddFailed(final Exception e) {

	}

	@Override
	public void onDDLFormUpdateRecordFailed(final Exception e) {

	}

	@Override
	public void onDDLFormDocumentUploaded(final DocumentField documentField, final JSONObject jsonObject) {

	}

	@Override
	public void onDDLFormDocumentUploadFailed(final DocumentField documentField, final Exception e) {

	}

	public void goToWebContent(View view) {
		startActivity(new Intent(this, WebContentActivity.class));
	}
}

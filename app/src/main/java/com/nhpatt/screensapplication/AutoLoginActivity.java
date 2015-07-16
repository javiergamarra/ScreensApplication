package com.nhpatt.screensapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.liferay.mobile.screens.context.LiferayScreensContext;
import com.liferay.mobile.screens.context.SessionContext;
import com.liferay.mobile.screens.context.storage.CredentialsStoreBuilder;

public class AutoLoginActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_auto_login);

		LiferayScreensContext.init(this);
		SessionContext.loadSessionFromStore(CredentialsStoreBuilder.StorageType.SHARED_PREFERENCES);

		Class destination = SessionContext.hasSession() ? UserPortraitActivity.class : LoginActivity.class;
		startActivity(new Intent(this, destination));
	}
}

package com.pedronveloso.encrypttest;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class EncryptionTestsActivity extends Activity {

	private void debugFunc(String logMsg) {
		Log.v("Pedro", logMsg);
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		debugFunc("EncryptionTest initialzyzed");

		try {
			Crypto cifrar = new Crypto("androidptrules");
			debugFunc("'pedro' encrypted: "
					+ cifrar.encrypt("esta frase tem acentuacao"));
			
			debugFunc("String decrypted: "+cifrar.decrypt("3fd341d1b18a04eee9c027fdd955355d10f981e9aafdf74e941b184c1ac75843a084405fd315a01541d8139b5c76bdb1"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
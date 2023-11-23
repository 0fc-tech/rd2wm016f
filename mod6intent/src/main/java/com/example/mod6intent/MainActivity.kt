package com.example.mod6intent

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val permissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) {isGranted->
            if(isGranted) {
                val intentCallPhone = Intent(
                    Intent.ACTION_CALL,
                    Uri.parse("tel:08555555")
                )
                startActivity(intentCallPhone)
            }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        permissionLauncher.launch(Manifest.permission.CALL_PHONE)
    }
}

//val intentToTarget = Intent(
//    this,
//    TargetActivity::class.java)
//intentToTarget.putExtra("Prenom","Jean-Mi")
//startActivity(intentToTarget)
//val intentViewGeo = Intent(
//    Intent.ACTION_VIEW,
//    Uri.parse("geo:48.0387972,-1.6930923")
//)
//startActivity(intentViewGeo)
package com.prank.app.brimo_prank

import android.app.Activity
import android.app.AlertDialog
import android.content.res.Configuration
import android.os.Bundle

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val isDarkMode = (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) ==
            Configuration.UI_MODE_NIGHT_YES
        val dialogTheme = if (isDarkMode) {
            android.R.style.Theme_DeviceDefault_Dialog_Alert
        } else {
            android.R.style.Theme_DeviceDefault_Light_Dialog_Alert
        }

        AlertDialog.Builder(this, dialogTheme)
            .setMessage("Your phone can't open this app.")
            .setPositiveButton("OK") { _, _ ->
                finishAndRemoveTask()
            }
            .setOnCancelListener {
                finishAndRemoveTask()
            }
            .setCancelable(true)
            .show()
    }
}

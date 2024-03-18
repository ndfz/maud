package me.ndfz.maud

import android.content.ClipData
import android.content.ClipboardManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object {
        const val EMPTY_STRING = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clipBoardManager = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
        clipBoardManager.setPrimaryClip(ClipData.newPlainText(EMPTY_STRING, EMPTY_STRING))
        Toast.makeText(this@MainActivity, getString(R.string.clipboard_cleaned), Toast.LENGTH_SHORT).show()
        finish()
    }
}
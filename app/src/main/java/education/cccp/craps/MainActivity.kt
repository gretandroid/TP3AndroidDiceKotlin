package education.cccp.craps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDices() {
        findViewById<ImageView>(imageViewFirstDice).run {
            if (!isVisible) visibility = VISIBLE
        }
        findViewById<ImageView>(imageViewSecondDice).run {
            if (!isVisible) visibility = VISIBLE
        }
    }

    fun onClickRollDiceButton(view: View) {
        showDices()
    }

    fun rollDice(): String = "1"
}
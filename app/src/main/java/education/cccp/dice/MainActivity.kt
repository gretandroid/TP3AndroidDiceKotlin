package education.cccp.dice

import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import education.cccp.dice.R.id.imageViewFirstDice
import education.cccp.dice.R.id.imageViewSecondDice
import education.cccp.dice.R.layout.activity_main


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
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
fun rollDice():String="1"

}
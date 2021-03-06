package com.example.marcelosiqueira.otempoem10

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textViewCity0: TextView? = null
    private var textViewTemperature0: TextView? = null

    private var textViewCity1: TextView? = null
    private var textViewTemperature1: TextView? = null

    private var textViewCity2: TextView? = null
    private var textViewTemperature2: TextView? = null

    private var textViewCity3: TextView? = null
    private var textViewTemperature3: TextView? = null

    private var textViewCity4: TextView? = null
    private var textViewTemperature4: TextView? = null

    private var textViewCity5: TextView? = null
    private var textViewTemperature5: TextView? = null

    private var textViewCity6: TextView? = null
    private var textViewTemperature6: TextView? = null

    private var textViewCity7: TextView? = null
    private var textViewTemperature7: TextView? = null

    private var textViewCity8: TextView? = null
    private var textViewTemperature8: TextView? = null

    private var textViewCity9: TextView? = null
    private var textViewTemperature9: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewCity0 = findViewById<TextView>(R.id.textViewCity0)
        textViewTemperature0 = findViewById<TextView>(R.id.textViewTemperature0)

        textViewCity1 = findViewById<TextView>(R.id.textViewCity1)
        textViewTemperature1 = findViewById<TextView>(R.id.textViewTemperature1)

        textViewCity2 = findViewById<TextView>(R.id.textViewCity2)
        textViewTemperature2 = findViewById<TextView>(R.id.textViewTemperature2)

        textViewCity3 = findViewById<TextView>(R.id.textViewCity3)
        textViewTemperature3 = findViewById<TextView>(R.id.textViewTemperature3)

        textViewCity4 = findViewById<TextView>(R.id.textViewCity4)
        textViewTemperature4 = findViewById<TextView>(R.id.textViewTemperature4)

        textViewCity5 = findViewById<TextView>(R.id.textViewCity5)
        textViewTemperature5 = findViewById<TextView>(R.id.textViewTemperature5)

        textViewCity6 = findViewById<TextView>(R.id.textViewCity6)
        textViewTemperature6 = findViewById<TextView>(R.id.textViewTemperature6)

        textViewCity7 = findViewById<TextView>(R.id.textViewCity7)
        textViewTemperature7 = findViewById<TextView>(R.id.textViewTemperature7)

        textViewCity8 = findViewById<TextView>(R.id.textViewCity8)
        textViewTemperature8 = findViewById<TextView>(R.id.textViewTemperature8)

        textViewCity9 = findViewById<TextView>(R.id.textViewCity9)
        textViewTemperature9 = findViewById<TextView>(R.id.textViewTemperature9)

        Thread{
            var city0 = CidadeTempoServico.getClimaCidade("3384987")
            runOnUiThread {
                textViewCity0?.text = city0?.name.toString()
                textViewTemperature0?.text = city0?.main?.temp.toString()
            }
            var city1 = CidadeTempoServico.getClimaCidade("3398688")
            runOnUiThread {
                textViewCity1?.text = city1?.name.toString()
                textViewTemperature1?.text = city1?.main?.temp.toString()
            }

            var city2 = CidadeTempoServico.getClimaCidade("3402655")
            runOnUiThread {
                textViewCity2?.text = city2?.name.toString()
                textViewTemperature2?.text = city2?.main?.temp.toString()
            }
            var city3 = CidadeTempoServico.getClimaCidade("3405738")
            runOnUiThread {
                textViewCity3?.text = city3?.name.toString()
                textViewTemperature3?.text = city3?.main?.temp.toString()
            }

            var city4 = CidadeTempoServico.getClimaCidade("3405812")
            runOnUiThread {
                textViewCity4?.text = city4?.name.toString()
                textViewTemperature4?.text = city4?.main?.temp.toString()
            }
            var city5 = CidadeTempoServico.getClimaCidade("3397277")
            runOnUiThread {
                textViewCity5?.text = city5?.name.toString()
                textViewTemperature5?.text = city5?.main?.temp.toString()
            }

            var city6 = CidadeTempoServico.getClimaCidade("3391556")
            runOnUiThread {
                textViewCity6?.text = city6?.name.toString()
                textViewTemperature6?.text = city6?.main?.temp.toString()
            }
            var city7 = CidadeTempoServico.getClimaCidade("4580391")
            runOnUiThread {
                textViewCity7?.text = city7?.name.toString()
                textViewTemperature7?.text = city7?.main?.temp.toString()
            }

            var city8 = CidadeTempoServico.getClimaCidade("3402271")
            runOnUiThread {
                textViewCity8?.text = city8?.name.toString()
                textViewTemperature8?.text = city8?.main?.temp.toString()
            }
            var city9 = CidadeTempoServico.getClimaCidade("3392916")
            runOnUiThread {
                textViewCity9?.text = city9?.name.toString()
                textViewTemperature9?.text = city9?.main?.temp.toString()
            }
        }.start()
    }

}

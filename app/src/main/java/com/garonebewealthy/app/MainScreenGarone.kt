package com.garonebewealthy.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.garonebewealthy.app.databinding.ActivityMainScreenGaroneBinding
import com.garonebewealthy.app.garonewishutils.GasponeUtils
import kotlin.random.Random

class MainScreenGarone : AppCompatActivity() {
    private lateinit var binding : ActivityMainScreenGaroneBinding
    private var gshsadasd = false
    private var psisiadas: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenGaroneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.jdsfjfsd.setOnClickListener {
            pdsksdkdsxa()
        }
    }


    private fun pdsksdkdsxa() = with(binding){
        var counter = 0
        psisiadas?.cancel()
        psisiadas = object : CountDownTimer(3000,100){
            override fun onTick(millisUntilFinished: Long) {
                counter++
                gshsadasd = true
                jdsfjfsd.alpha = 0.7f
                nkldsd.visibility = View.GONE
                ndssf.visibility = View.GONE
                if(counter>5) counter = 0
                jksdadwqw.setImageResource(GasponeUtils.ldskdskdfs[counter])
            }

            override fun onFinish() {
                ncgdysasd()
                gshsadasd = false
                jdsfjfsd.alpha = 1.0f
                nkldsd.visibility = View.VISIBLE
                ndssf.visibility = View.VISIBLE

            }

        }.start()

    }

    private fun ncgdysasd() =with(binding) {
        val kskasdsd = GasponeUtils.ldskdskdfs[Random.nextInt(6)]
        val ooasodas = GasponeUtils.opaasdwqdqwsa[Random.nextInt(8)]
        jksdadwqw.setImageResource(kskasdsd)
        ndssf.text = ooasodas
    }
}
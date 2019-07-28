package com.example.mycalclator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val ADD = 1
    val SUB = 2
    val MUL = 3
    val DIV = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





//        var mem2=0.0
        var mem = 0.0
        var op = 0
        var d=false
        btClr.setOnClickListener {
            tvResult.text = "0"
            tvResult2.text = " "
            d=false
        }
        btEq.setOnClickListener {
            if (op == 0 ||  tvResult.text.toString().takeLast(1) == "+"
                ||tvResult.text.toString().takeLast(1) == "-"
                || tvResult.text.toString().takeLast(1) == "X"
                || tvResult.text.toString().takeLast(1) == "/"||!d)
                return@setOnClickListener


            tvResult2.text = tvResult.text.toString()
            d=false

            when (op) {
                ADD -> {
                    tvResult.text = (mem + tvResult.text.toString().substringAfterLast("+").toInt()).toString()
//                    tvResult.text = "=" + (tvResult.text.toString())
                    if(tvResult.text.toString().substringAfterLast(".")=="0")
                        tvResult.text="="+tvResult.text.toString().substringBeforeLast(".")
                    else
                        tvResult.text="="+tvResult.text.toString()

                }
                SUB -> {
                    tvResult.text = (mem - tvResult.text.toString().substringAfterLast("-").toInt()).toString()
//                    tvResult.text = "=" + (tvResult.text.toString())
                    if(tvResult.text.toString().substringAfterLast(".")=="0")
                        tvResult.text="="+tvResult.text.toString().substringBeforeLast(".")
                    else
                        tvResult.text="="+tvResult.text.toString()
                }
                MUL -> {
                    tvResult.text = (mem * tvResult.text.toString().substringAfterLast("X").toInt()).toString()
//                    tvResult.text = "=" + (tvResult.text.toString())
                    if(tvResult.text.toString().substringAfterLast(".")=="0")
                        tvResult.text="="+tvResult.text.toString().substringBeforeLast(".")
                    else
                        tvResult.text="="+tvResult.text.toString()
                }
                DIV -> {
                    if (tvResult.text == "0")
                        tvResult.text = "error inf"
                    else
                        tvResult.text =(mem.toFloat() / tvResult.text.toString().substringAfterLast("/").toFloat()).toString()
//                       tvResult.text = "=" + (tvResult.text.toString())
                      if(tvResult.text.toString().substringAfterLast(".")=="0")
                        tvResult.text="="+tvResult.text.toString().substringBeforeLast(".")
                      else
                        tvResult.text="="+tvResult.text.toString()
                }


            }
        }
        bt1.setOnClickListener {
            if (tvResult.text == "0") tvResult.text = "7"
            else tvResult.text = tvResult.text.toString() + "7"

        }
        bt2.setOnClickListener {
            if (tvResult.text == "0") tvResult.text = "8"
            else tvResult.text = tvResult.text.toString() + "8"

        }
        bt3.setOnClickListener {
            if (tvResult.text == "0") tvResult.text = "9"
            else tvResult.text = tvResult.text.toString() + "9"


        }
        btAdd.setOnClickListener {
            if(d) return@setOnClickListener
            op = ADD
            mem = tvResult.text.toString().substringAfterLast("=").toDouble()
            tvResult.text = tvResult.text.toString().substringAfterLast("=") + "+"
            d=true
        }


        bt5.setOnClickListener {
            if (tvResult.text == "0") tvResult.text = "4"
            else tvResult.text = tvResult.text.toString() + "4"

        }
        bt6.setOnClickListener {
            if (tvResult.text == "0") tvResult.text = "5"
            else tvResult.text = tvResult.text.toString() + "5"


        }
        bt7.setOnClickListener {
            if (tvResult.text == "0") tvResult.text = "6"
            else tvResult.text = tvResult.text.toString() + "6"


        }
        btSub.setOnClickListener {
            if(d) return@setOnClickListener
            op = SUB
            mem = tvResult.text.toString().substringAfterLast("=").toDouble()
            tvResult.text = tvResult.text.toString().substringAfterLast("=") + "-"
            d=true
        }
        bt9.setOnClickListener {
            if (tvResult.text == "0") tvResult.text = "1"
            else tvResult.text = tvResult.text.toString() + "1"

        }
        bt10.setOnClickListener {
            if (tvResult.text == "0") tvResult.text = "2"
            else tvResult.text = tvResult.text.toString() + "2"

        }
        bt11.setOnClickListener {
            if (tvResult.text == "0") tvResult.text = "3"
            else tvResult.text = tvResult.text.toString() + "3"

        }
        btMul.setOnClickListener {
                     if(d) return@setOnClickListener
            op = MUL
            mem = tvResult.text.toString().substringAfterLast("=").toDouble()
            tvResult.text = tvResult.text.toString().substringAfterLast("=") + "X"
            d=true
        }

        bt14.setOnClickListener {
            if (tvResult.text == "0") tvResult.text = "0"
            else tvResult.text = tvResult.text.toString() + "0"


        }
        btDiv.setOnClickListener {
                      if(d) return@setOnClickListener
            op = DIV
            mem = tvResult.text.toString().substringAfterLast("=").toDouble()
            tvResult.text = tvResult.text.toString().substringAfterLast("=") + "/"
            d=true
        }

    }
}

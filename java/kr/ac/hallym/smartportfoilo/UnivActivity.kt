package kr.ac.hallym.smartportfoilo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import kr.ac.hallym.smartportfoilo.databinding.ActivityMainActivityportBinding
import kr.ac.hallym.smartportfoilo.databinding.ActivityUnivBinding

class UnivActivity : AppCompatActivity() {
    lateinit var univbinding:ActivityUnivBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_univ)

        univbinding = ActivityUnivBinding.inflate(layoutInflater)
        setContentView(univbinding.root)


        val requestLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){}
        univbinding.univDrawerView.setNavigationItemSelectedListener {
            val intent : Intent
            when(it.title){
                "홈"->{
                    val intent = Intent(this, MainActivityport::class.java)
                    requestLauncher.launch(intent)
                }
                "전공성적"->{
                    val intent = Intent(this, UnivActivity::class.java)
                    requestLauncher.launch(intent)

                }
                "깃허브" ->{
                    val  intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/minuatt"));
                    startActivity(intent);

                }
                "인스타그램" ->{
                    val  intent = Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/minu_att"));
                    startActivity(intent);

                }
            }

            true
        }



        findViewById<ImageView>(R.id.goback).setOnClickListener{
            val intent = Intent(this, MainActivityport::class.java)
            startActivity(intent)
            finish()
        }

        //1학년
        findViewById<LinearLayout>(R.id.onegrade).visibility = View.INVISIBLE
        findViewById<ImageView>(R.id.up).visibility = View.INVISIBLE
        //2학년1학기
        findViewById<LinearLayout>(R.id.two_1grade).visibility = View.INVISIBLE
        findViewById<ImageView>(R.id.up2_1).visibility = View.INVISIBLE
        //2학년2학기
        findViewById<LinearLayout>(R.id.two_2grade).visibility = View.INVISIBLE
        findViewById<ImageView>(R.id.up2_2).visibility = View.INVISIBLE
        //3학년 1학기
        findViewById<LinearLayout>(R.id.three_1grade).visibility = View.INVISIBLE
        findViewById<ImageView>(R.id.up3_1).visibility = View.INVISIBLE
        //3학년 2학기
        findViewById<LinearLayout>(R.id.three_2grade).visibility = View.INVISIBLE
        findViewById<ImageView>(R.id.up3_2).visibility = View.INVISIBLE
        //4학년
        findViewById<FrameLayout>(R.id.four_grade).visibility = View.INVISIBLE
        findViewById<LinearLayout>(R.id.four_1grade).visibility = View.INVISIBLE




        //1학년
        findViewById<ImageView>(R.id.down).setOnClickListener{
            findViewById<LinearLayout>(R.id.onegrade).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.down).visibility = View.INVISIBLE
            findViewById<ImageView>(R.id.up).visibility = View.VISIBLE
        }
        findViewById<ImageView>(R.id.up).setOnClickListener{
            findViewById<LinearLayout>(R.id.onegrade).visibility = View.INVISIBLE
            findViewById<ImageView>(R.id.down).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.up).visibility = View.INVISIBLE
        }
        //2학년1학기

        findViewById<ImageView>(R.id.down2_1).setOnClickListener{
            findViewById<LinearLayout>(R.id.two_1grade).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.down2_1).visibility = View.INVISIBLE
            findViewById<ImageView>(R.id.up2_1).visibility = View.VISIBLE
        }
        findViewById<ImageView>(R.id.up2_1).setOnClickListener{
            findViewById<LinearLayout>(R.id.two_1grade).visibility = View.INVISIBLE
            findViewById<ImageView>(R.id.down2_1).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.up2_1).visibility = View.INVISIBLE
        }

        //2학년2학기
        findViewById<ImageView>(R.id.down2_2).setOnClickListener{
            findViewById<LinearLayout>(R.id.two_2grade).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.down2_2).visibility = View.INVISIBLE
            findViewById<ImageView>(R.id.up2_2).visibility = View.VISIBLE
        }
        findViewById<ImageView>(R.id.up2_2).setOnClickListener{
            findViewById<LinearLayout>(R.id.two_2grade).visibility = View.INVISIBLE
            findViewById<ImageView>(R.id.down2_2).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.up2_2).visibility = View.INVISIBLE
        }
        //3학년1학기
        findViewById<ImageView>(R.id.down3_1).setOnClickListener{
            findViewById<LinearLayout>(R.id.three_1grade).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.down3_1).visibility = View.INVISIBLE
            findViewById<ImageView>(R.id.up3_1).visibility = View.VISIBLE
        }
        findViewById<ImageView>(R.id.up3_1).setOnClickListener{
            findViewById<LinearLayout>(R.id.three_1grade).visibility = View.INVISIBLE
            findViewById<ImageView>(R.id.down3_1).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.up3_1).visibility = View.INVISIBLE
        }
        //3학년2학기
        findViewById<ImageView>(R.id.down3_2).setOnClickListener{
            findViewById<LinearLayout>(R.id.three_2grade).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.down3_2).visibility = View.INVISIBLE
            findViewById<ImageView>(R.id.up3_2).visibility = View.VISIBLE
        }
        findViewById<ImageView>(R.id.up3_2).setOnClickListener{
            findViewById<LinearLayout>(R.id.three_2grade).visibility = View.INVISIBLE
            findViewById<ImageView>(R.id.down3_2).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.up3_2).visibility = View.INVISIBLE
        }
        //4학년1학기
        findViewById<ImageView>(R.id.down4_1).setOnClickListener{
            findViewById<LinearLayout>(R.id.four_1grade).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.down4_1).visibility = View.INVISIBLE
            findViewById<ImageView>(R.id.up4_1).visibility = View.VISIBLE
        }
        findViewById<ImageView>(R.id.up4_1).setOnClickListener{
            findViewById<LinearLayout>(R.id.four_1grade).visibility = View.INVISIBLE
            findViewById<ImageView>(R.id.down4_1).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.up4_1).visibility = View.INVISIBLE
        }

    }
    }

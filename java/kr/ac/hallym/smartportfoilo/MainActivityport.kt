package kr.ac.hallym.smartportfoilo

import android.R
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kr.ac.hallym.smartportfoilo.databinding.ActivityMainActivityportBinding


class MainActivityport : AppCompatActivity() {
    lateinit var portbinding: ActivityMainActivityportBinding
    //lateinit var toggle: ActionBarDrawerToggle
    var arr:Array<String> = arrayOf("Info","project_details","career")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        portbinding = ActivityMainActivityportBinding.inflate(layoutInflater)
        setContentView(portbinding.root)

//        toggle= ActionBarDrawerToggle(this,portbinding.drawer, R.string.drawer_opened, R.string.drawer_closed)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        toggle.syncState()


        portbinding.viewpager.adapter = MyFragmentPagerAdapter(this)
        TabLayoutMediator(portbinding.tabs, portbinding.viewpager){ tab, position ->
            tab.text = arr[position]
        }.attach()

        //back버튼
        portbinding.back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val requestLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){}
        portbinding.mainDrawerView.setNavigationItemSelectedListener {
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
                    val  intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/minu_att"));
                    startActivity(intent);

                }
            }

            true
        }

    }

//    override fun onSupportNavigateUp(): Boolean {
//        onBackPressed()
//        return super.onSupportNavigateUp()
//    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if(toggle.onOptionsItemSelected(item))
//            return true
//        return super.onOptionsItemSelected(item)
//    }

}
class MyFragmentPagerAdapter(activity: FragmentActivity): FragmentStateAdapter(activity){
    val fragments: List<Fragment>
    init{
        fragments = listOf(OneFragment(), TwoFragment(), ThreeFragment())
    }

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]
}
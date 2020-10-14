package com.systemk.mainlayout_rv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.systemk.mainlayout_rv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapters: MainAdapter

    private val mainList: ArrayList<MainItem> = arrayListOf(
        MainItem("test1", R.drawable.ic_m),
        MainItem("test2", R.drawable.ic_s),
        MainItem("test3", R.drawable.ic_w),
        MainItem("test3", R.drawable.ic_z),
        MainItem("test3", R.drawable.ic_t),
        MainItem("test1", R.drawable.ic_m),
        MainItem("test2", R.drawable.ic_s),
        MainItem("test3", R.drawable.ic_w),
        MainItem("test3", R.drawable.ic_z),
        MainItem("test3", R.drawable.ic_t),
        MainItem("test1", R.drawable.ic_m),
        MainItem("test2", R.drawable.ic_s),
        MainItem("test3", R.drawable.ic_w),
        MainItem("test3", R.drawable.ic_z),
        MainItem("test3", R.drawable.ic_t)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        binding.apply {
            rvList.adapter = MainAdapter(mainList)
        }
    }
}
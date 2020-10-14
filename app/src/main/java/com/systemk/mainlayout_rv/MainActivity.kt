package com.systemk.mainlayout_rv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.systemk.mainlayout_rv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val mainList: List<MainItem> = listOf(
        MainItem(1,"test1", R.drawable.ic_m),
        MainItem(2,"test2", R.drawable.ic_s),
        MainItem(3,"test3", R.drawable.ic_w),
        MainItem(4,"test4", R.drawable.ic_z),
        MainItem(5,"test5", R.drawable.ic_t),
        MainItem(6,"test6", R.drawable.ic_t)
    )

    private val roleList: List<Int> = listOf(1,5,6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        var filtering: List<MainItem> = mainList.filter { mainItem -> roleList.contains(mainItem.roleCode) }

        binding.apply {
            rvList.adapter = MainAdapter(filtering)
        }
    }
}
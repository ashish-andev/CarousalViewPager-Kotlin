package com.ashish.carousalviewandroid

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by digismart on 1/12/17.
 */
class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    val items = listOf<Int>(
            R.drawable.food1, R.drawable.food2, R.drawable.food3,
            R.drawable.food1, R.drawable.food2, R.drawable.food3,
            R.drawable.food1, R.drawable.food2, R.drawable.food3,
            R.drawable.food1, R.drawable.food2, R.drawable.food3,
            R.drawable.food1, R.drawable.food2, R.drawable.food3,
            R.drawable.food1, R.drawable.food2, R.drawable.food3)

    override fun getItem(position: Int): Fragment {
        return ImgFragment.newInstance(items.get(position))
    }

    override fun getCount(): Int {
        return items.count()
    }
}
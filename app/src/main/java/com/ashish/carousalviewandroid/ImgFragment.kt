package com.ashish.carousalviewandroid

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_image.view.*

/**
 * Created by digismart on 1/12/17.
 */
class ImgFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_image, container, false)
        Glide.with(context)
                .load(arguments.getInt(ARG_DRAWABLE))
                .crossFade()
                .placeholder(R.mipmap.ic_launcher)
                .into(rootView.imageView)
        return rootView
    }

    companion object {
        private val ARG_DRAWABLE = "img"
        fun newInstance(sectionNumber: Int): ImgFragment {
            val fragment = ImgFragment()
            val args = Bundle()
            args.putInt(ARG_DRAWABLE, sectionNumber)
            fragment.arguments = args
            return fragment
        }
    }
}
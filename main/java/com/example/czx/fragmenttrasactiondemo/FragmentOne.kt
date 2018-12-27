package com.example.czx.fragmenttrasactiondemo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created on 12/27/2018.
 * Author caizhixing
 */
class FragmentOne : Fragment(){

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("cccccc","FragmentOne onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("cccccc","FragmentOne onCreateView")
        return inflater.inflate(R.layout.fragment_one,container,false)
    }

    override fun onPause() {
        Log.d("cccccc","FragmentOne onPause")
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        Log.d("cccccc","FragmentOne onResume")
    }
}
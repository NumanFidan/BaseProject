package com.simplertutorials.android.baseproject.ui.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simplertutorials.android.baseproject.R
import com.simplertutorials.android.baseproject.ui.MainActivity

class SampleFragment : BaseFragment() {
    private lateinit var _presenter: SamplePresenter
    private lateinit var activity: MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _presenter = SamplePresenter(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.sample_fragment, container, false)
        updateUi(view)
        return view}

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.activity = context as MainActivity;
    }

    fun updateUi(view: Any) {

    }
}
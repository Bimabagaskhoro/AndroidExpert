package com.bimabagaskhoro.submissionjetpactpro1.ui.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bimabagaskhoro.submissionjetpactpro1.R
import com.bimabagaskhoro.submissionjetpactpro1.databinding.FragmentTvShowBinding
import com.bimabagaskhoro.submissionjetpactpro1.viewmodel.TvShowViewModel

class TvShowFragment : Fragment() {

    private lateinit var fragmentTvShowBinding: FragmentTvShowBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        fragmentTvShowBinding = FragmentTvShowBinding.inflate(layoutInflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            if (activity != null) {
                val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]
                val tvshow = viewModel.getTvSHow()
                val academyAdapter = TvShowAdapter()
                academyAdapter.setTvShow(tvshow)
                with(fragmentTvShowBinding.rvTvshow) {
                    layoutManager = LinearLayoutManager(context)
                    setHasFixedSize(true)
                    adapter = academyAdapter
                }
            }
        }
    }
}
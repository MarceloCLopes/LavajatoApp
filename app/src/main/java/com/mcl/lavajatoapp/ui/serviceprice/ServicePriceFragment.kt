package com.mcl.lavajatoapp.ui.serviceprice

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mcl.lavajatoapp.R

class ServicePriceFragment : Fragment() {

    private lateinit var viewModel: ServicePriceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.service_price_fragment, container, false)
    }

}
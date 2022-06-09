package com.example.unitconvertor.title

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.unitconvertor.R
import com.example.unitconvertor.convertor.convertors.*
import com.example.unitconvertor.databinding.TitleFragmentBinding

class TitleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: TitleFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.title_fragment, container, false)

        binding.lengthBtn.setOnClickListener { navigateToConvertor(LengthConvertor)}
        binding.weightBtn.setOnClickListener { navigateToConvertor(WeightConvertor)}
        binding.temperatureBtn.setOnClickListener { navigateToConvertor(TemperatureConvertor)}
        binding.timeBtn.setOnClickListener { navigateToConvertor(TimeConvertor) }
        return binding.root
    }

    private fun navigateToConvertor(convertor: Convertor){
        findNavController().navigate(TitleFragmentDirections.actionTitleToConvertor(convertor))
    }
}
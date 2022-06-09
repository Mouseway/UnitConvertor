package com.example.unitconvertor.convertor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.unitconvertor.R
import com.example.unitconvertor.convertor.convertors.Convertor
import com.example.unitconvertor.databinding.ConvertorFragmentBinding
import android.widget.Toast
import com.example.unitconvertor.convertor.units.Unit
import kotlin.math.round

class ConvertorFragment : Fragment(){
    // TODO add model
    lateinit var convertor: Convertor
    lateinit var binding: ConvertorFragmentBinding
    lateinit var from: Unit
    lateinit var to: Unit

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DataBindingUtil.inflate(inflater, R.layout.convertor_fragment, container, false)
        convertor = ConvertorFragmentArgs.fromBundle(requireArguments()).convertor
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initSpinners()
        binding.convertBtn.setOnClickListener { onConvert() }
    }

    private fun onConvert(){
        if(binding.inputEt.text.toString() == ""){
            Toast.makeText(context, getString(R.string.waiting_for_input), Toast.LENGTH_SHORT).show()
            return
        }

        val value = binding.inputEt.text.toString().toDouble()
        val converted = convertor.convert(value, from, to)

        binding.resultLb.text = (round(converted * 100000) /100000).toString() + if(to.mark == null) "" else " ${to.mark}"
    }

    private fun initSpinners(){
        val aa = this.context?.let { ArrayAdapter(it, android.R.layout.simple_spinner_dropdown_item, convertor.unitsList().toTypedArray()) }
        val fromListener: OnItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                from = convertor.getUnitByPosition(position)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
        val toListener: OnItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                to = convertor.getUnitByPosition(position)
            }
            override fun onNothingSelected(arg0: AdapterView<*>?) {}
        }

        binding.fromSpin.adapter = aa
        binding.fromSpin.onItemSelectedListener = fromListener
        binding.fromSpin.setSelection(convertor.defaultUnitPosition)
        from = convertor.defaultUnit

        binding.toSpin.adapter = aa
        binding.toSpin.onItemSelectedListener = toListener
        binding.toSpin.setSelection(convertor.defaultUnitPosition)
        to = convertor.defaultUnit
    }
}


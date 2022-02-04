package com.jjrz.myfragtestapplication

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.jjrz.myfragtestapplication.databinding.BlankFragment1FragmentBinding
import java.util.zip.Inflater

class BlankFragment1 : Fragment() {
    lateinit var binding : BlankFragment1FragmentBinding
    companion object {
        fun newInstance() = BlankFragment1()
    }

    private lateinit var viewModel: BlankFragment1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BlankFragment1FragmentBinding.inflate(LayoutInflater.from(requireActivity()))
        viewModel = ViewModelProvider(requireActivity()).get(BlankFragment1ViewModel::class.java)
        binding.mainText.setText("test")
        binding.button1.setOnClickListener {

            viewModel.setMyString(binding.mainText.text.toString())
//            Toast.makeText(requireActivity(),"Click" + viewModel.MyString.value ,Toast.LENGTH_SHORT).show()
        }
        //return inflater.inflate(R.layout.blank_fragment1_fragment, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

}
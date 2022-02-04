package com.jjrz.myfragtestapplication

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.jjrz.myfragtestapplication.databinding.BlankFragment1FragmentBinding
import com.jjrz.myfragtestapplication.databinding.FragmentBlank2Binding

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment2 : Fragment() {
    private lateinit var binding : FragmentBlank2Binding
    private lateinit var viewModel: BlankFragment1ViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        viewModel = ViewModelProvider(requireActivity()).get(BlankFragment1ViewModel::class.java)
        binding = FragmentBlank2Binding.inflate(LayoutInflater.from(requireActivity()))
        binding.textMain.text = viewModel.MyString.value
//        return inflater.inflate(R.layout.fragment_blank2, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.MyString.observe(requireActivity()) {
//            Toast.makeText(requireActivity(),viewModel.MyString.value ?: "null",Toast.LENGTH_SHORT).show()
            binding.textMain.text = viewModel.MyString.value ?: "None"
        }
    }

    companion object {
        fun newInstance() = BlankFragment2()
            }
}
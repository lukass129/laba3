package com.example.myapplication12345

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.myapplication12345.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.Messageforfrag1.observe(activity as LifecycleOwner){
            binding.textView2.text = it
        }
        binding.button2.setOnClickListener {
            dataModel.message.value = "hello"
        }
        binding.button3.setOnClickListener {
            dataModel.Messageforfrag2.value = "hello"
        }

    }
    companion object {

        @JvmStatic
        fun newInstance() = BlankFragment()
            }
    }

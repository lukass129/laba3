package com.example.myapplication12345

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.myapplication12345.databinding.FragmentBlank2Binding
import com.example.myapplication12345.databinding.FragmentBlankBinding


class BlankFragment2 : Fragment() {
    // TODO: Rename and change types of parameters


    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: FragmentBlank2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlank2Binding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.Messageforfrag2.observe(activity as LifecycleOwner, {
           binding.textView3.text = it
        })
        binding.button6.setOnClickListener {
            dataModel.message.value = "hello2"
        }

    }
    companion object {

        @JvmStatic
        fun newInstance() = BlankFragment2()
            }
    }

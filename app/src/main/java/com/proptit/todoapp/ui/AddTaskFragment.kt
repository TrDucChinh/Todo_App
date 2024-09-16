package com.proptit.todoapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.proptit.todoapp.databinding.FragmentAddTaskBinding

class AddTaskFragment(private val addTaskLis) : Fragment() {
    private var _binding: FragmentAddTaskBinding? = null
        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            _binding = FragmentAddTaskBinding.inflate(inflater, container, false)

            return binding.root
        }
        override fun onDestroy() {
            super.onDestroy()
            _binding = null
        }
}
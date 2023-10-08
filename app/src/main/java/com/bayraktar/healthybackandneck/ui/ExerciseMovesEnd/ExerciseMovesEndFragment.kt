package com.bayraktar.healthybackandneck.ui.ExerciseMovesEnd

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.bayraktar.healthybackandneck.R
import com.bayraktar.healthybackandneck.databinding.FragmentExerciseMovesEndBinding

class ExerciseMovesEndFragment : Fragment() {

    private var _binding: FragmentExerciseMovesEndBinding? = null
    val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExerciseMovesEndBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val action =
            ExerciseMovesEndFragmentDirections.actionExerciseMovesEndFragmentToDetailDayFragment()
        view.findNavController().navigate(action)
    }


}
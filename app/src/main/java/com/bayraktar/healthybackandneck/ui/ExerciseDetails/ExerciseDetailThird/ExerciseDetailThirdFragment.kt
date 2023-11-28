package com.bayraktar.healthybackandneck.ui.ExerciseDetails.ExerciseDetailThird

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bayraktar.healthybackandneck.data.Models.ExerciseDetailModel.ExerciseDay
import com.bayraktar.healthybackandneck.databinding.FragmentExerciseDetailThirdBinding
import com.bayraktar.healthybackandneck.ui.ExerciseDetails.ExerciseDetailFirst.ExerciseDetailFirstAdapter
import com.bayraktar.healthybackandneck.utils.RecyclerViewClickListener
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ExerciseDetailThirdFragment : Fragment(), RecyclerViewClickListener {

    private var _binding: FragmentExerciseDetailThirdBinding?= null
    val binding get() = _binding!!

    private var detailList = emptyList<ExerciseDay>()
    private lateinit var firstAdapter: ExerciseDetailFirstAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExerciseDetailThirdBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerview()

        detailList = listOf(
            ExerciseDay(
                day = 1,
                exerciseCount = 7,
                exerciseTime = 7,
                exerciseKcal = 340,
                dayId = 1,
                homeId = 3

            ),
            ExerciseDay(
                day = 2,
                exerciseCount = 6,
                exerciseTime = 7,
                exerciseKcal = 240,
                dayId = 2,
                homeId = 3
            ),
            ExerciseDay(
                day = 3,
                exerciseCount = 8,
                exerciseTime = 8,
                exerciseKcal = 375,
                dayId = 3,
                homeId = 3
            ),
            ExerciseDay(
                day = 4,
                exerciseCount = 8,
                exerciseTime = 7,
                exerciseKcal = 300,
                dayId = 4,
                homeId = 3
            ), ExerciseDay(
                day = 5,
                exerciseCount = 6,
                exerciseTime = 8,
                exerciseKcal = 350,
                dayId = 5,
                homeId = 3
            ), ExerciseDay(
                day = 6,
                exerciseCount = 9,
                exerciseTime = 7,
                exerciseKcal = 290,
                dayId = 6,
                homeId = 3
            ), ExerciseDay(
                day = 7,
                exerciseCount = 6,
                exerciseTime = 8,
                exerciseKcal = 330,
                dayId = 7,
                homeId = 3
            ), ExerciseDay(
                day = 8,
                exerciseCount = 7,
                exerciseTime = 7,
                exerciseKcal = 310,
                dayId = 8,
                homeId = 3
            ), ExerciseDay(
                day = 9,
                exerciseCount = 8,
                exerciseTime = 7,
                exerciseKcal = 290,
                dayId = 9,
                homeId = 3
            ),
            ExerciseDay(
                day = 10,
                exerciseCount = 9,
                exerciseTime = 8,
                exerciseKcal = 340,
                dayId = 10,
                homeId = 3
            ),
            ExerciseDay(
                day = 11,
                exerciseCount = 7,
                exerciseTime = 8,
                exerciseKcal = 240,
                dayId = 11,
                homeId = 3
            ),
            ExerciseDay(
                day = 12,
                exerciseCount = 8,
                exerciseTime = 8,
                exerciseKcal = 270,
                dayId = 12,
                homeId = 3
            ),
            ExerciseDay(
                day = 13,
                exerciseCount = 8,
                exerciseTime = 7,
                exerciseKcal = 290,
                dayId = 13,
                homeId = 3
            ),
            ExerciseDay(
                day = 14,
                exerciseCount = 7,
                exerciseTime = 7,
                exerciseKcal = 330,
                dayId = 14,
                homeId = 3
            ),
            ExerciseDay(
                day = 15,
                exerciseCount = 6,
                exerciseTime = 7,
                exerciseKcal = 330,
                dayId = 15,
                homeId = 3
            ), ExerciseDay(
                day = 16,
                exerciseCount = 7,
                exerciseTime = 7,
                exerciseKcal = 410,
                dayId = 16,
                homeId = 3
            ), ExerciseDay(
                day = 17,
                exerciseCount = 8,
                exerciseTime = 8,
                exerciseKcal = 290,
                dayId = 17,
                homeId = 3
            ),
            ExerciseDay(
                day = 18,
                exerciseCount = 9,
                exerciseTime = 7,
                exerciseKcal = 340,
                dayId = 18,
                homeId = 3
            ),
            ExerciseDay(
                day = 19,
                exerciseCount = 7,
                exerciseTime = 8,
                exerciseKcal = 240,
                dayId = 19,
                homeId = 3
            ),
            ExerciseDay(
                day = 20,
                exerciseCount = 8,
                exerciseTime = 8,
                exerciseKcal = 270,
                dayId = 20,
                homeId = 3
            ),
            ExerciseDay(
                day = 21,
                exerciseCount = 8,
                exerciseTime = 7,
                exerciseKcal = 290,
                dayId = 21,
                homeId = 3
            ),
        )
        firstAdapter.setData(detailList)
    }
    private fun setRecyclerview() = with(binding) {
        listDaysOfWeek.layoutManager = LinearLayoutManager(requireContext())
        firstAdapter = ExerciseDetailFirstAdapter(detailList,this@ExerciseDetailThirdFragment)
        listDaysOfWeek.adapter = firstAdapter
    }

    override fun recyclerviewListClicked(v: View, position: Int) {
        TODO("Not yet implemented")
    }


}
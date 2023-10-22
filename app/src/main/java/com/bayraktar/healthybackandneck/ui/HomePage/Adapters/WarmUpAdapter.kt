package com.bayraktar.healthybackandneck.ui.HomePage.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bayraktar.healthybackandneck.data.Models.Exercise.WarmUpModel
import com.bayraktar.healthybackandneck.databinding.SliderLayoutBinding

class WarmUpAdapter(private val warmList: List<WarmUpModel>, val viewPager2: ViewPager2):
    RecyclerView.Adapter<WarmUpAdapter.OnBoardingsItemAdapter>(){


    inner class OnBoardingsItemAdapter(val binding: SliderLayoutBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingsItemAdapter {
        val itemBinding = SliderLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return OnBoardingsItemAdapter(itemBinding)
    }

    override fun getItemCount(): Int {
        return warmList.size
    }

    override fun onBindViewHolder(holder: OnBoardingsItemAdapter, position: Int) {
        val model = warmList[position]

        holder.binding.apply {
            sliderImage.setImageResource(model.imageWarmUp)
            titleWarmUp.text = model.title
        }
    }
}
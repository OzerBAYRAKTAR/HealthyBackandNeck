package com.bayraktar.healthybackandneck.ui.FirstActivity.SixthFragment

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bayraktar.healthybackandneck.R
import com.bayraktar.healthybackandneck.databinding.FragmentFivethBinding
import com.bayraktar.healthybackandneck.databinding.FragmentSixthBinding
import com.bayraktar.healthybackandneck.ui.HomeActivity


class SixthFragment : Fragment() {

    private var _binding: FragmentSixthBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSixthBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val handler = Handler(Looper.getMainLooper())
        var status = 0

        Thread {
            while (status < 100) {
                status += 1
                try {
                    Thread.sleep(90)
                    when (status) {
                        30 -> {
                            handler.post {
                                binding.labelSplash.text = getString(R.string.splash_2)
                                binding.imageSplash.setImageResource(R.drawable.splashnew1)
                            }
                        }
                        65 -> {
                            handler.post {
                                binding.labelSplash.text = getString(R.string.splash_3)
                                binding.imageSplash.setImageResource(R.drawable.splashnew2)
                            }
                        }
                    }
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                handler.post {
                    binding.txtProgress.text = status.toString()
                }
            }
        }.start()

        handler.post {
            binding.progresSplash.max = 100
            val currentProgress = 100
            ObjectAnimator.ofInt(binding.progresSplash, "progress", currentProgress)
                .setDuration(9000).start()

            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(requireActivity(), HomeActivity::class.java))
                requireActivity().finish()
            }, 9000)
        }
    }

}
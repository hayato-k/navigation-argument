package com.example.navigation_argument

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigation_argument.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    private val thirdFragmentArgs by navArgs<ThirdFragmentArgs>()
    private val hogeHogeArgs: String by lazy {
        thirdFragmentArgs.hogehoge
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentThirdBinding>(inflater, R.layout.fragment_third, container, false)

        binding.textView.text = hogeHogeArgs

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = ThirdFragment()
    }
}

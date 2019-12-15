package com.example.navigation_argument

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigation_argument.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private val secondFragmentArgs by navArgs<SecondFragmentArgs>()
    private val hogeArgs: String by lazy {
        secondFragmentArgs.hoge
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding =
            DataBindingUtil.inflate<FragmentSecondBinding>(inflater, R.layout.fragment_second, container, false)

        binding.textView.text = hogeArgs

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.thirdFragment, Bundle().apply {
                putString("hogehoge", "hogehoge")
            })
        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = SecondFragment()
    }
}

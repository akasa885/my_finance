package android.latihan.my_finance.view

import android.latihan.my_finance.controller.MainActivity
import android.latihan.my_finance.R
import android.latihan.my_finance.controller.BaseActivity
import android.latihan.my_finance.databinding.FragmentAboutBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment

class aboutFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentAboutBinding>(inflater,
            R.layout.fragment_about,container,false)
        (activity as BaseActivity?)!!.closeOurDrawer()
        return binding.root
    }
}
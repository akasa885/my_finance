package android.latihan.my_finance.view

import android.latihan.my_finance.controller.MainActivity
import android.latihan.my_finance.R
import android.latihan.my_finance.databinding.FragmentSettingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment

class settingFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentSettingBinding>(inflater,
            R.layout.fragment_setting,container,false)
        (activity as MainActivity?)!!.closeOurDrawer()
        return binding.root
    }
}
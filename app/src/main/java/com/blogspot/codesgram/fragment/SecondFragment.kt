package com.blogspot.codesgram.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders


class SecondFragment : Fragment() {
    private var PageViewHolder: PageViewModel? = null

    private var txtName: TextView? = null
    private var txtPhone: TextView? = null
    private var txtAddress: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        PageViewHolder = ViewModelProviders.of(requireActivity()).get(PageViewModel::class.java)
        }

        override fun onCreateView(

            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            return inflater.inflate(R.layout.fragment_second, container, false)

        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            txtName = view.findViewById(R.id.textViewName)
            txtPhone = view.findViewById(R.id.textViewPhone)
            txtAddress = view.findViewById(R.id.textViewAddress)

            PageViewHolder!!.name.observe(requireActivity(), { s -> txtName!!.text = s })
            PageViewHolder!!.phone.observe(requireActivity(), { i -> txtPhone!!.text = i  })
            PageViewHolder!!.adrs.observe(requireActivity(), { s -> txtAddress!!.text = s })

        }

        companion object {
            fun newInstance(): SecondFragment {
                return SecondFragment()

            }
        }

    }

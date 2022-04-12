package com.blogspot.codesgram.fragment

import android.os.Bundle

import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater

import android.view.View

import android.view.ViewGroup
import androidx.fragment.app.Fragment import androidx.lifecycle.ViewModelProviders

import com.google.android.material.textfield.TextInputEditText

class FirstFragment : Fragment() {

    private var PageViewHolder: PageViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        PageViewHolder = ViewModelProviders.of(requireActivity()).get(PageViewModel::class.java)
    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        return inflater.inflate(R.layout.fragment_first, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nameEditText = view.findViewById<TextInputEditText> (R.id.textInputTextName)

        nameEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                }

                override fun onTextChanged(charSequence: CharSequence, i:Int, i1:Int, i2:Int) {
                    PageViewHolder!!.setName(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) { }

            })

        val phoneEditText = view.findViewById<TextInputEditText> (R.id.textInputTextPhone)

        phoneEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                }

                override fun onTextChanged(charSequence: CharSequence, i:Int, i1:Int, i2:Int) {
                    PageViewHolder!!.setPhone(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) { }

            })

        val addressEditText = view.findViewById<TextInputEditText> (R.id.textInputTextAddress)

        addressEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                }

                override fun onTextChanged(charSequence: CharSequence, i:Int, i1:Int, i2:Int) {
                    PageViewHolder!!.setAddress(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) { }

            })
    }

    companion object {
        fun newInstance(): FirstFragment {
            return FirstFragment()
        }
    }
}

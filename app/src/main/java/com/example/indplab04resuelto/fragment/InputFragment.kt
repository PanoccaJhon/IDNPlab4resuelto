package com.example.indplab04resuelto.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.indplab04resuelto.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [InputFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InputFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_input, container, false)

        val btnEnviarTexto= view.findViewById<Button>(R.id.btnEnviarTexto)
        val edtTextInput = view.findViewById<EditText>(R.id.edtTextInput)
        btnEnviarTexto.setOnClickListener {
            clickEnviarMensaje(edtTextInput.text.toString())
        }
        return view
    }

    companion object {
    private lateinit var clickEnviarMensaje:(String)->Unit
        @JvmStatic
        fun newInstance(clickEnviarMensaje:(String)->Unit): InputFragment{
            val fragment = InputFragment()
            this.clickEnviarMensaje = clickEnviarMensaje
            return fragment
        }

    }
}
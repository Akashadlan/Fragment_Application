package com.example.fragment_application

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Lifecycle_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Lifecycle_Fragment : Fragment() {
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lifecycle_, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(requireContext(),"this is onAttach",Toast.LENGTH_LONG).show()
    }

    override fun onDetach() {
        super.onDetach()
        Toast.makeText(requireContext(),"this is onDetach",Toast.LENGTH_LONG).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(),"this is onCreated",Toast.LENGTH_LONG).show()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Toast.makeText(requireContext(),"this is onViewStateRestored",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(requireContext(),"this is onStart",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(requireContext(),"this is onResume",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(requireContext(),"this is onPause",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(requireContext(),"this is onStop",Toast.LENGTH_LONG).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Toast.makeText(requireContext(),"this is onSaveInstanceState",Toast.LENGTH_LONG).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(requireContext(),"this is onDestroyView",Toast.LENGTH_LONG).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(requireContext(),"this is onDestroy",Toast.LENGTH_LONG).show()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Lifecycle_Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Lifecycle_Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
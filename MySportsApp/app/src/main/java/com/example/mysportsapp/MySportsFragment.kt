package com.example.mysportsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button // 1. Import Button
import androidx.navigation.fragment.findNavController // 2. Import NavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MySportsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MySportsFragment : Fragment() {
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
    // Inside the MySportsFragment class
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // ESSENTIAL LINE: Loads fragment_my_sports.xml
        return inflater.inflate(R.layout.fragment_my_sports, container, false)
    }

    // <--- START NEW CODE HERE: onViewCreated --->
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the NavController (used to perform navigation)
        val navController = findNavController()

        // 1. Setup click listener for the Football button
        // Assumes you have a Button with ID 'btn_football' in fragment_my_sports.xml
        view.findViewById<Button>(R.id.btn_football)?.setOnClickListener {
            // Navigate using the Action ID created in nav_graph.xml
            navController.navigate(R.id.action_mySportsFragment_to_footballFragment)
        }

        // 2. Setup click listener for the Basketball button
        // Assumes you have a Button with ID 'btn_basketball' in fragment_my_sports.xml
        view.findViewById<Button>(R.id.btn_basketball)?.setOnClickListener {
            navController.navigate(R.id.action_mySportsFragment_to_basketballFragment)
        }
    }
    // <--- END NEW CODE HERE --->

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MySportsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MySportsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
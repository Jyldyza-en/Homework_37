package kg.tutorialapp.homework_37

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kg.tutorialapp.homework_37.databinding.FragmentBinding

class Fragment: Fragment(R.layout.fragment) {

    private var binding: FragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentBinding.bind(view)

        val textFromActivity1 = arguments?.getString("key")

        binding!!.textView.text = textFromActivity1

    }
}
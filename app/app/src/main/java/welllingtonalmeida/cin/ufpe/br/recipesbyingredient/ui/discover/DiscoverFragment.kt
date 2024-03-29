package welllingtonalmeida.cin.ufpe.br.recipesbyingredient.ui.discover

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import welllingtonalmeida.cin.ufpe.br.recipesbyingredient.R

class DiscoverFragment : Fragment() {

    private lateinit var discoverViewModel: DiscoverViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        discoverViewModel =
            ViewModelProviders.of(this).get(DiscoverViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_discover, container, false)
        val textView: TextView = root.findViewById(R.id.text_discover)
        discoverViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}
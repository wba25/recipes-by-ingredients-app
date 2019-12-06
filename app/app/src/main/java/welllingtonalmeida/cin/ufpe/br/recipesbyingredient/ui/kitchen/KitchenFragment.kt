package welllingtonalmeida.cin.ufpe.br.recipesbyingredient.ui.kitchen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import welllingtonalmeida.cin.ufpe.br.recipesbyingredient.R

class KitchenFragment : Fragment() {

    private lateinit var kitchenViewModel: KitchenViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        kitchenViewModel =
            ViewModelProviders.of(this).get(KitchenViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_kitchen, container, false)
        val textView: TextView = root.findViewById(R.id.text_kitchen)
        kitchenViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}
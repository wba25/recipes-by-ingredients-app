package welllingtonalmeida.cin.ufpe.br.recipesbyingredient.ui.discover

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiscoverViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is some random recipes from dataset"
    }
    val text: LiveData<String> = _text
}
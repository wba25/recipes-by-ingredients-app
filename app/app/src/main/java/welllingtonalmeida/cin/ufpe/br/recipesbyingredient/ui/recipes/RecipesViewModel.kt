package welllingtonalmeida.cin.ufpe.br.recipesbyingredient.ui.recipes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecipesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is my recent accessed recipes"
    }
    val text: LiveData<String> = _text
}
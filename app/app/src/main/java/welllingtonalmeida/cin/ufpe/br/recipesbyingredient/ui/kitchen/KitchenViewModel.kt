package welllingtonalmeida.cin.ufpe.br.recipesbyingredient.ui.kitchen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KitchenViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is my kitchen"
    }
    val text: LiveData<String> = _text
}
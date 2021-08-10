import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sofudev.viewmodelbasic.MainActivityViewModel
import java.lang.IllegalArgumentException

@Suppress("UNCHECKED_CAST")
class MainActivityViewModelFactory(private val initialVal : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java))
        {
            return MainActivityViewModel(initialVal) as T
        }

        throw IllegalArgumentException("Viewmodel tidak ditemukan")
    }

}
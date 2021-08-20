package com.example.currencyconverterapp.viewModels

import androidx.lifecycle.*
import com.example.currencyconverterapp.model.Repository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel : ViewModel(){

    private val repository = Repository()

    val USAcurrency = MutableLiveData<String>()
    val IQDcurrency = MutableLiveData<String>()
    private val _result = MutableLiveData<String>()
    val result: LiveData<String>
        get() = _result



    fun getIQD() {
        viewModelScope.launch {
            repository.getIQDCurrency(USAcurrency.value).collect {
                _result.postValue(it)
            }
        }
    }

    fun getUSA() {
        viewModelScope.launch {
            repository.getUSACurrency(IQDcurrency.value).collect {
                _result.postValue(it)
            }
        }
    }

    fun empty(){
        IQDcurrency.value = ""
        USAcurrency.value = ""
    }

}
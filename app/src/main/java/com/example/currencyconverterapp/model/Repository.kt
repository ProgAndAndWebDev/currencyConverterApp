package com.example.currencyconverterapp.model

import kotlinx.coroutines.flow.flow

class Repository {
    private var data = Data()

    fun getUSACurrency(number: String?) = flow { emit(data.exchangeFromIQDtoUSA(number)) }
    fun getIQDCurrency(number: String?) = flow { emit(data.exchangeFromUSAtoIQD(number)) }

}

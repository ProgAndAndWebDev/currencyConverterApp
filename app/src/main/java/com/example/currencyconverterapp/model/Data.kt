package com.example.currencyconverterapp.model
import kotlinx.coroutines.delay
import java.text.DecimalFormat

class Data {

    suspend fun exchangeFromUSAtoIQD(number: String?):String {

        val check = checkIfNull(number)
        val result = check!!.toDouble() * 1460
        delay(1)
        return result.convert()

    }

    suspend fun exchangeFromIQDtoUSA(number: String?): String {

        val check = checkIfNull(number)
        val result = check!!.toDouble() / 1460
        delay(1)
        return result.convert()

    }




    fun checkIfNull(number: String?): String? {
        if (number == "")
            return "0"
        return number
    }

    fun Double.convert(): String {
        val format = DecimalFormat("#,###.00000")
        format.isDecimalSeparatorAlwaysShown = false
        return format.format(this).toString()
    }
}
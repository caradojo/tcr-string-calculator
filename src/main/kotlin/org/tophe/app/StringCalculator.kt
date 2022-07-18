package org.tophe.app

class StringCalculator {
    fun add(stringParams: String): Int {
        if (stringParams.isEmpty() ) {
            return 0
        } else {
            return stringParams.toInt()
        }
    }

}

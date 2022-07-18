package org.tophe.app

class StringCalculator {
    fun add(stringParams: String): Int {

        if (stringParams.isEmpty()) {
            return 0
        }

        if (stringParams.contains(',')) {
            return stringParams.split(',').map { it.toInt() }.sum()
        }
        return stringParams.toInt()
    }

}

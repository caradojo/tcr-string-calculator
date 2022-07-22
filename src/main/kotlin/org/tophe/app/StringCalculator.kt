package org.tophe.app

class StringCalculator {
    fun add(stringParams: String): Int {

        if (stringParams.isEmpty()) {
            return 0
        }

        return stringParams
            .removePrefix("//,\n")
            .split(',', '\n')
            .map { it.toInt() }.sum()
    }

}

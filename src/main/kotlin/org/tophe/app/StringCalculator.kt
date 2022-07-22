package org.tophe.app

class StringCalculator {
    fun add(stringParams: String): Int {

        if (stringParams.isEmpty()) {
            return 0
        }

        val values = Regex("//,\n").split(stringParams).last()
        return values
            .split(',', '\n')
            .map { it.toInt() }.sum()
    }

}

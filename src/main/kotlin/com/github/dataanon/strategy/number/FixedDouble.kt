package com.github.dataanon.strategy.number

import com.github.dataanon.Field
import com.github.dataanon.Record
import com.github.dataanon.strategy.AnonymizationStrategy

class FixedDouble(val value: Double) : AnonymizationStrategy<Double> {

    override fun anonymize(field: Field<Double>, record: Record): Double = value
}
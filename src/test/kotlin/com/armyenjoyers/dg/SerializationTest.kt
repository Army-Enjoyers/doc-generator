package com.armyenjoyers.dg

import com.armyenjoyers.dg.models.Patient
import com.armyenjoyers.dg.schemas.OutpatientCard
import org.junit.Test

class SerializationTest {
    @Test
    fun outpatientCardSerializationTest() {
        val anyData = OutpatientCard(
            Patient("maxim", "yetsh", "20.20.2020"),
            "name",
            "21.12.2012"
        )
        print(anyData.serialize())
    }
}
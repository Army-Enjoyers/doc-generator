package com.armyenjoyers.dg.schemas

import com.armyenjoyers.dg.Card
import com.armyenjoyers.dg.models.Patient
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JacksonXmlRootElement
class OutpatientCard(
    @field:JacksonXmlProperty(localName = "Patient")
    val patient: Patient,

    val name: String,
    val surname: String
) : Card()
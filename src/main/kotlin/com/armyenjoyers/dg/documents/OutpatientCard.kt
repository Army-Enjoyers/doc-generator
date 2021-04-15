package com.armyenjoyers.dg.documents

import com.armyenjoyers.dg.models.Patient
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JacksonXmlRootElement
class OutpatientCard(
    @field:JacksonXmlProperty(localName = "Patient")
    val patient: Patient
) : Document()
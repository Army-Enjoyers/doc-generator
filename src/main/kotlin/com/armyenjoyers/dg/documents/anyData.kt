package com.armyenjoyers.dg.documents

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JacksonXmlRootElement
data class anyData(
    @field:JacksonXmlProperty
    val name: String,

    @field:JacksonXmlProperty
    val date: String
) : Document()

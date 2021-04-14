package com.armyenjoyers.dg.schemas

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JacksonXmlRootElement
data class OutpatientCard(
    @field:JacksonXmlProperty
    val name: String,

    @field:JacksonXmlProperty
    val surname: String
) : Card()
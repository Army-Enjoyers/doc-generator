package com.armyenjoyers.dg

import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule
import com.fasterxml.jackson.dataformat.xml.XmlMapper

open class Card {
    fun getEntityName(): String {
        return this::class.simpleName ?: throw Exception()
    }

    fun serialize(): String {
        val xmlMapper = XmlMapper(
            JacksonXmlModule().apply { setDefaultUseWrapper(false) }
        ).apply {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
        return xmlMapper.writeValueAsString(this)
    }
}
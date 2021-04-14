package com.armyenjoyers.dg

import com.armyenjoyers.dg.schemas.Card
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import org.docx4j.Docx4J
import java.io.ByteArrayOutputStream
import java.io.File

class DocGenerator {
    companion object {
        fun generate(schema: Card): ByteArrayOutputStream {
            val template = Links.generateLink(schema.getEntityName())
            val wordMLPackage = Docx4J.load(File(template))
            val xml = serialization(schema)
            Docx4J.bind(wordMLPackage, xml, Docx4J.FLAG_BIND_INSERT_XML or Docx4J.FLAG_BIND_BIND_XML)

            val stream = ByteArrayOutputStream()
            Docx4J.save(wordMLPackage, stream, Docx4J.FLAG_NONE)

            return stream
        }

        private fun serialization(schema: Card): String {
            val xmlMapper = XmlMapper(
                JacksonXmlModule().apply { setDefaultUseWrapper(false) }
            ).apply {
                enable(SerializationFeature.INDENT_OUTPUT)
            }
            return xmlMapper.writeValueAsString(schema)
        }
    }
}
package com.armyenjoyers.dg

import org.docx4j.Docx4J
import java.io.ByteArrayOutputStream
import java.io.File

class DocGenerator {
    companion object {
        fun generate(schema: Card): ByteArrayOutputStream {
            val template = Links.generateLink(schema.getEntityName())
            val wordMLPackage = Docx4J.load(File(template))
            val xml = schema.serialize()
            Docx4J.bind(wordMLPackage, xml, Docx4J.FLAG_BIND_INSERT_XML or Docx4J.FLAG_BIND_BIND_XML)

            val stream = ByteArrayOutputStream()
            Docx4J.save(wordMLPackage, stream, Docx4J.FLAG_NONE)

            return stream
        }
    }
}
package com.armyenjoyers.dg

import com.armyenjoyers.dg.documents.Document
import org.docx4j.Docx4J
import java.io.ByteArrayOutputStream
import java.io.File

object DocGenerator {
    fun generate(document: Document): ByteArrayOutputStream {
        val wordTemplate = DocumentPath.generateDocumentPath(document.getSimpleName())
        val wordMLPackage = Docx4J.load(File(wordTemplate))
        val xmlData = document.serialize()
        Docx4J.bind(wordMLPackage, xmlData, Docx4J.FLAG_BIND_INSERT_XML or Docx4J.FLAG_BIND_BIND_XML)

        val stream = ByteArrayOutputStream()
        Docx4J.save(wordMLPackage, stream, Docx4J.FLAG_NONE)

        return stream
    }
}
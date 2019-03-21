package ro.ubb.dp1819.gavrila.andrei.lab1.service

import java.io.File

class FileReaderService {
    fun read(file: File): List<String> = file.readLines()
    fun read(filepath: String): List<String> = read(File(filepath))
}
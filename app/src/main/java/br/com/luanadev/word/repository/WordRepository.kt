package br.com.luanadev.word.repository

import androidx.annotation.WorkerThread
import br.com.luanadev.word.data.entity.Word
import br.com.luanadev.word.data.dao.WordDao
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {
    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}

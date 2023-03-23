package com.usmaan.hangman

import junit.framework.Assert.assertEquals
import org.junit.Test

class GameManagerTest {

    @Test
    fun `generateUnderscores to return correct amount of underscores`() {
        // Given
        val word1 = "Computadora"
        val word2 = "Raton"
        val word3 = "Alberca"

        val underscores1 = "-----------"
        val underscores2 = "_____"
        val underscores3 = "-------"


        val gameManager = GameManager()

        // When
        val actual1 = gameManager.generateUnderscores(word1)
        val actual2 = gameManager.generateUnderscores(word2)
        val actual3 = gameManager.generateUnderscores(word3)

        // Then
        assertEquals(underscores1, actual1)
        assertEquals(underscores2, actual2)
        assertEquals(underscores3, actual3)
    }
}
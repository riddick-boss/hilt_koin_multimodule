package com.example.hiltkoinmultimodule

import com.example.koin.di.koinModule
import org.junit.Test
import org.koin.test.KoinTest
import org.koin.test.verify.verify

class KoinCheckModulesTest : KoinTest {
    @Test
    fun checkAllModules() {
        koinModule.verify()
    }
}
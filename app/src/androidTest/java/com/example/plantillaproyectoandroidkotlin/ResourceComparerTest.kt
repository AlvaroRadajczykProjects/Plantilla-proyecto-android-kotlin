package com.example.plantillaproyectoandroidkotlin

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.*
import org.junit.Test
import org.junit.Before
import org.junit.After

class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer

    @Before
    fun setup() {
        //for example you wanna init a variable value
        resourceComparer = ResourceComparer()
    }

    @After
    fun tearDown() {
        //for example you wanna teardown a server
    }

    @Test
    fun stringResourceSameAsGivenString_ReturnTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "PlantillaProyectoAndroidKotlin")
        assertTrue(result)
    }

    @Test
    fun stringResourceSameAsGivenString_ReturnFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "Hola")
        assertFalse(result)
    }

}
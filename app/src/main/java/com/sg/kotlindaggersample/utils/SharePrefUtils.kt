package com.sg.kotlindaggersample.utils

import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.sg.kotlindaggersample.SampleApp

/**
 * Created by Selin on 6.02.2019.
 */
object ShareTool {

    private val prefs: SharedPreferences?
        get() = PreferenceManager.getDefaultSharedPreferences(SampleApp.applicationContext())

    operator fun set(fieldName: String, fieldValue: String) {
        val sharepref = prefs
        if (sharepref != null) {
            val prefsEditor = sharepref.edit()
            prefsEditor.putString(fieldName, fieldValue)
            prefsEditor.apply()
        }
    }

    operator fun set(fieldName: String, fieldValue: Boolean?) {
        val sharepref = prefs
        if (sharepref != null && fieldValue != null) {
            val prefsEditor = sharepref.edit()
            prefsEditor.putBoolean(fieldName, fieldValue)
            prefsEditor.apply()
        }
    }

    operator fun set(fieldName: String, fieldValue: Int?) {
        val sharepref = prefs
        if (sharepref != null && fieldValue != null) {
            val prefsEditor = sharepref.edit()
            prefsEditor.putInt(fieldName, fieldValue)
            prefsEditor.apply()
        }
    }

    operator fun set(fieldName: String, fieldValue: Long?) {
        val sharepref = prefs
        if (sharepref != null && fieldValue != null) {
            val prefsEditor = sharepref.edit()
            prefsEditor.putLong(fieldName, fieldValue)
            prefsEditor.apply()
        }
    }

    operator fun get(fieldName: String, defaultValue: String?): String? {
        val sharepref = prefs
        return if (sharepref != null) sharepref.getString(fieldName, defaultValue) else defaultValue
    }

    fun getInt(fieldName: String, defaultValue: Int): Int {
        val sharepref = prefs
        return sharepref?.getInt(fieldName, defaultValue) ?: defaultValue
    }

    fun getBoolean(fieldName: String, defaultValue: Boolean): Boolean {
        val sharepref = prefs
        return sharepref?.getBoolean(fieldName, defaultValue) ?: defaultValue
    }

    fun getLong(fieldName: String, defaultValue: Long): Long {
        val sharepref = prefs
        return sharepref?.getLong(fieldName, defaultValue) ?: defaultValue
    }

    fun remove(fieldName: String): Boolean? {
        val sharepref = prefs
        val prefsEditor = sharepref?.edit()
        return prefsEditor?.remove(fieldName)?.commit()
    }
}
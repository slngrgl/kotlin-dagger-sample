package com.sg.flavorsample.utils

import android.support.v4.app.ActivityCompat
import android.support.v4.content.PermissionChecker.PERMISSION_GRANTED
import com.sg.flavorsample.SampleApp

/**
 * Created by Selin on 26.12.2018.
 */
const val LOCATION_PERMISSION_REQUEST_CODE = 98
const val WRITE_EXTERNAL_PERMISSION_REQUEST_CODE = 99

object PermissionUtils {

    val cameraPermission: Array<String>
        get() = arrayOf(android.Manifest.permission.CAMERA)

    val writeExternalPermission: Array<String>
        get() = arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)

    val locationPermission: Array<String>
        get() = arrayOf(android.Manifest.permission.ACCESS_COARSE_LOCATION)

    fun needPermissionForWriteStorage(): Boolean {
        return !isPermissionsGranted(writeExternalPermission)
    }

    fun needPermissionForLocation(): Boolean {
        return !isPermissionsGranted(locationPermission)
    }

    fun needPermissionForCamera(): Boolean {
        return !isPermissionsGranted(cameraPermission)
    }

    private fun isPermissionsGranted(permissions: Array<String>): Boolean {
        for (permission in permissions) {
            if (ActivityCompat.checkSelfPermission(SampleApp.applicationContext(), permission) != PERMISSION_GRANTED) {
                return false
            }
        }
        return true
    }
}


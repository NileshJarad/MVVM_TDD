package com.tddmvvm.utils.extension

import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

/***
 * Used to replace fragment in [FrameLayout]
 *
 * Check kotlin extension [@see https://kotlinlang.org/docs/extensions.html]
 */
fun FrameLayout.showFragment(
    supportFragmentManager: FragmentManager,
    fragment: Fragment
) {
    supportFragmentManager.beginTransaction()
        .replace(id, fragment)
        .commit()
}
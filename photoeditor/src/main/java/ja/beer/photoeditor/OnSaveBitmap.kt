package ja.beer.photoeditor

import android.graphics.Bitmap

/**
 * @author [beer Rashid](https://github.com/burhanrashid52)
 * @version 0.1.2
 * @since 5/21/2018
 */
interface OnSaveBitmap {
    fun onBitmapReady(saveBitmap: Bitmap)
}
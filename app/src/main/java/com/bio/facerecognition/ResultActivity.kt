package com.bio.facerecognition

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.mikhaellopez.circularprogressbar.CircularProgressBar


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        findViewById<Button>(R.id.btnEnd).setOnClickListener {
            super.onBackPressed()
        }

        val identifyedFace = intent.getParcelableExtra("identified_face") as? Bitmap
        val enrolledFace = intent.getParcelableExtra("enrolled_face") as? Bitmap
        val identifiedName = intent.getStringExtra("identified_name")
        val similarity = intent.getFloatExtra("similarity", 0f) * 100
        val livenessScore = intent.getFloatExtra("liveness", 0f)
        val yaw = intent.getFloatExtra("yaw", 0f)
        val roll = intent.getFloatExtra("roll", 0f)
        val pitch = intent.getFloatExtra("pitch", 0f)

        findViewById<ImageView>(R.id.imageEnrolled).setImageBitmap(enrolledFace)
        findViewById<ImageView>(R.id.imageIdentified).setImageBitmap(identifyedFace)
        findViewById<TextView>(R.id.txtUserName).text = identifiedName
        findViewById<TextView>(R.id.textSimilarityScore).text = String.format("%.1f%%", similarity)
        findViewById<TextView>(R.id.textLiveness).text = String.format("%.4f", livenessScore)
        findViewById<TextView>(R.id.textYaw).text = String.format("%.4f", yaw)
        findViewById<TextView>(R.id.textRoll).text = String.format("%.4f", roll)
        findViewById<TextView>(R.id.textPitch).text = String.format("%.4f", pitch)


        val circularProgressBar = findViewById<CircularProgressBar>(R.id.similarityBar)
        circularProgressBar.apply {
            // Set Progress
//            progress = similarity
            // or with animation
            setProgressWithAnimation(similarity, 500) // =1s

            // Set Progress Max
            progressMax = 100f

            // Set ProgressBar Color
            progressBarColor = Color.WHITE
            // or with gradient
            progressBarColorStart = ContextCompat.getColor(context, R.color.buttonBackgroundColor)
            progressBarColorEnd = ContextCompat.getColor(context, R.color.buttonBackgroundColor)
            progressBarColorDirection = CircularProgressBar.GradientDirection.TOP_TO_BOTTOM

            // Set background ProgressBar Color
            backgroundProgressBarColor = ContextCompat.getColor(context, R.color.buttonBackgroundColor)
            // or with gradient
            backgroundProgressBarColorStart = ContextCompat.getColor(context, R.color.buttonBackgroundColor_2nd)
            backgroundProgressBarColorEnd = ContextCompat.getColor(context, R.color.buttonBackgroundColor_2nd)
            backgroundProgressBarColorDirection = CircularProgressBar.GradientDirection.TOP_TO_BOTTOM

            // Set Width
            progressBarWidth = 7f // in DP
            backgroundProgressBarWidth = 7f // in DP

            // Other
            roundBorder = false
            startAngle = 0f
            progressDirection = CircularProgressBar.ProgressDirection.TO_RIGHT
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }
}
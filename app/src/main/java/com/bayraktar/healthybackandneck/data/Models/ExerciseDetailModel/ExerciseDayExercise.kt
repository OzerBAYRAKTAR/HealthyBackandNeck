package com.bayraktar.healthybackandneck.data.Models.ExerciseDetailModel

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "exercise_day_exercise",primaryKeys = ["id"])
data class ExerciseDayExercise(
    @SerializedName("id")
    val id: Int ,
    @SerializedName("ExerciseId")
    val exerciseId: Int,
    @SerializedName("Step")
    val step: Int,
    @SerializedName("titleName")
    val titleName: String,
    @SerializedName("DayId")
    val dayId: Int,
    @SerializedName("ExerciseName")
    val exerciseName: String,
    @SerializedName("ExerciseDescription")
    val exerciseDescription: String,
    @SerializedName("Image")
    val image: Int,
    @SerializedName("IsExerciseCompleted")
    var isExerciseCompleted: Boolean,
    @SerializedName("Level")
    var level: Int,

    @SerializedName("isChecked")
    var isChecked: Boolean = false,

    @SerializedName("isFavourite")
    var isFavourite: Boolean = false

): Parcelable



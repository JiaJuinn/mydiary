package com.example.mydiary

data class Diary(
    var title: String? = null,
    val subtitle: String? = null,
    var date: String? = null,
    var time: String? = null,
    var description: String = "",
    var diaryColor: String ="",
    var diaryImage: String = ""
){
    // Default constructor required for Firebase
    constructor() : this(null, null, null,null)
}


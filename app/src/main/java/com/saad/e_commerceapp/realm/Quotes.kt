package com.saad.e_commerceapp.realm

import io.realm.kotlin.ext.realmListOf
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

open class Quotes : RealmObject {
    @PrimaryKey
    var id: ObjectId = ObjectId.invoke()
    val count: Int = 0
    val totalCount: Int = 0
    val page: Int = 0
    val totalPages: Int = 0
    val lastItemIndex: Int = 0
    val results: List<Result> = realmListOf()
}

open class Result : RealmObject {
    val _id: String = ""
    val author: String = ""
    val authorSlug: String = ""
    val content: String = ""
    val dateAdded: String = ""
    val dateModified: String = ""
    val length: Int = 0
    val tags: List<String> = emptyList()
}
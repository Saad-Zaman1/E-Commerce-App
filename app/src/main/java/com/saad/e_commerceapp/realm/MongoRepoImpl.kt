package com.saad.e_commerceapp.realm

import io.realm.kotlin.Realm
import io.realm.kotlin.ext.query
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class MongoRepoImpl(val realm: Realm) : MongoRepo {
    override fun getQuotes(): Flow<List<Quotes>> {
        return realm.query<Quotes>().asFlow().map { it.list }
    }

    override suspend fun insertQuote(quotes: Quotes) {
        realm.write {
            copyToRealm(quotes)
        }
    }
}
package com.saad.e_commerceapp.di

import com.saad.e_commerceapp.realm.MongoRepo
import com.saad.e_commerceapp.realm.MongoRepoImpl
import com.saad.e_commerceapp.realm.Quotes
import com.saad.e_commerceapp.realm.Result
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun provideRealm(): Realm {
        val config = RealmConfiguration.Builder(
            schema = setOf(
                Quotes::class, Result::class
            )
        ).compactOnLaunch()
            .build()
        return Realm.open(config)
    }

    @Singleton
    @Provides
    fun provideMongoRepo(realm: Realm): MongoRepo {
        return MongoRepoImpl(realm = realm)
    }
}
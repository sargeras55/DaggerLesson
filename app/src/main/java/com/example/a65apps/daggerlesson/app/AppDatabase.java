package com.example.a65apps.daggerlesson.app;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.support.annotation.NonNull;

import com.example.a65apps.daggerlesson.data.contact.Contact;
import com.example.a65apps.daggerlesson.data.contact.ContactDao;


@Database(version = 1, entities = {Contact.class})
public abstract class AppDatabase extends RoomDatabase {

    @NonNull
    public abstract ContactDao getContactsDao();

}
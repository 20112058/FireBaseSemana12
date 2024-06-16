package com.example.firebase.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CustomerDao {

    @Insert
    fun insert(customerEntity: CustomerEntity)

    @Update
    fun update(customerEntity: CustomerEntity)

    @Query("SELECT * FROM customer ORDER BY last_name")
    fun getCustomerByLastName(): LiveData<List<CustomerEntity>>
}
package com.pratiksha.mvvmtut2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.util.Log
//import androidx.lifecycle.ViewModelProvider
//import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {
//    private lateinit var booksViewModel: BooksViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        booksViewModel = ViewModelProvider(this).get(BooksViewModel::class.java)
//
//        booksViewModel.bookLiveData.observe(this){
//            Log.i("allBooks", it.toString())
//        }


    }
}
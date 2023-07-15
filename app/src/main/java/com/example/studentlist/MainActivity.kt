package com.example.studentlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.studentlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var  studentRecycleView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // studentRecycleView= binding
//        studentRecycleView.layoutManager = LinearLayoutManager(this)
//
//        val students =listOf(
//            Student(R.drawable.female,"Bernadette de Jesus",24,90.5),
//            Student(R.drawable.female,"Alyssa Redima",26,90.5),
//            Student(R.drawable.female,"Geraldyn Vallescas",30,90.5),
//            Student(R.drawable.male,"Cyrille Pascual",27,90.5),
//            Student(R.drawable.male,"John Joseph Bautista",24,90.5),
//            Student(R.drawable.male,"Jonas Mamenta",24,90.5)
//        )
//
//        studentRecycleView.adapter=StudentAdapter(students)

    }
}
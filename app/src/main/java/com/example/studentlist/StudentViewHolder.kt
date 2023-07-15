package com.example.studentlist

import androidx.recyclerview.widget.RecyclerView
import com.example.studentlist.databinding.StudentLayoutBinding

class StudentViewHolder(private var binding:StudentLayoutBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(student: Student){
        binding.imgViewStudent.setImageResource(student.imgStud)
        binding.txtStudentName.text = student.name
        binding.txtViewGrade.text= student.grade.toString()
        binding.txtViewStudentAge.text = student.age.toString()


    }
}
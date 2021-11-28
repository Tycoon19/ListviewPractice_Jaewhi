package com.example.listviewpractice_jaewhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice_jaewhi.datas.Student

class MainActivity : AppCompatActivity() {
//  멤버변수 생성
    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      실제 뿌려줄 데이터들을 ArrayList에 추가해준다.
        mStudentList.add(Student("몸짱 재휘",1996))
        mStudentList.add(Student("몸짱 서환",1993))
        mStudentList.add(Student("몸짱 민재",1996))
        mStudentList.add(Student("몸짱 태현",1999))


    }
}
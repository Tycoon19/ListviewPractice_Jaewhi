package com.example.listviewpractice_jaewhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.listviewpractice_jaewhi.adapters.StudentAdapter
import com.example.listviewpractice_jaewhi.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//  멤버변수 생성
    val mStudentList = ArrayList<Student>()
//  나중에 채워넣는 변수를 생성
    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      실제 뿌려줄 데이터들을 ArrayList에 추가해준다.
        mStudentList.add(Student("몸짱 재휘",1996))
        mStudentList.add(Student("몸짱 서환",1993))
        mStudentList.add(Student("몸짱 민재",1996))
        mStudentList.add(Student("몸짱 태현",1999))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentlistView.adapter = mAdapter
//      여기까지만 하면 애뮬레이터 결과에선 "학생이름 (1999년생)"밖에 안 뜸. 그 이유는 StudentAdapter에서 student_list_item의 layout만 따왔기 때문에!!!!
        
        studentlistView.setOnItemClickListener { parent, view, position, id ->

        val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name}가 클릭 됨.", Toast.LENGTH_SHORT).show()

        }

        studentlistView.setOnItemLongClickListener { parent, view, position, id ->

            val longClickedStudent = mStudentList[position]

            Toast.makeText(this, "${longClickedStudent.name}가 길게 클릭 됨", Toast.LENGTH_SHORT).show()

            return@setOnItemLongClickListener true

        }
        
    }
}
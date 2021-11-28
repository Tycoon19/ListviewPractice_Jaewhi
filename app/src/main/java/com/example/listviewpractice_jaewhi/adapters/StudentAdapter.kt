package com.example.listviewpractice_jaewhi.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewpractice_jaewhi.R
import com.example.listviewpractice_jaewhi.datas.Student
//    StudentAdapter가 회색인 이유는 아직 아무데서도 안가져다 쓴다는 말임ㅇㅇ
class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {

        val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        return super.getView(position, convertView, parent) super 앞에 return이 붙으면 바로 날려버리자.

//        convertView를 tempRow 라는 변수로 저장한 이유는 비어있다면 채워달라는 의미의 if문을 사용하기 위해서(가짜변수!!)
        var tempRow = convertView
        if (tempRow == null){
//          student_list_item을 꺼내와서 tempRow에 담아줘. 부가정보는 따로 없으니 null로 설정한다.
            tempRow = inf.inflate(R.layout.student_list_item,null)
        }
//      여기까지 왔으면 tempRow는 절대 깡통일리가 없음! if문 때문에ㅎㅎ
        val row = tempRow!!

        return row


    }

}
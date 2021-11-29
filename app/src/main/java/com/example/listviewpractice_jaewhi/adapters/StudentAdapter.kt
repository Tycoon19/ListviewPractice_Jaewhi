package com.example.listviewpractice_jaewhi.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listviewpractice_jaewhi.R
import com.example.listviewpractice_jaewhi.datas.Student
//    StudentAdapter가 회색인 이유는 아직 아무데서도 안가져다 쓴다는 말임ㅇㅇ
class StudentAdapter(
//  Context는 내가 지금 보고있는 화면이 어딘가요라는 화면정보.
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {

        val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        return super.getView(position, convertView, parent) super 앞에 return이 붙으면 바로 날려버리자.
//        position: Int 는 내가 지금 몇 번째 줄을 그리기 위해서 get View가 실행되는지 알려주는 역할을 함.

//        convertView를 tempRow 라는 변수로 저장한 이유는 비어있다면 채워달라는 의미의 if문을 사용하기 위해서(가짜변수!!)
        var tempRow = convertView
        if (tempRow == null){
//          student_list_item을 꺼내와서 tempRow에 담아줘. 부가정보는 따로 없으니 null로 설정한다.
            tempRow = inf.inflate(R.layout.student_list_item,null)
        }
//      여기까지 왔으면 tempRow는 절대 깡통일리가 없음! if문 때문에ㅎㅎ
        val row = tempRow!!

        val studentData = mList[position]

//      여기선 자동완성 사용하면 안됨. 이게 앱이 죽는 원인이 될 수 있음.
//      -> 별개의 변수를 따로 만들어두고 결과로 나가는 row 안에서 찾아내달라 라는 동작을 추가.

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val birthYearTxt = row.findViewById<TextView>(R.id.birthYearTxt)

        nameTxt.text = studentData.name
        birthYearTxt.text = "(${studentData.birthYear}년생)"

        return row


    }

}
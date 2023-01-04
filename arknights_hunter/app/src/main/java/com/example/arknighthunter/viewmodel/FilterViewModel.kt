package com.example.arknighthunter.viewmodel

import android.graphics.Path.Op
import android.util.Log
import android.widget.Toast
import com.example.arknighthunter.data.DataSource
import com.example.arknighthunter.data.DataSource.operators
import com.example.arknighthunter.data.DataSource.tags
import com.example.arknighthunter.model.Operator

class FilterViewModel() { //TODO: to be :ViewModel
//    private val _tags = mutableListOf<String>()
//    val tags get() = _tags
//    private val _operators = mutableListOf<Operator>()  //註: for show in xml
//    val operators get() = _operators
//
//    private val operatorNames = mutableListOf<String>()    //註: 紀錄幹員name，只做檢查該幹員是否存在
//
//    private val tagsDataSource = DataSource.tags
//    private val operatorsDataSource = DataSource.operators
//
//    fun setTag(tag: String) {
//        if (tagsDataSource.contains(tag)) {   //註: tagList是否擁有該tag
//            if (tags.contains(tag))
//                _tags.remove(tag)    //註: 如果已經包含該tag，移除
//            else _tags.add(tag)
//        }
//        setOperator1()
//    }
//
//    private fun setOperator1() {
//        for (operatorData in operatorsDataSource) { //註: check database
//            val newTags = mutableListOf<String>()   //註: tagList for add new operator
//            for (tag in tags) { //註: create tagList
//                if (operatorData.tags.contains(tag)) {  //TODO: change here
//                    newTags.add(tag)
//                }
//            }
//
//            if (operators.size == 0) {
//                val newOperator = Operator(operatorData.operatorName, newTags)
//                _operators.add(newOperator)
//            } else {
//                for (operator in operators) {
//                    val newOperator = Operator(operatorData.operatorName, newTags)
//                    if (operator != newOperator) {
//                        _operators.add(newOperator)
//                        break
//                    }
//                }
//            }
//        }
//        Log.d("BBB", "List Of OperatorName: $operatorNames")
//        Log.d("BBB", "List Of Operators: $operators")
//    }

    //註: filter改為tags一起給條件判斷
    private val _tagsList = mutableListOf<MutableList<String>>()
    val tagsList get() = _tagsList
    private val _operators = mutableListOf<String>()
    val operators get() = _operators

    fun setTags(tag: String) {
        //
    }
}
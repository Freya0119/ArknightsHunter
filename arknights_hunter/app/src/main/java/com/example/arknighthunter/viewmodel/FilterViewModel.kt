package com.example.arknighthunter.viewmodel

import android.util.Log
import android.widget.Toast
import com.example.arknighthunter.data.DataSource
import com.example.arknighthunter.data.DataSource.operators
import com.example.arknighthunter.data.DataSource.tags

class FilterViewModel { //TODO: to be :ViewModel
    private lateinit var tags: MutableList<String>
    private lateinit var operators: MutableList<String> //TODO: String or Operator???

    private val tagsDataSource = DataSource.tags
    private val operatorsDataSource = DataSource.operators

    private fun isSameTag(tagString: String): Boolean {
        if (tags.contains(tagString)) tags.remove(tagString)
        return (tags.contains(tagString))
    }

    fun setTag(tag: String) {
        if (tags.contains(tag)) {   //TODO: tagList是否包括該string
            if (!isSameTag(tag)) {
                tags.add(tag)
            }
        }
    }

    private fun setOperator1() {    //TODO: 先operator or tag???
        for (operator in operatorsDataSource) {
            for (tag in tags) {
                if (operator.tags.contains(tag)) {
                    operators.add(operator.operatorName)
                }
            }
        }
        Log.d("BBB", "List Of Operators: $operators")
    }
}
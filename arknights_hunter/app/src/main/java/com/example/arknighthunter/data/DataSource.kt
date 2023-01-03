package com.example.arknighthunter.data

import com.example.arknighthunter.model.Operator

object DataSource {
    val tags = listOf<String>(
        "先锋",
        "近卫",
        "狙击",
        "重装",
        "医疗",
        "辅助",
        "术师",
        "特种",
        "近战位",
        "远程位",
        "新手",
        "资深干员",
        "高级资深干员",
        "治疗",
        "支援",
        "输出",
        "群攻",
        "减速",
        "生存",
        "防护",
        "削弱",
        "位移",
        "控场",
        "爆发",
        "召唤",
        "快速复活",
        "费用回复",
        "支援机械"
    )
    val operators = listOf(Operator("苇草", listOf("先锋", "近战位", "资深干员", "输出", "费用回复")))
}
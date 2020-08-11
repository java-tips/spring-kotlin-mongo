package com.kotlin.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
class Order() {
    @Id
    var id: String? = ObjectId().toHexString()
    var number: Int? = null
    var value: Double? = 0.00
    var description: String? = ""
    var date: LocalDate? = null
    var status: StatusType? = StatusType.NEW

}

enum class StatusType {
    NEW, APPROVED, ONGOING, DELIVERED
}
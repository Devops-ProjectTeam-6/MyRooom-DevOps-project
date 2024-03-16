package com.myroom.bookingservice.api.model.query;

import com.myroom.bookingservice.api.constants.QueryRelationalOperator;
import com.myroom.bookingservice.api.constants.SortingType;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
public class CheckInDateRequestModel {
    Date checkIn;
    QueryRelationalOperator operator;
    SortingType sortingType;
}

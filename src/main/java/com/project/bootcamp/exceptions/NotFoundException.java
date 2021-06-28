package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException()
    {
        super(MessageUtils.STOCK_RECORDS_FOUND);
    }

}

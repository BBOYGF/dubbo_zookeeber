package com.learn.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @DubboReference
    TicketService tickerService;
    public String buyTicker()
    {
       return tickerService.getTicket();
    }
}

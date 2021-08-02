package com.learn.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.learn.service.TicketService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
@Component
@DubboService
public class TicketSerrviceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "guofan";
    }
}

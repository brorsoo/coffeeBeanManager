package com.brorsoo.controller;

import com.brorsoo.common.OriginDTO;
import com.brorsoo.service.BeanService;
import com.brorsoo.view.PrintResult;

import java.util.List;

public class BeanController {

    private final BeanService beanService;
    private final PrintResult printResult;

    public BeanController() {
        beanService = new BeanService();
        printResult = new PrintResult();
    }

    public void selectAllBean() {

        List<OriginDTO> beanList = beanService.selectAllBean();

        if(beanList != null) {
            printResult.printBeanList(beanList);
        } else {
            printResult.printErrorMessage("selectAllList");
        }

    }
}

package com.brorsoo.controller;

import com.brorsoo.common.BeanDTO;
import com.brorsoo.common.OriginDTO;
import com.brorsoo.common.SearchCriteria;
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

        if(beanList != null && beanList.size() > 0) {
            printResult.printBeanList(beanList);
        } else {
            printResult.printErrorMessage("selectAllList");
        }

    }

    public void selectChoice(SearchCriteria searchCriteria) {

        List<OriginDTO> beanList = beanService.selectChoice(searchCriteria);

        if(beanList != null && beanList.size() > 0) {
            printResult.printBeanList(beanList);
        } else {
            printResult.printErrorMessage("selectChoice");
        }

    }

    public void selectOrigin() {

        List<OriginDTO> beanList = beanService.selectOrigin();

        if(beanList != null && beanList.size() > 0) {
            printResult.printBeanList(beanList);
        } else {
            printResult.printErrorMessage("selectOrigin");
        }
    }

    public void insertBean(BeanDTO beanDTO) {

        if(beanService.insertBean(beanDTO)){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }

    }
}

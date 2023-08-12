package com.brorsoo.controller;

import com.brorsoo.common.BeanDTO;
import com.brorsoo.common.OriginDTO;
import com.brorsoo.common.SearchCriteria;
import com.brorsoo.service.BeanService;
import com.brorsoo.view.PrintResult;

import java.util.List;
import java.util.Map;

public class BeanController {

    private final BeanService beanService;
    private final PrintResult printResult;

    public BeanController() {
        beanService = new BeanService();
        printResult = new PrintResult();
    }

    public void selectJoinAllBaen() {

        List<OriginDTO> beanList = beanService.selectJoinAllBaen();

        if(beanList != null && beanList.size() > 0) {
            printResult.printJoinList(beanList);
        } else {
            printResult.printErrorMessage("selectAllList");
        }

    }

    public void selectAllBean() {

        List<BeanDTO> beanList = beanService.selectAllBean();

        if(beanList != null && beanList.size() > 0) {
            printResult.printBeanList(beanList);
        } else {
            printResult.printErrorMessage("selectAllList");
        }

    }

    public void selectChoice(SearchCriteria searchCriteria) {

        List<OriginDTO> beanList = beanService.selectChoice(searchCriteria);

        if(beanList != null && beanList.size() > 0) {
            printResult.printJoinList(beanList);
        } else {
            printResult.printErrorMessage("selectChoice");
        }

    }

    public void selectOrigin() {

        List<OriginDTO> beanList = beanService.selectOrigin();

        if(beanList != null && beanList.size() > 0) {
            printResult.printJoinList(beanList);
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

    public void updateBean(BeanDTO beanDTO) {

        if(beanService.updateBean(beanDTO)){
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }

    }

    public void deleteBaen(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        if(beanService.deleteBean(code)){
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }

    }

    public void storageOrReleaseBean(SearchCriteria searchCriteria) {

        if(beanService.storageOrReleaseBean(searchCriteria)){

            if(searchCriteria.getCondition().equals("입고")){
                printResult.printSuccessMessage("storage");
            } else if (searchCriteria.getCondition().equals("출고")) {
                printResult.printSuccessMessage("Release");
            }

        } else {

            if(searchCriteria.getCondition().equals("입고")){
                printResult.printErrorMessage("storage");
            } else if (searchCriteria.getCondition().equals("출고")) {
                printResult.printErrorMessage("Release");
            } else {
                System.out.println("조건을 잘못입력하셨습니다.");
            }

        }

    }


}

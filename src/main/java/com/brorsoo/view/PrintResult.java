package com.brorsoo.view;

import com.brorsoo.common.BeanDTO;
import com.brorsoo.common.OriginDTO;

import java.util.List;
import java.util.Objects;

public class PrintResult {
    public void printJoinList(List<OriginDTO> beanList) {
        beanList.forEach(System.out::println);
    }

    public void printBeanList(List<BeanDTO> beanList) {
        beanList.forEach(System.out::println);
    }


    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectAllList" : errorMessage = "\n전체 원두 조회에 실패하였습니다.";
                break;
            case "selectOrigin" : errorMessage = "\n원산지 조회에 실패하였습니다.";
                break;
            case "selectChoice" : errorMessage = "\n선택 조회에 실패하였습니다.";
                break;
            case "insert" : errorMessage = "\n원두 등록에 실패하였습니다.";
                break;
            case "update" : errorMessage = "\n원두 수정에 실패하였습니다.";
                break;
            case "delete" : errorMessage = "\n원두 삭제에 실패하였습니다.";
                break;
            case "storage" : errorMessage = "\n원두 입고에 실패하였습니다.";
                break;
            case "Release" : errorMessage = "\n원두 출고에 실패하였습니다.";
                break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "\n신규 원두 등록이 되었습니다...";
                break;
            case "update" : successMessage = "\n원두 수정이 되었습니다...";
                break;
            case "delete" : successMessage = "\n원두 삭제가 되었습니다...";
                break;
            case "storage" : successMessage = "\n|￣￣￣￣￣￣￣|\n" +
                                            "|  입고 완료  |\n" +
                                            "|＿＿＿＿＿＿＿|";
                break;
            case "Release" : successMessage = "\n|￣￣￣￣￣￣￣|\n" +
                                            "|  출고 완료  |\n" +
                                            "|＿＿＿＿＿＿＿|";
                break;
        }
        System.out.println(successMessage);
    }

}

package com.brorsoo.view;

import com.brorsoo.common.OriginDTO;

import java.util.List;

public class PrintResult {
    public void printBeanList(List<OriginDTO> beanList) {
        beanList.forEach(System.out::println);
    }

//    public void printBean(List<OriginDTO> beanList) {
//        // 넣어야할곳
//    }


    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectAllList" : errorMessage = "전체 원두 조회에 실패하였습니다.";
                break;
            case "selectOrigin" : errorMessage = "원산지 조회에 실패하였습니다.";
                break;
            case "selectChoice" : errorMessage = "선택 조회에 실패하였습니다.";
                break;
//            case "insert" : errorMessage = "메뉴 등록에 실패하였습니다.";
//                break;
//            case "update" : errorMessage = "메뉴 수정에 실패하였습니다.";
//                break;
//            case "delete" : errorMessage = "메뉴 삭제에 실패하였습니다.";
//                break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "신규 원두 등록이 완료 되었습니다..";
                break;
//            case "update" : successMessage = "메뉴 수정이 완료 되었습니다..";
//                break;
//            case "delete" : successMessage = "메뉴 삭제가 완료 되었습니다..";
//                break;
        }
        System.out.println(successMessage);
    }

}

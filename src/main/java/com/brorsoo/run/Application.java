package com.brorsoo.run;

import com.brorsoo.common.BeanDTO;
import com.brorsoo.common.OriginDTO;
import com.brorsoo.common.SearchCriteria;
import com.brorsoo.controller.BeanController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n=========== 원두 재고 관리 =============");
            System.out.println("1. 원두 조회");
            System.out.println("2. 원두 관리");
            System.out.println("3. 원두 입출고");
            System.out.println("99. 프로그램 종료");
            System.out.print("번호 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    searchBeanSubMenu();
                    break;
                case 2 :
                    manageBeanSubMenu();
                    break;
                case 3 :
                    beanCountSubMenu();
                    break;
                case 99 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
            }

        } while(true);

    }


    /* 원두 조회 서브 메뉴 */
    private static void searchBeanSubMenu() {

        Scanner sc = new Scanner(System.in);

        BeanController beanController = new BeanController();

        do {
            System.out.println("\n========= 조회 sub 메뉴 ===========");
            System.out.println("1. 전체 원두 리스트 조회");
            System.out.println("2. 선택 조회 (이름 or 맛)");
            System.out.println("3. 선택 조회 (원산지 or 품종)");
            System.out.println("99. 이전 메뉴로");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    beanController.selectJoinAllBaen();
                    break;
                case 2 :
                    beanController.selectChoice(inputSearchCriteria(2));
                    break;
                case 3 :
                    beanController.selectChoice(inputSearchCriteria(3));
                    break;
                case 99 :
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
            }

        } while(true);

    }


    /* 원두 관리 서브 메뉴 */
    private static void manageBeanSubMenu() {

        Scanner sc = new Scanner(System.in);

        BeanController beanController = new BeanController();

        do {
            System.out.println("\n========= 관리 sub 메뉴 ===========");
            System.out.println("1. 원두 리스트 조회");
            System.out.println("2. 원두 추가");
            System.out.println("3. 원두 수정");
            System.out.println("4. 원두 삭제");
            System.out.println("99. 이전 메뉴로");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    beanController.selectAllBean();
                    break;
                case 2 :
                    beanController.selectOrigin();      // insert 할때 참고용
                    beanController.insertBean(inputInsertBean());
                    break;
                case 3 :
                     beanController.updateBean(inputUpdateBean());
                    break;
                case 4 :
                    beanController.deleteBaen(inputCode());
                    break;
                case 99 :
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
            }

        } while(true);

    }


    /* 원두 입출고 서브 메뉴 */
    private static void beanCountSubMenu() {

        Scanner sc = new Scanner(System.in);

        BeanController beanController = new BeanController();

        do {
            System.out.println("\n========= 입출고 sub 메뉴 ===========");
            System.out.println("1. 전체 원두 리스트 조회");
            System.out.println("2. 원두 입고 / 출고");
            System.out.println("99. 이전 메뉴로");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    beanController.selectAllBean();
                    break;
                case 2 :
                    beanController.storageOrReleaseBean(inputstorageOrReleaseBean());
                    break;
                case 99 :
                    return;
            }

        } while(true);

    }


    /* 선택조회 입력 */
    private static SearchCriteria inputSearchCriteria(int no) {

        Scanner sc = new Scanner(System.in);
        String condition = "";

        if (no == 2){
            System.out.print("선택 조회 (이름 or 맛) : ");
            condition = sc.nextLine();
        }
        if (no == 3){
            System.out.print("선택 조회 (원산지 or 품종) : ");
            condition = sc.nextLine();
        }

        System.out.print("조건을 입력해주세요 : ");
        String value = sc.nextLine();

        return new SearchCriteria(condition, value);
    }


    /* 원두추가 입력 */
    private static BeanDTO inputInsertBean() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== 상단에 원산지 리스트를 참고해서 작성해주세요 ===");
        System.out.print("원두이름를 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("원두 가격을 입력하세요 : ");
        int price = sc.nextInt();
        System.out.print("원산지 코드를 입력하세요 : ");
        int originCode = sc.nextInt();
        sc.nextLine();
        System.out.print("맛을 입력하세요 : ");
        String taste = sc.nextLine();
        System.out.print("포장 무게를 입력하세요(500, 1000) : ");
        int weight = sc.nextInt();

        BeanDTO beanList = new BeanDTO();
        beanList.setBeanName(name);
        beanList.setPrice(price);
        beanList.setOriginCode(originCode);
        beanList.setTaste(taste);
        beanList.setWeight(weight);
        beanList.setExtraCount(0);

        return beanList;

    }


    /* 원두수정 입력 */
    private static BeanDTO inputUpdateBean() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 원두 번호를 입력하세요 : ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("수정할 원두 이름를 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수정할 원두 가격을 입력하세요 : ");
        int price = sc.nextInt();
        System.out.print("수정할 원산지 코드를 입력하세요 : ");
        int originCode = sc.nextInt();
        sc.nextLine();
        System.out.print("수정할 맛을 입력하세요 : ");
        String taste = sc.nextLine();
        System.out.print("수정할 포장 무게를 입력하세요(500, 1000) : ");
        int weight = sc.nextInt();

        BeanDTO beanList = new BeanDTO();
        beanList.setBeanNo(code);
        beanList.setBeanName(name);
        beanList.setPrice(price);
        beanList.setOriginCode(originCode);
        beanList.setTaste(taste);
        beanList.setWeight(weight);

        return beanList;
    }


    /* 원두삭제 입력 */
    private static Map<String, String> inputCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("원두번호를 입력해주세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }


    /* 원두 입출고 입력 */
    private static SearchCriteria inputstorageOrReleaseBean() {

        Scanner sc = new Scanner(System.in);
        String condition = "";

        System.out.print("항목 선택 입력 (입고 or 출고) : ");
        condition = sc.nextLine();
        System.out.print("변경할 원두 번호를 입력하세요 : ");
        int code = sc.nextInt();
        System.out.print("변경할 수량을 입력하세요 : ");
        int count = sc.nextInt();

        return new SearchCriteria(condition, code, count);
    }

}

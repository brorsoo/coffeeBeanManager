package com.brorsoo.run;

import com.brorsoo.controller.BeanController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=========== 원두 재고 관리 =============");
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
                    beanController.selectAllBean();
                    break;
                case 2 :
//                    menuService.selectMenuByPrice(inputPrice());
                    break;
                case 3 :

                    break;
                case 99 :
                    return;
            }

        } while(true);

    }


    /* 원두 관리 서브 메뉴 */
    private static void manageBeanSubMenu() {

        Scanner sc = new Scanner(System.in);

        BeanController beanController = new BeanController();

        do {
            System.out.println("\n========= 관리 sub 메뉴 ===========");
            System.out.println("1. 전체 원두 리스트 조회");
            System.out.println("2. 원두 추가");
            System.out.println("3. 원두 수정");
            System.out.println("4. 원두 삭제");
            System.out.println("99. 이전 메뉴로");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
//                    menuService.selectMenuByPrice(inputPrice());
                    break;
                case 2 :

                    break;
                case 3 :

                    break;
                case 4 :

                    break;
                case 99 :
                    return;
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
            System.out.println("2. 원두 입고");
            System.out.println("3. 원두 출고");
            System.out.println("99. 이전 메뉴로");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
//                    menuService.selectMenuByPrice(inputPrice());
                    break;
                case 2 :

                    break;
                case 3 :

                    break;
                case 99 :
                    return;
            }

        } while(true);

    }
}

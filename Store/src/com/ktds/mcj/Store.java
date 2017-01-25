package com.ktds.mcj;

import com.ktds.mcj.buyer.Buyer;
import com.ktds.mcj.seller.Seller;

public class Store {

	public void start() {
		
//		Buyer ljs = new Buyer(0, 5000000);
//		Buyer jgu = ljs;
//		
//		ljs.buy();
//		
//		System.out.println(ljs);
//		System.out.println(jgu);
		
		Buyer lyj = new Buyer(0, 50000);
		Seller nym = new Seller(500, 50000);
		
		lyj.buy(nym);
		
		System.out.println(lyj);
		System.out.println(nym);
		
//		System.out.println("장터에 오신 것을 환영합니다!");
//		Buyer jjh = new Buyer(0, 500000);
//		Seller mjk = new Seller(100, 5000000);
//		
//		System.out.println("바이어 : 상품 좀 살게요. 이 상품 1개 주세요.");
//		mjk.sell();
//		jjh.buy();
//		
//		System.out.println("셀러 : 2500원 입니다.");
//		jjh.pay(2500);
//		
//		System.out.println(mjk);
//		System.out.println(jjh);
		
	}
	
	public static void main(String[] args) {
		new Store().start();
	}
	
}









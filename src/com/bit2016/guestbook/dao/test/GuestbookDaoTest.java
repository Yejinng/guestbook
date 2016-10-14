package com.bit2016.guestbook.dao.test;

import java.util.List;
import com.bit2016.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
		insertTest();
		getListTest();
		deleteTest();

	}
	public static void deleteTest() {
		GuestbookVo vo = new GuestbookVo();
		vo.setNo(Long.parseLong("1"));
		vo.setPassword("2345");
		
		GuestbookDao dao = new GuestbookDao();
		dao.delete(vo);
	}

	public static void insertTest() {
		GuestbookVo vo = new GuestbookVo();
		vo.setName("또치");
		vo.setContent("또또!!!");
		vo.setPassword("2345");
		
		GuestbookDao dao = new GuestbookDao();
		dao.insert(vo);
	}
	public static void getListTest() {
			GuestbookDao dao = new GuestbookDao();
			List<GuestbookVo> list = dao.getList();
			for (GuestbookVo vo : list) {
				System.out.println(vo);
			}
		}

}

package com.oracle.service.impl;

import com.oracle.dao.BookmsgDao;
import com.oracle.dao.BtypemsgDao;
import com.oracle.dao.GrademsgDao;
import com.oracle.dao.impl.BookmsgDaoImpl;
import com.oracle.dao.impl.BtypeMsgDaoImpl;
import com.oracle.dao.impl.GradeMsgDoImpl;
import com.oracle.entity.Bookmsg;
import com.oracle.entity.Btypemsg;
import com.oracle.entity.Grademsg;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookService {

	private GrademsgDao grademsgDao = new GradeMsgDoImpl();
	private BtypemsgDao btypemsgDao = new BtypeMsgDaoImpl();
	private BookmsgDao bookmsgDao = new BookmsgDaoImpl();


	/**
	 * 显示所有年级、类别、课本封面图
	 *
	 * @return
	 */
	public List<Map> queryBooks() throws SQLException {

		List<Map> result = new ArrayList<>();
		//所有的年级
		List<Grademsg> grademsgList = grademsgDao.queryAll();


		for (Grademsg grademsg : grademsgList) {
			//如果这里不返回就判断

			Map map = new HashMap();

			//根据年级找类别
			List<Btypemsg> btypemsgs = btypemsgDao.queryBygrademsg_id(grademsg.getNid());
			List list3 = new ArrayList();

			for (Btypemsg btypemsg : btypemsgs) {
				Map types = new HashMap();


				List<Map> listdatas = new ArrayList<>();

				//根据类别找课本
				List<Bookmsg> bookmsgs = bookmsgDao.queryBybtypemsg_id(btypemsg.getTid());
				for (Bookmsg bookmsg : bookmsgs) {
					Map mm = new HashMap();
					mm.put("bimg", bookmsg.getLPictre());
					mm.put("bname", bookmsg.getLname());
					listdatas.add(mm);
				}


				//年级下的类别名称
				types.put("typeName", btypemsg.getTname());
				types.put("datas",  listdatas);

				list3.add(types);
			}



			//types.put("datas", listdatas);


			map.put("typeDatas", list3);
			//年级名称
			map.put("clssname", grademsg.getNname());

			result.add(map);
		}

		return result;


	}
}

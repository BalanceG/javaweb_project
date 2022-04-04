package com.oracle.dao.impl;

import com.oracle.dao.BtypemsgDao;
import com.oracle.entity.Btypemsg;
import com.oracle.util.DBManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BtypeMsgDaoImpl extends DBManager implements BtypemsgDao {
	@Override
	public List<Btypemsg> queryBygrademsg_id(Integer grademsg_id) throws SQLException {
		List<Btypemsg> list =new ArrayList<>();


		String sql="select * from btypemsg where\n" +
				" grademsg_id = ? ";

		try {

			ResultSet query = super.query(sql, grademsg_id);
			while(query.next()){
				Btypemsg msg=new Btypemsg();
				msg.setGrademsgId(query.getInt("Grademsg_Id"));
//				msg.setTFlag();
				msg.setTid(query.getInt("Tid"));
				msg.setTname(query.getString("Tname"));
				list.add(msg);
			}


		}finally {
			super.close();
		}


		return list;
	}

	@Override
	public Btypemsg queryById(Integer tid) {
		return null;
	}

	@Override
	public long count(Btypemsg btypemsg) {
		return 0;
	}

	@Override
	public int insert(Btypemsg btypemsg) {
		return 0;
	}

	@Override
	public int update(Btypemsg btypemsg) {
		return 0;
	}

	@Override
	public int deleteById(Integer tid) {
		return 0;
	}
}

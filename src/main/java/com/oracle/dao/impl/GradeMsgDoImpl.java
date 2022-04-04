package com.oracle.dao.impl;

import com.oracle.dao.GrademsgDao;
import com.oracle.entity.Grademsg;
import com.oracle.util.DBManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GradeMsgDoImpl extends DBManager implements GrademsgDao {


	@Override
	public List<Grademsg> queryAll() throws SQLException {
		List<Grademsg> list = new ArrayList<>();


		String sql = "SELECT\n" +
				"\t*\n" +
				"FROM\n" +
				"\tgrademsg\n" +
				"ORDER BY\n" +
				"\tt_sx ASC";


		try {
			ResultSet query = super.query(sql);
			while (query.next()) {
				Grademsg msg = new Grademsg();
				msg.setNid(query.getInt("nid"));
				msg.setNname(query.getString("nname"));
				msg.setTSx(query.getInt("t_sx"));
				list.add(msg);
			}
		}finally {
			super.close();
		}

		return list;
	}


	@Override
	public Grademsg queryById(Integer nid) {
		return null;
	}

	@Override
	public long count(Grademsg grademsg) {
		return 0;
	}

	@Override
	public int insert(Grademsg grademsg) {
		return 0;
	}

	@Override
	public int update(Grademsg grademsg) {
		return 0;
	}

	@Override
	public int deleteById(Integer nid) {
		return 0;
	}
}
